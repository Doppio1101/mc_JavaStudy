CREATE TABLE bookTBL(
	isbn NUMBER(5) primary key,
	title VARCHAR(50) not null,
	author VARCHAR(50) not null,
	publisher VARCHAR(50) not null,
	price NUMBER(6) not null,
	description VARCHAR(200)	
);

COMMENT ON COLUMN bookTBL.isbn IS '도서 번호';
COMMENT ON COLUMN bookTBL.title IS '도서 명';
COMMENT ON COLUMN bookTBL.author IS '저자';
COMMENT ON COLUMN bookTBL.publisher IS '출판사';
COMMENT ON COLUMN bookTBL.price IS '가격';
COMMENT ON COLUMN bookTBL.description IS '상세';

select * from bookTBL;