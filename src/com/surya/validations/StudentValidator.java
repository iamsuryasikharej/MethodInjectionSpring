package com.surya.validations;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.surya.beans.Student;

public class StudentValidator implements Validator {
	private Resource resource;
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Student.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		Properties prop = null;
		Student student=(Student)arg0;
		try {
			prop=PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(student.getName()==null || student.getName().equals(""))
		{
			arg1.rejectValue("unamesss", "name required bbb", prop.getProperty("error.uname.required"));
		}
		if(student.getId()==null || student.getId().equals(""))
		{
			arg1.rejectValue("uidsss", "uid required bbb", prop.getProperty("error.id.required"));
		}


	}



	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
