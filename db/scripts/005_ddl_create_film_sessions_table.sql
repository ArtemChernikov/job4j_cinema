create table if not exists film_sessions
(
    id         serial primary key,
    film_id    int references films (id),
    hall_id    int references halls (id),
    start_time timestamp,
    end_time   timestamp,
    price      int
);