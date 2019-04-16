import java.sql.*;

public class RepeatableRead extends Config{
    public static void main(String [] args) throws SQLException, InterruptedException {
    Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
    Statement stmt = dbConnection.createStatement();
    dbConnection.setAutoCommit(false);
    dbConnection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
    ResultSet rs = stmt.executeQuery("select count(*) from examples.film_list");
    while(rs.next()){
        System.out.println(rs.getInt(1));
    }

    new NewTransaction().start();
    Thread.sleep(2000);

    ResultSet rs1 = stmt.executeQuery("select count(*) from examples.film_list");
    while(rs1.next()){
        System.out.println(rs1.getInt(1));
    }
    //dbConnection.commit();
}
    static class NewTransaction extends Thread{
        @Override
        public void run(){
            try(Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
                Statement stmt = dbConnection.createStatement()) {
                dbConnection.setAutoCommit(false);
                dbConnection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
                stmt.execute("insert into examples.film_list(film_name, film_year) values(\'Titanic\', 2001)");
                dbConnection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
