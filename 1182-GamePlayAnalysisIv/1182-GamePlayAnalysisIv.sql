-- Last updated: 09/07/2026, 15:07:01
# Write your MySQL query statement below
SELECT ROUND(COUNT(a.player_id) / COUNT(f.player_id), 2) AS fraction
FROM (SELECT player_id, MIN(event_date) AS first_date FROM Activity GROUP BY player_id) f
LEFT JOIN Activity a 
  ON f.player_id = a.player_id AND DATEDIFF(a.event_date, f.first_date) = 1;
