package com.zsmart.tva.dao;
import com.zsmart.tva.bean.Tva;
import com.zsmart.tva.bean.TvaFacture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TvaFactureDao extends JpaRepository<TvaFacture,Long> {


	 public TvaFacture findByTva(Tva tva);

	 public int deleteByTva(Tva tva);

}
