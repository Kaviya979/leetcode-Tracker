-- Last updated: 09/07/2026, 15:09:20
# Write your MySQL query statement below
SELECT email AS Email
FROM person
GROUP BY email
HAVING COUNT(*) > 1;