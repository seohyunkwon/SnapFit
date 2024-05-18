package com.ssafy.snapfit.security;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.ssafy.snapfit.model.dto.Member;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
    private String key = "SnapFit_Secret_key_String_key_key";
    private SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));

    public static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

    public String createToken(Member member) {

        Date exp = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12);

        String token = Jwts.builder()
                .setSubject(member.getId())
                .claim("role", "USER")
                .setExpiration(exp)
                .signWith(secretKey)
                .compact();
        logger.info("token = {}", token);
        return token;
    }

    // 토큰 검증
    // 유효기간이 지나면 에러 발생
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secretKey).build().parseClaimsJws(token);
            return true;
        } catch (SecurityException | MalformedJwtException | SignatureException e) {
            logger.error("Invalid JWT signature");
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token");
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims is empty");
        }
        return false;
    }

    public Claims getUserInfoFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public Authentication autenticate(String token) {
        Claims claims = getUserInfoFromToken(token);
        String id = claims.getSubject();
        String role = claims.get("role", String.class);

        // 비밀번호 대신 null을 사용하고, 필요한 경우 details 필드에 추가 정보를 담음
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                id,
                null,
                Collections.singleton(new SimpleGrantedAuthority(role))
        );

        // Authentication 객체에 토큰 저장
        authenticationToken.setDetails(token);

        return authenticationToken;
    }
}