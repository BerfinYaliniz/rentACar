package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "brands") //veritabanındaki tablonun adı
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id yi otomatik arttırır
    @Column(name = "id")
    private int id;

    @Column(name = "name") //veritabanındaki name kolonuyla tanımlanan namei eşler
    private String name;


    public Brand() {

    }
}
