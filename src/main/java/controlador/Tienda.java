package controlador;
import modelo.Producto;
import util.MySQLConexion;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Tienda {
    
    /*    public void adi_lacteos(Lácteos la){
        lis.add(la);
    }
    public void adi_licores(Licores li){
        lis.add(li);
    }*/
    
    public String fecha_aleatoria() {
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();

        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(10)+2022, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(unaFecha.getTime());
        return fecha;
    }    
    
    //adicion de prestamos
    public void adicion(Producto p){
        Connection cn=MySQLConexion.getConexion();
        String sql="insert into prestamo(cliente,monto,meses)values(?,?,?)";
        try{
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, p.getNom_prod());
            st.setInt(2, p.getCategoría());
            st.setString(3, p.getFec_venc());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //actualizar cualquier campo excepto el nro de prestamo
    public void modifica(Producto p){
        Connection cn=MySQLConexion.getConexion();
        String sql="update prestamo set cliente=?,monto=?,meses=? where nropre=?";
        try{
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, p.getNom_prod());
            st.setInt(2, p.getCategoría());
            st.setString(3, p.getFec_venc());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //anulacion de un numero de prestamo
    public void anular(int nro){
        Connection cn=MySQLConexion.getConexion();
        String sql="delete from prestamo where nropre=?";
        try{
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, nro); 
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //listado total de prestamos
    public List<Producto> listado(){
      List<Producto> lista=new ArrayList();
      Connection cn=MySQLConexion.getConexion();
      String sql="select nropre,cliente,monto,meses from prestamo";
      try{
         PreparedStatement st=cn.prepareStatement(sql);
         ResultSet rs=st.executeQuery(); //la consulta pasa a memoria 
         //se debe leer fila por fila y llevarlo a un arraylist
         while(rs.next()){
            Producto p=new Producto();
            st.setString(1, p.getNom_prod());
            st.setInt(2, p.getCategoría());
            st.setString(3, p.getFec_venc());
            lista.add(p);
         }
      }catch(Exception ex){
          ex.printStackTrace();
      }
      return lista;
    }
    /*Consulta*/
    public Producto consulta(int nro){
      Producto p=null;
      Connection cn=MySQLConexion.getConexion();
      String sql="select nropre,cliente,monto,meses from prestamo";
      try{
         PreparedStatement st=cn.prepareStatement(sql);
         st.setInt(1,nro); //la consulta pasa a memoria 
         ResultSet rs = st.executeQuery();
         //se debe leer fila por fila y llevarlo a un arraylist
         if(rs.next()){
             p=new Producto();
             p.setCod(rs.getInt(1)); 
             p.setNom_prod(rs.getString(2));
             p.setCategoría(rs.getInt(3));
             p.setFec_venc(rs.getString(4));
         }
      }catch(Exception ex){
          ex.printStackTrace();
      }
      return p;
    }
    
}
