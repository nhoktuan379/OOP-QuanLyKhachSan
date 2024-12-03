package src;

import java.util.Scanner;
class NhanVien extends ThucThe {
    private String gioiTinh;
    private int cmnd;
    private String ngaySinh;
    private int soDienThoai;
    private String diaChi;
    private int luong;
    private String gioLamviec;

    public NhanVien() {
        this.gioiTinh = "";
        this.cmnd = 0;
        this.ngaySinh = "";
        this.soDienThoai = 0;
        this.diaChi = "";
        this.luong=0;
        this.gioLamviec="";
    }
    public String getGioitinh()
    {
        return this.gioiTinh;
    }
    public void setGioitinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public int getCmnd()
    {
        return this.cmnd;
    }
    public void setCmnd(int cmnd)
    {
        this.cmnd = cmnd;
    }
    public String getNgaysinh()
    {
        return this.ngaySinh;
    }
    public void setNgaysinh(String ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
    public int getSoDienThoai()
    {
        return this.soDienThoai;
    }
    public void setSoDienThoai(int soDienThoai)
    {
        this.soDienThoai = soDienThoai;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getGiolamviec()
    {
        return this.gioLamviec;
    }
    public void setGiolamviec(String giolamviec)
    {
        this.gioLamviec=giolamviec;
    }
    public int getLuong()
    {
        return this.luong;
    }
    public void setLuong(int luong)
    {
        this.luong = luong;
    }

    @Override
    public void nhapThongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        this.maSo=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten nhan vien:");
        this.ten = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhap so CMND:");
        this.cmnd = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        this.ngaySinh=sc.nextLine();
        System.out.println("Nhap so dien thoai:");
        this.soDienThoai = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        this.diaChi = sc.nextLine();
        System.out.println("Nhap gio lam viec:");
        this.gioLamviec = sc.nextLine();
        System.out.println("Nhap luong:");
        this.luong = sc.nextInt();
    }
    @Override
    public void inThongtin()
    {
        System.out.println("Ma nhan vien: "+maSo);
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("Gioi tinh nhan vien:"+gioiTinh);
        System.out.println("So cmnd:"+cmnd);
        System.out.println("So dien thoai:"+soDienThoai);
        System.out.println("Dia chi:"+diaChi);
        System.out.println("Gio lam viec:"+gioLamviec);
        System.out.println("Luong:"+luong);
    }
}

