package com.oscar.menuapp.menu.infrastructure.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timeslot {
    Timestamp startAt;
    Timestamp endAt;
}
