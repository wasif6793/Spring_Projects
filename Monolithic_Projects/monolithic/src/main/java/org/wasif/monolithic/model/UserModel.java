package org.wasif.monolithic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserModel {
    @Id
    private String userId;
    private String name;
    private String email;
    private String mobile;
    /*
    {
    "name":"Wasif",
    "email":"abd",
    "mobile":"1234"
}
     */


}
