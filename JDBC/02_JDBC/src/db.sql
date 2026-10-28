CREATE TABLE DB_TEST(
  d_no Number(2) primary key,
  d_name varchar2(20 char) not null ,
  d_age number(3) not null
);

select * from DB_TEST;

create sequence db_test_seq;

insert into DB_TEST values (db_test_seq.nextval, 'mz', 10);
insert into DB_TEST values (db_test_seq.nextval, 'mz2', 20);
insert into DB_TEST values (db_test_seq.nextval, 'mz3', 30);

delete DB_TEST
where d_name = 'mz5';

Select * from SNACK;