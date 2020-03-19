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
import com.zsmart.tva.service.facade.TvaService;
import com.zsmart.tva.bean.Tva;
import com.zsmart.tva.ws.rest.vo.TvaVo;
import com.zsmart.tva.ws.rest.converter.TvaConverter;
import com.zsmart.tva.service.util.* ;
@RestController
@RequestMapping("/tva/Tva")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TvaRest {

 @Autowired 
 private TvaService tvaService;

 @Autowired 
private TvaConverter tvaConverter ;

@PostMapping("/")
public TvaVo save(@RequestBody TvaVo tvaVo){
Tva tva= tvaConverter.toItem(tvaVo);
return tvaConverter.toVo(tvaService.save(tva));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tvaService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
tvaService.deleteByReference(reference);
}
@GetMapping("/")
public List<TvaVo> findAll(){
return tvaConverter.toVo(tvaService.findAll());
}

 public TvaConverter getTvaConverter(){
return tvaConverter;
}
 
 public void setTvaConverter(TvaConverter tvaConverter){
this.tvaConverter=tvaConverter;
}

 public TvaService getTvaService(){
return tvaService;
}
 
 public void setTvaService(TvaService tvaService){
this.tvaService=tvaService;
}

}