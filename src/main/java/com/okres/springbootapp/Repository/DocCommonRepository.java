package com.okres.springbootapp.Repository;

import com.okres.springbootapp.Entity.DocCommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DocCommonRepository extends JpaRepository<DocCommonEntity, Long> {
    List<DocCommonEntity> findByDocdateEquals(String date);
}
