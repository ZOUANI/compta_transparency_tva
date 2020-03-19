package com.zsmart.tva.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.tva.service.util.*;
import com.zsmart.tva.bean.TauxTva; 
import com.zsmart.tva.ws.rest.vo.TauxTvaVo; 

 @Component 
public class TauxTvaConverter extends AbstractConverter<TauxTva,TauxTvaVo>{ 


 @Override 
 public TauxTva toItem(TauxTvaVo vo) {
 if (vo == null) {
    return null;
      } else {
TauxTva item = new TauxTva();

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getPercentage() != null) {
 item.setPercentage(NumberUtil.toBigDecimal(vo.getPercentage()));
} 

 if (vo.getMajoration() != null) {
 item.setMajoration(NumberUtil.toBigDecimal(vo.getMajoration()));
} 

 if (vo.getPenalite() != null) {
 item.setPenalite(NumberUtil.toBigDecimal(vo.getPenalite()));
} 

 if (vo.getDateApplicationDebut() != null) {
 item.setDateApplicationDebut(DateUtil.parse(vo.getDateApplicationDebut()));
} 

 if (vo.getDateApplicationFin() != null) {
 item.setDateApplicationFin(DateUtil.parse(vo.getDateApplicationFin()));
} 

return item;
 }
 }

  @Override 
 public TauxTvaVo toVo(TauxTva item) {
 if (item == null) {
    return null;
      } else {
TauxTvaVo vo = new TauxTvaVo();

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getPercentage() != null) {
 vo.setPercentage(NumberUtil.toString(item.getPercentage()));
} 

 if (item.getMajoration() != null) {
 vo.setMajoration(NumberUtil.toString(item.getMajoration()));
} 

 if (item.getPenalite() != null) {
 vo.setPenalite(NumberUtil.toString(item.getPenalite()));
} 

 if (item.getDateApplicationDebut() != null) {
 vo.setDateApplicationDebut(DateUtil.formateDate(item.getDateApplicationDebut()));
} 

 if (item.getDateApplicationFin() != null) {
 vo.setDateApplicationFin(DateUtil.formateDate(item.getDateApplicationFin()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
