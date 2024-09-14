/*
 * CREATE TABLE 테이블명(
 * 	컬럼명 타입 (길이),
 * 	컬럼명 타입 (길이),
 * 	컬럼명 타입 (길이),
 * 	컬럼명 타입 (길이)
 * );
 * 
 * 
 * */
-- 이름
-- 나이 


CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(100),
	AGE NUMBER
);
-- 주의점
-- 컬럼이 여러개일때 콤마 (,) 잘 써야함 .
-- 사이에 공백 두지 않기 
-- 같은이름으로는 안만들어짐 

CREATE TABLE TBL_CAR(
	ID NUMBER, -- 차량식별번호 
	BRAND VARCHAR2(100),-- 브랜드
	COLOR VARCHAR2(100),-- 색
	PRICE NUMBER, -- 가격 
	CONSTRAINT CAR_PK PRIMARY KEY(ID) -- 테이블을 생성하면서 제약조건을 지정
);
-- 영구 삭제이기때문에 조심해야함 
DROP TABLE TBL_CAR ;
DROP TABLE TBL_MEMBER ;


CREATE TABLE ex2_10(
	COL1 VARCHAR2(10) NOT NULL,
	COL2 VARCHAR2(10),
	Create_date DATE DEFAULT SYSDATE -- sysdate는 현재시간을 반환을해준다 
);

-- 컬럼명 변경 Col1 -> COl11
-- alter table 테이블명 RENAME COLUMN 기존컬럼명 TO 새로운 컬럼명

ALTER TABLE ex2_10 RENAME COLUMN COL1 TO Col11;

-- 컬럼타입 변경 
-- alter table 테이블명 MODIFY 컬럼명 데이터타입 ;

ALTER TABLE EX2_10 MODIFY COL2 varchar2(30);

-- 컬럼 삭제 
-- alter table 테이블명 drop column 컬럼명;
ALTER TABLE EX2_10 DROP COLUMN CREATE_date;

-- 컬럼추가 
-- alter table 테이블명 add 컬럼명 컬럼타입;
ALTER TABLE EX2_10 ADD col3 number;

-- 제약조건 추가
-- 테이블이 생성된 후 제약조건을 추가 or 삭제 
-- ALTER TABLE 테이블명 add constraint 제약조건명 제약조건종류 (컬럼명);
ALTER TABLE EX2_10 ADD CONSTRAINT pk_ex2_10 PRIMARY key(Col11);

-- 제약조건 삭제
-- alter table 테이블명 drop constraint 제약조건명 
ALTER TABLE EX2_10 DROP CONSTRAINT pk_ex2_10;

-- 테이블생성
--테이블명 TBL_ANIMAL
-- ID 숫자 기본키
-- "TYPE" 문자형 길이 100
-- AGE 숫자형 길이 3
-- FEED 문자형 길이 100

CREATE TABLE TBL_ANIMAL(
	ID NUMBER PRIMARY KEY,
	"TYPE" VARCHAR2(100),
	--오라클에서는 TYPE은 명령어 이기 때문에 명령어를 컬럼으로 사용하고 싶다면 쌍따옴표 안에 넣어야 한다.
	AGE NUMBER(3),
	FEED VARCHAR(100)
);

ALTER TABLE TBL_ANIMAL DROP CONSTRAINT SYS_C007001;

-- 제약조건 추가하기
-- id칼럼에 animal_pk 라는 이름으로 기본키 설정하기

ALTER TABLE tbl_animal ADD CONSTRAINT anumal_pk PRIMARY key(id);

-- tbl_animal 테이블 삭제하기
DROP TABLE TBL_ANIMAL;

-- DEFAULT  와 CHECK 제약조건
CREATE TABLE TBL_STUDENT(
	ID NUMBER, -- 학번
	NAME VARCHAR2(100),-- 이름
	MAJOR VARCHAR2(100),-- 전공
	GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER = 'M' OR GENDER = 'W'), --CHECK 특정조건에 맞는 데이터만 입력받는 제약조건  
	BIRTH DATE CONSTRAINT BAN_DATE CHECK (BIRTH >=TO_DATE('1980-01-01','YYYY-MM-DD')), -- 문자열을 날짜로 형변환시켜주는 함수 
	CONSTRAINT STD_PK PRIMARY KEY(ID)
);

DROP TABLE TBL_STUDENT;


