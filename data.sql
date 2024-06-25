# MEMBER INSERT
INSERT INTO member (id, password, nickname, birth_date, gender) VALUES ('jies000', "qwer1234", "서혀닝", "1998-03-08", 1),
('jsc1363', "qwer1234", "정승찬", "1998-04-01", 0),
('user001', 'passA1234', '푸른하늘', '1990-01-15', 1),
('user002', 'passB5678', '밝은미소', '1992-03-22', 0),
('user003', 'passC9012', '행복한사람', '1988-07-30', 1),
('user004', 'passD3456', '꿈꾸는별', '1995-02-14', 0),
('user005', 'passE7890', '자유로운영혼', '1991-11-18', 1),
('user006', 'passF1122', '용감한용사', '1993-05-25', 0),
('user007', 'passG3344', '빛나는햇살', '1989-09-09', 1),
('user008', 'passH5566', '푸른바다', '1996-12-01', 0),
('user009', 'passI7788', '아름다운꿈', '1994-06-17', 1),
('user010', 'passJ9900', '별빛속으로', '1987-10-23', 0),
('user011', 'passK1111', '맑은물', '1991-04-05', 1),
('user012', 'passL2222', '고요한강', '1990-08-13', 0),
('user013', 'passM3333', '평화로운밤', '1993-12-31', 1),
('user014', 'passN4444', '하늘의별', '1992-11-20', 0),
('user015', 'passO5555', '조용한숲', '1988-03-03', 1),
('user016', 'passP6666', '따뜻한손길', '1996-07-07', 0),
('user017', 'passQ7777', '사랑의빛', '1991-01-25', 1),
('user018', 'passR8888', '행운의별', '1989-05-14', 0),
('user019', 'passS9999', '달빛아래', '1995-10-02', 1),
('user020', 'passT0000', '여유로운하루', '1993-08-18', 0),
('user021', 'passU1212', '아침햇살', '1990-06-30', 1),
('user022', 'passV2323', '청춘의빛', '1992-02-27', 0),
('user023', 'passW3434', '하늘바람', '1988-12-12', 1),
('user024', 'passX4545', '희망의길', '1994-09-09', 0),
('user025', 'passY5656', '믿음의힘', '1987-04-04', 1),
('user026', 'passZ6767', '용기의별', '1991-11-11', 0),
('user027', 'passAA7878', '도전의날', '1995-03-01', 1),
('user028', 'passBB8989', '기쁨의순간', '1993-07-21', 0),
('user029', 'passCC9090', '창조의길', '1989-02-18', 1),
('user030', 'passDD1010', '성장의시간', '1992-05-15', 0),
('user031', 'passEE1110', '미래의빛', '1990-09-25', 1),
('user032', 'passFF1211', '지혜의별', '1988-11-05', 0),
('user033', 'passGG1312', '열정의불꽃', '1994-03-28', 1),
('user034', 'passHH1413', '행복한여행', '1995-12-12', 0),
('user035', 'passII1514', '감사의마음', '1991-06-06', 1),
('user036', 'passJJ1615', '신뢰의사람', '1993-04-04', 0),
('user037', 'passKK1716', '희망의빛', '1987-08-08', 1),
('user038', 'passLL1817', '평온의시간', '1992-01-01', 0),
('user039', 'passMM1918', '행복한미래', '1994-10-10', 1),
('user040', 'passNN2020', '사랑의별빛', '1995-05-05', 0);

# EXERCISE INSERT
INSERT INTO exercise (name) VALUES 
('농구'), 
('다이빙'), 
('댄스'), 
('배구'), 
('배드민턴'), 
('서핑'), 
('수영'), 
('스노보드'), 
('스케이트보드'), 
('야구'),
('요가'), 
('주짓수'), 
('줄넘기'), 
('체조'), 
('축구'), 
('클라이밍'), 
('킥복싱'), 
('탁구'), 
('파쿠르'), 
('헬스');

