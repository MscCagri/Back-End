package com.hoaxify.ws.user;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="t_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String displayName;

    private String password;
}
