package com.example.demo.sts.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.cmm.utl.Vector;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Integer> {
	public int insertMany(Vector<Grade>vc);
	public Vector<GradeVo> selectJoinAll(String examDate);
	public int insert(Grade grade);
	public Vector<Grade> selectSome(Grade grade);
	public Grade selectOne(Grade grade);
	public int update(Grade grade);
	//public int delete(Grade grade);
}