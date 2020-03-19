package com.zsmart.tva.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.tva.bean.TvaFacture;
import com.zsmart.tva.bean.Tva; 
public interface TvaFactureService {

public TvaFacture save(TvaFacture tvafacture); 
public List<TvaFacture>  findAll();
public TvaFacture findById(Long id);
public int delete(TvaFacture tvafacture);
public void  deleteById(Long id);
public void clone(TvaFacture tvafacture,TvaFacture tvafactureClone);
public TvaFacture clone(TvaFacture tvafacture);
public List<TvaFacture> clone(List<TvaFacture>tvafactures);
 public List<TvaFacture>  findByCriteria(String referenceFacture,String referenceSociete,Long idMin,Long idMax);

}
