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
import com.zsmart.tva.service.facade.EtatTvaService;
import com.zsmart.tva.bean.EtatTva;
import com.zsmart.tva.ws.rest.vo.EtatTvaVo;
import com.zsmart.tva.ws.rest.converter.EtatTvaConverter;
import com.zsmart.tva.service.util.* ;
@RestController
@RequestMapping("/tva/EtatTva")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EtatTvaRest {

 @Autowired 
 private EtatTvaService etatTvaService;

 @Autowired 
private EtatTvaConverter etatTvaConverter ;

@PostMapping("/")
public EtatTvaVo save(@RequestBody EtatTvaVo etatTvaVo){
EtatTva etatTva= etatTvaConverter.toItem(etatTvaVo);
return etatTvaConverter.toVo(etatTvaService.save(etatTva));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
etatTvaService.deleteById(id);
}
@GetMapping("/")
public List<EtatTvaVo> findAll(){
return etatTvaConverter.toVo(etatTvaService.findAll());
}

 public EtatTvaConverter getEtatTvaConverter(){
return etatTvaConverter;
}
 
 public void setEtatTvaConverter(EtatTvaConverter etatTvaConverter){
this.etatTvaConverter=etatTvaConverter;
}

 public EtatTvaService getEtatTvaService(){
return etatTvaService;
}
 
 public void setEtatTvaService(EtatTvaService etatTvaService){
this.etatTvaService=etatTvaService;
}

}