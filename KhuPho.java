import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    int soHoDan;
    private HoDan[] hoDans;
    public KhuPho(int inputSoHoDan) {
        soHoDan = inputSoHoDan;
        hoDans = new HoDan[soHoDan];
    }
    public void ThemThanhVienHoDan(int inputSoNha, int inputSoNguoi, String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputNgheNghiep){
        for (int i = 0; i < hoDans.length; i++) {
            List<Nguoi> nguoi = new ArrayList<>();
            HoDan hoDan = new HoDan(inputSoNha,inputSoNguoi);
            if (hoDans[i]==null) {
                hoDans[i] = hoDan;
            }
            for (int j = 0; j < inputSoNguoi; j++) {
                Nguoi thanhVien = new Nguoi(inputHoVaTen,inputTuoi,inputNamSinh,inputNgheNghiep);
                hoDan.ThemThongTinThanhVien(thanhVien);
//                hoDan.setHoVaTen(inputHoVaTen);
//                hoDan.setTuoi(inputTuoi);
//                hoDan.setNamSinh(inputNamSinh);
//                hoDan.setNgheNghiep(inputNgheNghiep);
                nguoi.add(thanhVien);
                hoDan.setDanhSachThanhVien(nguoi);
            }
        }
    }
    public void TimKiemThongTinHoDan(int soNha){
        for (int i = 0; i < hoDans.length; i++) {
            if (hoDans[i].getSoNha()==soNha){
                hoDans[i].XuatThongTinHoDan();
            }
        }
    }

//    public void ThemHoDan(int inputSoNguoi, int inputSoNha) {
//        for (int i = 0; i < hoDans.length; i++) {
//            HoDan hoDan1 = new HoDan(inputSoNguoi, inputSoNha);
//            List<Nguoi> danhSachThanhVien = new ArrayList<>();
//            System.out.println("nhập số nhà: ");
//            Scanner scSoNha = new Scanner(System.in);
//            int soNha = scSoNha.nextInt();
//            hoDan1.setSoNha(soNha);
//            System.out.println("nhập số thành viên: ");
//            Scanner scThanhVien = new Scanner(System.in);
//            int soThanhVien = scThanhVien.nextInt();
//            hoDan1.setSoNguoi(soThanhVien);
//            hoDans[i] = hoDan1;
//            for (int j = 0; j < inputSoNguoi; j++) {
//                System.out.println("nhập họ tên: ");
//                Scanner scHoTen = new Scanner(System.in);
//                String hoTen = scHoTen.nextLine();
//                System.out.println("nhập tuổi: ");
//                Scanner scTuoi = new Scanner(System.in);
//                int tuoi = scTuoi.nextInt();
//                System.out.println("nhập năm sinh: ");
//                Scanner scNamSinh = new Scanner(System.in);
//                int namSinh = scNamSinh.nextInt();
//                System.out.println("nhập nghề nghiệp: ");
//                Scanner scNgheNghiep = new Scanner(System.in);
//                String ngheNghiep = scNgheNghiep.nextLine();
//                Nguoi nguoi = new Nguoi(hoTen,tuoi,namSinh,ngheNghiep);
//                danhSachThanhVien.add(nguoi);
//            }
//            hoDan1.setDanhSachThanhVien(danhSachThanhVien);
//            System.out.println("Nhap ho dan tiep theo");
//            hoDan1.XuatThongTinHoDan();
//        }
//    }
}
