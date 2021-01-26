package dataAccess.abstracts;

import entities.abstracts.IEntity;

import java.util.List;

public interface IEntityRepository<T extends IEntity> {

    void add(T item);

    void update(T item);

    void delete(T item);

    List<T> getAll();
}
