SELECT LastName, FirstName, DateOfAdmission,DateOfBirth, DateOfDischarge
FROM Patients
WHERE Department = '�����������'
ORDER BY DateOfAdmission DESC, LastName ASC;