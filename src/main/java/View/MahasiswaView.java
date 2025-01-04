package View;

import Model.MahasiswaModel;

public class MahasiswaView {
    public void datamahasiswa(MahasiswaModel mmd){
        System.out.println("nama mahasiswa : " +mmd.getNama());
        System.out.println("umur mahasiswa : " +mmd.getUmur());
    }
}
