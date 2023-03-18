package com.beanoapp.beanoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beanoapp.beanoservice.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String>{

}
