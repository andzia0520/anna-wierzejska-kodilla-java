package com.kodilla.uploading_app.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "User.retrieveUsersSortedAccordingAge",
                query = "SELECT * FROM USERS" +
                        "ORDER BY BIRTH_DATE DESC",
                resultClass = User.class
        ),
        @NamedNativeQuery(
                name = "User.retrieveTheOldestUserWithPhoneNo",
                query = "SELECT * FROM USERS" +
                        "WHERE PHONE_NO IS NOT NULL" +
                        "ORDER BY BIRTH_DATE ASC" +
                        "LIMIT 1",
                resultClass = User.class
        )
})

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "PHONE_NO")
    private int phoneNo;

    public User(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}

