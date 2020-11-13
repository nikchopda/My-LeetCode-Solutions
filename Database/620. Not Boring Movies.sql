# Write your MySQL query statement below
SELECT * FROM cinema WHERE (NOT description='boring') AND (mod(id,2)!=0) ORDER BY rating DESC;