CREATE TABLE bookTBL(
	isbn NUMBER(5) primary key,
	title VARCHAR(50) not null,
	author VARCHAR(50) not null,
	publisher VARCHAR(50) not null,
	price NUMBER(6) not null,
	description VARCHAR(200)	
);

COMMENT ON COLUMN bookTBL.isbn IS '���� ��ȣ';
COMMENT ON COLUMN bookTBL.title IS '���� ��';
COMMENT ON COLUMN bookTBL.author IS '����';
COMMENT ON COLUMN bookTBL.publisher IS '���ǻ�';
COMMENT ON COLUMN bookTBL.price IS '����';
COMMENT ON COLUMN bookTBL.description IS '��';

select * from bookTBL;