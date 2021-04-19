-- employees�� �ִ� ��������� ������
SELECT * FROM EMPLOYEES;
-- department_id ��ȸ����. 80���� ��ȸ
SELECT department_id,commission_pct from employees
WHERE DEPARTMENT_ID = 80;
-- ǥ���� �������� ���
SELECT department_id,commission_pct from employees
WHERE DEPARTMENT_ID = (select department_id from DEPARTMENTS 
where department_name = 'Sales');

--������ ������ ��ȸ�Ͻÿ�.(commission point�� �ִ� ������ ��ȸ�Ͻÿ�.)
select * from employees where commission_pct is not null;-- commission_pct > 0;
-- �μ��� ��� ������ �������.

select department_id from DEPARTMENTS 
where department_name = 'Sales';

-- ��� ������ ������ ��ȸ�Ͻÿ�
SELECT employee_id, salary, salary*12 as annual
from employees;

-- ��� ������ ������ ������ �����Ͽ� ��ȸ
SELECT employee_id, salary, salary*12+(salary*12*commission_pct) as annual
from employees;

--�ĸ��� �ٿ��� ���
SELECT employee_id, salary,
TO_CHAR(salary*12+(salary*12*commission_pct),'999,999,999') as annual
from employees;

