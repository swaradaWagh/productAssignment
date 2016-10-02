package com.sample.productSampleApp.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sample.productSampleApp.model.User;

public interface UserRepository extends CrudRepository<User, String> {
	
@Query("from User u where u.username =:userName")	
public User findUserByUserName(@Param("userName") String userName);

}
 