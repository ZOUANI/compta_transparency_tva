package com.zsmart.tva.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.tva.bean.TypeTva;
public interface TypeTvaService {

public TypeTva save(TypeTva typetva); 
public List<TypeTva>  findAll();
public TypeTva findById(Long id);
public int delete(TypeTva typetva);
public void  deleteById(Long id);
public void clone(TypeTva typetva,TypeTva typetvaClone);
public TypeTva clone(TypeTva typetva);
public List<TypeTva> clone(List<TypeTva>typetvas);
 public List<TypeTva>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
