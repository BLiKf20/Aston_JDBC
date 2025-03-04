import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableManipulation {
    Connection connection;

    public TableManipulation(Connection connection) {
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        try (PreparedStatement ps = connection.prepareStatement("CREATE TABLE IF NOT EXISTS train_schedules (id INT, trainNumber VARCHAR(20), dateOfTrain DATE)")) {
            ps.executeUpdate();
        }
    }

}
