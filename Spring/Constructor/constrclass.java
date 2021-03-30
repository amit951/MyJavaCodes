package com.constr;

import java.util.List;

public class constrclass {
String x;
int y;
int z;
Certi certi;
List<String> list;
public constrclass(String x, int y,int z,Certi certi, List<String> list) {
	super();
	this.x = x;
	this.y = y;
	this.z=z;
	this.certi=certi;
	this.list=list;
}
@Override
public String toString() {
	return x +" : "+y+ " : "+z+ ":"+certi+" "+list;
}
}
