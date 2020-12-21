package com.hasan.springsecuritydb.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:05
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Role extends BaseModel {

    private String role;

    private boolean activeStatus;

}
