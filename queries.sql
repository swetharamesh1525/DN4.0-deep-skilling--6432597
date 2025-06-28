CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    age NUMBER,
    loan_interest_rate NUMBER
);
INSERT INTO customers VALUES (1, 65, 10);
INSERT INTO customers VALUES (2, 45, 12);
INSERT INTO customers VALUES (3, 70, 8);
INSERT INTO customers VALUES (4, 50, 11);
COMMIT;
SELECT * FROM customers;
DECLARE
    CURSOR customer_cursor IS
        SELECT customer_id, age, loan_interest_rate FROM customers;
    v_customer_id customers.customer_id%TYPE;
    v_age customers.age%TYPE;
    v_rate customers.loan_interest_rate%TYPE;
BEGIN
    FOR rec IN customer_cursor LOOP
        IF rec.age > 60 THEN
            UPDATE customers
            SET loan_interest_rate = rec.loan_interest_rate - 1
            WHERE customer_id = rec.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
