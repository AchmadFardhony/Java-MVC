package Model;

public class MahasiswaModel {
    private String nama;
    private int umur;

    public MahasiswaModel( String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama(){
        return nama;
    }
    public Integer getUmur(){
        return umur;
    }

    public void setNama( String nama ){
        this.nama = nama;
    }
    public void setUmur( Integer umur ){
        this.umur = umur;
    }
}
