package es.spring.batch.persistence;

import java.util.List;

import es.spring.batch.model.Prueba;

public interface  PruebaMapper {
	
	List<Prueba> selectByExample();
	
	List<Prueba> selectByExamplePaginated();

}
