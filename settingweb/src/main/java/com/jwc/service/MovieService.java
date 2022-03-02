package com.jwc.service;

import java.util.List;

import com.jwc.vo.MovieVO;

public interface MovieService {
	public List<MovieVO> selectMovie() throws Exception;

}
