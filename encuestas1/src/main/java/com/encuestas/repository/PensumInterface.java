package com.encuestas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.encuestas.domain.PENSUM;

public interface PensumInterface extends CrudRepository<PENSUM, Integer> {
//
	@Query(value = "select new com.tallerperiodo.dominio.Pensum(pe.pensum_id, pe.materiaid,  pe.grupoid, est) from pensum pe inner join pe.estudiante est  "
			+ "where pe.pensum_id=?1 and pe.grupoid=?2", nativeQuery=false)
	public List<PENSUM> getestudiantesbyPensum(int pensum_id, int grupoid);
	
	
}
