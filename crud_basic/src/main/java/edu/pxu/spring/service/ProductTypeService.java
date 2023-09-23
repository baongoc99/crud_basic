package edu.pxu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pxu.spring.model.Product;
import edu.pxu.spring.model.Producttype;
import edu.pxu.spring.repository.BaseRepository;

@Service
public class ProductTypeService implements BaseService<Producttype> {

	@Autowired
	private BaseRepository<Producttype> productRepository;

	public ProductTypeService() {
		super();
	}

	@Override
	public List<Producttype> getAll() {
		// TODO Auto-generated method stub
		return productRepository.getAll();
	}

	@Override
	public void save(Producttype object) {
		// TODO Auto-generated method stub
		productRepository.save(object);
	}

	@Override
	public Producttype getById(int id) {
		// TODO Auto-generated method stub
		return productRepository.getById(id);
	}

	@Override
	public void update(Producttype object) {
		// TODO Auto-generated method stub
		productRepository.update(object);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

}
