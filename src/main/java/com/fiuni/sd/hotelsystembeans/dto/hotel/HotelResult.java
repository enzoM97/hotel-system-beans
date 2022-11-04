package com.fiuni.sd.hotelsystembeans.dto.hotel;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;

@XmlRootElement(name = "hotelResult")
public class HotelResult extends BaseResult<HotelDTO> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<HotelDTO> geHotels(){
        return getList();
    }

    public void setHotels(List<HotelDTO> dtos) {
        super.setList(dtos);
    }
}
