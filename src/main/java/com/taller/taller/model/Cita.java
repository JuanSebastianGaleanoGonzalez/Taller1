package com.taller.taller.model;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cita {
    private Paciente paciente;
    Date fecha;
}
