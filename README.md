# SOLID
Juan Campo/ Juan Ayala

Juan Diego Campo y Juan Sebastian Ayala

# Interpretacion del codigo

al observar los archivos contenidos en la carpeta "unsolid" que se nos proporcionó identificamos que el proposito general del sistema es el generar reportes del salario de los empleados de una empresa los cuales tienen atributos como el nombre, su departamento (el cual usamos para determinar su salario) y si son empleados a tiempo parcial o a tiempo completo (lo que implica una reduccion de su salario), los reportes podian ser de distintos formatos, inicialmente PDF y Excel. A partir de estas conclusiones se modificaron, eliminaron y añadieron archivos para cumplir así tanto con el proposito de la aplicacion como con los principios SOLID.

Principios SOLID violados e identificados en la carpeta "unsolid"

1) La clase "EmployeeManager" no cumple con el principio de responsabilidad ùnica, puesto que dentro de la misma hay funciones que cumplen con varias funcionalidades vitales para el sistema, por otra parte, las funciones "CalculateSalary" y "saveToFile" no tienen cohesiòn con el objetivo propuesto por la funciòn.
Para solucionar esta problemàtica, se han "transferido" las funciones "CalculateSalary" y "saveToFile" a las clases donde se requieren dichas funcionalidades, por ejemplo: "CalculateSalary" se transfiriò a la clase de su mismo nombre y "saveToFile" realiza su objetivo dentro de la interfaz "Report".

 2) 

