package com.mulit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mulit.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

	Iterable<Tutorial> findByTitleContaining(String title);

	List<Tutorial> findByPublished(boolean b);


	//Tutorial save(Tutorial tutorial);

}
