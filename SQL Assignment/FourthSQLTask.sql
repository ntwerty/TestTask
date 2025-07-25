WITH MinSalaries AS (
    SELECT 
        MGR,
        MIN(SAL) AS min_salary
    FROM 
        EMP
    WHERE 
        MGR IS NOT NULL
    GROUP BY 
        MGR
    HAVING 
        MIN(SAL) >= 1000
)
SELECT 
    MGR,
    min_salary AS "MIN(SAL)"
FROM 
    MinSalaries
ORDER BY 
    min_salary ASC;