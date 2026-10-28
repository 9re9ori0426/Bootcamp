select * from SNACK;

-- 숫자 자동으로 올리기
CREATE SEQUENCE snack_seq;

truncate table SNACK;


select S_COMPANY, SUM(S_PRICE)
from SNACK
group by S_COMPANY;

-- by chatgpt
insert into SNACK
values (snack_seq.nextval, '빼빼로 카라멜맛', '해태', 50.8, 1500, to_date('2026-12-20'));

insert into SNACK
values (snack_seq.nextval, '양파링', '해태', 50.8, 1500, to_date('2026-12-20'));

insert into SNACK
values (snack_seq.nextval, '포카칩', '오리온', 60.0, 1700, to_date('2026-12-20'));

insert into SNACK
values (snack_seq.nextval, '꼬깔콘', '롯데', 67.0, 1600, to_date('2026-11-15'));

insert into SNACK
values (snack_seq.nextval, '새우깡', '농심', 90.0, 1500, to_date('2027-01-10'));

insert into SNACK
values (snack_seq.nextval, '감자깡', '농심', 75.0, 1400, to_date('2026-12-30'));

insert into SNACK
values (snack_seq.nextval, '홈런볼', '해태', 46.0, 1800, to_date('2027-02-05'));

insert into SNACK
values (snack_seq.nextval, '맛동산', '해태', 90.0, 1900, to_date('2027-01-25'));

insert into SNACK
values (snack_seq.nextval, '오징어집', '농심', 83.0, 1500, to_date('2026-11-28'));

insert into SNACK
values (snack_seq.nextval, '꿀꽈배기', '농심', 55.0, 1600, to_date('2027-03-12'));

insert into SNACK
values (snack_seq.nextval, '빼빼로', '롯데', 54.0, 1800, to_date('2027-02-20'));

insert into SNACK
values (snack_seq.nextval, '칸쵸', '롯데', 54.0, 1200, to_date('2026-12-05'));

insert into SNACK
values (snack_seq.nextval, '초코송이', '오리온', 50.0, 1300, to_date('2027-01-18'));

insert into SNACK
values (snack_seq.nextval, '고래밥', '오리온', 46.0, 1200, to_date('2026-10-30'));

insert into SNACK
values (snack_seq.nextval, '오!감자', '오리온', 50.0, 1600, to_date('2027-02-14'));

insert into SNACK
values (snack_seq.nextval, '스윙칩', '오리온', 60.0, 1700, to_date('2027-03-01'));

insert into SNACK
values (snack_seq.nextval, '썬칩', '농심', 64.0, 1800, to_date('2026-12-28'));

insert into SNACK
values (snack_seq.nextval, '바나나킥', '농심', 75.0, 1500, to_date('2027-01-30'));

insert into SNACK
values (snack_seq.nextval, '자갈치', '농심', 50.0, 1300, to_date('2026-11-20'));

insert into SNACK
values (snack_seq.nextval, '쫄병스낵', '농심', 77.0, 1000, to_date('2027-02-28'));

insert into SNACK
values (snack_seq.nextval, '예감', '오리온', 64.0, 1800, to_date('2027-03-15'));

insert into SNACK
values (snack_seq.nextval, '다이제', '오리온', 194.0, 2500, to_date('2027-04-01'));

insert into SNACK
values (snack_seq.nextval, '초코하임', '크라운', 284.0, 3000, to_date('2027-02-10'));

insert into SNACK
values (snack_seq.nextval, '화이트하임', '크라운', 284.0, 3000, to_date('2027-02-10'));

insert into SNACK
values (snack_seq.nextval, '콘칩', '크라운', 70.0, 1600, to_date('2026-12-18'));

insert into SNACK
values (snack_seq.nextval, '죠리퐁', '크라운', 50.0, 1400, to_date('2027-01-08'));

insert into SNACK
values (snack_seq.nextval, '국희땅콩샌드', '크라운', 100.0, 2200, to_date('2027-03-20'));

insert into SNACK
values (snack_seq.nextval, '쿠크다스', '크라운', 128.0, 2400, to_date('2027-01-22'));

insert into SNACK
values (snack_seq.nextval, '에이스', '해태', 364.0, 2800, to_date('2027-04-15'));

insert into SNACK
values (snack_seq.nextval, '웨하스', '해태', 50.0, 1500, to_date('2026-12-12'));

insert into SNACK
values (snack_seq.nextval, '자유시간', '해태', 36.0, 1200, to_date('2027-02-25'));

insert into SNACK
values (snack_seq.nextval, '맛동산 초코', '해태', 90.0, 2000, to_date('2027-03-30'));
