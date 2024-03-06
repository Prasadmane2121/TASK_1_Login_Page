package com.org.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.servicei.serviceinterface;
import com.org.model.Student;
import com.org.reposatory.repointerface;

@Service
public class serviceclass implements serviceinterface{

	@Autowired
	repointerface sr;
	@Override
	public List<Student> loginstudent(String username, String password) {
		List<Student> list=sr.getstudentnameandpassword(username,password);
			return list;
		
	}
}
