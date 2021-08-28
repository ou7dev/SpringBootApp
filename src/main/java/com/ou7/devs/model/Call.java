package com.ou7.devs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Call {

    @Id
    @GeneratedValue
    private Long id;
    private String phoneNumber;
    private String duration;
    private String date;

}
