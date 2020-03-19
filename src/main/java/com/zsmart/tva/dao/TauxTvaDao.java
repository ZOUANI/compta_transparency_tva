package com.zsmart.tva.dao;
import com.zsmart.tva.bean.TauxTva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxTvaDao extends JpaRepository<TauxTva,Long> {




}
