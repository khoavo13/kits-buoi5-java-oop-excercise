package HeThongNhomMau;

import java.util.Scanner;

public abstract class NhomMau {
    protected boolean Rh;
    protected int loaiMau;

    public static final int _O = 1;
    public static final int _A = 2;
    public static final int _B = 3;
    public static final int _AB = 4;


    public void nhapRh(){
        System.out.println("1: Rh+");
        System.out.println("2: Rh-");
        System.out.println("Nhap loai Rh: ");
        Scanner sc = new Scanner(System.in);

        int flag = sc.nextInt();
        if (flag == 1){
            this.Rh = true;
        }
        else {
            this.Rh = false;
        }
    }
    public void xuat(){
        System.out.println("========================");
        if (this.loaiMau == _O){
            System.out.print("O");
        }
        else if (this.loaiMau == _A){
            System.out.print("A");
        }
        else if (this.loaiMau == _B){
            System.out.print("B");
        }
        else if (this.loaiMau == _AB){
            System.out.print("AB");
        }

        if (this.Rh){
            System.out.println("+");
        }
        else System.out.println("-");
        System.out.println("========================");
    }

    public boolean isRh() {
        return Rh;
    }

    public void setRh(boolean rh) {
        Rh = rh;
    }

    public int getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }

    public abstract boolean kiemTraDiTruyen(NhomMau cha, NhomMau con);

    public boolean kiemTraRh(NhomMau nguoiCho){
        if (nguoiCho.isRh()){
            if (this.Rh){
                return true;
            }
        }
        else return true;
        return false;
    }

    public abstract boolean kiemTraNhomMau(NhomMau nguoiCho);

    public boolean kiemTraChoNhan(NhomMau nguoiCho){
        boolean nhomMau = kiemTraNhomMau(nguoiCho);
        boolean rh = kiemTraRh(nguoiCho);

        if (nhomMau && rh){
            return true;
        }
        else {
            return false;
        }
    }
}
