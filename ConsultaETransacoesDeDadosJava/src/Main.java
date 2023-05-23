import model.Dentista;

import java.sql.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static final String sqlCreatTable = """
            DROP TABLE IF EXISTS Dentista; CREATE TABLE Dentista
            (
            Id INT PRIMARY KEY,
            Nome VARCHAR(100) NOT NULL,
            Sobrenome VARCHAR(100) NOT NULL,
            Matricula VARCHAR(10) NOT NULL
            )""";

    private static final String sqlInsert = "INSERT INTO Dentista (Id, Nome, Sobrenome, Matricula) VALUES (?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE Dentista SET Matricula = ? WHERE Id = ?";

    public static void main(String[] args) throws Exception {
        Dentista d1 = new Dentista(1, "Bruno", "Keys", "12345");

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreatTable);
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setLong(1, 1);
            preparedStatement.setString(2, d1.getNome());
            preparedStatement.setString(3, d1.getSobrenome());
            preparedStatement.setString(4, d1.getMatricula());
            String sql = "SELECT * FROM Dentista";

            connection.setAutoCommit(false);
            LOGGER.info("Antes da atualização: " + d1.getMatricula().toString());

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            d1.setMatricula("123123");
            LOGGER.info("Depois da atualização: " + d1.getMatricula().toString());

            psUpdate.setString(1, d1.getMatricula());
            psUpdate.setLong(2, 1);
            psUpdate.execute();
            preparedStatement.executeUpdate();

            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {

        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}