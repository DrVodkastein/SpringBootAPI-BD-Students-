package ismail.project.springstudents.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @NonNull // esto asegura que en cada get nos mostrara email da igual si lo hemos pedido o no
    private String email;
    private int age;



}
