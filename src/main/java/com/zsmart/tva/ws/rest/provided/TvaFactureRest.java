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
import com.zsmart.tva.service.facade.TvaFactureService;
import com.zsmart.tva.bean.TvaFacture;
import com.zsmart.tva.ws.rest.vo.TvaFactureVo;
import com.zsmart.tva.ws.rest.converter.TvaFactureConverter;
import com.zsmart.tva.service.util.* ;
@RestController
@RequestMapping("/tva/TvaFacture")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TvaFactureRest {

 @Autowired 
 private TvaFactureService tvaFactureService;

 @Autowired 
private TvaFactureConverter tvaFactureConverter ;

@PostMapping("/")
public TvaFactureVo save(@RequestBody TvaFactureVo tvaFactureVo){
TvaFacture tvaFacture= tvaFactureConverter.toItem(tvaFactureVo);
return tvaFactureConverter.toVo(tvaFactureService.save(tvaFacture));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tvaFactureService.deleteById(id);
}
@GetMapping("/")
public List<TvaFactureVo> findAll(){
return tvaFactureConverter.toVo(tvaFactureService.findAll());
}

 public TvaFactureConverter getTvaFactureConverter(){
return tvaFactureConverter;
}
 
 public void setTvaFactureConverter(TvaFactureConverter tvaFactureConverter){
this.tvaFactureConverter=tvaFactureConverter;
}

 public TvaFactureService getTvaFactureService(){
return tvaFactureService;
}
 
 public void setTvaFactureService(TvaFactureService tvaFactureService){
this.tvaFactureService=tvaFactureService;
}

}