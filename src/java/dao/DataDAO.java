package dao;

import java.util.List;
import model.Data;

/**
 * @author tombisnis@yahoo.com
 */
public interface DataDAO {
    public void save(Data data);
    public void saveOrUpdate(Data data);
    public void delete(Data data);
    public List<Data> getAllDatas();
}