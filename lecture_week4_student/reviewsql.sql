-- employees에 있는 모든정보를 꺼내기
SELECT * FROM EMPLOYEES;
-- department_id 조회하자. 80번만 조회
SELECT department_id,commission_pct from employees
WHERE DEPARTMENT_ID = 80;
-- 표본을 기준으로 출력
SELECT department_id,commission_pct from employees
WHERE DEPARTMENT_ID = (select department_id from DEPARTMENTS 
where department_name = 'Sales');

--영업부 직원을 조회하시오.(commission point가 있는 직원을 조회하시오.)
select * from employees where commission_pct is not null;-- commission_pct > 0;
-- 부서의 모든 정보를 출력하자.

select department_id from DEPARTMENTS 
where department_name = 'Sales';

-- 모든 직원의 연봉을 조회하시오
SELECT employee_id, salary, salary*12 as annual
from employees;

-- 모든 직원의 연봉을 수당을 포함하여 조회
SELECT employee_id, salary, salary*12+(salary*12*commission_pct) as annual
from employees;

--컴마를 붙여서 출력
SELECT employee_id, salary,
TO_CHAR(salary*12+(salary*12*commission_pct),'999,999,999') as annual
from employees;

