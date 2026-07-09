-- Last updated: 09/07/2026, 15:07:07
# Write your MySQL query statement below
SELECT
    actor_id,
    director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;