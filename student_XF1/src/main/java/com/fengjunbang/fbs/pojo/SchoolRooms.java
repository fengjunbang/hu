package com.fengjunbang.fbs.pojo;

import java.io.Serializable;
import java.util.Date;

public class SchoolRooms implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer sid;

    private Date startdate;

    private String leavedate;

    private Integer did;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(String leavedate) {
        this.leavedate = leavedate == null ? null : leavedate.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}