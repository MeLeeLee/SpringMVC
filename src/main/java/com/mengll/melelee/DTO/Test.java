package com.mengll.melelee.DTO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author mengll
 * @create 2017-12-28 14:25
 **/
@Entity
public class Test {
	private String txt;

	@Basic
	@Column(name = "txt", nullable = true, length = 100)
	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Test test = (Test) o;

		if (txt != null ? !txt.equals(test.txt) : test.txt != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return txt != null ? txt.hashCode() : 0;
	}
}
