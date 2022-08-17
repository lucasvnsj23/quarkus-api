package org.bb.letscode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
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

    // private Categoria categoria;

    // public void setCategoria(Categoria categoria) {
    //     this.categoria = categoria;
    // }

    // public Categoria getCategoria() {
    //     return categoria;
    // }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
