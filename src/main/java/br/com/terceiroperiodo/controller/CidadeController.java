package br.com.terceiroperiodo.controller;

import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class CidadeController {
    @Autowired
    CidadeService cidadeService;

    @PostMapping
    public ResponseEntity<Cidade> salvarEstado(@RequestBody Cidade cidade) {
        Cidade response = cidadeService.salvar(cidade);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Cidade>> buscarTodos() {
        List<Cidade> response = cidadeService.buscarTodos();
        return ResponseEntity.ok(response);

    }
//    @GetMapping(path = "/{id}" )
//    public ResponseEntity<Cidade> buscaPorId(@PathVariable Long id) {
//        Optional<Cidade> response = CidadeService.buscarPorId(id);
//        if(response.isPresent()) {
//            return ResponseEntity.ok(response.get());
//        }
//        return ResponseEntity.notFound().build();
//    }
//
////    @PutMapping()
////    public ResponseEntity<Cidade> update(@RequestBody Cidade cidade) {
////        if (!cidadeService.buscarPorId(cidade.getId()).isPresent()) {
////        }
////        return ResponseEntity.ok(cidadeService.atualizar(cidade));
////    }
//
//    @GetMapping (path = "/nome/{nome}")
//    public ResponseEntity <List<Cidade>> buscaPorNome(@PathVariable String nome) {
//        List <Cidade> response = cidadeService.buscaPorNomes(nome);
//        if (response != null && !response.isEmpty()) {
//            return ResponseEntity.ok(response);
//        }
//
//        return ResponseEntity.notFound().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete (@PathVariable Long id) {
//
//        if (!cidadeService.buscarPorId(id).isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        cidadeService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
 }

