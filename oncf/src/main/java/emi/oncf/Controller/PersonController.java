package emi.oncf.Controller;

import emi.oncf.Model.Person;
import emi.oncf.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PersonController {

    @Autowired
    private PersonRepository personRepository;


    @PostMapping( "/register")
    public String creerCompte(@RequestBody Person person){
        List<Person> lcompte=personRepository.findAll();
        for(Person x:lcompte){
            if(x.getEmail().equals(person.getEmail())) return "fail";
        }
        personRepository.save(person);
        return person.getId();
    }

    @PostMapping( "/auth")
    public String SeConnecter(@RequestBody Person person){
        List<Person> lcompte=personRepository.findAll();
        for(Person x:lcompte){
            if(person.equals(x)) return x.getId();
        }
        return "fail";
    }

    @CrossOrigin
    @GetMapping("/login/{id}")
    public Person getCompte(@PathVariable String id) {
        return personRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
