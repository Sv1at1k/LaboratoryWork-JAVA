package labs.IoT.persistence.dao;

import javax.transaction.Transactional;

public interface IDao<T> {

    T findById(Integer id);

    T add(T object);

    void delete(Integer id);

    T update(T object);

}
