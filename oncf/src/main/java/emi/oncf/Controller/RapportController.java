package emi.oncf.Controller;

import emi.oncf.Model.Rapport;
import emi.oncf.Repository.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RapportController {

    @Autowired
    private RapportRepository rapportRepository;


    @GetMapping("/GetRapport/{id}")
    public Rapport getRapport(@PathVariable String id){
        return rapportRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/PostRapport")
    public Rapport PostRapport(@RequestBody Rapport rapport){
        rapportRepository.save(rapport);
        return rapport;
    }

    @GetMapping("/GetAllRapport")
    public List<Rapport> getAllRapport(){
        return rapportRepository.findAll();
    }
}
