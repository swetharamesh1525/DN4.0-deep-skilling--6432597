CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  EmployeeName VARCHAR2(50),
  DepartmentID NUMBER,
  Salary NUMBER(10, 2)
);
BEGIN
  INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, Salary)
  VALUES (1, 'Alice', 101, 50000.00);

  INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, Salary)
  VALUES (2, 'Bob', 101, 60000.00);

  INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, Salary)
  VALUES (3, 'Charlie', 102, 70000.00);

  COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_DepartmentID IN Employees.DepartmentID%TYPE,
  p_BonusPercentage IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_BonusPercentage / 100)
  WHERE DepartmentID = p_DepartmentID;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in department ' || p_DepartmentID);
END;
/
BEGIN
  DBMS_OUTPUT.ENABLE;
END;
/
BEGIN
  UpdateEmployeeBonus(101, 10);
END;
/
SELECT * FROM Employees;
