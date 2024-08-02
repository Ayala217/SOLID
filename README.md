# SOLID
Juan Campo/ Juan Ayala

Juan Diego Campo y Juan Sebastian Ayala

Principios SOLID violados e identificados en la carpeta "unsolid"

1) La clase "EmployeeManager" no cumple con el principio de responsabilidad ùnica, puesto que dentro de la misma hay funciones que cumplen con varias funcionalidades vitales para el sistema, por otra parte, las funciones "CalculateSalary" y "saveToFile" no tienen cohesiòn con el objetivo propuesto por la funciòn.
Para solucionar esta problemàtica, se han "transferido" las funciones "CalculateSalary" y "saveToFile" a las clases donde se requieren dichas funcionalidades, por ejemplo: "CalculateSalary" se transfiriò a la clase de su mismo nombre y "saveToFile" realiza su objetivo dentro de la interfaz "Report".

 2) 

