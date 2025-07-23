SELECT 
    d.DEPTNO,
    AVG(e.SAL) AS avg_salary
FROM 
    DEPT d
JOIN 
    EMP e ON d.DEPTNO = e.DEPTNO
GROUP BY 
    d.DEPTNO
HAVING 
    COUNT(e.EMPNO) > 3
    AND AVG(e.SAL) > (
        SELECT AVG(e2.SAL)
        FROM EMP e2
        WHERE e2.DEPTNO = 30
    )
ORDER BY 
    d.DEPTNO;