package com.zsmart.tva.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.tva.service.util.*;
import com.zsmart.tva.bean.TypeTva; 
import com.zsmart.tva.ws.rest.vo.TypeTvaVo; 

 @Component 
public class TypeTvaConverter extends AbstractConverter<TypeTva,TypeTvaVo>{ 


 @Override 
 public TypeTva toItem(TypeTvaVo vo) {
 if (vo == null) {
    return null;
      } else {
TypeTva item = new TypeTva();

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
 public TypeTvaVo toVo(TypeTva item) {
 if (item == null) {
    return null;
      } else {
TypeTvaVo vo = new TypeTvaVo();

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
