package com.fiuni.sd.hotelsystembeans.dto.user;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;


public class UserResult extends BaseResult<UserDTO>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<UserDTO> getUsers(){
        return getList();
    }

    public void setUsers(List<UserDTO> dtos) {
        super.setList(dtos);
    }

}