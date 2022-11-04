package com.fiuni.sd.hotelsystembeans.dto.client;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseResult;


@XmlRootElement(name = "clientResult")
public class ClientResult extends BaseResult<ClientDTO> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement
    public List<ClientDTO> getClients(){
        return getList();
    }

    public void setClients(List<ClientDTO> dtos) {
        super.setList(dtos);
    }

}
