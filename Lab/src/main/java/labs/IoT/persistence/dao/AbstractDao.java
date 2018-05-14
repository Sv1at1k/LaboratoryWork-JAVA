package labs.IoT.persistence.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;


public abstract class AbstractDao<T> implements IDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<T> getEntityClass();

    @Transactional(value = TxType.REQUIRED)
    @Override
    public T findById(Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        return result;
    }

    @Transactional(value = TxType.REQUIRED)
    @Override
    public T add(T object) {
        entityManager.merge(object);
        return object;
    }

    @Transactional(value = TxType.REQUIRED)
    @Override
    public void delete(Integer id) {

        T result = (T) entityManager.find(getEntityClass(), id);
        entityManager.remove(result);
    }

    @Transactional(value = TxType.REQUIRED)
    @Override
    public T update(T object) {
        return entityManager.merge(object);
    }
}
