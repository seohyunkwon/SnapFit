drop database snapfit;

create database snapfit;

use snapfit;

CREATE TABLE Member(
  no BIGINT NOT NULL AUTO_INCREMENT,
  id VARCHAR(30) NOT NULL UNIQUE,
  password VARCHAR(40) NOT NULL,
  nickname VARCHAR(10) NOT NULL,
  profile_img VARCHAR(50) NULL DEFAULT 'default.png',
  birth_date DATE NOT NULL,
  gender INT NOT NULL,
  PRIMARY KEY (no)
);

CREATE TABLE Exercise(
  no BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NULL,
  part VARCHAR(50) NULL,
  PRIMARY KEY (no)
);

CREATE TABLE Video(
  no BIGINT NOT NULL AUTO_INCREMENT,
  uploader_no BIGINT NOT NULL,
  exercise_no BIGINT NOT NULL,
  title VARCHAR(50) NOT NULL,
  content VARCHAR(200) NULL DEFAULT ' ',
  created_date DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (no),
  CONSTRAINT FK_Exercise_TO_Video FOREIGN KEY (exercise_no) REFERENCES Exercise (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Video FOREIGN KEY (uploader_no) REFERENCES Member (no) ON DELETE CASCADE
);

CREATE TABLE Comment(
  no BIGINT NOT NULL AUTO_INCREMENT,
  video_no BIGINT NOT NULL,
  member_no BIGINT NOT NULL,
  content VARCHAR(200) NOT NULL,
  created_date DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (no),
  CONSTRAINT FK_Video_TO_Comment FOREIGN KEY (video_no) REFERENCES Video (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Comment FOREIGN KEY (member_no) REFERENCES Member (no) ON DELETE CASCADE
);

CREATE TABLE Like_Video(
  no BIGINT NOT NULL AUTO_INCREMENT,
  video_no BIGINT NOT NULL,
  member_no BIGINT NOT NULL,
  PRIMARY KEY (no),
  CONSTRAINT FK_Video_TO_Like_Video FOREIGN KEY (video_no) REFERENCES Video (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Like_Video FOREIGN KEY (member_no) REFERENCES Member (no) ON DELETE CASCADE
);

CREATE TABLE Like_Comment(
  no BIGINT NOT NULL AUTO_INCREMENT,
  comment_no BIGINT NOT NULL,
  member_no BIGINT NOT NULL,
  PRIMARY KEY (no),
  CONSTRAINT FK_Comment_TO_Like_Comment FOREIGN KEY (comment_no) REFERENCES Comment (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Like_Comment FOREIGN KEY (member_no) REFERENCES Member (no) ON DELETE CASCADE
);

CREATE TABLE Follow(
  no BIGINT NOT NULL AUTO_INCREMENT,
  following_no BIGINT NOT NULL,
  follower_no BIGINT NOT NULL,
  PRIMARY KEY (no),
  CONSTRAINT FK_Member_TO_Follow FOREIGN KEY (following_no) REFERENCES Member (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Follow1 FOREIGN KEY (follower_no) REFERENCES Member (no) ON DELETE CASCADE
);

CREATE TABLE NotificationCode(
  no BIGINT NOT NULL AUTO_INCREMENT,
  message VARCHAR(50) NOT NULL,
  PRIMARY KEY (no)
);

CREATE TABLE Notification(
  no BIGINT NOT NULL AUTO_INCREMENT,
  sender_no BIGINT NOT NULL,
  receiver_no BIGINT NOT NULL,
  notificationcode_no BIGINT NOT NULL,
  is_read BOOLEAN NOT NULL DEFAULT false,
  created_date DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (no),
  CONSTRAINT FK_Member_TO_Notification FOREIGN KEY (sender_no) REFERENCES Member (no) ON DELETE CASCADE,
  CONSTRAINT FK_Member_TO_Notification1 FOREIGN KEY (receiver_no) REFERENCES Member (no) ON DELETE CASCADE,
  CONSTRAINT FK_NotificationCode_TO_Notification FOREIGN KEY (notificationcode_no) REFERENCES NotificationCode (no) ON DELETE CASCADE
);