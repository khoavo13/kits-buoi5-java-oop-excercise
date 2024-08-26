import GaHam.MonGaHam;
import HeThongNhomMau.*;

public class Main {
    public static void main(String[] args) {
        /*
            Bai 1: Ga Ham
         */
//        MonGaHam m = new MonGaHam();
//        m.nhap();
//        m.kiemTraDinhDuong();
//        System.out.println("Cau 3: " + m.cau3());
        /*
            Bai 2: Nhom mau
         */
        DanhSachNhomMau d = new DanhSachNhomMau();
        d.nhap();
        d.xuat();
        d.cau2();
        d.cau3();
    }
}