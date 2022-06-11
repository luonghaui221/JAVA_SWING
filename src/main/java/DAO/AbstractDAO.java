package DAO;

import model.Nguoi;
import utils.ConnectionUtils;
import utils.ObjectMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.TableNguoi;

public class AbstractDAO<T> implements GenericDAO<T>{
    private void setParams(PreparedStatement statement,Object... parameters) throws SQLException{
        if(parameters.length > 0){
            int index = 1;
            for(Object o : parameters){
                if(o instanceof String){
                    statement.setString(index,(String) o); index++;
                }else if(o instanceof Integer){
                    statement.setInt(index,(Integer) o); index++;
                }else if(o instanceof Double){
                    statement.setDouble(index,(Double) o); index++;
                }else if(o instanceof Float){
                    statement.setDouble(index,(Float) o); index++;
                }else if(o instanceof Boolean){
                    statement.setBoolean(index,(Boolean) o); index++;
                }else if(o instanceof Date){
                    statement.setDate(index, (java.sql.Date) o); index++;
                }else{
                    statement.setString(index," ");
                }
            }
        }
    }

    @Override
    public <T> List<T> select(String sql, ObjectMapper<T> objMapper, Object... parameters) {
        List<T> result = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            conn = ConnectionUtils.getConnection();
            statement = conn.prepareStatement(sql);
            setParams(statement,parameters);
            rs = statement.executeQuery();
            while (rs.next()){
                result.add(objMapper.map(rs));
            }
            return result;
        }catch (SQLException e){
            return null;
        }finally {
            try {
                if(conn != null) conn.close();
                if(statement != null) statement.close();
                if(rs != null) rs.close();
            }catch (SQLException e){
                return null;
            }
        }
    }

    @Override
    public int insert(String sql, Object... parameters) {
        Connection conn = null;
        PreparedStatement statement = null;
        int result = 0;
        try{
            conn = ConnectionUtils.getConnection();
            statement = conn.prepareStatement(sql);
            setParams(statement,parameters);
            result = statement.executeUpdate();
            return result;
        }catch (SQLException e){
            return 0;
        }finally {
            try {
                if(conn != null) conn.close();
                if(statement != null) statement.close();
            }catch (SQLException e){
                return 0;
            }
        }
    }

    @Override
    public int update(String sql, Object... parameters) {
        Connection conn = null;
        PreparedStatement statement = null;
        int result = 0;
        try{
            conn = ConnectionUtils.getConnection();
            statement = conn.prepareStatement(sql);
            setParams(statement,parameters);
            result = statement.executeUpdate();
            return result;
        }catch (SQLException e){
            return 0;
        }finally {
            try {
                if(conn != null) conn.close();
                if(statement != null) statement.close();
            }catch (SQLException e){
                return 0;
            }
        }
    }

    @Override
    public void delete(String sql, Object... parameters) {
        Connection conn = null;
        PreparedStatement statement = null;
        try{
            conn = ConnectionUtils.getConnection();
            statement = conn.prepareStatement(sql);
            setParams(statement,parameters);
            statement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }finally {
            try {
                if(conn != null) conn.close();
                if(statement != null) statement.close();
            }catch (SQLException e){
                System.out.println(e);
            }
        }
    }

    @Override
    public <T> List<T> getResults(String sql,ObjectMapper<T> objMapper, Object... parameters) {
        List<T> result = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            conn = ConnectionUtils.getConnection();
            statement = conn.prepareStatement(sql);
            setParams(statement,parameters);
            rs = statement.executeQuery();
            result.add(objMapper.map(rs));
            return result;
        }catch (SQLException e){
            return null;
        }finally {
            try {
                if(conn != null) conn.close();
                if(statement != null) statement.close();
                if(rs != null) rs.close();
            }catch (SQLException e){
                return null;
            }
        }
    }
}
