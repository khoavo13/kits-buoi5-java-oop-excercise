package HeThongNhomMau;

public class NhomB extends NhomMau{
    public NhomB() {
        this.loaiMau = _B;
    }
    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if (cha.getLoaiMau() == _O || cha.getLoaiMau() == _B){
            if (con.getLoaiMau() == _O || con.getLoaiMau() == _B){
                return true;
            }
        }
        else if (cha.getLoaiMau() == _A){
            return true;
        }
        else if (cha.getLoaiMau() == _AB){
            if (con.getLoaiMau() != _O){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean kiemTraNhomMau(NhomMau nguoiCho) {
        if (nguoiCho.getLoaiMau() == _B || nguoiCho.getLoaiMau() == _O){
            return true;
        }
        return false;
    }
}
