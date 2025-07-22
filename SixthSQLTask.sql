WITH LastHired AS (
    SELECT 
        DEPTNO,
        ENAME,
        HIREDATE,
        RANK() OVER (PARTITION BY DEPTNO ORDER BY HIREDATE DESC) AS hire_rank
    FROM 
        EMP
)
SELECT 
    DEPTNO,
    ENAME,
    HIREDATE
FROM 
    LastHired
WHERE 
    hire_rank = 1
ORDER BY 
    HIREDATE;