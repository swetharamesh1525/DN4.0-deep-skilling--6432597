CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  AccountHolderName VARCHAR2(50),
  Balance NUMBER(10, 2)
);
BEGIN
  INSERT INTO Accounts (AccountID, AccountHolderName, Balance)
  VALUES (1001, 'Alice', 5000.00);

  INSERT INTO Accounts (AccountID, AccountHolderName, Balance)
  VALUES (1002, 'Bob', 3000.00);

  INSERT INTO Accounts (AccountID, AccountHolderName, Balance)
  VALUES (1003, 'Charlie', 7000.00);

  COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE TransferFunds(
  p_SourceAccountID IN Accounts.AccountID%TYPE,
  p_TargetAccountID IN Accounts.AccountID%TYPE,
  p_Amount IN NUMBER
) AS
  v_SourceBalance Accounts.Balance%TYPE;
BEGIN
  SELECT Balance INTO v_SourceBalance
  FROM Accounts
  WHERE AccountID = p_SourceAccountID;

  IF v_SourceBalance >= p_Amount THEN
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_SourceAccountID;
    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_TargetAccountID;

    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
  ELSE
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;
END;
/
BEGIN
  DBMS_OUTPUT.ENABLE;
END;
/
BEGIN
  TransferFunds(1001, 1002, 2000);
END;
/
SELECT * FROM Accounts;
