package com.java8.oops.serialization;

import java.io.Serializable;
import java.util.Date;

public class StudentdInfo implements Serializable {
	Integer sno;
	String sname;
	Date sdate;

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "StudentdInfo [sno=" + sno + ", sname=" + sname + ", sdate=" + sdate + "]";
	}

	public Integer getSno() {
		return sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getSdate() {
		return sdate;
	}
}
