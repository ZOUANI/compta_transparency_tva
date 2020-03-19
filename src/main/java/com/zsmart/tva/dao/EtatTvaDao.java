package com.zsmart.tva.dao;
import com.zsmart.tva.bean.EtatTva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface EtatTvaDao extends JpaRepository<EtatTva,Long> {




}
