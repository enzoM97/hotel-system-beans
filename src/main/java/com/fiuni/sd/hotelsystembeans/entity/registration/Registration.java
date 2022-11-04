package com.fiuni.sd.hotelsystembeans.entity.registration;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fiuni.sd.hotelsystembeans.entity.base.BaseEntity;
import com.fiuni.sd.hotelsystembeans.entity.client.Client;
import com.fiuni.sd.hotelsystembeans.entity.payment.Payment;
import com.fiuni.sd.hotelsystembeans.entity.room.Room;

@Entity
@Table(name = "registration")
public class Registration implements BaseEntity{
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
    private String typeOfRegistration;

    @Column
    private String observation;

    @Column
    @NotNull
    private Integer totalpay;

    @Column
    @NotNull
    private LocalDate departureDate;

    @Column
    @NotNull
    private LocalDate dateOfAdmission;

    @Column
    private LocalDate removeAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registration")
    private Set<Room> rooms;


    @JoinColumn(name = "payment_id")
    @ManyToOne
    private Payment payment;

    @JoinColumn(name = "client_id")
    @ManyToOne
    private Client client;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTypeOfregistration() {
        return typeOfRegistration;
    }


    public void setTypeOfregistration(String typeOfregistration) {
        this.typeOfRegistration = typeOfregistration;
    }


    public String getObservation() {
        return observation;
    }


    public void setObservation(String observation) {
        this.observation = observation;
    }


    public Integer getTotalpay() {
        return totalpay;
    }


    public void setTotalpay(Integer totalpay) {
        this.totalpay = totalpay;
    }


    public LocalDate getDepartureDate() {
        return departureDate;
    }


    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }


    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }


    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }


    public LocalDate getRemoveAt() {
        return removeAt;
    }


    public void setRemoveAt(LocalDate removeAt) {
        this.removeAt = removeAt;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }


    public Set<Room> getRooms() {
        return rooms;
    }


    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }


    public Payment getPayments() {
        return payment;
    }


    public void setPayments(Payment payment) {
        this.payment = payment;
    }


    public String getTypeOfRegistration() {
        return typeOfRegistration;
    }


    public void setTypeOfRegistration(String typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }


}
