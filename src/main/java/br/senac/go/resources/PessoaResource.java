package br.senac.go.resources;

import br.senac.go.domain.Pessoa;
import br.senac.go.generics.GenericOperationsResource;
import org.springframework.http.MediaType;
import org.springframework.javapoet.ClassName;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/pessoa")
public class PessoaResource implements
        GenericOperationsResource<Pessoa, Integer> {

    private static final Logger LOGGER =
            Logger.getLogger(PessoaResource.class.getName());

    /**
     * Consumes é o que o serviço vai receber (json ou xml)
     * Produces é o que o serviço vai entregar (json ou xml)
     * @param entity
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            "application/xml;charset=UTF-8"},
    produces = {MediaType.APPLICATION_JSON_VALUE,
    MediaType.APPLICATION_XML_VALUE})
    public Pessoa post(@RequestBody @Validated Pessoa entity) {

        LOGGER.log(Level.INFO,"Exemplo de imprimir", entity);

        return entity;
    }

    @Override
    public List<Pessoa> get() {
        return null;
    }

    @Override
    public void put(Pessoa entity, Integer id) {

    }

    @Override
    public void patch(Pessoa entity, Integer id) {

    }

    @Override
    public void delete(Pessoa entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
