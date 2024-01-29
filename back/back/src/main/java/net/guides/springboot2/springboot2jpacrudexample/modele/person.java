package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;
    String رقم_بطاقة_التعريف;
    String رقم_جواز_السفر;
    String الاسم;
    String اللقب;
    String الكنية;
    String الهاتف;
    String الهوية;
    String المهنة;
    Date تاريخ_الولادة;
    Date تاريخ_اصدار_بطاقة_التعريف;
    Date تاريخ_اصدار_جواز_السفر;


}
