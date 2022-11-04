package com.fiuni.sd.hotelsystembeans.dto.registration;

import java.time.LocalDate;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "registration")
public class RegistrationDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String typeOfRegistration;
    private String observation;
    private Integer totalPay;
    private LocalDate departureDate;
    private LocalDate dateOfAdmission;
    private Integer clientId;
    private Set<Integer> idRooms;

    @XmlElement
    public String getTypeOfRegistration() {
        return typeOfRegistration;
    }
    public void setTypeOfRegistration(String typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }
    @XmlElement
    public String getObservation() {
        return observation;
    }
    public void setObservation(String observation) {
        this.observation = observation;
    }
    @XmlElement
    public Integer getTotalPay() {
        return totalPay;
    }
    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }
    @XmlElement
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    @XmlElement
    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }
    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
    @XmlElement
    public Integer getClientId() {
        return clientId;
    }
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    @XmlElement
    public Set<Integer> getIdRooms() {
        return idRooms;
    }
    public void setIdRooms(Set<Integer> idRooms) {
        this.idRooms = idRooms;
    }





}
