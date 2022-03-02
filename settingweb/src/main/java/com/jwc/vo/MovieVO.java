package com.jwc.vo;

//클라이언트에게 비춰지는 UI는 목적마다 상이한 데이터가 반영되지만, 도매인 객체의 정보를 직접 비추기에는 보안상의 문제가 발생
//Data Transfer Obeject는 도메인 모델의 민감한 데이터를 사용하기에는 문제가 있으므로 데이터 전송 목적을 위해 생성하는 객체

//VO : Value Object , 즉 일련의 값을 저장하고 관리하
public class MovieVO {
	public Long id;
	public String movie_name;
	public String director;
	public String type;
	
	
	public MovieVO() {
	}
	
	public MovieVO(Long id, String movie_name, String director, String type) {
		this.id = id;
		this.movie_name = movie_name;
		this.director = director;
		this.type = type;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_name() {//DB필드명, VO속성명 ,JSP에서 불러올 속성 명 모두 동일하게 맞춰줘야함. 프로퍼티 속성 문제!
		return movie_name;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	

}
