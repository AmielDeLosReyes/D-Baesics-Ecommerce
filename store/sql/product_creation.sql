-- Variables for Product Details
SET @productId = 5;  -- Replace with the actual product_id
SET @productName = 'Challis Double Lining Peplum Top';
SET @oldPrice = 259.00;
SET @currentPrice = 181.00;
SET @productDescription = 'Introducing the Challis Double Lining Peplum Top – a perfect fusion of style and comfort. Crafted with precision, this top features a luxurious challis fabric that exudes softness and flows gracefully. The double lining ensures not only maximum coverage but also shapes a flattering peplum silhouette. Versatile for both casual and dressy occasions, this top adds a touch of sophistication with its chic peplum design. Pair it with your favorite jeans for a laid-back look or elevate your style with tailored trousers or a skirt for a more refined ensemble. The Challis Double Lining Peplum Top is your go-to choice for effortlessly chic and feminine fashion.';

-- Insert into PRODUCT table
INSERT INTO PRODUCT (product_id, product_name, old_price, current_price, product_description)
VALUES (@productId, @productName, @oldPrice, @currentPrice, @productDescription);

-- Insert into PRODUCT_COLOR
INSERT INTO PRODUCT_COLOR (color_name)
VALUES ('blue'), ('black'), ('red');

-- Insert into PRODUCT_SIZE
INSERT INTO PRODUCT_SIZE (size_name)
VALUES ('small'), ('medium'), ('large');

-- Insert into PRODUCT_SIZE_MAPPING for each size
INSERT INTO PRODUCT_SIZE_MAPPING (product_id, size_id)
VALUES
    (@productId, (SELECT size_id FROM PRODUCT_SIZE WHERE size_name = 'small' LIMIT 1)),
    (@productId, (SELECT size_id FROM PRODUCT_SIZE WHERE size_name = 'medium' LIMIT 1)),
    (@productId, (SELECT size_id FROM PRODUCT_SIZE WHERE size_name = 'large' LIMIT 1));

-- Insert into PRODUCT_COLOR_MAPPING for each color
-- Assuming you have the actual product_id and color_id values
INSERT INTO PRODUCT_COLOR_MAPPING (product_id, color_id)
VALUES
    (@productId, (SELECT color_id FROM PRODUCT_COLOR WHERE color_name = 'blue' LIMIT 1)),
    (@productId, (SELECT color_id FROM PRODUCT_COLOR WHERE color_name = 'black' LIMIT 1)),
    (@productId, (SELECT color_id FROM PRODUCT_COLOR WHERE color_name = 'red' LIMIT 1));
    -- (@productId, (SELECT color_id FROM PRODUCT_COLOR WHERE color_name = 'white' LIMIT 1));



-- Iterate through image files
INSERT INTO PRODUCT_IMAGE (product_id, image_url)
VALUES
    (@productId, 'img/products/product5/blue/bl1.png'),
    (@productId, 'img/products/product5/blue/bl2.png'),
    (@productId, 'img/products/product5/black/b1.png'),
    (@productId, 'img/products/product5/red/r1.png');
  
    
