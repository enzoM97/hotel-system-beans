package com.fiuni.sd.hotelsystembeans.entity.hotel;

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
@Table(name = "hotel")
public class Hotel implements BaseEntity{
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
    private String direction;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate removeAt;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
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


    public String getDirection() {
        return direction;
    }


    public void setDirection(String direction) {
        this.direction = direction;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
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
