import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Geometria; CREATE TABLE Geometria"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Cor VARCHAR(100) NOT NULL "
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (1,'Circulo','Vermelha')";
    private static final String sqlInsert2 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (2,'Circulo','Vermelha')";
    private static final String sqlInsert3 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (3,'Quadrado','🟩')";
    private static final String sqlInsert4 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (4,'Quadrado','🟩')";
    private static final String sqlInsert5 = "INSERT INTO Geometria (Id, Nome, Cor) VALUES (5,'Quadrado','🟩')";


    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);

            mostrarCores(connection);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static void mostrarCores(Connection connection) throws SQLException {
        String sqlQuery = "SELECT Cor FROM Geometria WHERE Cor = 'Vermelha'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }

    public static Connection getConexao() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}