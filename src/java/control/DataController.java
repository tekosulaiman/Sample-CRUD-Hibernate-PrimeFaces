package control;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import model.Data;
import service.DataService;
import service.impl.DataServiceImpl;

/**
 * @author tombisnis@yahoo.com
 */
@ManagedBean
@SessionScoped
public class DataController {
    private Data data = new Data();
    private List<Data> list;
    private DataService dataService = new DataServiceImpl();

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Data> getList() {
        return list;
    }

    public void setList(List<Data> list) {
        this.list = list;
    }

    public DataService getDataService() {
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
    
    @PostConstruct
    public void initComponents(){
        list = getDataService().getAllDatas();
        data = new Data();
    }
    
    public void save(ActionEvent actionEvent){
        System.out.println("Save");
        dataService.save(data);
        list = getDataService().getAllDatas();
        data = new Data();
    }
    
    public void update(ActionEvent actionEvent){
        System.out.println("update");
        dataService.saveOrUpdate(data);
        list = getDataService().getAllDatas();
        data = new Data();
    }
    
    public void delete(ActionEvent actionEvent){
        System.out.println("delete");
        dataService.delete(data);
        list = getDataService().getAllDatas();
        data = new Data();
    }
}