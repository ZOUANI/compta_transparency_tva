package com.zsmart.tva.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.tva.bean.TauxTva;
public interface TauxTvaService {

public TauxTva save(TauxTva tauxtva); 
public List<TauxTva>  findAll();
public TauxTva findById(Long id);
public int delete(TauxTva tauxtva);
public void  deleteById(Long id);
public void clone(TauxTva tauxtva,TauxTva tauxtvaClone);
public TauxTva clone(TauxTva tauxtva);
public List<TauxTva> clone(List<TauxTva>tauxtvas);
 public List<TauxTva>  findByCriteria(Long idMin,Long idMax,BigDecimal percentageMin,BigDecimal percentageMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax);

}
