package com.shearf.cloud.apps.commons.foundation.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = -3634586838148880384L;

    private Date createTime;

    private Date updateTime;
}
