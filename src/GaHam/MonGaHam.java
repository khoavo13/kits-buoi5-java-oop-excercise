package GaHam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonGaHam {
    public static final int FLAG_CARB = 1;
    public static final int FLAG_FAT = 2;
    public static final int FLAG_FAT_BH = 3;
    public static final int FLAG_PROTEIN = 4;
    public static final int FLAG_CALO = 5;
    
    private List<ThucPham> arr;

    public MonGaHam() {
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        System.out.print("Khoi luong ga (gam): ");
        ThucPham ga = new Ga();
        ga.setKhoiLuong(sc.nextInt());
        this.arr.add(ga);

        System.out.print("Khoi luong hat sen (gam): ");
        ThucPham hatSen = new HatSen();
        hatSen.setKhoiLuong(sc.nextInt());
        this.arr.add(hatSen);

        System.out.print("Khoi luong ca rot (gam): ");
        ThucPham caRot = new CaRot();
        caRot.setKhoiLuong(sc.nextInt());
        this.arr.add(caRot);

        System.out.print("Khoi luong tao do (gam): ");
        ThucPham taoDo = new TaoDo();
        taoDo.setKhoiLuong(sc.nextInt());
        this.arr.add(taoDo);

        System.out.print("Khoi luong nam dong co (gam): ");
        ThucPham nam = new NamDongCo();
        nam.setKhoiLuong(sc.nextInt());
        this.arr.add(nam);

    }
    // Cach 1
    public float tinhNangLuong(int flag){
        float sum = 0f;

        for (ThucPham t : this.arr){
            if (flag == 1){
                sum += t.getKhoiLuong()/100.0 * t.getCarb();
            }
            else if (flag == 2){
                sum += t.getKhoiLuong()/100.0 * t.getFat();
            }
            else if (flag == 3){
                sum += t.getKhoiLuong()/100.0 * t.getFatBaoHoa();
            }
            else if (flag == 4){
                sum += t.getKhoiLuong()/100.0 * t.getProtein();
            }
            else if (flag == 5){
                sum += t.getKhoiLuong()/100.0 * t.getCalo();
            }
        }
        return sum;
    }
    // Cach 2: Su dung stream
    public float tinhNangLuong2(int flag){
        return (float) this.arr.stream()
                .mapToDouble(d -> {
                    if (flag == FLAG_CARB){
                        return d.getKhoiLuong()/100.0f*d.getCarb();
                    }
                    else if (flag == FLAG_FAT){
                        return d.getKhoiLuong()/100.0f*d.getFat();
                    }
                    else if (flag == FLAG_FAT_BH){
                        return d.getKhoiLuong()/100.0f*d.getFatBaoHoa();
                    }
                    else if (flag == FLAG_PROTEIN){
                        return d.getKhoiLuong()/100.0f*d.getProtein();
                    }
                    else if (flag == FLAG_CALO){
                        return d.getKhoiLuong()/100.0f*d.getCalo();
                    }
                    throw new IllegalArgumentException("Invalid flag value");
                })
                .sum();
    }

    public void kiemTraDinhDuong(){
        System.out.println("================================");
        System.out.print("Chi so carb (g): ");
        Scanner sc = new Scanner(System.in);
        int carbIndex = sc.nextInt();
        System.out.print("Chi so fat (g): ");
        int fatIndex = sc.nextInt();
        System.out.print("Chi so fat bao hoa (g): ");
        int fatBaoHoaIndex = sc.nextInt();
        System.out.print("Chi so protein (g): ");
        int proteinIndex = sc.nextInt();
        System.out.print("Chi so calo (Kcal): ");
        int caloIndex = sc.nextInt();


        float nangLuong = tinhNangLuong(1);
        if (carbIndex > nangLuong){
            System.out.println("Ban can bo sung carb: " + (carbIndex - nangLuong));
        }
        nangLuong = tinhNangLuong(2);
        if (fatIndex > nangLuong){
            System.out.println("Ban can bo sung fat: " + (fatIndex - nangLuong));
        }
        nangLuong = tinhNangLuong(3);
        if (fatBaoHoaIndex > nangLuong){
            System.out.println("Ban can bo sung fat bao hoa: " + (fatBaoHoaIndex - nangLuong));
        }
        nangLuong = tinhNangLuong(4);
        if (proteinIndex > nangLuong){
            System.out.println("Ban can bo sung protein: " + (proteinIndex - nangLuong));
        }
        nangLuong = tinhNangLuong(5);
        if (caloIndex > nangLuong){
            System.out.println("Ban can bo sung calo: " + (caloIndex - nangLuong));
        }

    }

    public float cau3(){
        if (tinhNangLuong(FLAG_CALO) > 600){
            return 30 * (tinhNangLuong(5) - 600)/147.5f;
        }
        return 0;
    }
}
