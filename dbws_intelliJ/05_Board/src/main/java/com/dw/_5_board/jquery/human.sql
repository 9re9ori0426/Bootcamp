create table human_test(
    h_no number(2) primary key ,
    h_name varchar2(30 char) not null ,
    h_age number(2) not null
);

create sequence human_test_seq;

insert into HUMAN_TEST values (human_test_seq.nextval, 'dw1', 10);
insert into HUMAN_TEST values (human_test_seq.nextval, 'dw2', 20);
insert into HUMAN_TEST values (human_test_seq.nextval, 'dw3', 30);

select * from HUMAN_TEST;