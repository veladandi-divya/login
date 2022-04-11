package com.dwaith.a2zgoogleapp.service;

import java.util.List;

import com.dwaith.a2zgoogleapp.entity.A2zgoogle;



public interface A2zgoogleService {
	
	List<A2zgoogle> getAllA2zgoogle();
	
	
	A2zgoogle saveA2zgoogle(A2zgoogle a2zgoogle);
	
	A2zgoogle getA2zgoogleById(Long id);
	
	A2zgoogle updateA2zgoogle(A2zgoogle a2zgoogle);
	
	void deleteA2zgoogleById(Long id);
}
