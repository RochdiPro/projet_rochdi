package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "research_center")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class research_center {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;
}
