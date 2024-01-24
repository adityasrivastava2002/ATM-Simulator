create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25));

show tables;

select * from signup;

create table signup2(formno varchar(20), accountType varchar(40), cardNumber varchar(25), pin varchar(10), facility varchar(100));

select * from signup2;

create table login(formno varchar(20), cardNumber varchar(25), pin varchar(10));
select * from login;

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));
select * from bank;

truncate signup;
truncate signup2;
truncate login;
drop table bank;