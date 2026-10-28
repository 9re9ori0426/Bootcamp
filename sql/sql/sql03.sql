-- 과자를 저장하고 싶음
-- 하나의 테이블에 pk 하나 있는게 좋음

-- 이름, 회사, 무게, 가격, 유통기한
Create table SNACK
(
    s_no      number(3) primary key,
    s_name    varchar2(30 char) not null,
    s_company varchar2(30 char) not null,
    s_weight  number(4, 1)      not null,
    s_price   number(5)         not null,
    s_exp     DATE              not null
);

-- DML (CRUD)
insert into SNACK
values (3, '양파링', '해태', 50.8, 1500, sysdate);

select *
from snack;

-- sysdate : 현재 날짜 시간
insert into SNACK
values (4, '양파링', '해태', 50.8, 1500, TO_DATE('07-03-2026', 'DD-MM-YYYY'));

insert into SNACK
values (9, '양파링', '해태', 50.8, 1500, TO_DATE('2026/11/01'));


select SUM(s_price)
from SNACK;

commit