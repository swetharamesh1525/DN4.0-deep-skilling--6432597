CREATE TABLE SavingsAccount (
  AccountID NUMBER PRIMARY KEY,
  AccountHolderName VARCHAR2(50),
  Balance NUMBER(10, 2)
);

INSERT INTO SavingsAccount (AccountID, AccountHolderName, Balance)
VALUES (1, 'Alice', 1000.00);

INSERT INTO SavingsAccount (AccountID, AccountHolderName, Balance)
VALUES (2, 'Bob', 1500.00);

INSERT INTO SavingsAccount (AccountID, AccountHolderName, Balance)
VALUES (3, 'Charlie', 2000.00);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE SavingsAccount
  SET Balance = Balance + (Balance * 0.01);
  DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all accounts.');
END;
/

BEGIN
  DBMS_OUTPUT.ENABLE;
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/

SELECT * FROM SavingsAccount;
