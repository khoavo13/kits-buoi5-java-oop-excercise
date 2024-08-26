package HeThongNhomMau;

public class NhomO extends NhomMau{
    public NhomO() {
        this.loaiMau = _O;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if (cha.getLoaiMau() == _O){
            if (con.getLoaiMau() == _O)
                return true;
        }
        else if (cha.getLoaiMau() == _A){
            if (con.getLoaiMau() == _O || con.getLoaiMau() == _A)
                return true;
        }
        else if (cha.getLoaiMau() == _B){
            if (con.getLoaiMau() == _O || con.getLoaiMau() == _B)
                return true;
        }
        else if (cha.getLoaiMau() == _AB){
            if (con.getLoaiMau() == _B || con.getLoaiMau() == _A)
                return true;
        }
        return false;
    }

    @Override
    public boolean kiemTraNhomMau(NhomMau nguoiCho) {
        if (nguoiCho.getLoaiMau() == _O){
            return true;
        }
        return false;
    }
}
