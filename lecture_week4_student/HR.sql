select * from USERTBL;
select * from BUYTBL;

-- idNum�� 8�� �ڷ��� price�� 500���� �����Ͻÿ�.
update buytbl
set price = 500
where idNum =8;

--userID�� KBS�� ��� user�� �����Ͻÿ�.
delete from buytbl where userID ='KBS';