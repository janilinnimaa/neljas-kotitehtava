package kotitehtavaneljas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Olut {

    private String nimi;
    private String tyyppi;
    private String valmistaja;
    private String maa;

    public Olut(String nimi, String tyyppi, String valmistaja, String maa) {

        this.nimi = nimi;
        this.tyyppi = tyyppi;
        this.valmistaja = valmistaja;
        this.maa = maa;

    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getValmistaja() {
        return valmistaja;
    }

    public void setValmistaja(String valmistaja) {
        this.valmistaja = valmistaja;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public void insertBeerIntoDB() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/olut_db?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Connection success!");
            
            Statement stmt = con.createStatement();
            
            String taulu = "oluet";
            stmt.executeUpdate("INSERT INTO "+taulu+" (id, nimi, tyyppi, valmistaja, maa) " +
                    "VALUES (null,'"+this.nimi+"','"+this.tyyppi+"','"+this.valmistaja+"','"+this.maa+"')");
            
            con.close();
           
            
            
        } catch (Exception e){
            System.out.println("Tapahtui virhe!");
            System.out.println(e);
        }
    }
    
}
