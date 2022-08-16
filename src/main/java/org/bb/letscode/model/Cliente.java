package org.bb.letscode.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Length(min = 5,max = 100)
    private String name;

    @Column(nullable = false)
    @Min(18)
    private int age;
    
    @Column(nullable = false)
    @Pattern(regexp ="^[a-z,A-Z]{2}[0-9]{9}$")
    private String vatNumber;

    @Column(nullable = false)
    private String email;
}
