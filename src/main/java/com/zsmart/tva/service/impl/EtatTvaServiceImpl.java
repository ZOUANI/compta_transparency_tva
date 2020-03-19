
package com.zsmart.tva.service.impl ;
import com.zsmart.tva.service.facade.EtatTvaService ; 
import com.zsmart.tva.dao.EtatTvaDao ;
import com.zsmart.tva.service.util.SearchUtil;
import com.zsmart.tva.bean.EtatTva;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class EtatTvaServiceImpl implements EtatTvaService  {


 @Autowired 

 private EtatTvaDao etattvaDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public EtatTva  save (EtatTva etattva){

if(etattva== null){ 
 return null; 
}else {
 etattvaDao.save(etattva);
return etattva;
}
}

 @Override 
public List< EtatTva>  findAll(){
 return etattvaDao.findAll();
}

 @Override 
public EtatTva findById(Long id){
 return etattvaDao.getOne(id);
}

 @Override 
public int delete(EtatTva etattva){
if(etattva== null){ 
  return -1; 
}else {
 etattvaDao.delete(etattva);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       etattvaDao.deleteById(id);
}
public void clone(EtatTva etattva,EtatTva etattvaClone){
if(etattva!= null && etattvaClone != null){
etattvaClone.setId(etattva.getId());
etattvaClone.setLibelle(etattva.getLibelle());
etattvaClone.setCode(etattva.getCode());
}
}
public EtatTva clone(EtatTva etattva){
if(etattva== null){       return null ;
}else{EtatTva etattvaClone= new EtatTva();
etattvaClone.setId(etattva.getId());
etattvaClone.setLibelle(etattva.getLibelle());
etattvaClone.setCode(etattva.getCode());
return etattvaClone;
}
}
public List<EtatTva> clone(List<EtatTva>etattvas){
if(etattvas== null){
       return null ;
}else{List<EtatTva> etattvasClone = new ArrayList();
	 	 	 etattvas.forEach((etattva)->{etattvasClone.add(clone(etattva));
});return etattvasClone;
}
}
 @Override 
 public List< EtatTva>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT e FROM EtatTva e where 1=1 ";
query += SearchUtil.addConstraint( "e", "libelle","=",libelle);
query += SearchUtil.addConstraint( "e", "code","=",code);
query += SearchUtil.addConstraintMinMax("e", "id", idMin, idMax);

  return query; 
}
}
