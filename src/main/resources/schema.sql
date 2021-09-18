drop table if exists demo;

create table if not exists todo(
    id bigint primary key auto_increment not null,
    title varchar(30) unique key not null,
    deadline date not null,
    status tinyint(1) not null default 0,
    created_time timestamp not null default current_timestamp,
    updated_time timestamp not null default current_timestamp on update current_timestamp
);
