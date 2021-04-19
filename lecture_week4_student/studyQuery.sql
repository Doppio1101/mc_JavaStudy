--Null�� �� 0���� ġȯ
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
select * from employees; --Steven King�� �����̶� �Ŵ����� ����.

--outer join(�ܺ� ����)�� ON���� ���� join���ǿ� ��߳��� �͵鵵 ����� �� �ֵ��� ���ش�.
-- left outer join�� from������ ���� ���̺��� on���ǿ� ������� �� ���;� �ȴ�.
-- right outer join�� join������ ���� ���̺��� on���ǿ� ������� �� ���;� �ȴ�.
-- full outer join�� ��� ���̺��� on���ǿ� ������� �� ���;� �ȴ�.
SELECT emp.employee_id, mgr.employee_id, mgr.first_name, mgr.last_name
FROM employees mgr
right outer JOIN employees emp
on mgr.employee_id = emp.manager_id;

--���÷��̿� �Ҵ�� ����Ʈ��Ʈ ���̵� �� �� ���� �ִ°� ���� �����ϰ� 11����
SELECT count(distinct department_id) from employees;
SELECT distinct department_id from employees;

-- ��ġ���� ���� ������ null�� ǥ�� ��ġ���� ���� ���� ��ȸ
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
left outer JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- ������ ���� �μ��� � �μ����� Ȯ��
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
right outer JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- ��ġ�� �Ϸ���� �ʴ� ������ ������ ���� �μ� ��ȸ
SELECT e.EMPLOYEE_ID, e.first_name ,e.DEPARTMENT_ID, d.DEPARTMENT_NAME
FROM employees e
JOIN DEPARTMENTS d
ON e.department_id = d.department_id;

-- CROSS JOIN(��ȣ ����)�� on���� ������ �� ���Ѵ�.

select * from gisaTBL;
delete from gisaTBL;

select count(*) from gisaTBL;

