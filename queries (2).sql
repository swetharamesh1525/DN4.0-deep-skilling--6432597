CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,     
    customer_id NUMBER,             
    due_date DATE                   
);
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (1, 101, SYSDATE + 10);
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (2, 102, SYSDATE + 25);
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (3, 103, SYSDATE + 40);
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (4, 104, SYSDATE + 5);
COMMIT;
DECLARE
    CURSOR loan_cursor IS
        SELECT customer_id, loan_id, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.loan_id || 
                             ' for Customer ID ' || rec.customer_id || 
                             ' is due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY') || '.');
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Loan reminder process completed.');
END;
