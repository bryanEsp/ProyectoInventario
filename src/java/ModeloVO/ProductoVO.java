/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Usuario
 */
public class ProductoVO {
String CodigoPro,NombrePro,DescripcionPro,UnidadesdeMedidaPro,PesoPro,CantidadgeneralPro,TemperaturaPro,EstadoPro,CategoriaPro;
    public ProductoVO(String Codigo, String Nombre, String Descripcion, String UnidaddeMedida, String Peso, String CantidadGeneral, String Temperatura, String Estado, String Categoria)
    {
    this.CodigoPro=Codigo;
    this.NombrePro=Nombre;
    this.DescripcionPro=Descripcion;
    this.UnidadesdeMedidaPro=UnidaddeMedida;
    this.PesoPro=Peso;
    this.CantidadgeneralPro=CantidadGeneral;
    this.TemperaturaPro=Temperatura;
    this.EstadoPro=Estado;
    this.CategoriaPro=Categoria;
    }

    public ProductoVO() {
   
    }

    public String getCodigoPro() {
        return CodigoPro;
    }

    public void setCodigoPro(String CodigoPro) {
        this.CodigoPro = CodigoPro;
    }

    public String getNombrePro() {
        return NombrePro;
    }

    public void setNombrePro(String NombrePro) {
        this.NombrePro = NombrePro;
    }

    public String getDescripcionPro() {
        return DescripcionPro;
    }

    public void setDescripcionPro(String DescripcionPro) {
        this.DescripcionPro = DescripcionPro;
    }

    public String getUnidadesdeMedidaPro() {
        return UnidadesdeMedidaPro;
    }

    public void setUnidadesdeMedidaPro(String UnidadesdeMedidaPro) {
        this.UnidadesdeMedidaPro = UnidadesdeMedidaPro;
    }

    public String getPesoPro() {
        return PesoPro;
    }

    public void setPesoPro(String PesoPro) {
        this.PesoPro = PesoPro;
    }

    public String getCantidadgeneralPro() {
        return CantidadgeneralPro;
    }

    public void setCantidadgeneralPro(String CantidadgeneralPro) {
        this.CantidadgeneralPro = CantidadgeneralPro;
    }

    public String getTemperaturaPro() {
        return TemperaturaPro;
    }

    public void setTemperaturaPro(String TemperaturaPro) {
        this.TemperaturaPro = TemperaturaPro;
    }

    public String getEstadoPro() {
        return EstadoPro;
    }

    public void setEstadoPro(String EstadoPro) {
        this.EstadoPro = EstadoPro;
    }

    public String getCategoriaPro() {
        return CategoriaPro;
    }

    public void setCategoriaPro(String CategoriaPro) {
        this.CategoriaPro = CategoriaPro;
    }
    
    
}
