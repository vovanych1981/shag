SELECT LastName, FirstName,DateOfBirth, Department 
FROM Patients
WHERE DATEDIFF(day, DateOfAdmission, DateOfDischarge) > 30 OR 
DATEDIFF(day, DateOfAdmission, GETDATE()) > 30;