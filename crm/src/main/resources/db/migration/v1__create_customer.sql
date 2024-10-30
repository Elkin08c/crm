CREATE TABLE IF NOT EXISTS customer(
    id SERIAL,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone VARCHAR(10),
    address VARCHAR(50),
    PRIMARY KEY(id)
);