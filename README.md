# SOLID


Juan Diego Campo y Juan Sebastian Ayala

# Interpretacion del codigo

al observar los archivos contenidos en la carpeta "unsolid" que se nos proporcionó identificamos que el proposito general del sistema es el generar reportes del salario de los empleados de una empresa los cuales tienen atributos como el nombre, su departamento (el cual usamos para determinar su salario) y si son empleados a tiempo parcial o a tiempo completo (lo que implica una reduccion de su salario), los reportes podian ser de distintos formatos, inicialmente PDF y Excel. A partir de estas conclusiones se modificaron, eliminaron y añadieron archivos para cumplir así tanto con el proposito de la aplicacion como con los principios SOLID.

Principios SOLID violados e identificados en la carpeta "unsolid"

1) La interfaz "EmployeeOperations" no cumple con el principio de segregaciòn de interfaces, esto se debe a que dentro de la misma se llaman varias funciones con distintas funcionalidades para el sistema, de esta forma la interfaz cumple con un propòsito general, lo cual es de alto riesgo debido a la alta implementaciòn que esta conlleva.
Se podrìa decir que esta problemàtica se ha solucionado cuando se distribuyeron todas las funciones de la interfaz , tanto en clases y otras interfaces donde realmente se requerìan sus funciones y eliminando esta interfaz inicial.
2) La clase "EmployeeManager" no cumple con el principio de responsabilidad ùnica, puesto que dentro de la misma hay funciones que cumplen con varias funcionalidades vitales para el sistema, por otra parte, las funciones "CalculateSalary" y "saveToFile" no tienen cohesiòn con el objetivo propuesto por la funciòn.
Para solucionar esta problemàtica, se han "transferido" las funciones "CalculateSalary" y "saveToFile" a las clases donde se requieren dichas funcionalidades, por ejemplo: "CalculateSalary" se transfiriò a la clase "SalaryCalculator" y "saveToFile" realiza su objetivo dentro de la interfaz "Report".
3) La clase "Employee" aùn sin violar ningùn principio SOLID pasò a ser una interfaz con el fin de permitir el polimorfismo a los mètodos que requerìan un empleado como paràmetro, por esto sus mètodos son "Versalario()", "getName()" y "tiempoParcial()". Tambièn se ha creado nuevas clases independientes para cada departamento, estas implementan la interfaz "Employee" (la cual nos permite diferenciar el salario por departamento) y poseen los atributos que anteriormente tenìa la clase "Employee".
4) La clase "PartTimeEmployee" inicialmente violaba el principio de sustituciòn de Liskov, pues no permitìa el polimorfismo entre empleados, si un empleado a tiempo parcial intentaba usar el mètodo heredado por su padre "Employee", este arrojaba un error.
Para solucionarlo, se redujo la clase "PartTimeEmployee" a un atributo en un objeto de tipo "Employee" (nuevas clases de departamentos).
5) La clase "ReportGenerator" no cumplìa con los principios de inversiòn de dependencias y abierto/cerrado, puesto que la clase dependìa directamente del tipo de archivo (Excel o PDF), ademàs, si en algùn momento se necesitaba implementar un nuevo tipo de archivo o eliminar uno actual, era necesario modificar el mètodo general.
La soluciòn fue crear una interfaz llamada "Report", la cual funciona como abstracciòn para unir los archivos de tipo "alto" con los de tipo "bajo" y que la dependencia vaya en el sentido correcto( bajo->alto). Se crearon las clases "ReportPDF" y "ReportExcel" las cuales implementan la interfaz "Report" y juegan el papel de archivo tipo "bajo", esto permite añadir y eliminar tipos de archivo y si uno de estos no està disponible no afecta directamente al funcionamiento del sistema.
6) La clase "SalaryCalculator" no poseìa polimorfismo ni cohesiòn en su estructura, pues no calculaba el salario y ademàs generaba un bucle al llamarse asìmisma.
La soluciòn implementada consistiò  en que el paràmetro recibido por la funciòn no sea simplemente un nombre sino un objeto tipo "Employee", lo que el permite el polimorfismo y se implementò la lògica para calcular el salario del empleado usando sus mètodos propios lo que le permite tener cohesiòn finalmente.
7) Finalmente, se ha creado una clase "Main" en la que se instancian los empleados y los reportes ademàs de un ArrayList que fue el que tomò los mètodos "AddEmployee" y "RemoveEmployee" que originalmente pertenecìan a la clase "EmployeeManager" y se usa en la funciòn "RealizarReporteMùltiple". Tambièn es posible realizar un reporte para un ùnico empleado con la funciòn "RealizarReporte". Los reportes proporcionan informaciòn de las caracterìsticas y salario de cada empleado al mismo tiempo que genera el reporte en el formato seleccionado y en ùltima instancia, guarda el archivo con la funciòn "saveToFile".


