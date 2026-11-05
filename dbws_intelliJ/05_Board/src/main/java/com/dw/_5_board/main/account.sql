create table login_test(
    l_id varchar2(30 char) primary key ,
    l_pw varchar2(30 char) not null ,
    l_name varchar2(30 char) not null
);

insert into LOGIN_TEST values ('dw1', 'dw1', 'dw1004');
insert into LOGIN_TEST values ('dw2', 'dw2', 'dw10040');

select * from LOGIN_TEST;