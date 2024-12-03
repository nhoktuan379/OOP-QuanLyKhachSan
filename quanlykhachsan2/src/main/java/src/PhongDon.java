package src;

import java.util.Scanner;
class PhongDon extends Phong {
    private static double giaPhongdon=200000;
    private double dienTich;
    public PhongDon(){
        this.dienTich=0;
    
    }
    //get and set gia phong don
    public static double getGiaPhongdon(){
        return giaPhongdon;
    }
    public static void setGiaPhongdon(double giaPhongdon){
        PhongDon.giaPhongdon = giaPhongdon;
    }
    // get and set dien tich
    public void setDienTich( double dienTich){
        this.dienTich=dienTich;
    }
    public double getDienTich(){
        return dienTich;
    }
    //Nhap thong tin phong don 
    @Override
    public void nhapThongtin(){
        Scanner scanner=new Scanner(System.in);
        super.nhapThongtin();
        System.out.println("Nhập diện tích phòng đơn:");
        dienTich=scanner.nextInt();
    }
    // Hien thi thong tin phong don
   @Override
   public void inThongtin(){
    super.inThongtin();
    System.out.println("Gia phong:"+giaPhongdon+"VND");
    System.out.println("Dien Tich: "+dienTich+"m2");
   }
}
