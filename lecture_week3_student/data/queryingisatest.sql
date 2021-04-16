-- 테이블의 속성이름을 변수 이름으로 만든다.
-- day10의 기사시험에 나오는 데이털르 입력하는 테이블인데
-- 속성의 이름을 StudentDTO의 필드 이름으로 만들자.
-- int - NUMBER 크기가 없는 것으로
-- String은 VARCHAR2로 크기가 50인 것으로
-- stdNo는 PK로 선정하고 모든 컬럼(속성)은 not null임.
-- table 이름은 gisaTBL
CREATE TABLE gisaTBL
(
	stdNo NUMBER PRIMARY KEY NOT NULL,
	email VARCHAR2(50) NOT NULL,
	kor NUMBER NOT NULL,
	eng NUMBER NOT NULL,
	math NUMBER NOT NULL,
	sci NUMBER NOT NULL,
	hist NUMBER NOT NULL,
	total NUMBER NOT NULL,
	MgrCode VARCHAR2(50) NOT NULL,
	accPoint VARCHAR2(50) NOT NULL,
	localCode VARCHAR2(50) NOT NULL

);
SELECT * FROM gisaTBL;