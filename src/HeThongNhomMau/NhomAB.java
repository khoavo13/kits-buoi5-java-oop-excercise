package HeThongNhomMau;

public class NhomAB extends NhomMau{
    public NhomAB() {
        this.loaiMau = _AB;
    }


    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if (cha.getLoaiMau() != _O){
            if (con.getLoaiMau() != _O){
                return true;
            }
        }
        else {
            if (con.getLoaiMau() == _A || con.getLoaiMau() == _B){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean kiemTraNhomMau(NhomMau nguoiCho) {

        return true;
    }
}
