package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "certificate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;
    String  نوع ;
    String نص_التسخير ;
}
