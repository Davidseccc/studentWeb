create table manager
(
  id           bigint not null
    constraint manager_pkey
      primary key,
  email        varchar(255),
  login        varchar(255),
  passwordhash varchar(255)
);

create table category
(
  id          bigint not null
    constraint category_pkey
      primary key,
  name        varchar(255),
  category_id bigint
    constraint fk4tls49xvjxl9bh7fjkx8pdq89
      references category
);


create table article
(
  id          bigint  not null
    constraint article_pkey
      primary key,
  content     text,
  createddate timestamp,
  imagepath   varchar(255),
  name        varchar(255),
  number      integer not null,
  fk_category bigint
    constraint fk5dm27seftegfgvybdh8pojxpb
      references category
);


create table abstractfile
(
  dtype      varchar(31) not null,
  id         bigint      not null
    constraint abstractfile_pkey
      primary key,
  filesize   bigint      not null,
  name       varchar(255),
  path       varchar(255),
  url        varchar(255),
  article_id bigint
    constraint fko7o6hbsk7t3m8bxo20j4p7p0m
      references article
);


