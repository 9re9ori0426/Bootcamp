create table name_age_test (
    n_name varchar2(20 char) not null,
    n_age number(3) not null
);

insert into NAME_AGE_TEST values ('person1', 10);
insert into NAME_AGE_TEST values ('person2', 20);
insert into NAME_AGE_TEST values ('person3', 30);

select * from NAME_AGE_TEST;