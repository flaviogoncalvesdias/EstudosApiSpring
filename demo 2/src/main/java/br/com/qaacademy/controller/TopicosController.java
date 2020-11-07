package br.com.qaacademy.controller;

import br.com.qaacademy.controller.dto.TopicoDto;
import br.com.qaacademy.modelo.Curso;
import br.com.qaacademy.modelo.Topico;
import br.com.qaacademy.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> lista(String nomeCurso) {
if (nomeCurso == null ) {
    List<Topico> topicos = topicoRepository.findAll();
    return TopicoDto.converter(topicos);
}else {

    List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
    return TopicoDto.converter(topicos);

}

    }


}
