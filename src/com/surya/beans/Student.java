package com.surya.beans;


public abstract class Student {
private String name;
private String id;


protected abstract Course setCourse();
public Course getCourse()
{
	return setCourse();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
