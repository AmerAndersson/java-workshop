## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Data types

```java

Primitive data types - includes:

1.byte,
2. short,
3. int,
4. long,
5. float,
6. double,
7. boolean,
8. char

Non-primitive data types are called reference types because they refer to objects.

1. String,
2. Arrays,
3. Classes.
4. Interface
```

`Primitive types are predefined (already defined) in Java.`
`Non-primitive types are created by the programmer and is not defined by Java (except for String).`

Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

## Numbers

Primitive number types are divided into two groups:

`Integer types stores whole numbers`, `positive or negative (such as 123 or -456)`, without decimals. Valid types are `byte, short, int and long.` Which type you should use, depends on the numeric value.

byte 1 byte Stores whole numbers from -128 to 127
short 2 bytes Stores whole numbers from -32,768 to 32,767
int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

- character/letter:
  char 2 bytes Stores a single character/letter or ASCII value

`Floating point types represents numbers` with a fractional part, containing one or more decimals. There are two types: `float and double.`

float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 1 bit Stores true or false values

## In Java, there are two types of casting

1. `Widening Casting (automatically)` - converting a smaller type to a larger type size
   ` byte -> short -> char -> int -> long -> float -> double`

2. `Narrowing Casting (manually)` - converting a larger type to a smaller size type
   `double -> float -> long -> int -> char -> short -> byte`

## Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

```java
-----------------------------------------------------------------
Operator	Name	        Description	                Example
-----------------------------------------------------------------
+	      Addition	      Adds together two values	          x + y
-	      Subtraction	    Subtracts one value from another	  x - y
*	      Multiplication	Multiplies two values	              x * y
/	      Division	      Divides one value by another	      x / y
%	      Modulus	        Returns the division remainder	    x % y
++	    Increment	      Increases the value of a variable by 1	++x
--	    Decrement	      Decreases the value of a variable by 1	--x

--------------------------------------------------------
Operator	              Example	              Same As
--------------------------------------------------------
=	                      x = 5	                x = 5
+=	                    x += 3	              x = x + 3
-=	                    x -= 3	              x = x - 3
*=	                    x *= 3	              x = x * 3
/=	                    x /= 3	              x = x / 3
%=	                    x %= 3	              x = x % 3
&=	                    x &= 3	              x = x & 3
|=	                    x |= 3	              x = x | 3
^=	                    x ^= 3	              x = x ^ 3
>>=	                    x >>= 3              	x = x >> 3
<<=	                    x <<= 3              	x = x << 3
---------------------------------------------------------

The return value of a comparison is either `true or false`. These values are known as Boolean values:

----------------------------------------------------
Operator	        Name	                   Example
----------------------------------------------------
==	            Equal to	                  x == y
!=	            Not equal	                  x != y
>	              Greater than	              x > y
<	              Less than	                  x < y
>=	            Greater than or equal to	  x >= y
<=	            Less than or equal to	    x <= y
---------------------------------------------------



Java Logical Operators

You can also test for true or false values with logical operators.
Logical operators are used to determine the logic between variables or values
--------------------------------------------------------------------------------------------------------------
Operator	      Name	                Description	                                                Example
--------------------------------------------------------------------------------------------------------------
&& 	          Logical and	        Returns true if both statements are true	                x < 5 &&  x < 10
|| 	          Logical or	        Returns true if one of the statements is true	            x < 5 || x < 4
!	            Logical not	        Reverse the result, returns false if the result is true	  !(x < 5 && x < 10)
---------------------------------------------------------------------------------------------------------------

Code	      Result
\n	         New Line
\r	         Carriage Return
\t	         Tab
\b	         Backspace
\f	         Form Feed
```

![Datatpyes](../Main/img/datatype1.png)
![Datatpyes](../Main/img/datatype2.png)
![Datatpyes](../Main/img/app.png)


![Datatpyes](../Main/img/BST/key1.png)
![Datatpyes](../Main/img/BST/key2.png)
![Datatpyes](../Main/img/BST/key3.png)
![Datatpyes](../Main/img/BST/key4.png)
![Datatpyes](../Main/img/BST/key5.png)

## Java finns överallt så du kan välja vad du ska göra

Vad används Java till? Den används till allt!
Java finns nästan överallt och här är en kort lista: 
Java och JVM har en ljus framtid
- Big Enterprise-appar på serversidan
- Android-applikationer
- Olika webb- och skrivbordsapplikationer
- Serverappar hos Financial Services Industry
- Internet of Things (IoT), blockchain
- Big Data-teknik
- AI, maskininlärning

## Sätt av Java-utvecklare
## #1 Lär dig att koda från noll
Grundläggande Java-konstruktioner, operatorer och datatyper
OOP och dess implementering i Java
Undantag
Ramverk för Java-samlingar
Generika
Input/output API
Multithreading och Java Concurrency API
Enhetstestning
Lambdas
SQL
 Frontend-utveckling samt hur backend kopplas till frontend.
 Målet med kursen är att den studerande kan skapa webbsidor med aktuella ramverk och tekniker för frontend samt att koppla sin klient mot ett existerande backend för att konsumera någon webbservice.

Backendlösningar med Java som programspråk genom de ramverk och serverlösningar som finns tillgängliga. De studerande ska i denna kurs få eninblick i utveckling av Enterprise software samt kunna använda sig av de viktigaste delarna av Java EE.
Utveckling av backend i Java samt ha kompetensen att integrera backendsystem med varandra
  - multi-tier architecture
  - MicroServices.
  - Affärsmannaskap == Entrepreneurship
  - (deployas) till olika testmiljöer.
  - testautomatisering samt versionshantering.
---

Javautvecklare
Programutvecklare Java
Applikationsprogrammerare Java
Webbprogrammerare Java
Systemutvecklare
---

## Junior Java Developer-krav
 Spring, Hibernate och Spring Boot.
Vår == Spring
Övervintra == Hibernate
Fjäder MVC == Spring MVC
Fjäderkänga == Spring boot

## #2 Lär dig Android
mobilutveckling

## Customer Relationship Management (CRM) is a strategy that companies use to manage interactions with customers and potential customers
## ERP stands for enterprise resource planning – which is a type of business management software.
