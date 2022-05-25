package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
///RestController pq eu quero fazer uma rest api(que tem os métodos)
@RestController
@AllArgsConstructor /// no lugar desse tbm podia ser @autowired
public class CarroController {

    CarroRepository repository;

    /// Usado para fazer um get para pegar a lista de carros:
    @GetMapping("/carro")
    public List<Carro> getAllCarros() {
        return repository.findAll();
    }
    ///Pegando carro por id:
    @GetMapping("/Carro/{id}")
    public  Carro getCarroById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    ///Esse resquestbody é "de onde vem o carro" no formato json
    /// Adicionando um carro:
    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro)  {
        return repository.save(carro);
    }
    ///Deletando carro específico através do id
    @DeleteMapping("/carro/{id}")
    public void deleteCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
