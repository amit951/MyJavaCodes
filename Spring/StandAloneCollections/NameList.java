package com.StandAloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class NameList {
	
	List<String> name;
	Map<String,Integer> var;
	Properties p;

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Map<String, Integer> getVar() {
		return var;
	}

	public void setVar(Map<String, Integer> var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return "NameList [name=" + name + ", var=" + var + ", p=" + p + "]";
	}

	
	

}
