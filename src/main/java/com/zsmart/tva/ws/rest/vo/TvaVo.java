package com.zsmart.tva.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class TvaVo{

private String id ;
private String tvaCollectee;
private String tvaCollecteeMin ;
private String tvaCollecteeMax ;
private String tvaDeductible;
private String tvaDeductibleMin ;
private String tvaDeductibleMax ;
private String differenceTva;
private String differenceTvaMin ;
private String differenceTvaMax ;
private String mantantTva;
private String mantantTvaMin ;
private String mantantTvaMax ;
private String mantantBaseTva;
private String mantantBaseTvaMin ;
private String mantantBaseTvaMax ;
private String mantantRetard;
private String mantantRetardMin ;
private String mantantRetardMax ;
private String mantantMajoration;
private String mantantMajorationMin ;
private String mantantMajorationMax ;
private String mantantPenalite;
private String mantantPenaliteMin ;
private String mantantPenaliteMax ;
private String nomberMoisRetard;
private String nomberMoisRetardMin ;
private String nomberMoisRetardMax ;
private String description ;
private String reference ;
private String referenceSociete ;
private String referenceComptableValidateur ;
private String referenceComptableCreateur ;
private String dateValidation;
private String dateValidationMin ;
private String dateValidationMax ;
private String dateCreation;
private String dateCreationMin ;
private String dateCreationMax ;
private String anne;
private String anneMin ;
private String anneMax ;
private String periode;
private String periodeMin ;
private String periodeMax ;
private String honoraire;
private String honoraireMin ;
private String honoraireMax ;
private String penalite;
private String penaliteMin ;
private String penaliteMax ;
private String majoration;
private String majorationMin ;
private String majorationMax ;
private String montantTotal;
private String montantTotalMin ;
private String montantTotalMax ;
private String dateSaisie;
private String dateSaisieMin ;
private String dateSaisieMax ;
private TypeTvaVo typeTvaVo ;
private EtatTvaVo etatTvaVo ;
private List<TvaFactureVo>tvaFacturesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getTvaCollectee(){
    return tvaCollectee;
}

public void setTvaCollectee(String  tvaCollectee){
     this.tvaCollectee = tvaCollectee;
}

public String  getTvaCollecteeMin(){
    return tvaCollecteeMin;
}

public void setTvaCollecteeMin(String  tvaCollecteeMin){
     this.tvaCollecteeMin = tvaCollecteeMin;
}

public String  getTvaCollecteeMax(){
    return tvaCollecteeMax;
}

public void setTvaCollecteeMax(String  tvaCollecteeMax){
     this.tvaCollecteeMax = tvaCollecteeMax;
}

public String  getTvaDeductible(){
    return tvaDeductible;
}

public void setTvaDeductible(String  tvaDeductible){
     this.tvaDeductible = tvaDeductible;
}

public String  getTvaDeductibleMin(){
    return tvaDeductibleMin;
}

public void setTvaDeductibleMin(String  tvaDeductibleMin){
     this.tvaDeductibleMin = tvaDeductibleMin;
}

public String  getTvaDeductibleMax(){
    return tvaDeductibleMax;
}

public void setTvaDeductibleMax(String  tvaDeductibleMax){
     this.tvaDeductibleMax = tvaDeductibleMax;
}

public String  getDifferenceTva(){
    return differenceTva;
}

public void setDifferenceTva(String  differenceTva){
     this.differenceTva = differenceTva;
}

public String  getDifferenceTvaMin(){
    return differenceTvaMin;
}

public void setDifferenceTvaMin(String  differenceTvaMin){
     this.differenceTvaMin = differenceTvaMin;
}

public String  getDifferenceTvaMax(){
    return differenceTvaMax;
}

public void setDifferenceTvaMax(String  differenceTvaMax){
     this.differenceTvaMax = differenceTvaMax;
}

public String  getMantantTva(){
    return mantantTva;
}

public void setMantantTva(String  mantantTva){
     this.mantantTva = mantantTva;
}

public String  getMantantTvaMin(){
    return mantantTvaMin;
}

public void setMantantTvaMin(String  mantantTvaMin){
     this.mantantTvaMin = mantantTvaMin;
}

public String  getMantantTvaMax(){
    return mantantTvaMax;
}

public void setMantantTvaMax(String  mantantTvaMax){
     this.mantantTvaMax = mantantTvaMax;
}

public String  getMantantBaseTva(){
    return mantantBaseTva;
}

public void setMantantBaseTva(String  mantantBaseTva){
     this.mantantBaseTva = mantantBaseTva;
}

public String  getMantantBaseTvaMin(){
    return mantantBaseTvaMin;
}

public void setMantantBaseTvaMin(String  mantantBaseTvaMin){
     this.mantantBaseTvaMin = mantantBaseTvaMin;
}

public String  getMantantBaseTvaMax(){
    return mantantBaseTvaMax;
}

public void setMantantBaseTvaMax(String  mantantBaseTvaMax){
     this.mantantBaseTvaMax = mantantBaseTvaMax;
}

public String  getMantantRetard(){
    return mantantRetard;
}

public void setMantantRetard(String  mantantRetard){
     this.mantantRetard = mantantRetard;
}

public String  getMantantRetardMin(){
    return mantantRetardMin;
}

public void setMantantRetardMin(String  mantantRetardMin){
     this.mantantRetardMin = mantantRetardMin;
}

public String  getMantantRetardMax(){
    return mantantRetardMax;
}

public void setMantantRetardMax(String  mantantRetardMax){
     this.mantantRetardMax = mantantRetardMax;
}

public String  getMantantMajoration(){
    return mantantMajoration;
}

public void setMantantMajoration(String  mantantMajoration){
     this.mantantMajoration = mantantMajoration;
}

public String  getMantantMajorationMin(){
    return mantantMajorationMin;
}

public void setMantantMajorationMin(String  mantantMajorationMin){
     this.mantantMajorationMin = mantantMajorationMin;
}

public String  getMantantMajorationMax(){
    return mantantMajorationMax;
}

public void setMantantMajorationMax(String  mantantMajorationMax){
     this.mantantMajorationMax = mantantMajorationMax;
}

public String  getMantantPenalite(){
    return mantantPenalite;
}

public void setMantantPenalite(String  mantantPenalite){
     this.mantantPenalite = mantantPenalite;
}

public String  getMantantPenaliteMin(){
    return mantantPenaliteMin;
}

public void setMantantPenaliteMin(String  mantantPenaliteMin){
     this.mantantPenaliteMin = mantantPenaliteMin;
}

public String  getMantantPenaliteMax(){
    return mantantPenaliteMax;
}

public void setMantantPenaliteMax(String  mantantPenaliteMax){
     this.mantantPenaliteMax = mantantPenaliteMax;
}

public String  getNomberMoisRetard(){
    return nomberMoisRetard;
}

public void setNomberMoisRetard(String  nomberMoisRetard){
     this.nomberMoisRetard = nomberMoisRetard;
}

public String  getNomberMoisRetardMin(){
    return nomberMoisRetardMin;
}

public void setNomberMoisRetardMin(String  nomberMoisRetardMin){
     this.nomberMoisRetardMin = nomberMoisRetardMin;
}

public String  getNomberMoisRetardMax(){
    return nomberMoisRetardMax;
}

public void setNomberMoisRetardMax(String  nomberMoisRetardMax){
     this.nomberMoisRetardMax = nomberMoisRetardMax;
}

public String  getDescription(){
    return description;
}

public void setDescription(String  description){
     this.description = description;
}

public String  getReference(){
    return reference;
}

public void setReference(String  reference){
     this.reference = reference;
}

public String  getReferenceSociete(){
    return referenceSociete;
}

public void setReferenceSociete(String  referenceSociete){
     this.referenceSociete = referenceSociete;
}

public String  getReferenceComptableValidateur(){
    return referenceComptableValidateur;
}

public void setReferenceComptableValidateur(String  referenceComptableValidateur){
     this.referenceComptableValidateur = referenceComptableValidateur;
}

public String  getReferenceComptableCreateur(){
    return referenceComptableCreateur;
}

public void setReferenceComptableCreateur(String  referenceComptableCreateur){
     this.referenceComptableCreateur = referenceComptableCreateur;
}

public String  getDateValidation(){
    return dateValidation;
}

public void setDateValidation(String  dateValidation){
     this.dateValidation = dateValidation;
}

public String  getDateValidationMin(){
    return dateValidationMin;
}

public void setDateValidationMin(String  dateValidationMin){
     this.dateValidationMin = dateValidationMin;
}

public String  getDateValidationMax(){
    return dateValidationMax;
}

public void setDateValidationMax(String  dateValidationMax){
     this.dateValidationMax = dateValidationMax;
}

public String  getDateCreation(){
    return dateCreation;
}

public void setDateCreation(String  dateCreation){
     this.dateCreation = dateCreation;
}

public String  getDateCreationMin(){
    return dateCreationMin;
}

public void setDateCreationMin(String  dateCreationMin){
     this.dateCreationMin = dateCreationMin;
}

public String  getDateCreationMax(){
    return dateCreationMax;
}

public void setDateCreationMax(String  dateCreationMax){
     this.dateCreationMax = dateCreationMax;
}

public String  getAnne(){
    return anne;
}

public void setAnne(String  anne){
     this.anne = anne;
}

public String  getAnneMin(){
    return anneMin;
}

public void setAnneMin(String  anneMin){
     this.anneMin = anneMin;
}

public String  getAnneMax(){
    return anneMax;
}

public void setAnneMax(String  anneMax){
     this.anneMax = anneMax;
}

public String  getPeriode(){
    return periode;
}

public void setPeriode(String  periode){
     this.periode = periode;
}

public String  getPeriodeMin(){
    return periodeMin;
}

public void setPeriodeMin(String  periodeMin){
     this.periodeMin = periodeMin;
}

public String  getPeriodeMax(){
    return periodeMax;
}

public void setPeriodeMax(String  periodeMax){
     this.periodeMax = periodeMax;
}

public String  getHonoraire(){
    return honoraire;
}

public void setHonoraire(String  honoraire){
     this.honoraire = honoraire;
}

public String  getHonoraireMin(){
    return honoraireMin;
}

public void setHonoraireMin(String  honoraireMin){
     this.honoraireMin = honoraireMin;
}

public String  getHonoraireMax(){
    return honoraireMax;
}

public void setHonoraireMax(String  honoraireMax){
     this.honoraireMax = honoraireMax;
}

public String  getPenalite(){
    return penalite;
}

public void setPenalite(String  penalite){
     this.penalite = penalite;
}

public String  getPenaliteMin(){
    return penaliteMin;
}

public void setPenaliteMin(String  penaliteMin){
     this.penaliteMin = penaliteMin;
}

public String  getPenaliteMax(){
    return penaliteMax;
}

public void setPenaliteMax(String  penaliteMax){
     this.penaliteMax = penaliteMax;
}

public String  getMajoration(){
    return majoration;
}

public void setMajoration(String  majoration){
     this.majoration = majoration;
}

public String  getMajorationMin(){
    return majorationMin;
}

public void setMajorationMin(String  majorationMin){
     this.majorationMin = majorationMin;
}

public String  getMajorationMax(){
    return majorationMax;
}

public void setMajorationMax(String  majorationMax){
     this.majorationMax = majorationMax;
}

public String  getMontantTotal(){
    return montantTotal;
}

public void setMontantTotal(String  montantTotal){
     this.montantTotal = montantTotal;
}

public String  getMontantTotalMin(){
    return montantTotalMin;
}

public void setMontantTotalMin(String  montantTotalMin){
     this.montantTotalMin = montantTotalMin;
}

public String  getMontantTotalMax(){
    return montantTotalMax;
}

public void setMontantTotalMax(String  montantTotalMax){
     this.montantTotalMax = montantTotalMax;
}

public String  getDateSaisie(){
    return dateSaisie;
}

public void setDateSaisie(String  dateSaisie){
     this.dateSaisie = dateSaisie;
}

public String  getDateSaisieMin(){
    return dateSaisieMin;
}

public void setDateSaisieMin(String  dateSaisieMin){
     this.dateSaisieMin = dateSaisieMin;
}

public String  getDateSaisieMax(){
    return dateSaisieMax;
}

public void setDateSaisieMax(String  dateSaisieMax){
     this.dateSaisieMax = dateSaisieMax;
}

public TypeTvaVo  getTypeTvaVo (){
    return typeTvaVo ;
}

public void setTypeTvaVo (TypeTvaVo  typeTvaVo ){
     this.typeTvaVo  = typeTvaVo ;
}

public EtatTvaVo  getEtatTvaVo (){
    return etatTvaVo ;
}

public void setEtatTvaVo (EtatTvaVo  etatTvaVo ){
     this.etatTvaVo  = etatTvaVo ;
}

public List<TvaFactureVo> getTvaFacturesVo(){
    return tvaFacturesVo;
}

public void setTvaFacturesVo(List<TvaFactureVo> tvaFacturesVo){
     this.tvaFacturesVo = tvaFacturesVo;
}




}