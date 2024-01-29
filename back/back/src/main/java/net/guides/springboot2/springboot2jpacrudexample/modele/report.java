package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long الرقم_الموحد;
    String رقم_النيابة   ;
    String رقم_المحضر;
    String رقم_الضبط;
    String تاريخ_الانشاء;
    String تاريخ_التغير;
    String الموضوع;
    String التكيف;
    String الحوصلة;
    String وكيل_الجمهورية ;
    @ManyToOne
    research_center المركز;
    @OneToMany
    private List<listen> السمعات = new ArrayList<>();
    @OneToMany
    private List<preview> المعاينات = new ArrayList<>();
    @OneToMany
    private List<harness> التساخير = new ArrayList<>();
    @OneToMany
    private List<certificate> الشهادات = new ArrayList<>();
    @OneToMany
    private List<participant> الشاكون = new ArrayList<>();
    @OneToMany
    private List<participant> المشتكي_بهم = new ArrayList<>();
    @OneToMany
    private List<participant> الشهود = new ArrayList<>();

    @OneToMany
    private List<agent> الباحثون = new ArrayList<>();


}
