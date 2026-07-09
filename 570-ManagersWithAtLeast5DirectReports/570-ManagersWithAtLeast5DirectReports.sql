-- Last updated: 09/07/2026, 15:07:46
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(m.id) >= 5;