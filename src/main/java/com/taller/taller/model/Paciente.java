package com.taller.taller.model;

import lombok.*;
import org.springframework.stereotype.Controller;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    private String nombre;
    private String apellido;
    private String cedula;
    int edad;
}
