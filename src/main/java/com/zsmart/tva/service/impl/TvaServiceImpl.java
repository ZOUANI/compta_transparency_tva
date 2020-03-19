
package com.zsmart.tva.service.impl ;
import com.zsmart.tva.service.facade.TvaService ; 
import com.zsmart.tva.dao.TvaDao ;
import com.zsmart.tva.service.util.SearchUtil;
import com.zsmart.tva.bean.Tva;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.tva.bean.TypeTva; 
import com.zsmart.tva.service.facade.TypeTvaService ; 
import com.zsmart.tva.bean.EtatTva; 
import com.zsmart.tva.service.facade.EtatTvaService ; 
import com.zsmart.tva.service.facade.TvaFactureService ; 
import com.zsmart.tva.bean.TvaFacture ; 

 @Service  

 public class TvaServiceImpl implements TvaService  {


 @Autowired 

 private TvaDao tvaDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private TvaFactureService tvafactureService; 

 @Autowired 

 private TypeTvaService typetvaService; 

 @Autowired 

 private EtatTvaService etattvaService; 

 @Override 
public Tva  save (Tva tva){

if(tva== null){ 
 return null; 
}else {
 tvaDao.save(tva);
return tva;
}
}

 @Override 
public Tva  saveWithTvaFactures (Tva tva){

if(tva== null){ 
        return null; 
}else {
   if(tva.getTvaFactures().isEmpty()){
            return null;
        }else{
            for (TvaFacture tvafacture : tva.getTvaFactures()) {
tvafacture.setTva(tva);
 tvafactureService.save(  tvafacture);          
            }
            }
tvaDao.save(tva);
return tva;
}
}

 @Override 
public List< Tva>  findAll(){
 return tvaDao.findAll();
}

 @Override 
public Tva findById(Long id){
 return tvaDao.getOne(id);
}

 @Override 
public Tva  findByReference(String  reference){
 return tvaDao.findByReference(reference);
}

 @Override 
public int delete(Tva tva){
if(tva== null){ 
  return -1; 
}else {
 tvaDao.delete(tva);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       tvaDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  tvaDao.deleteByReference(reference);
}
public void clone(Tva tva,Tva tvaClone){
if(tva!= null && tvaClone != null){
tvaClone.setId(tva.getId());
tvaClone.setTvaCollectee(tva.getTvaCollectee());
tvaClone.setTvaDeductible(tva.getTvaDeductible());
tvaClone.setDifferenceTva(tva.getDifferenceTva());
tvaClone.setMantantTva(tva.getMantantTva());
tvaClone.setMantantBaseTva(tva.getMantantBaseTva());
tvaClone.setMantantRetard(tva.getMantantRetard());
tvaClone.setMantantMajoration(tva.getMantantMajoration());
tvaClone.setMantantPenalite(tva.getMantantPenalite());
tvaClone.setNomberMoisRetard(tva.getNomberMoisRetard());
tvaClone.setDescription(tva.getDescription());
tvaClone.setReference(tva.getReference());
tvaClone.setReferenceSociete(tva.getReferenceSociete());
tvaClone.setReferenceComptableValidateur(tva.getReferenceComptableValidateur());
tvaClone.setReferenceComptableCreateur(tva.getReferenceComptableCreateur());
tvaClone.setDateValidation(tva.getDateValidation());
tvaClone.setDateCreation(tva.getDateCreation());
tvaClone.setAnne(tva.getAnne());
tvaClone.setPeriode(tva.getPeriode());
tvaClone.setHonoraire(tva.getHonoraire());
tvaClone.setPenalite(tva.getPenalite());
tvaClone.setMajoration(tva.getMajoration());
tvaClone.setMontantTotal(tva.getMontantTotal());
tvaClone.setDateSaisie(tva.getDateSaisie());
tvaClone.setTypeTva(typetvaService.clone(tva.getTypeTva()));
tvaClone.setEtatTva(etattvaService.clone(tva.getEtatTva()));
tvaClone.setTvaFactures(tvafactureService.clone(tva.getTvaFactures()));
}
}
public Tva clone(Tva tva){
if(tva== null){       return null ;
}else{Tva tvaClone= new Tva();
tvaClone.setId(tva.getId());
tvaClone.setTvaCollectee(tva.getTvaCollectee());
tvaClone.setTvaDeductible(tva.getTvaDeductible());
tvaClone.setDifferenceTva(tva.getDifferenceTva());
tvaClone.setMantantTva(tva.getMantantTva());
tvaClone.setMantantBaseTva(tva.getMantantBaseTva());
tvaClone.setMantantRetard(tva.getMantantRetard());
tvaClone.setMantantMajoration(tva.getMantantMajoration());
tvaClone.setMantantPenalite(tva.getMantantPenalite());
tvaClone.setNomberMoisRetard(tva.getNomberMoisRetard());
tvaClone.setDescription(tva.getDescription());
tvaClone.setReference(tva.getReference());
tvaClone.setReferenceSociete(tva.getReferenceSociete());
tvaClone.setReferenceComptableValidateur(tva.getReferenceComptableValidateur());
tvaClone.setReferenceComptableCreateur(tva.getReferenceComptableCreateur());
tvaClone.setDateValidation(tva.getDateValidation());
tvaClone.setDateCreation(tva.getDateCreation());
tvaClone.setAnne(tva.getAnne());
tvaClone.setPeriode(tva.getPeriode());
tvaClone.setHonoraire(tva.getHonoraire());
tvaClone.setPenalite(tva.getPenalite());
tvaClone.setMajoration(tva.getMajoration());
tvaClone.setMontantTotal(tva.getMontantTotal());
tvaClone.setDateSaisie(tva.getDateSaisie());
tvaClone.setTypeTva(typetvaService.clone(tva.getTypeTva()));
tvaClone.setEtatTva(etattvaService.clone(tva.getEtatTva()));
tvaClone.setTvaFactures(tvafactureService.clone(tva.getTvaFactures()));
return tvaClone;
}
}
public List<Tva> clone(List<Tva>tvas){
if(tvas== null){
       return null ;
}else{List<Tva> tvasClone = new ArrayList();
	 	 	 tvas.forEach((tva)->{tvasClone.add(clone(tva));
});return tvasClone;
}
}
 @Override 
 public List< Tva>  findByCriteria(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,BigDecimal tvaCollecteeMin,BigDecimal tvaCollecteeMax,BigDecimal tvaDeductibleMin,BigDecimal tvaDeductibleMax,BigDecimal differenceTvaMin,BigDecimal differenceTvaMax,BigDecimal mantantTvaMin,BigDecimal mantantTvaMax,BigDecimal mantantBaseTvaMin,BigDecimal mantantBaseTvaMax,BigDecimal mantantRetardMin,BigDecimal mantantRetardMax,BigDecimal mantantMajorationMin,BigDecimal mantantMajorationMax,BigDecimal mantantPenaliteMin,BigDecimal mantantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateCreationMin,Date dateCreationMax,Integer anneMin,Integer anneMax,Integer periodeMin,Integer periodeMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,Date dateSaisieMin,Date dateSaisieMax){
 return entityManager.createQuery(constructQuery(description,reference,referenceSociete,referenceComptableValidateur,referenceComptableCreateur,idMin,idMax,tvaCollecteeMin,tvaCollecteeMax,tvaDeductibleMin,tvaDeductibleMax,differenceTvaMin,differenceTvaMax,mantantTvaMin,mantantTvaMax,mantantBaseTvaMin,mantantBaseTvaMax,mantantRetardMin,mantantRetardMax,mantantMajorationMin,mantantMajorationMax,mantantPenaliteMin,mantantPenaliteMax,nomberMoisRetardMin,nomberMoisRetardMax,dateValidationMin,dateValidationMax,dateCreationMin,dateCreationMax,anneMin,anneMax,periodeMin,periodeMax,honoraireMin,honoraireMax,penaliteMin,penaliteMax,majorationMin,majorationMax,montantTotalMin,montantTotalMax,dateSaisieMin,dateSaisieMax)).getResultList(); 
 }
private String constructQuery(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,BigDecimal tvaCollecteeMin,BigDecimal tvaCollecteeMax,BigDecimal tvaDeductibleMin,BigDecimal tvaDeductibleMax,BigDecimal differenceTvaMin,BigDecimal differenceTvaMax,BigDecimal mantantTvaMin,BigDecimal mantantTvaMax,BigDecimal mantantBaseTvaMin,BigDecimal mantantBaseTvaMax,BigDecimal mantantRetardMin,BigDecimal mantantRetardMax,BigDecimal mantantMajorationMin,BigDecimal mantantMajorationMax,BigDecimal mantantPenaliteMin,BigDecimal mantantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateCreationMin,Date dateCreationMax,Integer anneMin,Integer anneMax,Integer periodeMin,Integer periodeMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,Date dateSaisieMin,Date dateSaisieMax){
String query = "SELECT t FROM Tva t where 1=1 ";
query += SearchUtil.addConstraint( "t", "description","=",description);
query += SearchUtil.addConstraint( "t", "reference","=",reference);
query += SearchUtil.addConstraint( "t", "referenceSociete","=",referenceSociete);
query += SearchUtil.addConstraint( "t", "referenceComptableValidateur","=",referenceComptableValidateur);
query += SearchUtil.addConstraint( "t", "referenceComptableCreateur","=",referenceComptableCreateur);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "tvaCollectee", tvaCollecteeMin, tvaCollecteeMax);
query += SearchUtil.addConstraintMinMax("t", "tvaDeductible", tvaDeductibleMin, tvaDeductibleMax);
query += SearchUtil.addConstraintMinMax("t", "differenceTva", differenceTvaMin, differenceTvaMax);
query += SearchUtil.addConstraintMinMax("t", "mantantTva", mantantTvaMin, mantantTvaMax);
query += SearchUtil.addConstraintMinMax("t", "mantantBaseTva", mantantBaseTvaMin, mantantBaseTvaMax);
query += SearchUtil.addConstraintMinMax("t", "mantantRetard", mantantRetardMin, mantantRetardMax);
query += SearchUtil.addConstraintMinMax("t", "mantantMajoration", mantantMajorationMin, mantantMajorationMax);
query += SearchUtil.addConstraintMinMax("t", "mantantPenalite", mantantPenaliteMin, mantantPenaliteMax);
query += SearchUtil.addConstraintMinMax("t", "nomberMoisRetard", nomberMoisRetardMin, nomberMoisRetardMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateValidation", dateValidationMin, dateValidationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateCreation", dateCreationMin, dateCreationMax);
query += SearchUtil.addConstraintMinMax("t", "anne", anneMin, anneMax);
query += SearchUtil.addConstraintMinMax("t", "periode", periodeMin, periodeMax);
query += SearchUtil.addConstraintMinMax("t", "honoraire", honoraireMin, honoraireMax);
query += SearchUtil.addConstraintMinMax("t", "penalite", penaliteMin, penaliteMax);
query += SearchUtil.addConstraintMinMax("t", "majoration", majorationMin, majorationMax);
query += SearchUtil.addConstraintMinMax("t", "montantTotal", montantTotalMin, montantTotalMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSaisie", dateSaisieMin, dateSaisieMax);

  return query; 
}
}
