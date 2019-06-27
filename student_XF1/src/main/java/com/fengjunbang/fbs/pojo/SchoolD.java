package com.fengjunbang.fbs.pojo;

import java.io.Serializable;

public class SchoolD implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer did;

    private Integer dnum;

    private Integer pcount;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDnum() {
        return dnum;
    }

    public void setDnum(Integer dnum) {
        this.dnum = dnum;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }
}