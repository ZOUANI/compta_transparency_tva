package com.zsmart.tva.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.tva.service.util.*;
import com.zsmart.tva.bean.EtatTva; 
import com.zsmart.tva.ws.rest.vo.EtatTvaVo; 

 @Component 
public class EtatTvaConverter extends AbstractConverter<EtatTva,EtatTvaVo>{ 


 @Override 
 public EtatTva toItem(EtatTvaVo vo) {
 if (vo == null) {
    return null;
      } else {
EtatTva item = new EtatTva();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getCode())) {
 item.setCode(vo.getCode());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public EtatTvaVo toVo(EtatTva item) {
 if (item == null) {
    return null;
      } else {
EtatTvaVo vo = new EtatTvaVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getCode())) {
 vo.setCode(item.getCode());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
