package com.fiuni.sd.hotelsystembeans.dto.base;


import java.io.Serializable;
import java.util.List;

public abstract class BaseResult<DTO extends BaseDTO> implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<DTO> dtos;

    protected List<DTO> getList() {
        return dtos;
    }

    protected void setList(List<DTO> dtos) {
        this.dtos = dtos;
    }

    public Integer getTotal() {
        return null == this.dtos ? 0 : this.dtos.size();
    }
}
