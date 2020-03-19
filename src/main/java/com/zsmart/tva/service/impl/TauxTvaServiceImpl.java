
package com.zsmart.tva.service.impl ;
import com.zsmart.tva.service.facade.TauxTvaService ; 
import com.zsmart.tva.dao.TauxTvaDao ;
import com.zsmart.tva.service.util.SearchUtil;
import com.zsmart.tva.bean.TauxTva;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TauxTvaServiceImpl implements TauxTvaService  {


 @Autowired 

 private TauxTvaDao tauxtvaDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TauxTva  save (TauxTva tauxtva){

if(tauxtva== null){ 
 return null; 
}else {
 tauxtvaDao.save(tauxtva);
return tauxtva;
}
}

 @Override 
public List< TauxTva>  findAll(){
 return tauxtvaDao.findAll();
}

 @Override 
public TauxTva findById(Long id){
 return tauxtvaDao.getOne(id);
}

 @Override 
public int delete(TauxTva tauxtva){
if(tauxtva== null){ 
  return -1; 
}else {
 tauxtvaDao.delete(tauxtva);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       tauxtvaDao.deleteById(id);
}
public void clone(TauxTva tauxtva,TauxTva tauxtvaClone){
if(tauxtva!= null && tauxtvaClone != null){
tauxtvaClone.setId(tauxtva.getId());
tauxtvaClone.setPercentage(tauxtva.getPercentage());
tauxtvaClone.setMajoration(tauxtva.getMajoration());
tauxtvaClone.setPenalite(tauxtva.getPenalite());
tauxtvaClone.setDateApplicationDebut(tauxtva.getDateApplicationDebut());
tauxtvaClone.setDateApplicationFin(tauxtva.getDateApplicationFin());
}
}
public TauxTva clone(TauxTva tauxtva){
if(tauxtva== null){       return null ;
}else{TauxTva tauxtvaClone= new TauxTva();
tauxtvaClone.setId(tauxtva.getId());
tauxtvaClone.setPercentage(tauxtva.getPercentage());
tauxtvaClone.setMajoration(tauxtva.getMajoration());
tauxtvaClone.setPenalite(tauxtva.getPenalite());
tauxtvaClone.setDateApplicationDebut(tauxtva.getDateApplicationDebut());
tauxtvaClone.setDateApplicationFin(tauxtva.getDateApplicationFin());
return tauxtvaClone;
}
}
public List<TauxTva> clone(List<TauxTva>tauxtvas){
if(tauxtvas== null){
       return null ;
}else{List<TauxTva> tauxtvasClone = new ArrayList();
	 	 	 tauxtvas.forEach((tauxtva)->{tauxtvasClone.add(clone(tauxtva));
});return tauxtvasClone;
}
}
 @Override 
 public List< TauxTva>  findByCriteria(Long idMin,Long idMax,BigDecimal percentageMin,BigDecimal percentageMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,percentageMin,percentageMax,majorationMin,majorationMax,penaliteMin,penaliteMax,dateApplicationDebutMin,dateApplicationDebutMax,dateApplicationFinMin,dateApplicationFinMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,BigDecimal percentageMin,BigDecimal percentageMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
String query = "SELECT t FROM TauxTva t where 1=1 ";
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "percentage", percentageMin, percentageMax);
query += SearchUtil.addConstraintMinMax("t", "majoration", majorationMin, majorationMax);
query += SearchUtil.addConstraintMinMax("t", "penalite", penaliteMin, penaliteMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationDebut", dateApplicationDebutMin, dateApplicationDebutMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationFin", dateApplicationFinMin, dateApplicationFinMax);

  return query; 
}
}
