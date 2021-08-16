
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    @Id
    long id_producto;
    @Basic
    String nombreProducto;
    int cantCuota;
    double precioProducto;
    double precioPorCuota;

    public Producto() {
    }

    public Producto(long id_producto, String nombreProducto, int cantCuota, double precioProducto) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.cantCuota = cantCuota;
        this.precioProducto = precioProducto;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantCuota() {
        return cantCuota;
    }

    public void setCantCuota(int cantCuota) {
        this.cantCuota = cantCuota;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPrecioPorCuota() {
        return precioPorCuota;
    }

    public void setPrecioPorCuota(double precioPorCuota) {
        this.precioPorCuota = precioPorCuota;
    }
    
    public boolean tieneCuotas(){
            return getCantCuota()<0;
    }
    
    public double precioPorCuota(int cantCuota, double precioProducto){
        double precio;
        if (tieneCuotas()){
             precio= precioProducto/cantCuota;
            return precio;
        }
        return precioProducto;
        
    }
    
}
