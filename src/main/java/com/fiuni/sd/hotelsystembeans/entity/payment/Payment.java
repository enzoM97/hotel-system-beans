package com.fiuni.sd.hotelsystembeans.entity.payment;

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
@Table(name = "payment")
public class Payment implements BaseEntity{
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
    private Integer total;

    @Column
    private LocalDate paymentDate;


    @Column
    private LocalDate removeAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    private Set<Registration> registrations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
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
