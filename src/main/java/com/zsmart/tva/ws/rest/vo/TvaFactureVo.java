package com.zsmart.tva.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class TvaFactureVo{

private String id ;
private String referenceFacture ;
private String referenceSociete ;
private TvaVo tvaVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getReferenceFacture(){
    return referenceFacture;
}

public void setReferenceFacture(String  referenceFacture){
     this.referenceFacture = referenceFacture;
}

public String  getReferenceSociete(){
    return referenceSociete;
}

public void setReferenceSociete(String  referenceSociete){
     this.referenceSociete = referenceSociete;
}

public TvaVo  getTvaVo (){
    return tvaVo ;
}

public void setTvaVo (TvaVo  tvaVo ){
     this.tvaVo  = tvaVo ;
}




}