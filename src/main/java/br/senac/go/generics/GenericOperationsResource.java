package br.senac.go.generics;

import java.util.List;

public interface GenericOperationsResource<E,N> {

    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     * @param entity
     * @return
     */
    public E post(E entity);

    /**
     * Retorna uma lista de entidades
     * @return
     */
    public List<E> get();

    /**
     * Atualiza TODO o registro
     * @param entity
     * @param id
     */
    public void put(E entity, N id);

    /**
     * Atualiza parcialmente um registro
     * @param entity
     * @param id
     */
    public void patch(E entity, N id) throws Exception;

    /**
     * Deleta um registro no banco;
     * @param entity
     */
    public void delete(E entity);

    /**
     * Deleta um registro no banco pelo identificador
     * @param id
     */
    public void deleteById(N id);
}