# VIDEO INSERT 
# 1 ~ 20 : 댄스
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (1, 3, '탕후루 챌린지 ,,', '탕탕 후루후루,,');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (1, 3, '댄스 배틀 도전!', '스트리트 댄스 배틀에서 보여준 나의 멋진 퍼포먼스!');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, 'K-pop 댄스 커버', '최신 K-pop 노래에 맞춰 춤을 추는 영상을 올려보아요!');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (12, 3, '힙합 댄스 연습', '힙합 댄스 기본기를 익히는 연습 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (21, 3, '발레 연습 일지', '우아한 발레 동작을 연습하는 모습을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (18, 3, '팝핀 댄스 챌린지', '팝핀 댄스 챌린지에 참여한 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (30, 3, '댄스 루틴 소개', '내가 좋아하는 댄스 루틴을 소개합니다. 함께 춰봐요!');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 3, '재즈 댄스 퍼포먼스', '재즈 댄스 공연에서의 퍼포먼스를 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (37, 3, '락킹 댄스 기본기', '락킹 댄스의 기본기를 익히는 방법을 알려드립니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (42, 3, '클래식 댄스 연습', '클래식 댄스 동작을 연습하는 영상을 찍어봤어요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '브레이크 댄스 챌린지', '브레이크 댄스의 화려한 동작을 도전해봤습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '댄스 퍼포먼스', '춤추는 내 모습이 너무 좋아요!');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '트렌디한 춤', '요즘 유행하는 춤을 따라해봤어요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '댄스 챌린지', '댄스 챌린지에 도전해봤어요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '댄스 커버', '유명한 춤을 커버해봤습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 3, '댄스 트레이닝', '춤 연습하는 모습을 담았어요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (20, 3, '댄스 레슨', '댄스 레슨 영상을 찍어봤습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 3, '댄스 비디오', '나의 댄스 비디오를 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 3, '댄스 파티', '댄스 파티에서 춤추는 모습입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (17, 3, '댄스 연습', '춤 연습 영상을 올려봅니다.');

# 21 ~ 42 : 서핑
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (1, 6, '서핑 입문 영상', '서핑 초보자를 위한 기본 입문 강의입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (3, 6, '파도타기 도전', '큰 파도에서 서핑을 도전하는 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 6, '서핑 트릭 연습', '서핑 트릭을 연습하는 과정을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (7, 6, '서핑 여행 브이로그', '서핑 여행에서 찍은 브이로그입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 6, '서핑 대회 준비', '서핑 대회를 준비하는 모습을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (11, 6, '서핑 장비 리뷰', '서핑 장비에 대한 리뷰 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 6, '서핑 스팟 소개', '서핑하기 좋은 장소를 소개합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (15, 6, '서핑 기술 익히기', '서핑 기술을 익히는 과정을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (17, 6, '서핑 체험 후기', '서핑 체험 후기를 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (19, 6, '서핑과 요가', '서핑과 요가를 결합한 운동 영상을 올렸어요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (21, 6, '서핑 팁과 요령', '서핑을 잘할 수 있는 팁과 요령을 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 6, '서핑 중 사고 대처법', '서핑 중 발생할 수 있는 사고에 대처하는 방법을 알려드립니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (25, 6, '서핑 보드 관리법', '서핑 보드를 관리하는 방법에 대해 설명합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (27, 6, '서핑 입문자의 하루', '서핑 입문자의 하루 일과를 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (29, 6, '서핑 연습 루틴', '효과적인 서핑 연습 루틴을 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (31, 6, '서핑 명소 탐방', '서핑하기 좋은 명소를 탐방한 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (33, 6, '서핑 친구 만들기', '서핑을 통해 친구를 만드는 방법을 소개합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (35, 6, '서핑 훈련 일지', '서핑 훈련 과정을 기록한 일지 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (37, 6, '서핑 기술 마스터하기', '서핑 기술을 마스터하는 과정을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (39, 6, '서핑의 매력', '서핑의 매력을 소개하는 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (41, 6, '서핑 모임 후기', '서핑 모임에 참가한 후기를 공유합니다.');

delete from video where no = 42;

# 43 ~ 61 : 스노보드
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (1, 8, '스노보드 입문 가이드', '스노보드 초보자를 위한 기본 가이드 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 8, '눈 위에서의 자유', '스노보드 타면서 느끼는 자유를 표현한 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (3, 8, '스노보드 트릭 연습', '스노보드 트릭을 연습하는 과정을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (4, 8, '스노보드 여행 브이로그', '스노보드 여행에서 찍은 브이로그입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 8, '스노보드 장비 리뷰', '스노보드 장비에 대한 리뷰 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (6, 8, '스노보드 명소 탐방', '스노보드하기 좋은 명소를 탐방한 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (7, 8, '스노보드 기술 익히기', '스노보드 기술을 익히는 과정을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (8, 8, '스노보드 대회 준비', '스노보드 대회를 준비하는 모습을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 8, '스노보드의 매력', '스노보드의 매력에 빠져보세요.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (10, 8, '스노보드 안전 수칙', '스노보드를 할 때 지켜야 할 안전 수칙을 알려드립니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (11, 8, '스노보드 팁과 요령', '스노보드를 잘할 수 있는 팁과 요령을 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (12, 8, '눈 속에서의 하루', '눈 속에서 보낸 하루를 영상으로 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 8, '스노보드 체험 후기', '스노보드 체험 후기를 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (14, 8, '스노보드와 자연', '스노보드를 하면서 자연을 느끼는 순간들을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (15, 8, '스노보드 연습 루틴', '효과적인 스노보드 연습 루틴을 공유합니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (16, 8, '스노보드 훈련 일지', '스노보드 훈련 과정을 기록한 일지 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (17, 8, '스노보드 커뮤니티 소개', '스노보드 커뮤니티를 소개하고 참여 방법을 알려드립니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (18, 8, '스노보드 모임 후기', '스노보드 모임에 참가한 후기를 공유합니다.');

# 61 ~ 85 ; 스노보드
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (40, 9, '기술 강의: 스케이트 보드의 기초', '스케이트 보드의 기초 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (40, 9, '그라인드와 함께하는 스케이트 보드 팁', '그라인드와 스케이트 보드 팁을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (40, 9, '다양한 트릭 배우기: 스케이트 보드', '스케이트 보드의 다양한 트릭을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (40, 9, '초보자를 위한 기술: 스케이트 보드', '스케이트 보드 초보자를 위한 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (39, 9, '트릭 마스터: 스케이트 보드 레슨', '트릭 마스터와 함께하는 스케이트 보드 레슨 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (39, 9, '연습 방법 강의: 스케이트 보드', '스케이트 보드 연습 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (39, 9, '팁과 요령: 스케이트 보드', '스케이트 보드 팁과 요령을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (39, 9, '트릭 연습하기: 스케이트 보드', '스케이트 보드로 트릭을 연습하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (38, 9, '기술의 비밀: 스케이트 보드', '스케이트 보드 기술의 비밀을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (38, 9, '트릭의 기본: 스케이트 보드', '스케이트 보드 트릭의 기본을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (38, 9, '고급 기술 배우기: 스케이트 보드', '고급 스케이트 보드 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 9, '기술의 모든 것: 스케이트 보드', '스케이트 보드 기술의 모든 것을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 9, '마스터 되기: 스케이트 보드', '스케이트 보드의 마스터가 되는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 9, '기술 향상 방법: 스케이트 보드', '스케이트 보드 기술을 향상시키는 방법을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 9, '초보 탈출하기: 스케이트 보드', '스케이트 보드 초보를 탈출하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (16, 9, '고급 기술 연습: 스케이트 보드', '스케이트 보드 고급 기술을 연습하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (17, 9, '트릭 마스터하기: 스케이트 보드', '스케이트 보드로 트릭을 마스터하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (18, 9, '강의: 스케이트 보드 기초부터 고급까지', '스케이트 보드 강의로 기초부터 고급 기술까지 배우는 영상을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (19, 9, '트릭 마스터의 비결: 스케이트 보드', '스케이트 보드 트릭을 마스터하는 비결을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (20, 9, '초보자 레슨: 스케이트 보드', '스케이트 보드 초보자를 위한 레슨 영상을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (21, 9, '기초와 응용: 스케이트 보드', '스케이트 보드의 기초와 응용 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (22, 9, '고급 트릭 배우기: 스케이트 보드', '스케이트 보드 고급 트릭을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 9, '강의: 스케이트 보드 트릭과 기술', '스케이트 보드 강의로 트릭과 기술을 배우는 영상을 담았습니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 9, '기술 완전 정복: 스케이트 보드', '스케이트 보드 기술을 완전 정복하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (25, 9, '팁과 기술 배우기: 스케이트 보드', '스케이트 보드 팁과 기술을 배우는 과정을 담은 영상입니다.');

select * from video;

# 86 ~ 97 : 축구
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (1, 15, '기술 강의: 축구 드리블의 기초', '축구 드리블의 기초 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 15, '축구에서의 정확한 패스 방법', '축구에서 정확하게 패스하는 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (3, 15, '다양한 축구 트릭 배우기', '축구의 다양한 트릭을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (4, 15, '초보자를 위한 축구 기술', '축구 초보자를 위한 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 15, '트릭 마스터: 축구 레슨', '트릭 마스터와 함께하는 축구 레슨 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (6, 15, '축구 연습 방법 강의', '축구 연습 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (7, 15, '축구 팁과 요령', '축구 팁과 요령을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (8, 15, '축구 슛 연습하기', '축구 슛을 연습하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 15, '기술의 비밀: 축구', '축구 기술의 비밀을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 15, '슈팅의 기본: 축구', '축구 슈팅의 기본을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 15, '고급 축구 기술 배우기', '고급 축구 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 15, '축구 기술의 모든 것', '축구 기술의 모든 것을 배우는 과정을 담은 영상입니다.');

# 98 ~ 112 파쿠르
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 19, '기술 강의: 파쿠르의 기초', '파쿠르의 기초 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 19, '파쿠르에서의 장애물 넘기', '파쿠르에서 장애물을 넘는 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 19, '다양한 파쿠르 기술 배우기', '파쿠르의 다양한 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (23, 19, '초보자를 위한 파쿠르 기술', '파쿠르 초보자를 위한 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 19, '트릭 마스터: 파쿠르 레슨', '트릭 마스터와 함께하는 파쿠르 레슨 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 19, '파쿠르 연습 방법 강의', '파쿠르 연습 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 19, '파쿠르 팁과 요령', '파쿠르 팁과 요령을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (24, 19, '파쿠르로 다양한 트릭 연습하기', '파쿠르로 다양한 트릭을 연습하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 19, '기술의 비밀: 파쿠르', '파쿠르 기술의 비밀을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (27, 19, '파쿠르의 기본 동작 배우기', '파쿠르의 기본 동작을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 19, '고급 파쿠르 기술 배우기', '고급 파쿠르 기술을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 19, '파쿠르 기술의 모든 것', '파쿠르 기술의 모든 것을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (27, 19, '파쿠르 트릭 마스터하기', '파쿠르 트릭을 마스터하는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 19, '파쿠르 강의: 기초부터 고급까지', '파쿠르 강의로 기초부터 고급 기술까지 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 19, '트릭 마스터의 비결: 파쿠르', '파쿠르 트릭을 마스터하는 비결을 담은 영상입니다.');

# 113 ~ 136 : 헬스
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (18, 20, '근력 운동의 기초', '근력 운동의 기초를 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (3, 20, '유산소 운동 팁', '유산소 운동의 팁과 요령을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (3, 20, '효과적인 스트레칭 방법', '효과적인 스트레칭 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (4, 20, '웨이트 트레이닝 기본', '웨이트 트레이닝의 기본을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (5, 20, '다이어트 운동 가이드', '다이어트에 도움이 되는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (6, 20, '전신 운동 프로그램', '전신 운동 프로그램을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (7, 20, '홈트레이닝 루틴', '홈트레이닝 루틴을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (8, 20, '운동 후 회복 방법', '운동 후 회복 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (9, 20, '근육 성장 비결', '근육 성장을 위한 비결을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (10, 20, '체지방 감소 운동', '체지방을 감소시키는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (11, 20, '집에서 할 수 있는 운동', '집에서 할 수 있는 다양한 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (12, 20, '유연성 향상 스트레칭', '유연성을 향상시키는 스트레칭 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (13, 20, '심폐 지구력 강화 운동', '심폐 지구력을 강화하는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (30, 20, '복근 운동 팁', '복근 운동 팁을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (33, 20, '근력 강화 운동', '근력을 강화시키는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (34, 20, '다이어트를 위한 운동', '다이어트를 위한 다양한 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (34, 20, '스트레스 해소 운동', '스트레스를 해소하는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (26, 20, '유산소와 무산소 운동 병행', '유산소와 무산소 운동을 병행하는 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (19, 20, '균형 잡힌 운동 계획', '균형 잡힌 운동 계획을 세우는 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 20, '초보자를 위한 운동 가이드', '운동 초보자를 위한 가이드를 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 20, '강도 높은 인터벌 트레이닝', '강도 높은 인터벌 트레이닝 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 20, '운동 동기 부여 방법', '운동 동기 부여 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 20, '체형 개선 운동', '체형을 개선하는 운동 방법을 배우는 과정을 담은 영상입니다.');
INSERT INTO video (uploader_no, exercise_no, title, content) VALUES (2, 20, '운동 후 영양 관리', '운동 후 영양 관리 방법을 배우는 과정을 담은 영상입니다.');



# COMMENT INSERT

select * from video;

# 댓글
# 댄스
INSERT INTO comment (video_no, member_no, content) VALUES (1, 5, '김지우 춤 정말 잘 춰요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 12, '장규진 춤 정말 인상적이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 8, '오해원 춤이 너무 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 21, '김지우 춤 선이 정말 예뻐요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 30, '장규진 춤 너무 잘 춰요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 11, '오해원 춤에서 에너지가 느껴져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 15, '김지우 춤 실력 정말 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 18, '장규진 춤에 매료됐어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 25, '오해원 춤 너무 잘 춰요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 6, '김지우 춤이 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 13, '장규진 춤 정말 멋있어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 22, '오해원 춤이 예술이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 19, '김지우 춤 실력 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 3, '장규진 춤 너무 잘 춰요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 29, '오해원 춤에서 감동 받았어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 33, '김지우 춤 정말 매력적이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 27, '장규진 춤을 잘 추네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 2, '오해원 춤 실력 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 17, '김지우 춤 너무 잘 춰요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 4, '장규진 춤 실력이 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 38, '오해원 춤이 정말 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 24, '김지우 춤이 예술이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 9, '장규진 춤을 잘 추네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 40, '오해원 춤에서 에너지가 넘쳐요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 7, '김지우 춤 정말 멋있어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 36, '장규진 춤 실력 정말 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 31, '오해원 춤 너무 잘 추네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 20, '김지우 춤 선이 아름다워요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 14, '장규진 춤 정말 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (1, 41, '오해원 춤에 매료됐어요!');

#헬스
INSERT INTO comment (video_no, member_no, content) VALUES (135, 5, '등근육이 정말 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 12, '등근육이 정말 대단합니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 8, '등근육이 예술이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 21, '후면 측두근이 죽이네요');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 30, '등근육 발달이 정말 인상적이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 11, '등근육이 정말 탄탄하네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 15, '등근육이 놀랍습니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 18, '등근육이 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 25, '등근육 발달이 정말 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 6, '등근육이 완벽해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 13, '등근육이 진짜 멋집니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 22, '등근육이 정말 예술이네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 19, '등근육이 아주 인상적입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 3, '등근육이 정말 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 29, '등근육이 진짜 강력해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 33, '등근육이 정말 훌륭해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 27, '등근육이 정말 탄탄하네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 2, '등근육 발달이 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 17, '등근육이 정말 예술입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (135, 4, '등근육이 정말 놀랍습니다!');

#스케이트보드
INSERT INTO comment (video_no, member_no, content) VALUES (76, 18, '롱보드 저도 배워보고 싶어여');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 5, '롱보드 실력이 정말 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 12, '롱보드 타는 모습이 너무 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 8, '롱보드 타는 모습이 예술이네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 21, '롱보드 실력 정말 인상적입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 30, '롱보드 타는 기술이 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 11, '롱보드 실력에 감탄했어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 15, '롱보드 타는 모습이 정말 멋있어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 18, '롱보드 실력이 너무 좋아요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 25, '롱보드 타는 기술이 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 6, '롱보드 타는 모습이 너무 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 13, '롱보드 실력이 정말 최고입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 22, '롱보드 타는 기술이 예술이에요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 19, '롱보드 실력에 감동받았어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 3, '롱보드 타는 모습이 너무 멋있어요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 29, '롱보드 실력이 정말 인상적입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 33, '롱보드 타는 기술이 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 27, '롱보드 실력이 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 2, '롱보드 타는 모습이 예술이네요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 17, '롱보드 실력이 너무 좋아요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 4, '롱보드 타는 기술이 최고입니다!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 20, '영상미가 정말 멋져요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 7, '영상미가 대단해요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 31, '영상미가 최고예요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 40, '영상미가 너무 예뻐요!');
INSERT INTO comment (video_no, member_no, content) VALUES (76, 14, '영상미가 인상적이에요!');
 
 # LIKE_VIDEO INSERT
 INSERT INTO like_video (video_no, member_no) VALUES (23, 15);
INSERT INTO like_video (video_no, member_no) VALUES (56, 22);
INSERT INTO like_video (video_no, member_no) VALUES (45, 8);
INSERT INTO like_video (video_no, member_no) VALUES (78, 17);
INSERT INTO like_video (video_no, member_no) VALUES (100, 3);
INSERT INTO like_video (video_no, member_no) VALUES (34, 9);
INSERT INTO like_video (video_no, member_no) VALUES (65, 20);
INSERT INTO like_video (video_no, member_no) VALUES (112, 5);
INSERT INTO like_video (video_no, member_no) VALUES (87, 11);
INSERT INTO like_video (video_no, member_no) VALUES (59, 14);
INSERT INTO like_video (video_no, member_no) VALUES (120, 7);
INSERT INTO like_video (video_no, member_no) VALUES (66, 16);
INSERT INTO like_video (video_no, member_no) VALUES (98, 2);
INSERT INTO like_video (video_no, member_no) VALUES (130, 13);
INSERT INTO like_video (video_no, member_no) VALUES (29, 21);
INSERT INTO like_video (video_no, member_no) VALUES (75, 10);
INSERT INTO like_video (video_no, member_no) VALUES (52, 6);
INSERT INTO like_video (video_no, member_no) VALUES (135, 1);
INSERT INTO like_video (video_no, member_no) VALUES (17, 4);
INSERT INTO like_video (video_no, member_no) VALUES (89, 12);
INSERT INTO like_video (video_no, member_no) VALUES (36, 19);
INSERT INTO like_video (video_no, member_no) VALUES (123, 3);
INSERT INTO like_video (video_no, member_no) VALUES (71, 14);
INSERT INTO like_video (video_no, member_no) VALUES (93, 15);
INSERT INTO like_video (video_no, member_no) VALUES (116, 7);
INSERT INTO like_video (video_no, member_no) VALUES (81, 11);
INSERT INTO like_video (video_no, member_no) VALUES (47, 8);
INSERT INTO like_video (video_no, member_no) VALUES (108, 9);
INSERT INTO like_video (video_no, member_no) VALUES (39, 20);
INSERT INTO like_video (video_no, member_no) VALUES (63, 13);
INSERT INTO like_video (video_no, member_no) VALUES (28, 17);
INSERT INTO like_video (video_no, member_no) VALUES (102, 5);
INSERT INTO like_video (video_no, member_no) VALUES (55, 2);
INSERT INTO like_video (video_no, member_no) VALUES (19, 10);
INSERT INTO like_video (video_no, member_no) VALUES (95, 18);
INSERT INTO like_video (video_no, member_no) VALUES (49, 15);
INSERT INTO like_video (video_no, member_no) VALUES (77, 1);
INSERT INTO like_video (video_no, member_no) VALUES (88, 14);
INSERT INTO like_video (video_no, member_no) VALUES (133, 11);
INSERT INTO like_video (video_no, member_no) VALUES (25, 7);
INSERT INTO like_video (video_no, member_no) VALUES (84, 16);
INSERT INTO like_video (video_no, member_no) VALUES (113, 19);
INSERT INTO like_video (video_no, member_no) VALUES (37, 3);
INSERT INTO like_video (video_no, member_no) VALUES (68, 8);
INSERT INTO like_video (video_no, member_no) VALUES (125, 21);
INSERT INTO like_video (video_no, member_no) VALUES (91, 4);
INSERT INTO like_video (video_no, member_no) VALUES (41, 18);
INSERT INTO like_video (video_no, member_no) VALUES (82, 12);
INSERT INTO like_video (video_no, member_no) VALUES (21, 2);
INSERT INTO like_video (video_no, member_no) VALUES (53, 13);
INSERT INTO like_video (video_no, member_no) VALUES (103, 6);
INSERT INTO like_video (video_no, member_no) VALUES (48, 1);
INSERT INTO like_video (video_no, member_no) VALUES (117, 14);
INSERT INTO like_video (video_no, member_no) VALUES (31, 5);
INSERT INTO like_video (video_no, member_no) VALUES (101, 3);
INSERT INTO like_video (video_no, member_no) VALUES (62, 17);
INSERT INTO like_video (video_no, member_no) VALUES (73, 11);
INSERT INTO like_video (video_no, member_no) VALUES (57, 18);
INSERT INTO like_video (video_no, member_no) VALUES (111, 7);
INSERT INTO like_video (video_no, member_no) VALUES (26, 4);
INSERT INTO like_video (video_no, member_no) VALUES (86, 12);
INSERT INTO like_video (video_no, member_no) VALUES (134, 9);
INSERT INTO like_video (video_no, member_no) VALUES (44, 16);
INSERT INTO like_video (video_no, member_no) VALUES (99, 2);
INSERT INTO like_video (video_no, member_no) VALUES (58, 20);
INSERT INTO like_video (video_no, member_no) VALUES (126, 5);
INSERT INTO like_video (video_no, member_no) VALUES (74, 1);
INSERT INTO like_video (video_no, member_no) VALUES (38, 11);
INSERT INTO like_video (video_no, member_no) VALUES (13, 8);
INSERT INTO like_video (video_no, member_no) VALUES (92, 19);
INSERT INTO like_video (video_no, member_no) VALUES (30, 6);
INSERT INTO like_video (video_no, member_no) VALUES (20, 10);
INSERT INTO like_video (video_no, member_no) VALUES (105, 17);
INSERT INTO like_video (video_no, member_no) VALUES (51, 15);
INSERT INTO like_video (video_no, member_no) VALUES (118, 7);
INSERT INTO like_video (video_no, member_no) VALUES (33, 12);
INSERT INTO like_video (video_no, member_no) VALUES (76, 9);
INSERT INTO like_video (video_no, member_no) VALUES (114, 4);
INSERT INTO like_video (video_no, member_no) VALUES (12, 21);
INSERT INTO like_video (video_no, member_no) VALUES (61, 5);
INSERT INTO like_video (video_no, member_no) VALUES (54, 3);
INSERT INTO like_video (video_no, member_no) VALUES (79, 2);
INSERT INTO like_video (video_no, member_no) VALUES (109, 11);
INSERT INTO like_video (video_no, member_no) VALUES (40, 14);
INSERT INTO like_video (video_no, member_no) VALUES (90, 10);
INSERT INTO like_video (video_no, member_no) VALUES (22, 8);
INSERT INTO like_video (video_no, member_no) VALUES (85, 4);
INSERT INTO like_video (video_no, member_no) VALUES (119, 13);
INSERT INTO like_video (video_no, member_no) VALUES (46, 19);
INSERT INTO like_video (video_no, member_no) VALUES (131, 7);
INSERT INTO like_video (video_no, member_no) VALUES (67, 12);
INSERT INTO like_video (video_no, member_no) VALUES (104, 20);
INSERT INTO like_video (video_no, member_no) VALUES (15, 5);
INSERT INTO like_video (video_no, member_no) VALUES (128, 9);
INSERT INTO like_video (video_no, member_no) VALUES (72, 16);
INSERT INTO like_video (video_no, member_no) VALUES (18, 3);
INSERT INTO like_video (video_no, member_no) VALUES (96, 8);
INSERT INTO like_video (video_no, member_no) VALUES (122, 10);
INSERT INTO like_video (video_no, member_no) VALUES (64, 4);
INSERT INTO like_video (video_no, member_no) VALUES (124, 11);
INSERT INTO like_video (video_no, member_no) VALUES (50, 14);
INSERT INTO like_video (video_no, member_no) VALUES (14, 17);
INSERT INTO like_video (video_no, member_no) VALUES (70, 9);
INSERT INTO like_video (video_no, member_no) VALUES (132, 6);
INSERT INTO like_video (video_no, member_no) VALUES (27, 1);
INSERT INTO like_video (video_no, member_no) VALUES (94, 13);
INSERT INTO like_video (video_no, member_no) VALUES (16, 20);
INSERT INTO like_video (video_no, member_no) VALUES (121, 7);
INSERT INTO like_video (video_no, member_no) VALUES (43, 5);
INSERT INTO like_video (video_no, member_no) VALUES (60, 4);
INSERT INTO like_video (video_no, member_no) VALUES (11, 8);
INSERT INTO like_video (video_no, member_no) VALUES (80, 10);
INSERT INTO like_video (video_no, member_no) VALUES (32, 6);
INSERT INTO like_video (video_no, member_no) VALUES (69, 19);
INSERT INTO like_video (video_no, member_no) VALUES (115, 2);
INSERT INTO like_video (video_no, member_no) VALUES (24, 14);
INSERT INTO like_video (video_no, member_no) VALUES (107, 11);
INSERT INTO like_video (video_no, member_no) VALUES (9, 1);
INSERT INTO like_video (video_no, member_no) VALUES (83, 7);
INSERT INTO like_video (video_no, member_no) VALUES (97, 18);
INSERT INTO like_video (video_no, member_no) VALUES (10, 13);
INSERT INTO like_video (video_no, member_no) VALUES (110, 4);
INSERT INTO like_video (video_no, member_no) VALUES (5, 2);
INSERT INTO like_video (video_no, member_no) VALUES (30, 17);
INSERT INTO like_video (video_no, member_no) VALUES (20, 5);
INSERT INTO like_video (video_no, member_no) VALUES (72, 1);
INSERT INTO like_video (video_no, member_no) VALUES (50, 9);
INSERT INTO like_video (video_no, member_no) VALUES (97, 8);
INSERT INTO like_video (video_no, member_no) VALUES (132, 15);
INSERT INTO like_video (video_no, member_no) VALUES (64, 20);
INSERT INTO like_video (video_no, member_no) VALUES (39, 5);
INSERT INTO like_video (video_no, member_no) VALUES (51, 1);
INSERT INTO like_video (video_no, member_no) VALUES (118, 7);
INSERT INTO like_video (video_no, member_no) VALUES (75, 12);
INSERT INTO like_video (video_no, member_no) VALUES (22, 11);
INSERT INTO like_video (video_no, member_no) VALUES (43, 9);
INSERT INTO like_video (video_no, member_no) VALUES (83, 16);
INSERT INTO like_video (video_no, member_no) VALUES (63, 13);
INSERT INTO like_video (video_no, member_no) VALUES (104, 4);
INSERT INTO like_video (video_no, member_no) VALUES (123, 2);
INSERT INTO like_video (video_no, member_no) VALUES (89, 6);
INSERT INTO like_video (video_no, member_no) VALUES (47, 8);


# LIKE_COMMENT INSERT
INSERT INTO like_comment (comment_no, member_no) VALUES (14, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (23, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (56, 22);
INSERT INTO like_comment (comment_no, member_no) VALUES (45, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (13, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (34, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (65, 20);
INSERT INTO like_comment (comment_no, member_no) VALUES (12, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (37, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (59, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (20, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (66, 16);
INSERT INTO like_comment (comment_no, member_no) VALUES (42, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (18, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (32, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (29, 21);
INSERT INTO like_comment (comment_no, member_no) VALUES (15, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (52, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (35, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (17, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (26, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (36, 19);
INSERT INTO like_comment (comment_no, member_no) VALUES (25, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (71, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (14, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (51, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (28, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (47, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (61, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (33, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (24, 20);
INSERT INTO like_comment (comment_no, member_no) VALUES (68, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (31, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (53, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (55, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (16, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (70, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (39, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (49, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (19, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (43, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (57, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (41, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (74, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (44, 16);
INSERT INTO like_comment (comment_no, member_no) VALUES (22, 19);
INSERT INTO like_comment (comment_no, member_no) VALUES (37, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (68, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (12, 21);
INSERT INTO like_comment (comment_no, member_no) VALUES (9, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (50, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (60, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (45, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (62, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (10, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (38, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (54, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (48, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (13, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (27, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (6, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (11, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (22, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (58, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (64, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (17, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (52, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (26, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (46, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (31, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (75, 16);
INSERT INTO like_comment (comment_no, member_no) VALUES (63, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (14, 20);
INSERT INTO like_comment (comment_no, member_no) VALUES (57, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (18, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (23, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (55, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (3, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (29, 19);
INSERT INTO like_comment (comment_no, member_no) VALUES (7, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (24, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (16, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (28, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (44, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (67, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (19, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (72, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (32, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (10, 20);
INSERT INTO like_comment (comment_no, member_no) VALUES (35, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (36, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (30, 16);
INSERT INTO like_comment (comment_no, member_no) VALUES (71, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (1, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (61, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (21, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (25, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (51, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (33, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (39, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (47, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (40, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (53, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (73, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (34, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (70, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (49, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (15, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (42, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (69, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (60, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (20, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (5, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (9, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (2, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (50, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (27, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (59, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (66, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (76, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (8, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (11, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (4, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (64, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (74, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (41, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (38, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (54, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (31, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (63, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (43, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (21, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (14, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (26, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (68, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (46, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (37, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (65, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (30, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (48, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (58, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (72, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (7, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (22, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (35, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (40, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (17, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (36, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (25, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (56, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (32, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (12, 18);
INSERT INTO like_comment (comment_no, member_no) VALUES (18, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (44, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (67, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (73, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (28, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (62, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (13, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (39, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (53, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (9, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (71, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (24, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (29, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (55, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (19, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (45, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (61, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (34, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (70, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (15, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (42, 17);
INSERT INTO like_comment (comment_no, member_no) VALUES (27, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (50, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (57, 2);
INSERT INTO like_comment (comment_no, member_no) VALUES (16, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (41, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (74, 5);
INSERT INTO like_comment (comment_no, member_no) VALUES (66, 14);
INSERT INTO like_comment (comment_no, member_no) VALUES (52, 3);
INSERT INTO like_comment (comment_no, member_no) VALUES (11, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (60, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (33, 9);
INSERT INTO like_comment (comment_no, member_no) VALUES (54, 11);
INSERT INTO like_comment (comment_no, member_no) VALUES (36, 15);
INSERT INTO like_comment (comment_no, member_no) VALUES (3, 4);
INSERT INTO like_comment (comment_no, member_no) VALUES (69, 8);
INSERT INTO like_comment (comment_no, member_no) VALUES (38, 10);
INSERT INTO like_comment (comment_no, member_no) VALUES (31, 6);
INSERT INTO like_comment (comment_no, member_no) VALUES (6, 7);
INSERT INTO like_comment (comment_no, member_no) VALUES (47, 1);
INSERT INTO like_comment (comment_no, member_no) VALUES (58, 12);
INSERT INTO like_comment (comment_no, member_no) VALUES (26, 13);
INSERT INTO like_comment (comment_no, member_no) VALUES (75, 5);


# FOLLOW INSERT
INSERT INTO follow (following_no, follower_no) VALUES (28, 31);
INSERT INTO follow (following_no, follower_no) VALUES (1, 13);
INSERT INTO follow (following_no, follower_no) VALUES (27, 3);
INSERT INTO follow (following_no, follower_no) VALUES (10, 33);
INSERT INTO follow (following_no, follower_no) VALUES (26, 7);
INSERT INTO follow (following_no, follower_no) VALUES (32, 12);
INSERT INTO follow (following_no, follower_no) VALUES (16, 19);
INSERT INTO follow (following_no, follower_no) VALUES (15, 6);
INSERT INTO follow (following_no, follower_no) VALUES (22, 40);
INSERT INTO follow (following_no, follower_no) VALUES (34, 2);
INSERT INTO follow (following_no, follower_no) VALUES (18, 11);
INSERT INTO follow (following_no, follower_no) VALUES (9, 35);
INSERT INTO follow (following_no, follower_no) VALUES (39, 25);
INSERT INTO follow (following_no, follower_no) VALUES (17, 36);
INSERT INTO follow (following_no, follower_no) VALUES (5, 21);
INSERT INTO follow (following_no, follower_no) VALUES (20, 14);
INSERT INTO follow (following_no, follower_no) VALUES (37, 4);
INSERT INTO follow (following_no, follower_no) VALUES (24, 29);
INSERT INTO follow (following_no, follower_no) VALUES (38, 8);
INSERT INTO follow (following_no, follower_no) VALUES (30, 23);
INSERT INTO follow (following_no, follower_no) VALUES (3, 1);
INSERT INTO follow (following_no, follower_no) VALUES (11, 18);
INSERT INTO follow (following_no, follower_no) VALUES (6, 15);
INSERT INTO follow (following_no, follower_no) VALUES (40, 22);
INSERT INTO follow (following_no, follower_no) VALUES (14, 20);
INSERT INTO follow (following_no, follower_no) VALUES (4, 37);
INSERT INTO follow (following_no, follower_no) VALUES (19, 17);
INSERT INTO follow (following_no, follower_no) VALUES (12, 32);
INSERT INTO follow (following_no, follower_no) VALUES (31, 28);
INSERT INTO follow (following_no, follower_no) VALUES (13, 9);
INSERT INTO follow (following_no, follower_no) VALUES (36, 16);
INSERT INTO follow (following_no, follower_no) VALUES (7, 26);
INSERT INTO follow (following_no, follower_no) VALUES (2, 34);
INSERT INTO follow (following_no, follower_no) VALUES (33, 10);
INSERT INTO follow (following_no, follower_no) VALUES (25, 39);
INSERT INTO follow (following_no, follower_no) VALUES (8, 30);
INSERT INTO follow (following_no, follower_no) VALUES (21, 5);
INSERT INTO follow (following_no, follower_no) VALUES (29, 24);


UPDATE member SET profile_img = 'member_5.png' WHERE no = 5;
UPDATE member SET profile_img = 'member_6.png' WHERE no = 6;
UPDATE member SET profile_img = 'member_7.png' WHERE no = 7;
UPDATE member SET profile_img = 'member_8.png' WHERE no = 8;
UPDATE member SET profile_img = 'member_9.png' WHERE no = 9;
UPDATE member SET profile_img = 'member_10.png' WHERE no = 10;
UPDATE member SET profile_img = 'member_11.png' WHERE no = 11;
UPDATE member SET profile_img = 'member_12.png' WHERE no = 12;
UPDATE member SET profile_img = 'member_13.png' WHERE no = 13;
UPDATE member SET profile_img = 'member_14.png' WHERE no = 14;
UPDATE member SET profile_img = 'member_15.png' WHERE no = 15;
UPDATE member SET profile_img = 'member_16.png' WHERE no = 16;
UPDATE member SET profile_img = 'member_17.png' WHERE no = 17;
UPDATE member SET profile_img = 'member_18.png' WHERE no = 18;
UPDATE member SET profile_img = 'member_19.png' WHERE no = 19;
UPDATE member SET profile_img = 'member_20.png' WHERE no = 20;
UPDATE member SET profile_img = 'member_21.png' WHERE no = 21;
UPDATE member SET profile_img = 'member_22.png' WHERE no = 22;
UPDATE member SET profile_img = 'member_23.png' WHERE no = 23;
UPDATE member SET profile_img = 'member_24.png' WHERE no = 24;
UPDATE member SET profile_img = 'member_25.png' WHERE no = 25;
UPDATE member SET profile_img = 'member_26.png' WHERE no = 26;


select * from member;