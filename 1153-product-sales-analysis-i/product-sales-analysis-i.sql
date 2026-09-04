# Write your MySQL query statement below
SELECT P.product_name,S.year,S.price 
FROM Sales AS S
LEFT JOIN Product AS P
ON P.product_id =S.product_id ;