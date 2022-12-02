package com.example.springbottvalidator.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "customer_id", columnDefinition = "varchar(7) default '0000000'")
    @NotBlank
    @Size(max = 7, message = "only 7 characters")
    public String customerId="0000000";
    @Size(min=1, max = 50, message = "name should not exceed 50 characters")
    @NotBlank
    public String name;
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+.+[a-z]", message = "Enter valid mail")
    @NotBlank
    public String email;
    @Size(max = 30, message = "password should not more than 30 characters")
    @NotBlank
    public String password;
    @Size(max = 100)
    public String address;
    @Size(max = 10, message = "contact only 10 digits")
    public String contact;
    @Column(name = "nominee_nm")
    @NotBlank
    public String nomineeName;
    @Column(name = "relationship_with_nominee")
    @NotBlank
    public String relationshipWithNominee;

}
