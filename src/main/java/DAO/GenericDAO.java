package DAO;

import utils.ObjectMapper;

import java.util.List;
import model.TableNguoi;

public interface GenericDAO<T> {
    <T> List<T> select(String sql, ObjectMapper<T> objMapper,Object... parameters);
    int insert(String sql,Object... parameters);
    int update(String sql,Object... parameters);
    void delete(String sql,Object... parameters);
    <T> List<T> getResults(String sql,ObjectMapper<T> objMapper,Object... parameters);
}
