package com.example.springcourse.models;

import com.example.springcourse.util.validation.IAdult;
import com.example.springcourse.util.validation.ISubDom;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;

import static com.example.springcourse.Constants.*;

@Entity(name = TABLE_NAME_CLIENT)
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_LASTNAME)
    private String lastName;

    @NotNull
    @Pattern(regexp = "[0-9]{10}", message = "the number must have 10 digits")
    @Column(name = COLUMN_NUMBER)
    private String number;

    @Email(message = "the value entered is not an email")
    @ISubDom
    @Column(name = COLUMN_EMAIL)
    private String email;

    @IAdult
    @Column(name = COLUMN_BIRTHDAY)
    private Date birthDate;
}
