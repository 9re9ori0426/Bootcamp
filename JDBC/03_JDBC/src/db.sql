create table student_db (
    s_no number(2) primary key,
    s_name varchar2(20 char) not null,
    s_age number(2) not null,
    s_addr varchar2(30 char) not null
);

create sequence student_db_seq;

select * from STUDENT_DB;

-- test data 2-3개

insert into STUDENT_DB
values (student_db_seq.nextval, 'chiikawa', 7, 'tokyo');
insert into STUDENT_DB
values (student_db_seq.nextval, 'hachiware', 7, 'tokyo');
insert into STUDENT_DB
values (student_db_seq.nextval, 'usagi', 8, 'tokyo');
insert into STUDENT_DB
values (student_db_seq.nextval, 'st3 test', 30, 'nonhyeon');

SELECT *
FROM STUDENT_DB
WHERE s_name = 'st1';

DELETE STUDENT_DB
WHERE S_NO = 4;