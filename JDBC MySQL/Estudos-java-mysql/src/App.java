import db.ConnectionDBApp;

public class App {
    public static void main(String[] args) throws Exception {
        new ConnectionDBApp().getConnectionWithDB();
    }
}