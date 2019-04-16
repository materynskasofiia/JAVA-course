public class Config {

    protected static String dbHost="localhost";
    protected static String dbPort="3306";
    protected static String dbUser="root";
    protected static String dbPass="SQLcoursework2018";
    protected static String dbName="lab1_ida";
    protected static String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName +
            "?user=" + dbUser + "&password=" + dbPass + "&serverTimezone=UTC";

}