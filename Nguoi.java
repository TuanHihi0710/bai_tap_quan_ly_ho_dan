public class Nguoi {
    private String hoVaTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;
    public Nguoi(){}
    public Nguoi(String inputHoVaTen, int inputTuoi, int inputNamSinh, String inputNgheNghiep){
        hoVaTen=inputHoVaTen;
        tuoi=inputTuoi;
        namSinh=inputNamSinh;
        ngheNghiep=inputNgheNghiep;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void setHoVaTen(String inputHoVaTen){
        hoVaTen=inputHoVaTen;
    }
    public void setTuoi(int inputTuoi){
        tuoi=inputTuoi;
    }
    public void setNamSinh(int inputNamSinh){
        namSinh=inputNamSinh;
    }
    public void setNgheNghiep(String inputNgheNghiep){
        ngheNghiep=inputNgheNghiep;
    }
    public void XuatThongTinNguoiTrongHo(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Tuoi: "+getTuoi());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Nghe nghiep: "+getNgheNghiep());
    }
}
