package com.org.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.model.Student;
@Repository
public interface repointerface extends CrudRepository<Student, Integer> {

	@Query(value = "from Student where username=?1 and password=?2")
	public List<Student> getstudentnameandpassword(String username,String password);
	
}
