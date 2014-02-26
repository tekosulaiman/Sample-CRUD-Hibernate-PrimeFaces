package service.impl;

import dao.DataDAO;
import dao.impl.DataDAOImpl;
import java.util.List;
import model.Data;
import service.DataService;

/**
 * @author Admin
 */
public class DataServiceImpl implements DataService{
    private DataDAO dataDAO;

    public DataDAO getDataDAO() {
        return dataDAO;
    }

    public void setDataDAO(DataDAO dataDAO) {
        this.dataDAO = dataDAO;
    }
    
    public DataServiceImpl(){
        dataDAO = new DataDAOImpl();
    }

    @Override
    public void save(Data data) {
        dataDAO.save(data);
    }

    @Override
    public void saveOrUpdate(Data data) {
        dataDAO.saveOrUpdate(data);
    }

    @Override
    public void delete(Data data) {
        dataDAO.delete(data);
    }

    @Override
    public List<Data> getAllDatas() {
        return dataDAO.getAllDatas();
    }
}