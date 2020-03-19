
package com.zsmart.tva.service.impl ;
import com.zsmart.tva.service.facade.TypeTvaService ; 
import com.zsmart.tva.dao.TypeTvaDao ;
import com.zsmart.tva.service.util.SearchUtil;
import com.zsmart.tva.bean.TypeTva;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TypeTvaServiceImpl implements TypeTvaService  {


 @Autowired 

 private TypeTvaDao typetvaDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TypeTva  save (TypeTva typetva){

if(typetva== null){ 
 return null; 
}else {
 typetvaDao.save(typetva);
return typetva;
}
}

 @Override 
public List< TypeTva>  findAll(){
 return typetvaDao.findAll();
}

 @Override 
public TypeTva findById(Long id){
 return typetvaDao.getOne(id);
}

 @Override 
public int delete(TypeTva typetva){
if(typetva== null){ 
  return -1; 
}else {
 typetvaDao.delete(typetva);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       typetvaDao.deleteById(id);
}
public void clone(TypeTva typetva,TypeTva typetvaClone){
if(typetva!= null && typetvaClone != null){
typetvaClone.setId(typetva.getId());
typetvaClone.setLibelle(typetva.getLibelle());
typetvaClone.setCode(typetva.getCode());
}
}
public TypeTva clone(TypeTva typetva){
if(typetva== null){       return null ;
}else{TypeTva typetvaClone= new TypeTva();
typetvaClone.setId(typetva.getId());
typetvaClone.setLibelle(typetva.getLibelle());
typetvaClone.setCode(typetva.getCode());
return typetvaClone;
}
}
public List<TypeTva> clone(List<TypeTva>typetvas){
if(typetvas== null){
       return null ;
}else{List<TypeTva> typetvasClone = new ArrayList();
	 	 	 typetvas.forEach((typetva)->{typetvasClone.add(clone(typetva));
});return typetvasClone;
}
}
 @Override 
 public List< TypeTva>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT t FROM TypeTva t where 1=1 ";
query += SearchUtil.addConstraint( "t", "libelle","=",libelle);
query += SearchUtil.addConstraint( "t", "code","=",code);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);

  return query; 
}
}
