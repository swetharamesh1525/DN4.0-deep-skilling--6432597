CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY, 
    name VARCHAR2(50),              
    balance NUMBER,                 
    IsVIP BOOLEAN                   
);
INSERT INTO customers (customer_id, name, balance, IsVIP) 
VALUES (1, 'John Doe', 5000, FALSE);

INSERT INTO customers (customer_id, name, balance, IsVIP) 
VALUES (2, 'Jane Smith', 15000, FALSE);

INSERT INTO customers (customer_id, name, balance, IsVIP) 
VALUES (3, 'Alice Johnson', 12000, FALSE);

INSERT INTO customers (customer_id, name, balance, IsVIP) 
VALUES (4, 'Bob Brown', 8000, FALSE);

COMMIT;

DECLARE
    CURSOR customer_cursor IS
        SELECT customer_id, balance FROM customers;
BEGIN
    FOR rec IN customer_cursor LOOP
        IF rec.balance > 10000 THEN
            UPDATE customers
            SET IsVIP = 'Y'
            WHERE customer_id = rec.customer_id;
            DBMS_OUTPUT.PUT_LINE('Customer ID ' || rec.customer_id || ' promoted to VIP status.');
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP promotion process completed.');
END;



