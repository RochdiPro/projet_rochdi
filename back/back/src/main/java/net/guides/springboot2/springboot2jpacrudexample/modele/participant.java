package net.guides.springboot2.springboot2jpacrudexample.modele;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "participant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class participant extends person {

    String الصفة  ;
    String العلاقة_بالقضية ;
}
