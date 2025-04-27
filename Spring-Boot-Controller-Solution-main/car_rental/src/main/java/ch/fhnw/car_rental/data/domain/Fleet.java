package ch.fhnw.car_rental.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fleet")
public class Fleet {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn(name = "fleet_id")
    private List<Car> carList;

    @Column(name = "offer", nullable = false)
    private long offer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Car> getCarList() {
        return carList;
    }
    
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public long getOffer() {
        return offer;
    }

    public void setOffer(long offer) {
        this.offer = offer;
    }

}
