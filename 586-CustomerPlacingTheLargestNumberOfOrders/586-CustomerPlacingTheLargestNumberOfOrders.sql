-- Last updated: 09/07/2026, 15:07:39
# Write your MySQL query statement below
SELECT Customer_number
FROM Orders
GROUP BY Customer_number
ORDER BY COUNT(Order_number)DESC
LIMIT 1;