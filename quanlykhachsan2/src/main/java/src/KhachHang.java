package src;

import java.util.Scanner;
public class KhachHang extends ThucThe{
    private String diachi;
    private int sdt;
    private String email;
    private String ngaySinh;
    private int cmnd;
    private String gioiTinh;

    public KhachHang()
    {
        diachi="";
        sdt=0;
        email="";
    }
    public String getDiachi()
    {
        return diachi;
    }
    public void setDiachi(String diachi)
    {
        this.diachi = diachi;
    }
    public int getSdt()
    {
        return sdt;
    }
    public void setSdt(int sdt)
    {
        this.sdt = sdt;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getNgaySinh()
    {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
    public String getGioitinh()
    {
        return gioiTinh;
    }
    public void setGioitinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public int getCmnd()
    {
        return cmnd;
    }
    public void setCmnd(int cmnd)
    {
        this.cmnd = cmnd;
    }
    @Override
    public void nhapThongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang:");
        this.ten=sc.nextLine();
        System.out.println("Nhap ma khach hang:");
        this.maSo=sc.nextInt();
        System.out.println("Nhap cmnd:");
        this.cmnd=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        this.ngaySinh=sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        this.gioiTinh=sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        this.sdt = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        this.diachi = sc.nextLine();
        System.out.println("Nhập email:");
        this.email = sc.nextLine();
    }
    @Override
    public void inThongtin()
    {
        System.out.println("Ten khach hang:"+ten);
        System.out.println("Ma khach hang: "+maSo);
        System.out.println("Cmnd:"+cmnd);
        System.out.println("Ngay sinh:"+ngaySinh);
        System.out.println("Gioi tinh:"+gioiTinh);
        System.out.println("Số điện thoại:"+sdt);
        System.out.println("Địa chỉ:"+diachi);
        System.out.println("Email khách hàng:"+email);

    }
}
