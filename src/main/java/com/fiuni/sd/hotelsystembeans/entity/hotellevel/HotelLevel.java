package com.fiuni.sd.hotelsystembeans.entity.hotellevel;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fiuni.sd.hotelsystembeans.entity.base.BaseEntity;
import com.fiuni.sd.hotelsystembeans.entity.room.Room;

@Entity
@Table(name = "hotel_level")
public class HotelLevel implements BaseEntity{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    private LocalDate removeAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel_level")
    private Set<Room> rooms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRemoveAt() {
        return removeAt;
    }

    public void setRemoveAt(LocalDate removeAt) {
        this.removeAt = removeAt;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

}
