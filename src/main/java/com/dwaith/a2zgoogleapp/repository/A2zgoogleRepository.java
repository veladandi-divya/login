package com.dwaith.a2zgoogleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dwaith.a2zgoogleapp.entity.A2zgoogle;


public interface A2zgoogleRepository extends JpaRepository<A2zgoogle, Long>{

	/*
	 * @Query("SELECT a2z FROM A2ZGOOGLE a2z where a2z.catagory=?1") public
	 * A2zgoogle getA2zgoogleBycatagory(String catagory);
	 */
}
