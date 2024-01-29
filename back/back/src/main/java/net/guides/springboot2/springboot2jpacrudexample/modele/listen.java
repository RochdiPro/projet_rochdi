package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "listen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class listen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;
    String نص_السماع;

}