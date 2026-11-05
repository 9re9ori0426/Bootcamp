create table movie_test(
    m_no number(3) primary key,
    m_title varchar2(30 char) not null,
    m_actor varchar2(30 char) not null,
    m_img   varchar2(300 char) not null,
    m_story varchar2(3000 char) not null
);

create sequence movie_test_seq;

insert into movie_test values (movie_test_seq.nextval, 'title1', 'stark', 'a.jpg', 'I am IronMan');
insert into movie_test values (movie_test_seq.nextval, 'title2', 'tony stark', 'b.jpg', 'I am IronMan');
insert into movie_test values (movie_test_seq.nextval, 'title3', 'emma', 'c.jpg', 'I am IronMan');

select * from movie_test;

update MOVIE_TEST SET m_img='static-img/default_movie.jpg';