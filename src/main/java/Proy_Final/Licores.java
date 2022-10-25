/*package Proy_Final;

import modelo.Producto;

public class Licores extends Producto {
    private String nom_prod;
    private String restricción;
    private int cantidad;
    private double precio;
    private double pago;

    public Licores(int categoría, String nom_prod,int cantidad, double precio, String restricción, String fecha_venc) {
        super(nom_prod, categoría, fecha_venc);
        this.nom_prod = nom_prod;
        this.cantidad = cantidad;
        this.restricción = restricción;
        this.precio = precio;
    }

    public double PrecioL(){
        if (nom_prod == "Johnny Walker") precio= 113.9;
        else if (nom_prod == "Smirnoff") precio = 35;
        else if (nom_prod == "Cusqueña") precio = 35;
        return precio;
    }

    public String getRestricción() {
        return restricción;
    }

    public void setRestricción(String restricción) {
        this.restricción = restricción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

   
    
    

}
*/