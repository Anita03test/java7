package app;

import java.io.IOException;
import java.sql.SQLException;

class Feature5_ExceptionHandling {

    public void oldMethod() {
        try {
            methodThrowsExceptions();
        } catch (ArrayIndexOutOfBoundsException e) {
            // catchs and handle exception 1
        } catch (IOException e) {
            // catchs and handle exception 2
        } catch (SQLException e) {
            // catchs and handle exception 3
        } catch (Exception e) {
            // catchs and handle exception 4
        }
    }

    public void methodThrowsExceptions() throws IOException, SQLException {
    }

    /**
     * Improved Exception Handled
     */
    public void catchExceptions() {
        try {
            methodThrowsExceptions();
        } catch (IOException | SQLException | ArrayIndexOutOfBoundsException e) {
            // log and deal with all exceptions
        }
    }

}