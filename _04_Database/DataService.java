package _04_Database;

public class DataService {
  private DataStorage dataStorage;

  public DataService() {
    dataStorage = new Database();
  }

  public void saveData(String data) {
    dataStorage.save(data);
  }

}
