import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = Connect.getConnection();
        TableManipulation t = new TableManipulation(con);
        t.createTable();

        t.deleteAllRecord();
        t.selectAllRecord();
        t.insertRecord(new Railway_Station("247А", Date.valueOf("2025-3-9")));
        t.insertRecord(new Railway_Station("47В", Date.valueOf("2025-3-9")));
        t.insertRecord(new Railway_Station("008A", Date.valueOf("2025-3-9")));
        t.insertRecord(new Railway_Station("050И", Date.valueOf("2025-3-9")));
        t.selectAllRecord();
        t.deleteRecordById(1);
        t.selectAllRecord();

        //t.dropTable();

        con.close();
    }
}
