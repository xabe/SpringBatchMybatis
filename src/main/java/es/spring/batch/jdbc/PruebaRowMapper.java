package es.spring.batch.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import es.spring.batch.model.Prueba;

public class PruebaRowMapper implements RowMapper<Prueba> {
	 
	public Prueba mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Prueba prueba = new Prueba();
		 
		prueba.setId(rs.getInt("id"));
		prueba.setNombre(rs.getString("nombre"));
		prueba.setFecha(rs.getDate("fecha"));
 
		return prueba;
	}
	 
}
