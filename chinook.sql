--2.1 SELECT

--1.
SELECT * FROM employee;

--2.
SELECT * FROM employee WHERE LASTNAME = 'King';

--3.
SELECT * FROM employee WHERE FIRSTNAME = 'Andrew' AND REPORTSTO IS NULL;

--2.2 ORDER BY

--1.
SELECT * FROM ALBUM 
ORDER BY TITLE DESC;

--2.
SELECT FIRSTNAME FROM CUSTOMER
ORDER BY CITY ASC;

--2.3 INSERT INTO
SELECT * FROM GENRE

--1.
INSERT INTO GENRE (GENREID, NAME)
VALUES (26, 'Arabic');
/
INSERT INTO GENRE (GENREID, NAME)
VALUES (27, '');


SELECT * FROM EMPLOYEE

--2.
INSERT INTO EMPLOYEE VALUES (12, 'Wayne', 'Bruce', 'Batman', 1, TO_DATE('1995/09/27', 'yyyy/mm/dd'), TO_DATE('10-JUNE-19', 'dd-mm-yy'), '7980 Wayne Court', 'Gotham', 'New York', 'United States', 21075, '+1 (000) 000-0000', '+1 (000) 000-0000', 'brucewayne@gotham.com');
/
INSERT INTO EMPLOYEE VALUES (15, 'Nofal', 'Mustafa', 'DriftKing', 1, TO_DATE('1995/09/27', 'yyyy/mm/dd'), TO_DATE('10-JUNE-19', 'dd-mm-yy'), '3732 Partridge Ave', 'Baton Rouge', 'LA', 'United States', 70805, '+1 (225) 882-1101', '+1 (225) 882-1101', 'moose@revature.com');


--3.
SELECT * FROM CUSTOMER

INSERT INTO CUSTOMER VALUES(61,'Lonzo', 'Ball', 'Furisdale', '2345 Hooper Ln', 'New Orleans', 'LA', 'United States', 70815, '+1(504)518-7981','+1(504)518-7982','lonzoball@gmail.com',3);
/
INSERT INTO CUSTOMER VALUES(60,'Zion', 'Williamson', 'Chromsdale', '2343 Hooper Ln', 'New Orleans', 'LA', 'United States', 70815, '+1(916)678-1232','+1(916)678-1231','dukedynasty@gmail.com',2);
/

2.4 UPDATE
Task – Update Aaron Mitchell in Customer table to Robert Walter
Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”	
--2.4 UPDATE
SELECT * FROM Artist
ORDER BY NAME;

UPDATE CUSTOMER
SET FIRSTNAME = 'Robert', LASTNAME = 'Walter'
WHERE CUSTOMERID = 32;

UPDATE ARTIST
SET NAME = 'CCR'
WHERE ARTISTID = 76;

--2.5 LIKE
SELECT * FROM INVOICE
WHERE BILLINGADDRESS LIKE 'T%';

--2.6 BETWEEN
SELECT * FROM INVOICE
WHERE TOTAL BETWEEN 15 AND 50;

SELECT * FROM employee
WHERE HIREDATE BETWEEN '01-JUN-2003' and '01-MAR-2004';

--2.7 DELETE
SELECT * FROM CUSTOMER

ALTER TABLE INVOICE
DROP CONSTRAINT FK_INVOICECUSTOMERID;

DELETE FROM CUSTOMER
WHERE CUSTOMERID = 32;

--3.1 SYSTEM DEFINED FUNCTIONS
SELECT CURRENT_TIMESTAMP
FROM dual;

SELECT LENGTH(NAME)
FROM MEDIATYPE;

--3.2 SYSTEM DEFINED AGGREGATE FUNCTIONS
SELECT AVG(TOTAL) 
FROM INVOICE;

SELECT MAX(UNITPRICE)
FROM TRACK;

--7.1

SELECT LASTNAME, FIRSTNAME, INVOICEID 
FROM CUSTOMER 
INNER JOIN INVOICE 
ON INVOICE.CUSTOMERID = CUSTOMER.CUSTOMERID;

--7.2

SELECT CUSTOMER.CUSTOMERID, FIRSTNAME, LASTNAME, INVOICEID, TOTAL
FROM CUSTOMER
LEFT OUTER JOIN INVOICE
ON INVOICE.CUSTOMERID = CUSTOMER.CUSTOMERID;

--7.3

SELECT NAME, TITLE
FROM ARTIST 
RIGHT OUTER JOIN ALBUM
ON ALBUM.ARTISTID = ARTIST.ARTISTID;

--7.4

SELECT NAME
FROM ARTIST
CROSS JOIN ALBUM
ORDER BY NAME ASC;

--7.5

SELECT *--A.EMPLOYEEID, B.EMPLOYEEID, A.LASTNAME, B.LASTNAME, A.TITLE, B.TITLE
FROM EMPLOYEE A
INNER JOIN EMPLOYEE B
ON B.EMPLOYEEID = A.REPORTSTO;




commit;
exit;