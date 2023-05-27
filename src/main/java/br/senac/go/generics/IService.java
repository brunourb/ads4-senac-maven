package br.senac.go.generics;

/**
 * C - create
 * R - readById
 * R - Read()
 * U - update
 * D - delete
 * @param <E>
 * @param <N>
 */
public interface IService<E,N> {

    public E create(E entity);

    public E readById(N id) throws Exception;

    public E read(E entity) throws Exception;

    public E updatePatch(E entity, N id) throws Exception;

    public E updatePut(E entity, N id);

    public E deleteById(N id);

    public E delete(E entity);



}
