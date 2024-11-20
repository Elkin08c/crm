-- Tabla Lead
CREATE TABLE IF NOT EXISTS lead (
    id SERIAL PRIMARY KEY,
    customer_id BIGINT NOT NULL, -- Relación con customer
     lead_status VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE CASCADE
    );

-- Tabla Activity
CREATE TABLE IF NOT EXISTS activity (
    id SERIAL PRIMARY KEY,
    lead_id BIGINT NOT NULL,
    activity_type VARCHAR(50),
    activity_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    description TEXT,
    FOREIGN KEY (lead_id) REFERENCES lead(id) ON DELETE CASCADE
    );
