-- ���̺��� �Ӽ��̸��� ���� �̸����� �����.
-- day10�� �����迡 ������ �����и� �Է��ϴ� ���̺��ε�
-- �Ӽ��� �̸��� StudentDTO�� �ʵ� �̸����� ������.
-- int - NUMBER ũ�Ⱑ ���� ������
-- String�� VARCHAR2�� ũ�Ⱑ 50�� ������
-- stdNo�� PK�� �����ϰ� ��� �÷�(�Ӽ�)�� not null��.
-- table �̸��� gisaTBL
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