package com.fiuni.sd.hotelsystembeans.dto.registration;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;

@XmlRootElement(name = "registrationResult")
public class RegistrationResult extends BaseResult<RegistrationDTO> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<RegistrationDTO> getRegistrations(){
        return getList();
    }

    public void setRegistrations(List<RegistrationDTO> dtos) {
        super.setList(dtos);
    }



}
