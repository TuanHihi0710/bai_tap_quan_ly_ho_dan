import java.util.ArrayList;
import java.util.List;

public class HoDan extends Nguoi {
    private int soNguoi;
    private int soNha;
    private List<Nguoi> danhSachThanhVien;

    public HoDan() {
        danhSachThanhVien = new ArrayList<>();
    }

    public HoDan(int inputSoNha, int inputSoNguoi) {
        soNha = inputSoNha;
        soNguoi=inputSoNguoi;
    }
    public List<Nguoi> getDanhSachThanhVien(){
        return danhSachThanhVien;
    }

    public void setDanhSachThanhVien(List<Nguoi> nguois) {
        danhSachThanhVien = nguois;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNguoi(int inputSoNguoi) {
        soNguoi = inputSoNguoi;
    }

    public void setSoNha(int inputSoNha) {
        soNha = inputSoNha;
    }

    public void ThemThongTinThanhVien(String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputNgheNghiep) {
        Nguoi thanhVien = new Nguoi(inputHoVaTen, inputTuoi, inputNamSinh, inputNgheNghiep);
        danhSachThanhVien.add(thanhVien);
    }

    public void XuatThongTinThanhVien() {
        for (int i = 0; i < danhSachThanhVien.size(); i++) {
            danhSachThanhVien.get(i).XuatThongTinNguoiTrongHo();
        }
    }

    public void XuatThongTinHoDan() {
        System.out.println("So nha: " + getSoNha());
        System.out.println("So nguoi: " + getSoNguoi());
        System.out.println("Ho va ten: " + getHoVaTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Nam sinh: " + getNamSinh());
        System.out.println("Nghe nghiep: " + getNgheNghiep());
    }
}
