package com.fiuni.sd.hotelsystembeans.dto.room;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;

@XmlRootElement(name = "roomResult")
public class RoomResult extends BaseResult<RoomDTO> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<RoomDTO> getRooms(){
        return getList();
    }

    public void setRooms(List<RoomDTO> dtos) {
        super.setList(dtos);
    }

}
