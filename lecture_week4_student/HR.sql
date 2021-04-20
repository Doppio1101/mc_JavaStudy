select * from USERTBL;
select * from BUYTBL;

-- idNum이 8이 자료의 price를 500으로 변경하시오.
update buytbl
set price = 500
where idNum =8;

--userID가 KBS인 모든 user를 삭제하시오.
delete from buytbl where userID ='KBS';