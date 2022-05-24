package com.project.Campus.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "campus_user")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false, name = "password", length = 100)
    private String pw;

    @Column(name = "userName", length = 100)
    private String name;

    @Column(nullable = false, name = "phoneNumber")
    private int phone;

}
