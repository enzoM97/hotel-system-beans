package com.fiuni.sd.hotelsystembeans.entity.room;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fiuni.sd.hotelsystembeans.entity.base.BaseEntity;
import com.fiuni.sd.hotelsystembeans.entity.hotel.Hotel;
import com.fiuni.sd.hotelsystembeans.entity.hotellevel.HotelLevel;
import com.fiuni.sd.hotelsystembeans.entity.registration.Registration;
import com.fiuni.sd.hotelsystembeans.entity.typeofroom.TypeOfRoom;


@Entity
@Table(name = "room")
public class Room implements BaseEntity{
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
    @NotNull
    private String description;

    @Column
    @NotNull
    private String status;

    @Column
    @NotNull
    private Integer price;

    @Column
    @NotNull
    private Integer number;

    @Column
    private LocalDate removeAt;

    @JoinColumn(name = "hotel_id")
    @ManyToOne
    private Hotel hotel;

    @JoinColumn(name = "type_of_room_id")
    @ManyToOne
    private TypeOfRoom type_of_room;

    @JoinColumn(name = "hotel_level_id")
    @ManyToOne
    private HotelLevel hotel_level;


    @JoinColumn(name = "registration_id")
    @ManyToOne
    private Registration registration;

    public Registration getRegistrations() {
        return registration;
    }

    public void setRegistrations(Registration registration) {
        this.registration = registration;
    }

    public LocalDate getRemoveAt() {
        return removeAt;
    }

    public void setRemoveAt(LocalDate removeAt) {
        this.removeAt = removeAt;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public TypeOfRoom getType_of_room() {
        return type_of_room;
    }

    public void setType_of_room(TypeOfRoom type_of_room) {
        this.type_of_room = type_of_room;
    }

    public HotelLevel getHotel_level() {
        return hotel_level;
    }

    public void setHotel_level(HotelLevel hotel_level) {
        this.hotel_level = hotel_level;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }



}
