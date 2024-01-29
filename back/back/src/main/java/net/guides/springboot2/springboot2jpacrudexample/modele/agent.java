package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "agent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class agent extends person {
    String رقم_بطاقة_المهنية;
    String الخطة_الوظفية;
    String الرتبة;
    @OneToOne
    research_center مركز ;
}
