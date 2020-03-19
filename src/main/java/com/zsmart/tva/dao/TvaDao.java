package com.zsmart.tva.dao;
import com.zsmart.tva.bean.TypeTva;
import com.zsmart.tva.bean.EtatTva;
import com.zsmart.tva.bean.Tva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TvaDao extends JpaRepository<Tva,Long> {
	 public Tva findByReference(String reference);

	 public int deleteByReference(String reference);

	 public Tva findByTypeTva(TypeTva typeTva);
	 public Tva findByEtatTva(EtatTva etatTva);

	 public int deleteByTypeTva(TypeTva typeTva);
	 public int deleteByEtatTva(EtatTva etatTva);

}
