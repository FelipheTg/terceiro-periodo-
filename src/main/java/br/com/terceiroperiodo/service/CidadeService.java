package br.com.terceiroperiodo.service;

import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CidadeService {
    @Autowired
    static
    CidadeRepository cidadeRepository;


    public Cidade salvar (Cidade cidade) {
        return cidadeRepository.save(cidade);
    }


    public List<Cidade> buscarTodos(){
        List<Cidade> response = cidadeRepository.findAll();
        return response;

    }


//    public static Optional<Cidade> buscarPorId(Long id) {
//        return cidadeRepository.findById(id);
//
//    }
//    public Cidade atualizar(Cidade cidade){
//        Object cidade = new Object();
//        return cidadeRepository.save(cidade);
//    }
//    public List<Cidade> buscaPorNomes(String nome) {
//        return cidadeRepository.findByNomeAndAtivo(nome, true);
//    }
//    public void deleteById(Long id) {
//        CidadeService cidadeRepository = new CidadeService();
//        cidadeRepository.deleteById(id);
//    }


        }

