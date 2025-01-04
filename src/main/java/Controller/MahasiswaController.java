package Controller;


import Model.MahasiswaModel;
import View.MahasiswaView;

public class MahasiswaController {
    MahasiswaModel Model;
    MahasiswaView View;

    public MahasiswaController( MahasiswaModel Model, MahasiswaView View ){
        this.Model = Model;
        this.View = View;
    }

    public void setNamaMahasiswa ( String namaMahasiswa ){
        this.Model.setNama(namaMahasiswa);
    }
    public void setUmurMahasiswa ( Integer umurMahasiswa ){
        this.Model.setUmur(umurMahasiswa);
    }

    public void tampilkaninfomahasiswa(){
        View.datamahasiswa(Model);
    }
}
