package src;

import java.util.Scanner;
class Booking {
    private String ngaydat;
    private String ngaytra;
    private String tenkhachhang;
    private int maBooking;
    private int loaiphong;

    public Booking() {
        this.ngaydat = "";
        this.ngaytra = "";
        this.tenkhachhang="";
        this.maBooking=0;
        this.loaiphong=0;
    }
    //get and set booking 
    public String getNgaydat() {
        return ngaydat;
    }
    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }
    public String getNgaytra() {
        return ngaytra;
    }
    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }
    public String getTenkhachhang()
    {
        return tenkhachhang;
    }
    public void setTenkhachhang(String tenkhachhang)
    {
        this.tenkhachhang = tenkhachhang;
    }
    public int getMaBooking()
    {
        return maBooking;
    }
    public void setMaBooking(int maBooking)
    {
        this.maBooking=maBooking;
    }
    public int getLoaiphong(){
        return loaiphong;
    }
    public void setLoaiphong(int loaiphong) {
        this.loaiphong = loaiphong;
    }
    public void NhapBooking()
    {
        Scanner sc=new Scanner(System.in);
        String input1;
        int input2;
        System.out.println("Nhập thông tin booking:");
        System.out.println("Nhập tên khách hàng:");
        input1=sc.nextLine();
        tenkhachhang=input1;
        System.out.println("Nhập ngày đặt:");
        input1=sc.nextLine();
        ngaydat=input1;
        System.out.println("Nhập ngày trả");
        input1=sc.nextLine();
        ngaytra=input1;
        System.out.println("Nhập loại phòng");
        input2=sc.nextInt();
        loaiphong=input2;
        System.out.println("Nhập mã Booking");
        input2=sc.nextInt();
        maBooking=input2;
    }
    public void InBooking() {
        System.out.println("Ngay Dat: " + ngaydat);
        System.out.println("Ngay Tra: " + ngaytra);
        System.out.println("Tên khách hàng: "+ tenkhachhang);
        System.out.println("Mã Booking: "+ maBooking);
        System.out.println("Loại phòng: "+ loaiphong);
    }
    public void bookPhong(){
        System.out.println("Nhập loại phòng muốn đặt:");
        System.out.println("1.Phòng đơn");
        System.out.println("2.Phòng đôi");
        System.out.println("3.Phong Vip");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        switch(input){
            case 1:
                loaiphong=1;
                break;
            case 2:
                loaiphong=2;
                break;
            case 3:
                loaiphong=3;
                break;
            default:
                System.out.println("Nhập không hợp lệ");
                break;
        }
        System.out.println("Nhập ngày đặt:");
        ngaydat=sc.nextLine();
        System.out.println("Nhập ngày trả:");
        ngaytra=sc.nextLine();
        System.out.println("Nhập tên khách hàng:");
        tenkhachhang=sc.nextLine();
        for(int i=0;i<DSPhong.n1;i++)
        {
            if(loaiphong==1 && DSPhong.dsPhong[i].gettrangthaiPhong()==true)
            {
                System.out.println("Dat phong thanh cong ");
                DSPhong.dsPhong[i].settrangthaiPhong(false);
                maBooking=DSPhong.dsPhong[i].getMa();
            }
            else if(loaiphong==2 && DSPhong.dsPhong[i].gettrangthaiPhong()==true)
            {
                System.out.println("Dat phong thanh cong");
                DSPhong.dsPhong[i].settrangthaiPhong(false);
                maBooking=DSPhong.dsPhong[i].getMa();
            }
            else if(loaiphong==3 && DSPhong.dsPhong[i].gettrangthaiPhong()==true)
            {
                System.out.println("Dat phong thanh cong");
                DSPhong.dsPhong[i].settrangthaiPhong(false);
                maBooking=DSPhong.dsPhong[i].getMa();
            }
            else 
                System.out.println("Dat phong khong thanh cong");
        }
        
    }
    
}
