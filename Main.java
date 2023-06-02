import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap vao so ho dan");
        Scanner scSoHoDan = new Scanner(System.in);
        int soHoDan = scSoHoDan.nextInt();
        KhuPho khuPho = new KhuPho(soHoDan);
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 3 để chọn Menu:");
                System.out.println("1: Nhập thông tin 1 ho dan");
                System.out.println("2: Hiển thị ra màn hình thong tin ho gia dinh");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap==1) {
                    System.out.println("Nhap thong tin 1 ho dan");
                    System.out.println("nhập số nhà: ");
                    Scanner scSoNha = new Scanner(System.in);
                    int soNha = scSoNha.nextInt();
                    System.out.println("nhập số thành viên: ");
                    Scanner scThanhVien = new Scanner(System.in);
                    int soThanhVien = scThanhVien.nextInt();
                    String hoTen  = "";
                    int tuoi = 0;
                    int namSinh = 0;
                    String ngheNghiep = "";
                    for (int i = 0; i < soThanhVien; i++) {
                        System.out.println("Nhap vao ten thanh vien");
                        Scanner scHoVaTen = new Scanner(System.in);
                        hoTen = scHoVaTen.nextLine();
                        System.out.println("Nhap vao tuoi thanh vien");
                        Scanner scTuoi = new Scanner(System.in);
                        tuoi = scTuoi.nextInt();
                        System.out.println("Nhap vao nam sinh");
                        Scanner scNamSinh = new Scanner(System.in);
                        namSinh = scNamSinh.nextInt();
                        System.out.println("Nhap vao nghe nghiep");
                        Scanner scNgheNghiep = new Scanner(System.in);
                        ngheNghiep = scNgheNghiep.nextLine();
                    }
                    khuPho.ThemThanhVienHoDan(soNha,soThanhVien,hoTen,tuoi,namSinh,ngheNghiep);
                } else if (nhap==2) {
                    System.out.println("Hiển thị ra màn hình thong tin ho gia dinh");
                    System.out.println("Nhap vao so nha con tim kiem");
                    Scanner scSoNha = new Scanner(System.in);
                    int soNha = scSoNha.nextInt();
                    khuPho.TimKiemThongTinHoDan(soNha);
                }
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 4);
    }
}