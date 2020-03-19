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
import com.zsmart.tva.service.facade.TauxTvaService;
import com.zsmart.tva.bean.TauxTva;
import com.zsmart.tva.ws.rest.vo.TauxTvaVo;
import com.zsmart.tva.ws.rest.converter.TauxTvaConverter;
import com.zsmart.tva.service.util.* ;
@RestController
@RequestMapping("/tva/TauxTva")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TauxTvaRest {

 @Autowired 
 private TauxTvaService tauxTvaService;

 @Autowired 
private TauxTvaConverter tauxTvaConverter ;

@PostMapping("/")
public TauxTvaVo save(@RequestBody TauxTvaVo tauxTvaVo){
TauxTva tauxTva= tauxTvaConverter.toItem(tauxTvaVo);
return tauxTvaConverter.toVo(tauxTvaService.save(tauxTva));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tauxTvaService.deleteById(id);
}
@GetMapping("/")
public List<TauxTvaVo> findAll(){
return tauxTvaConverter.toVo(tauxTvaService.findAll());
}

 public TauxTvaConverter getTauxTvaConverter(){
return tauxTvaConverter;
}
 
 public void setTauxTvaConverter(TauxTvaConverter tauxTvaConverter){
this.tauxTvaConverter=tauxTvaConverter;
}

 public TauxTvaService getTauxTvaService(){
return tauxTvaService;
}
 
 public void setTauxTvaService(TauxTvaService tauxTvaService){
this.tauxTvaService=tauxTvaService;
}

}