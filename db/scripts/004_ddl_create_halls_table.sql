create table if not exists halls
(
    id          serial primary key,
    name        varchar not null,
    row_count   int     not null,
    place_count int     not null,
    description varchar not null,
    file_id             int references files (id)
);