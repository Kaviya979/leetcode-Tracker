-- Last updated: 09/07/2026, 15:07:03
SELECT 
    player_id, 
    MIN(event_date) AS first_login
FROM 
    Activity
GROUP BY 
    player_id;

