package src;

import java.util.Scanner;

public class PhongVip extends Phong{
    private static int giaPhongVip=1000000;
    private double dienTich;
    private boolean nguoiPhucvurieng;
    private boolean hoBoirieng;
    private boolean viewBien;
    
    public PhongVip()
    {
        dienTich = 0;
        nguoiPhucvurieng = false;
        hoBoirieng = false;
        viewBien = false;
    }
    public static int getGiaPhongVip()
    {
        return giaPhongVip;
    }
    public static void setGiaPhongVip(int giaPhongVip)
    {
        giaPhongVip = giaPhongVip;
    }
    public double getDientich()
    {
        return dienTich;
    }
    public void setDientich(double dienTich)
    {
        this.dienTich = dienTich;
    }
    public boolean getNguoiPhucvurieng()
    {
        return nguoiPhucvurieng;
    }
    public void setNguoiPhucvurieng(boolean nguoiPhucvurieng)
    {
        this.nguoiPhucvurieng = nguoiPhucvurieng;
    }
    public boolean getHoboirieng()
    {
        return hoBoirieng;
    }
    public void setHoboirieng(boolean hoBoirieng)
    {
        this.hoBoirieng=hoBoirieng;
    }
    public boolean getViewBien()
    {
        return viewBien;
    }
    public void setViewBien(boolean viewBien)
    {
        this.viewBien = viewBien;
    }

    //Nhap thong tin phong VIP
    @Override
    public void nhapThongtin(){
        Scanner scanner=new Scanner(System.in);
        super.nhapThongtin();
        System.out.println("Nhap dien tich: ");
        dienTich = scanner.nextDouble();
        System.out.println("Nhap xac nhan co nguoi phuc vu rieng: ");
        nguoiPhucvurieng = scanner.nextBoolean();
        System.out.println("Nhap xac nhan co ho boi rieng: ");
        hoBoirieng = scanner.nextBoolean();
        System.out.println("Nhap xac nhan co view bien: ");
        viewBien = scanner.nextBoolean();
    }
    // Hien thi thong tin phong VIP
   @Override
   public void inThongtin(){
    super.inThongtin();
    System.out.println("Gia phong:"+giaPhongVip+"VND");
    System.out.println("Dien Tich: "+dienTich+"m2");
    System.out.println("Co nguoi phuc vu rieng: "+nguoiPhucvurieng);
    System.out.println("Co ho boi rieng: "+hoBoirieng);
    System.out.println("Co view bien:"+viewBien);
   }



}
