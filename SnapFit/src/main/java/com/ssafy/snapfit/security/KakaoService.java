package com.ssafy.snapfit.security;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.snapfit.model.dto.Member;

@Service
public class KakaoService {
	
    public Member getKakaoMember(String code) throws IOException, InterruptedException {
        // Kakao OAuth 토큰 요청
        HttpClient client = HttpClient.newHttpClient();
        String requestBody = String.format(
            "grant_type=authorization_code&client_id=%s&redirect_uri=%s&code=%s",
            "14ee8a7f4bd8a6cc315d3da449a0c3cb", "http://localhost:8080/kakao/oauth", code
        );
        
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://kauth.kakao.com/oauth/token"))
            .header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8")
            .POST(HttpRequest.BodyPublishers.ofString(requestBody))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String responseBody = response.body();
            System.out.println("Response: " + responseBody);
            
            

            // JSON 파싱 (Jackson 라이브러리 사용)
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> responseMap = objectMapper.readValue(responseBody, Map.class);
            String idToken = (String) responseMap.get("id_token");

            // JWT 디코딩
            Map<String, Object> parsedToken = parseJwt(idToken);
            
            String nickname = (String)parsedToken.get("nickname");
            String id = "kakao@" + parsedToken.get("sub");
            String profileSrc = (String)parsedToken.get("picture");
            
            Member member = new Member();
            member.setId(id);
            member.setNickname(nickname);
            member.setProfileSrc(profileSrc);
            return member;
        } else {
            System.err.println("Failed to get token: " + response.statusCode());
        }
        return null;
    }

    // JWT 파싱
    private static Map<String, Object> parseJwt(String token) throws IOException {
        String[] parts = token.split("\\.");
        if (parts.length == 3) {
            String base64Url = parts[1];
            String base64 = base64Url.replace('-', '+').replace('_', '/');
            byte[] decodedBytes = Base64.getDecoder().decode(base64);
            String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(decodedString, Map.class);
        } else {
            throw new IllegalArgumentException("Invalid JWT token");
        }
    }
}
