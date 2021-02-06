package ru.netology.domain;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class User {
    private final String city;
    private final LocalDate meetingDate;
    private final String name;
    private final String phone;
}
