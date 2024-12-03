package src;

import java.util.Scanner;

class Phong extends ThucThe{
    private int soPhong;
    private int loaiPhong;
    private boolean isCoPhong;
    public Phong  (){
        this.soPhong = 0;
        this.loaiPhong = 0;
        this.isCoPhong= true;
    }
    //get and set soPhong
    public int getsoPhong(){
        return soPhong;
    }
    public void setSoPhong(int soPhong){
        if (soPhong > 0) {
            this.soPhong = soPhong;
            System.out.println("So phong da duoc cap nhap thanh: " + soPhong );
        } 
        else {
            System.out.println("So phong khong hop le.Vui long nhap gia tri lon hon 0");
        }
    }
    //get and set loai phong
    public int getLoaiPhong(){
        return loaiPhong;
    }
    public void setLoaiPhong(int loaiPhong){
       this.loaiPhong=loaiPhong;
    }
    //get and set trang thai phong
    public boolean gettrangthaiPhong(){
            return isCoPhong;
    }
    public void settrangthaiPhong(boolean isCoPhong){
        this.isCoPhong = isCoPhong;
    }

    //Phương thức nhập thông tin phòng
    @Override 
    public void nhapThongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten phong:");
        ten= scanner.nextLine();
        System.out.println("Nhap ma phong:");
        maSo = scanner.nextInt();
        System.out.println("Nhap tinh trang phong: ");
        isCoPhong=scanner.nextBoolean();
        System.out.println("Nhap loai phong: ");
        loaiPhong=scanner.nextInt();
        System.out.println("Nhap so phong: ");
        soPhong=scanner.nextInt();
    }
    // Phương thức hiển thị thông tin phong
    @Override
    public void inThongtin(){
        System.out.println("Ten phong: "+super.getTen());
        System.out.println("Ma phong: "+super.getMa());
        System.out.println("So phong:"+soPhong);
        System.out.println("Trang thai phong:"+isCoPhong);
    }
}
