package com.helloWorld.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;


public class Baba {
	private int p;
	private Trigger obj;
	private List<Trigger>l=new ArrayList<>();
	public  Baba(int p){
		this.p=p;
	}
	public void mukka(String s) {
		System.out.println("i am of mukka ->"+s);
	}
	public void chilla(String s) {
		mukka(s);
		System.out.println("chilla raha hu");
	}
	@Override
	public int hashCode() {
		return Objects.hash(p);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baba other = (Baba) obj;
		return p == other.p;
	}
	public List<Trigger> getL() {
		return l;
	}
	public void setL(List<Trigger> l) {
		this.l = l;
	}
	
}
