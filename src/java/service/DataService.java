package service;

import java.util.List;
import model.Data;

/**
 * @author Admin
 */
public interface DataService {
    public void save(Data data);
    public void saveOrUpdate(Data data);
    public void delete(Data data);
    public List<Data> getAllDatas();
}