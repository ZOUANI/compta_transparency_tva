package com.zsmart.tva.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.tva.bean.EtatTva;
public interface EtatTvaService {

public EtatTva save(EtatTva etattva); 
public List<EtatTva>  findAll();
public EtatTva findById(Long id);
public int delete(EtatTva etattva);
public void  deleteById(Long id);
public void clone(EtatTva etattva,EtatTva etattvaClone);
public EtatTva clone(EtatTva etattva);
public List<EtatTva> clone(List<EtatTva>etattvas);
 public List<EtatTva>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
