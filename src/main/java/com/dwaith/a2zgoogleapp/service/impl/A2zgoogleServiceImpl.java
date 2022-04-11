package com.dwaith.a2zgoogleapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dwaith.a2zgoogleapp.entity.A2zgoogle;
import com.dwaith.a2zgoogleapp.repository.A2zgoogleRepository;
import com.dwaith.a2zgoogleapp.service.A2zgoogleService;


@Service
public class A2zgoogleServiceImpl implements A2zgoogleService{

	private A2zgoogleRepository a2zgoogleRepository;
	
	public A2zgoogleServiceImpl(A2zgoogleRepository a2zgoogleRepository) {
		super();
		this.a2zgoogleRepository = a2zgoogleRepository;
	}

	@Override
	public List<A2zgoogle> getAllA2zgoogle() {
		return a2zgoogleRepository.findAll();
	}

	@Override
	public A2zgoogle saveA2zgoogle(A2zgoogle a2zgoogle) {
		return a2zgoogleRepository.save(a2zgoogle);
	}

	@Override
	public A2zgoogle getA2zgoogleById(Long id) {
		return a2zgoogleRepository.findById(id).get();
	}

	@Override
	public A2zgoogle updateA2zgoogle(A2zgoogle a2zgoogle) {
		return a2zgoogleRepository.save(a2zgoogle);
	}

	@Override
	public void deleteA2zgoogleById(Long id) {
		a2zgoogleRepository.deleteById(id);	
	}

}
