package com.jwc.dao;

import java.util.List;

import com.jwc.vo.MovieVO;

//Data access obejct, database 데이터 접근하기 위한 계층 
//Dao pattern과 Repository패턴의 차이점? 이름만 다른 동일한 기능을 수행하는 것일까?
public interface MovieDAO {
	
	public List<MovieVO> selectMovie() throws Exception;
	

}
