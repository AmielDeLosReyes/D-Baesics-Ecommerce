-- Replace @productId with the actual product_id
SET @productId = 1;

-- Select all items that are specific color for the given product_id
SELECT DISTINCT
    P.product_id,
    P.product_name,
    P.old_price,
    P.current_price,
    P.product_description,
    C.color_name
FROM
    PRODUCT P
JOIN
    PRODUCT_COLOR_MAPPING PCM ON P.product_id = PCM.product_id
JOIN
    PRODUCT_COLOR C ON PCM.color_id = C.color_id
JOIN
    PRODUCT_SIZE_MAPPING PSM ON P.product_id = PSM.product_id
JOIN
    PRODUCT_SIZE S ON PSM.size_id = S.size_id
WHERE
    P.product_id = @productId
    AND C.color_name = 'nude';
    
    
-- Select all items that are all colors for the given product_id
SELECT DISTINCT
    P.product_id,
    P.product_name,
    P.old_price,
    P.current_price,
    P.product_description,
    C.color_name
FROM
    PRODUCT P
JOIN
    PRODUCT_COLOR_MAPPING PCM ON P.product_id = PCM.product_id
JOIN
    PRODUCT_COLOR C ON PCM.color_id = C.color_id
JOIN
    PRODUCT_SIZE_MAPPING PSM ON P.product_id = PSM.product_id
JOIN
    PRODUCT_SIZE S ON PSM.size_id = S.size_id
WHERE
    P.product_id = @productId
    
