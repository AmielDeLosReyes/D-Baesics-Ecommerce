-- PRODUCT Table
CREATE TABLE PRODUCT (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    old_price DECIMAL(10, 2),
    current_price DECIMAL(10, 2) NOT NULL,
    product_description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- PRODUCT_IMAGE Table
CREATE TABLE PRODUCT_IMAGE (
    image_id INT PRIMARY KEY,
    product_id INT,
    image_url VARCHAR(255) NOT NULL,
    FOREIGN KEY (product_id) REFERENCES PRODUCT(product_id)
);

-- PRODUCT_SIZE Table
CREATE TABLE PRODUCT_SIZE (
    size_id INT PRIMARY KEY,
    size_name VARCHAR(50) NOT NULL
);

-- PRODUCT_COLOR Table
CREATE TABLE PRODUCT_COLOR (
    color_id INT PRIMARY KEY,
    color_name VARCHAR(50) NOT NULL
);

-- PRODUCT_SIZE_MAPPING Table
CREATE TABLE PRODUCT_SIZE_MAPPING (
    product_id INT,
    size_id INT,
    PRIMARY KEY (product_id, size_id),
    FOREIGN KEY (product_id) REFERENCES PRODUCT(product_id),
    FOREIGN KEY (size_id) REFERENCES PRODUCT_SIZE(size_id)
);

-- PRODUCT_COLOR_MAPPING Table
CREATE TABLE PRODUCT_COLOR_MAPPING (
    product_id INT,
    color_id INT,
    PRIMARY KEY (product_id, color_id),
    FOREIGN KEY (product_id) REFERENCES PRODUCT(product_id),
    FOREIGN KEY (color_id) REFERENCES PRODUCT_COLOR(color_id)
);
