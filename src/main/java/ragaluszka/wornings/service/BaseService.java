package ragaluszka.wornings.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ragaluszka.wornings.persistence.model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T,K>> {

    T save (T entity);
    T delete (K id);
    T getOne(K id);
    Collection<T> getAll();
    R getRepository();


    //CRUD
    /*
    public void save (T t);
    public T read (int id);
    public T readAll (List<Integer> list);
    public void update (T t);
    public void  delete (int id);
    public T deleteAll (List<Integer> list);
    */

}
