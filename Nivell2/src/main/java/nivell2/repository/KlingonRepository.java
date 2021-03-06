package nivell2.repository;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nivell2.dto.KlingonResponseDto;

@Repository
@Transactional
public class KlingonRepository implements IRepository, JpaRepository {
	
	@Autowired
	private KlingonResponseDto klingonResponseDto;

	@Override
	public KlingonResponseDto getKlingon(String uuid) {
		klingonResponseDto.setName("Worf");
		klingonResponseDto.setRank("Lieutenant Commander");
		return klingonResponseDto;
	}

	@Override
	public Page findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional findOne(Example example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page findAll(Example example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Example example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists(Example example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAllById(Iterable ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List saveAll(Iterable entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object saveAndFlush(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getOne(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
