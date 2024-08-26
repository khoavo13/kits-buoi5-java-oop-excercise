package HeThongNhomMau;

public class NhomA extends NhomMau{
    public NhomA(){
        this.loaiMau = _A;
    }


    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if (cha.getLoaiMau() == _O || cha.getLoaiMau() == _A){
            if (con.getLoaiMau() == _O || con.getLoaiMau() == _A){
                    return true;
            }
        }
        else if (cha.getLoaiMau() == _B){
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
        if (nguoiCho.getLoaiMau() == _A || nguoiCho.getLoaiMau() == _O){
            return true;
        }
        return false;
    }
}
