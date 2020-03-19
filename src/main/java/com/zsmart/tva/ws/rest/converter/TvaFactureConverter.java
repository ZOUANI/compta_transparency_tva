package com.zsmart.tva.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.tva.service.util.*;
import com.zsmart.tva.bean.TvaFacture; 
import com.zsmart.tva.ws.rest.vo.TvaFactureVo; 

 @Component 
public class TvaFactureConverter extends AbstractConverter<TvaFacture,TvaFactureVo>{ 

private boolean tva; 

 @Autowired
 private TvaConverter tvaConverter ; 

 @Override 
 public TvaFacture toItem(TvaFactureVo vo) {
 if (vo == null) {
    return null;
      } else {
TvaFacture item = new TvaFacture();

 if(tva&& vo.getTvaVo() != null) {
 item.setTva(tvaConverter.toItem(vo.getTvaVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getReferenceFacture())) {
 item.setReferenceFacture(vo.getReferenceFacture());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceSociete())) {
 item.setReferenceSociete(vo.getReferenceSociete());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public TvaFactureVo toVo(TvaFacture item) {
 if (item == null) {
    return null;
      } else {
TvaFactureVo vo = new TvaFactureVo();

 if(tva&& item.getTva() != null) {
 vo.setTvaVo(tvaConverter.toVo(item.getTva()));
} 
 
 if (StringUtil.isNotEmpty(item.getReferenceFacture())) {
 vo.setReferenceFacture(item.getReferenceFacture());
} 

 if (StringUtil.isNotEmpty(item.getReferenceSociete())) {
 vo.setReferenceSociete(item.getReferenceSociete());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 

tva = true; 
}
 } 
