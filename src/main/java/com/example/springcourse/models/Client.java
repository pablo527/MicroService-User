package com.example.springcourse.models;

import static com.example.springcourse.Constants.*;
import javax.persistence.*;
import java.util.Date;

@Entity(name = TABLE_NAME_CLIENT)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = COLUMN_NAME)
    private String name;

    @Column(name = COLUMN_LASTNAME)
    private String lastName;

    @Column(name = COLUMN_NUMBER)
    private String number;

    @Column(name = COLUMN_EMAIL)
    private String email;

    @Column(name = COLUMN_BIRTHDAY)
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
