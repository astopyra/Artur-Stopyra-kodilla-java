import com.kodilla.jdbc.DbManager;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    DbManager dbManager = DbManager.getInstance();

    @Test
    void testUpdateBestsellers() throws SQLException {

        //given
        String columnBestsellerUpdate = "UPDATE BOOKS SET BESTSELLER=FALSE";
        Statement statement1 = dbManager.getConnection().createStatement();
        statement1.executeUpdate(columnBestsellerUpdate);

        //when
        String callProcedure = "CALL UpdateBestsellers()";
        Statement statement2 = dbManager.getConnection().createStatement();
        statement2.execute(callProcedure);
        String checkTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=FALSE";
        ResultSet resultSet = statement2.executeQuery(checkTable);

        //then
        int howMany = -1;
        if (resultSet.next()){
            howMany = resultSet.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);
        resultSet.close();
        statement1.close();
        statement2.close();

    }

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //given

        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);


        //when
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }
}
