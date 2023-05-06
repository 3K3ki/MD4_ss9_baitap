package model.service;

import java.util.List;

public interface IServices <T, E>{
    List<T> findAll();
    boolean save(T t);
    boolean update(T t);
    T findById(E id);
    boolean delete(E id);
}
