package HeThongNhomMau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private final List<NhomMau> arr;

    public DanhSachNhomMau() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");

        while (true) {
            System.out.println("Nhap ten nhom mau");
            System.out.println("1: Nhom mau O");
            System.out.println("2: NHom mau A");
            System.out.println("3: Nhom mau B");
            System.out.println("4: Nhom mau AB");
            System.out.println("5: Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            int flag = sc.nextInt();
            NhomMau n;
            if (flag == 1) {
                n = new NhomO();
                n.nhapRh();
            } else if (flag == 2) {
                n = new NhomA();
                n.nhapRh();
            } else if (flag == 3) {
                n = new NhomB();
                n.nhapRh();
            } else if (flag == 4) {
                n = new NhomAB();
                n.nhapRh();
            } else {
                break;
            }
            this.arr.add(n);
        }
    }

    public void xuat() {
        for (NhomMau n : arr) {
            n.xuat();
        }
    }

    public void cau2(){
        NhomMau me = new NhomA();
        NhomMau cha = new NhomB();
        NhomMau con = new NhomA();

        if (me.kiemTraDiTruyen(cha, con)){
            System.out.printf("Gia dinh phu hop voi quy luat di truyen\n");
        }
        else System.out.printf("Co gi do sai sai\n");

    }

    public void cau3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chi so nguoi can nhan mau: ");
        int index = sc.nextInt();

        for (int i = 0; i < arr.size(); i++) {
            if (i != index) {
                if (this.arr.get(index).kiemTraChoNhan(this.arr.get(i))) {
                    System.out.printf("Ban thu %d co the cho mau ban %d nha.\n", i, index);
                }
            }
        }
    }

}
