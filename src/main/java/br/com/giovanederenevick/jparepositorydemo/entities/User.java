package br.com.giovanederenevick.jparepositorydemo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Double salary;
}
