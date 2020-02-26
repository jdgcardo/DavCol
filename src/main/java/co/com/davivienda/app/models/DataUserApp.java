package co.com.davivienda.app.models;

public class DataUserApp {

    private String tipoDocumento;
    private String numDocumento;
    private String contrasena;
    private String numCuenta;
    private String saldo;

    private String mesExtracto;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getMesExtracto() {
        return mesExtracto;
    }

    public DataUserApp(String tipoDocumento, String numDocumento, String contrasena, String numCuenta, String saldo, String mesExtracto) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.contrasena = contrasena;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.mesExtracto = mesExtracto;
    }


}
