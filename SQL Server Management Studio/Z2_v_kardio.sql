SELECT LastName, FirstName, DateOfAdmission,DateOfBirth, DateOfDischarge
FROM Patients
WHERE Department = 'кардиология'
ORDER BY DateOfAdmission DESC, LastName ASC;