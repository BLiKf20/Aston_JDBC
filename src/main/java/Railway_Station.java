import java.sql.Date;

/**
 * Класс для отображения в базу данных
 */

public class Railway_Station {
    private static int id = 0;

    private int idOfTrain;
    private String numberOfTrain;
    private Date start_time;

    public Railway_Station() {
    }

    public Railway_Station(String numberOfTrain, Date start_time) {
        idOfTrain = id++;
        this.numberOfTrain = numberOfTrain;
        this.start_time = start_time;
    }

    public int getId() {
        return idOfTrain;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public java.sql.Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    @Override
    public String toString() {
        return "Railway_Station{" +
                "id=" + idOfTrain +
                ", name='" + numberOfTrain + '\'' +
                ", start_time=" + start_time +
                '}';
    }
}
