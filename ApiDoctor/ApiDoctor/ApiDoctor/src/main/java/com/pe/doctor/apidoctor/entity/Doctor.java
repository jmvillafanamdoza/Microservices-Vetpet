package com.pe.doctor.apidoctor.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int doctorId;
    public String doctorName;
    public String doctorLastName;
    public String specialty;
    public int age;
    public String doctorEmail;
    public String doctorPhone;
}
