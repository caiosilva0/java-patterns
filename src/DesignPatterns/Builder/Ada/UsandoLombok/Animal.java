package DesignPatterns.Builder.Ada.UsandoLombok;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Animal {
    private String nome;
    private String dono;
    private String raca;
}
