package com.fiuni.sd.hotelsystembeans.entity.client;

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
import com.fiuni.sd.hotelsystembeans.entity.registration.Registration;


@Entity
@Table(name = "client")
public class Client implements BaseEntity {
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
    private String lastName;

    @Column
    @NotNull
    private String document;

    @Column
    private String direction;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate removeAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Registration> registrations;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    public Set<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<Registration> registrations) {
        this.registrations = registrations;
    }
}
