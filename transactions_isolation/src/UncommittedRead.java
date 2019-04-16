import java.sql.*;

public class UncommittedRead  extends Config{
    public static void main(String [] args) throws SQLException, InterruptedException {
        Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        Statement stmt = dbConnection.createStatement();
        dbConnection.setAutoCommit(false);
        dbConnection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
        stmt.execute("update examples.film_list set film_year=2000 where film_id=1");
        new NewTransaction().start();
        Thread.sleep(2000);
        dbConnection.rollback();
    }
    static class NewTransaction extends Thread{
        @Override
        public void run(){
            try(Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
                Statement stmt = dbConnection.createStatement();) {
                dbConnection.setAutoCommit(false);
                dbConnection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                ResultSet rs = stmt.executeQuery("select * from examples.film_list");
                while(rs.next()){
                    System.out.println(rs.getString("film_year"));
                }
                dbConnection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
