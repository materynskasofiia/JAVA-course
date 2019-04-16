import java.sql.*;

public class CommittedRead extends Config{
    public static void main(String [] args) throws SQLException, InterruptedException {
        Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        Statement stmt = dbConnection.createStatement();
        dbConnection.setAutoCommit(false);
        dbConnection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
        ResultSet rs = stmt.executeQuery("select * from examples.film_list");
        while(rs.next()){
            System.out.println(rs.getString("film_year"));
        }

        new NewTransaction().start();
        Thread.sleep(2000);

        ResultSet rs1 = stmt.executeQuery("select * from examples.film_list");
        while(rs1.next()){
            System.out.println(rs1.getString("film_year"));
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
                stmt.executeUpdate("update examples.film_list set film_year=1981 where film_id=1");
                dbConnection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
