package com.zsmart.tva.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.tva.bean.Tva;
import com.zsmart.tva.bean.TypeTva; 
import com.zsmart.tva.bean.EtatTva; 
public interface TvaService {

public Tva save(Tva tva); 
public Tva  saveWithTvaFactures (Tva tva);public List<Tva>  findAll();
public Tva findById(Long id);
public Tva  findByReference(String  reference);
public int delete(Tva tva);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(Tva tva,Tva tvaClone);
public Tva clone(Tva tva);
public List<Tva> clone(List<Tva>tvas);
 public List<Tva>  findByCriteria(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,BigDecimal tvaCollecteeMin,BigDecimal tvaCollecteeMax,BigDecimal tvaDeductibleMin,BigDecimal tvaDeductibleMax,BigDecimal differenceTvaMin,BigDecimal differenceTvaMax,BigDecimal mantantTvaMin,BigDecimal mantantTvaMax,BigDecimal mantantBaseTvaMin,BigDecimal mantantBaseTvaMax,BigDecimal mantantRetardMin,BigDecimal mantantRetardMax,BigDecimal mantantMajorationMin,BigDecimal mantantMajorationMax,BigDecimal mantantPenaliteMin,BigDecimal mantantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateCreationMin,Date dateCreationMax,Integer anneMin,Integer anneMax,Integer periodeMin,Integer periodeMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,Date dateSaisieMin,Date dateSaisieMax);

}
