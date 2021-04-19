--Null일 떄 0으로 치환
SELECT employee_id, salary,
TO_CHAR(salary*12+NVL((salary*12*commission_pct),0),'999,999,999') as annual
from employees;

SELECT * 
	FROM buyTbl
		INNER JOIN USERTBL
		ON BUYTBL.userid = userTBL.userID
	WHERE buyTBL.userID = 'KBS';
	
SELECT e.EMPLOYEE_ID, e.DEPARTMENT_ID, d.DEPARTMENT_NAME
	FROM employees e
	INNER JOIN DEPARTMENTS d
	ON e.department_id = d.department_id;
	
SELECT emp.employee_id, mgr.employee_id, mgr.first_name, mgr.last_name
FROM employees mgr
INNER JOIN employees emp
on mgr.employee_id = emp.manager_id;

select count(*) from employees;
select * from employees; --Steven King은 사장이라서 매니저가 없다.

--outer join(외부 조인)은 ON으로 들어온 join조건에 어긋나는 것들도 출력할 수 있도록 해준다.
-- left outer join은 from다음에 오는 테이블은 on조건에 관계없이 다 나와야 된다.
-- right outer join은 join다음에 오는 테이블은 on조건에 관계없이 다 나와야 된다.
-- full outer join은 모든 테이블은 on조건에 관계없이 다 나와야 된다.
SELECT emp.employee_id, mgr.employee_id, mgr.first_name, mgr.last_name
FROM employees mgr
right outer JOIN employees emp
on mgr.employee_id = emp.manager_id;

--임플로이에 할당된 디팔트먼트 아이디가 총 몇 군데 있는가 널을 제외하고 11군데
SELECT count(distinct department_id) from employees;
SELECT distinct department_id from employees;

-- 배치받지 못한 직원은 null로 표시 배치받지 못한 직원 조회
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
left outer JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- 직원이 없는 부서는 어떤 부서인지 확인
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
right outer JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- 배치가 완료되지 않는 직원과 직원이 없는 부서 조회
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- CROSS JOIN(상호 조인)은 on으로 조건을 안 취한다.

select * from gisaTBL;
delete from gisaTBL;

select count(*) from gisaTBL;

