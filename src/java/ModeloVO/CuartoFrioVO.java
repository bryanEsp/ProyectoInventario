/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author SEVEN
 */
public class CuartoFrioVO {

    private String Cod_Cufi, longitud, altura, temperatura, estado_cuartofrio, institucion;

    public CuartoFrioVO() {
    }

    public CuartoFrioVO(String Cod_Cufi, String longitud, String altura, String temperatura, String estado_cuartofrio, String institucion) {
        this.Cod_Cufi = Cod_Cufi;
        this.longitud = longitud;
        this.altura = altura;
        this.temperatura = temperatura;
        this.estado_cuartofrio = estado_cuartofrio;
        this.institucion = institucion;
    }

    public String getCod_Cufi() {
        return Cod_Cufi;
    }

    public void setCod_Cufi(String Cod_Cufi) {
        this.Cod_Cufi = Cod_Cufi;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String gettemperatura() {
        return temperatura;
    }

    public void settemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getEstado_Cuartofrio() {
        return estado_cuartofrio;
    }

    public void setEstado_Cuartofrio(String estado_cuartofrio) {
        this.estado_cuartofrio = estado_cuartofrio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInsitucion(String institucion) {
        this.institucion = institucion;
    }

}
