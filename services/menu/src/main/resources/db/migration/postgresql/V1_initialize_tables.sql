CREATE TABLE app_user (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    user_type               varchar(255) not null,
    username                varchar(255) not null unique,
    email                   varchar(255),
    password                varchar(255) not null
);

CREATE TABLE deck (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    repetition_mode         varchar(255) not null,
    period                  varchar(255),
    repetition              varchar(255),
    repetition_end_at       timestamp,
    start_at                timestamp,
    end_at                  timestamp,
    display_time_start      timestamp,
    display_time_end        timestamp,
    user_id                 bigint references app_user(id)
);

CREATE TABLE deck_item (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    sequence                int not null,
    deck_id                 bigint references deck(id)
);

CREATE TABLE menu (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    parent_id               bigint references menu(id),
    deck_item_id            bigint references deck_item(id) not null
);

CREATE TABLE menu_name (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    content                 varchar(255) not null,
    language_code           varchar(255) not null,
    menu_id                 bigint references menu(id)
);

CREATE TABLE menu_item (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    code                    varchar(255),
    price                   float not null,
    menu_id                 bigint references menu(id)
);

CREATE TABLE menu_item_name (
    id                      serial primary key not null,
    created_at              timestamp not null,
    updated_at              timestamp not null,
    content                 varchar(255) not null,
    language_code           varchar(255) not null,
    menu_item_id            bigint references menu_item(id)
);
