package com.encuestas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.encuestas.domain.ESTUDIANTE1;
import com.encuestas.domain.PENSUM;

public interface EstudianteRepository1 extends CrudRepository<ESTUDIANTE1, Integer> {
/*
	@Query(value = "select new com.tallerperiodo.dominio.Pensum(pe.pensum_id, pe.grupoid, est) from Pensum pe inner join Estudiantes est on pe.estudiante_id = est.id_estudiante "
			+ "where pensum_id=?1 and grupoid=?2 ")
	public List<Pensum> getestudiantesbyPensum(int pensum_id, int grupoid);
	*/
}
