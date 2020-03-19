package com.zsmart.tva.dao;
import com.zsmart.tva.bean.TypeTva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TypeTvaDao extends JpaRepository<TypeTva,Long> {




}
