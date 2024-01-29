package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "harness")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class harness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;

    @Column(name = "نص_التسخير")
    String نص_التسخير;

}
