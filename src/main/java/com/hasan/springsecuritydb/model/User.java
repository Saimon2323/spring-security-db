package com.hasan.springsecuritydb.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:05
 */

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseModel {

    private String name;

    private String email;

    private String password;

    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
