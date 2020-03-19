package com.zsmart.tva.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.tva.service.facade.TypeTvaService;
import com.zsmart.tva.bean.TypeTva;
import com.zsmart.tva.ws.rest.vo.TypeTvaVo;
import com.zsmart.tva.ws.rest.converter.TypeTvaConverter;
import com.zsmart.tva.service.util.* ;
@RestController
@RequestMapping("/tva/TypeTva")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TypeTvaRest {

 @Autowired 
 private TypeTvaService typeTvaService;

 @Autowired 
private TypeTvaConverter typeTvaConverter ;

@PostMapping("/")
public TypeTvaVo save(@RequestBody TypeTvaVo typeTvaVo){
TypeTva typeTva= typeTvaConverter.toItem(typeTvaVo);
return typeTvaConverter.toVo(typeTvaService.save(typeTva));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
typeTvaService.deleteById(id);
}
@GetMapping("/")
public List<TypeTvaVo> findAll(){
return typeTvaConverter.toVo(typeTvaService.findAll());
}

 public TypeTvaConverter getTypeTvaConverter(){
return typeTvaConverter;
}
 
 public void setTypeTvaConverter(TypeTvaConverter typeTvaConverter){
this.typeTvaConverter=typeTvaConverter;
}

 public TypeTvaService getTypeTvaService(){
return typeTvaService;
}
 
 public void setTypeTvaService(TypeTvaService typeTvaService){
this.typeTvaService=typeTvaService;
}

}