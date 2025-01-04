package Main;

import Controller.MahasiswaController;
import Model.MahasiswaModel;
import View.MahasiswaView;

public class Main {
    public static void main(String[] args){
        MahasiswaModel Model = new MahasiswaModel("Donny",29);
        MahasiswaView View = new MahasiswaView();
        MahasiswaController Controller = new MahasiswaController(Model,View);

        System.out.println("Data Mahasiswa awal :");
        Controller.tampilkaninfomahasiswa();

        Controller.setNamaMahasiswa("Alfarel");
        Controller.setUmurMahasiswa(25);

        System.out.println("----------");

        System.out.println("Data Mahasiswa setelah perubahan : ");
        Controller.tampilkaninfomahasiswa();
    }
}
