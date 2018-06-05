create database devnation;
create database foobar;
\c devnation;
set SEARCH_PATH to public;

Create table public.vgk (
no varchar,
player varchar,
flag varchar,
pos varchar,
age varchar,
height varchar,
weight varchar,
sc varchar,
exp varchar,
birthdate varchar,
summary varchar,
salary varchar,
draft varchar,
primary key (no)
);

Create table public.caps (
no varchar,
player varchar,
flag varchar,
pos varchar,
age varchar,
height varchar,
weight varchar,
sc varchar,
exp varchar,
birthdate varchar,
summary varchar,
salary varchar,
draft varchar,
primary key (no)
);
