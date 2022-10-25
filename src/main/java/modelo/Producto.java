package modelo;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    
    private String nom_prod, categoría, fec_venc;
    private int cod;
    private double precio;
    private String restricción;
    private List<Producto> lis=new ArrayList();

    public Producto() {
    } 
    
    public Producto(int cod, String nom_prod, double precio, String categoría, String fec_venc ) {
        this.cod = cod;
        this.nom_prod = nom_prod.toLowerCase();
        this.precio = precio;
        this.fec_venc = fec_venc;
        this.categoría = categoría;    
    }
    
    public String categoría(){
        if(nom_prod == "leche" || nom_prod == "queso" || nom_prod == "yogurt" || nom_prod == "mantequilla") categoría = "Lácteos";
        if(nom_prod == "agua" || nom_prod == "gaseosa" || nom_prod == "cifrut") categoría = "Bebidas";
        if(nom_prod == "agua" || nom_prod == "gaseosa" || nom_prod == "cifrut" || nom_prod == "") categoría = "Licores";
        return categoría;
    }
    
    public String restriccion(){
        if (categoría == "Licores") restricción = "+18 años";
        else restricción = "APT";
        
        return restricción;
    }
    
    public Producto busca(int cod){
        for(Producto x:lis){
            if(x.getCod()==cod)
                return x;
        }
        return null;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getFec_venc() {
        return fec_venc;
    }

    public void setFec_venc(String fec_venc) {
        this.fec_venc = fec_venc;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getRestricción() {
        return restricción;
    }

    public void setRestricción(String restricción) {
        this.restricción = restricción;
    }

    public List<Producto> getLis() {
        return lis;
    }

    public void setLis(List<Producto> lis) {
        this.lis = lis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    

    
       
}
