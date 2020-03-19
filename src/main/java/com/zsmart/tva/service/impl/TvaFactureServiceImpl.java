
package com.zsmart.tva.service.impl ;
import com.zsmart.tva.service.facade.TvaFactureService ; 
import com.zsmart.tva.dao.TvaFactureDao ;
import com.zsmart.tva.service.util.SearchUtil;
import com.zsmart.tva.bean.TvaFacture;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.tva.bean.Tva; 
import com.zsmart.tva.service.facade.TvaService ; 

 @Service  

 public class TvaFactureServiceImpl implements TvaFactureService  {


 @Autowired 

 private TvaFactureDao tvafactureDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private TvaService tvaService; 

 @Override 
public TvaFacture  save (TvaFacture tvafacture){

if(tvafacture== null){ 
 return null; 
}else {
 tvafactureDao.save(tvafacture);
return tvafacture;
}
}

 @Override 
public List< TvaFacture>  findAll(){
 return tvafactureDao.findAll();
}

 @Override 
public TvaFacture findById(Long id){
 return tvafactureDao.getOne(id);
}

 @Override 
public int delete(TvaFacture tvafacture){
if(tvafacture== null){ 
  return -1; 
}else {
 tvafactureDao.delete(tvafacture);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       tvafactureDao.deleteById(id);
}
public void clone(TvaFacture tvafacture,TvaFacture tvafactureClone){
if(tvafacture!= null && tvafactureClone != null){
tvafactureClone.setId(tvafacture.getId());
tvafactureClone.setReferenceFacture(tvafacture.getReferenceFacture());
tvafactureClone.setReferenceSociete(tvafacture.getReferenceSociete());
tvafactureClone.setTva(tvaService.clone(tvafacture.getTva()));
}
}
public TvaFacture clone(TvaFacture tvafacture){
if(tvafacture== null){       return null ;
}else{TvaFacture tvafactureClone= new TvaFacture();
tvafactureClone.setId(tvafacture.getId());
tvafactureClone.setReferenceFacture(tvafacture.getReferenceFacture());
tvafactureClone.setReferenceSociete(tvafacture.getReferenceSociete());
tvafactureClone.setTva(tvaService.clone(tvafacture.getTva()));
return tvafactureClone;
}
}
public List<TvaFacture> clone(List<TvaFacture>tvafactures){
if(tvafactures== null){
       return null ;
}else{List<TvaFacture> tvafacturesClone = new ArrayList();
	 	 	 tvafactures.forEach((tvafacture)->{tvafacturesClone.add(clone(tvafacture));
});return tvafacturesClone;
}
}
 @Override 
 public List< TvaFacture>  findByCriteria(String referenceFacture,String referenceSociete,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(referenceFacture,referenceSociete,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String referenceFacture,String referenceSociete,Long idMin,Long idMax){
String query = "SELECT t FROM TvaFacture t where 1=1 ";
query += SearchUtil.addConstraint( "t", "referenceFacture","=",referenceFacture);
query += SearchUtil.addConstraint( "t", "referenceSociete","=",referenceSociete);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);

  return query; 
}
}
