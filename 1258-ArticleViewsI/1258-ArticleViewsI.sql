-- Last updated: 09/07/2026, 15:06:56
# Write your MySQL query statement below
SELECT DISTINCT
    author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;