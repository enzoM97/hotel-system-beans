package com.fiuni.sd.hotelsystembeans.dto.room;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "room")
public class RoomDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private String status;
    private Integer price;
    private Integer number;
    private Integer idHotelLevel;
    private Integer idTypeOfRoom;
    private Integer idHotel;
    @XmlElement
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @XmlElement
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @XmlElement
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    @XmlElement
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    @XmlElement
    public Integer getIdHotelLevel() {
        return idHotelLevel;
    }
    public void setIdHotelLevel(Integer idHotelLevel) {
        this.idHotelLevel = idHotelLevel;
    }
    @XmlElement
    public Integer getIdTypeOfRoom() {
        return idTypeOfRoom;
    }
    public void setIdTypeOfRoom(Integer idTypeOfRoom) {
        this.idTypeOfRoom = idTypeOfRoom;
    }
    @XmlElement
    public Integer getIdHotel() {
        return idHotel;
    }
    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }



}
