package kg.megalab.finalprojectformegalab.models.entities;

import kg.megalab.finalprojectformegalab.models.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_admins")
@Getter
@Setter

public class Admin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String adminName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String personalNumber;
    @Enumerated
    private Role role;

}
