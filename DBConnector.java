package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

    private static DBConnection dbConn;
    private static Connection con;
    
    /**
     * Constructor creates a new, static instance of the DBConnection
     */
    protected DBConnector(){
        dbConn = new DBConnection();
        con = dbConn.getDBConnection();
    }//end of constructor

    protected String queryDB(){
        ResultSet rs;
        //TODO how to produce this string?
        //how will information be given to the class?
        //potential helper method needed to create the SQL string
        String queryString = "SELECT FROM WHERE"; 
        String resultString;
        try {
            Statement stmnt = con.createStatement();
            rs = stmnt.executeQuery(queryString);
            
            while(rs.next()){
                //again, not sure about formatting
                //is this supposed to be handed back to Dataset as a String or ResultSet
                //in what format will DBGui expect to get the results to display the information?
                resultString = rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+"\n";
            }           

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return "";
    }//end of queryDB();
    
    
    //TODO? Do we want to have an integer return or something to confirm DB connection closed?
    protected void disconnectDB(){        
        dbConn.disconnectFromDB();
    }//end of disconnectDB()
    
}//end of class

//    
//    public static void queryTableSuppliers(Connection con)
//    {
//        ResultSet rs = null;
//        String stmntStr = "SELECT * FROM suppliers";
//        try {
//            Statement stmnt = con.createStatement();
//            rs = stmnt.executeQuery(stmntStr);
//            System.out.println("\nTable Query!\n");
//        
//            System.out.println("snum\tsname\t\tstatus\tcity\t\tsupplier_id_seq");
//            while(rs.next()){
//                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
//            }           
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//    } //method
//
//    public static void queryTableParts(Connection con)
//    {
//        ResultSet rs = null;
//        String stmntStr = "SELECT * FROM parts";
//        try {
//            Statement stmnt = con.createStatement();
//            rs = stmnt.executeQuery(stmntStr);
//            System.out.println("\nTable Query!\n");
//        
//            System.out.println("pnum\tpname\t\tcolor\t\tweight\tcity\t\tparts_id_seq");
//            while(rs.next()){
//                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
//            }           
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//    } //method
//
//   
//        
//    public static void createTableTest(Connection con)
//    {
//        String stmntStr =
//            "CREATE TABLE test(name VARCHAR(50), score INTEGER)";
//        
//        try {
//            Statement stmnt = con.createStatement();
//            stmnt.executeUpdate(stmntStr);
//            stmnt.close();
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//        System.out.println("Table \"test\" created.");
//    }
//    
//    public static void dropTableTest(Connection con)
//    {
//        String stmntStr = "DROP TABLE test";
//
//        try {
//            Statement stmnt = con.createStatement();
//            stmnt.executeUpdate(stmntStr);
//            stmnt.close();
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//        
//        System.out.println("Table \"test\" dropped.");
//    }
//    
//    public static void addToTableTest(Connection con, String myString, Integer myInt)
//    {
//        String stmntStr = 
//            "INSERT INTO test VALUES('" + myString + "', " + myInt + ")";
//        try {
//            Statement stmnt = con.createStatement();
//            stmnt.executeUpdate(stmntStr);
//            stmnt.close();
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//        System.out.println("Added the following tuple to the test table: " + myString + ", " + myInt);
//                
//    }
//    
//    public static void queryTableTest2(Connection con)
//    {
//        ResultSet rs = null;
//        String myString = "SELECT * from test";
//        try{
//            Statement theirString = con.createStatement();
//            rs = theirString.executeQuery(myString);
//            
//            while(rs.next()){
//                System.out.println("Name " + rs.getString(1) + " Score: " + rs.getInt(2));
//            }
//        } catch(SQLException ex) {
//            System.err.println(ex.getMessage());
//            
//        }
//    }
//    
//    public static void queryTableTest(Connection con)
//    {
//        String stmtString = "SELECT * from test";
//        ResultSet rs = null;
//        try {
//            Statement stmt = con.createStatement();
//            rs = stmt.executeQuery(stmtString);
//            
//            System.out.println("Test Table Queried!");
//            while(rs.next()){
//                System.out.println("Name: " + rs.getString(1) + " Score: " + rs.getInt(2));
//            }
//            
//        } catch (SQLException ex){
//            System.err.println(ex.getMessage());
//        }
//        
//        
//        
//    }
//
//  
////........................ M A I N   M E T H O D ............................//
//
//    /**
//     * This main method is just for testing this class.
//     * @param args the arguments
//     */
//    public static void main(String[] args)
//            throws Exception
//    
        
//    } //main method

//} //class

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

