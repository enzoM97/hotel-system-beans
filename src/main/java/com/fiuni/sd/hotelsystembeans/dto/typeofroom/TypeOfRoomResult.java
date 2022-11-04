package com.fiuni.sd.hotelsystembeans.dto.typeofroom;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;

@XmlRootElement(name = "typeOfRoomResult")
public class TypeOfRoomResult extends BaseResult<TypeOfRoomDTO> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<TypeOfRoomDTO> getTypeOfRooms(){
        return getList();
    }

    public void setTypeOfRooms(List<TypeOfRoomDTO> dtos) {
        super.setList(dtos);
    }


}
