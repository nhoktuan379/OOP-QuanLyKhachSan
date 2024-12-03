package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class DSBooking implements GiaoDien{
    Booking[] dsBooking;
    static int n4;
    public DSBooking(){
        this.n4 = 0;
        dsBooking = new Booking[0];
    }
    @Override
    public void nhap() {
    //nhập n từ bàn phím ……, nhập n booking như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng booking: ");
        n4=sc.nextInt();
        dsBooking = new Booking[n4];
        for (int i=0;i<n4;i++) {
                dsBooking[i]=new Booking();
                dsBooking[i].NhapBooking();
        }
    }
    @Override
    public void xuat() {
        if(DSBooking.n4==0)
        {
            System.out.println("Danh sach booking rong.Hay nhap du lieu vao");
        }
        else
        {
            for (int i=0;i<n4;i++) 
            {
                dsBooking[i].InBooking();
            }
        }
    } 
    public void bookPhong()
    {
        bookPhong();
    }
    @Override
    public void them(){
        if(DSBooking.n4==0)
        {
            System.out.println("Danh sach booking rong.Hay nhap du lieu vao");
        }
        else 
        {
            dsBooking = Arrays.copyOf(dsBooking, n4+1);
            dsBooking[n4]=new Booking();
            dsBooking[n4].NhapBooking();
            n4++;
        }
    }
    @Override
    public void sua(int maBooking)
    {
        if(DSBooking.n4==0)
        {
            System.out.println("Danh sach booking rong.Hay nhap du lieu vao");
        }
        else 
        {
            System.out.println("Cac thong tin:");
            System.out.println("1.Ngay dat va ngay tra phong");
            System.out.println("2.Ten khach hang");
            System.out.println("3.Ma Booking");
            System.out.println("4.Loai phong");
            System.out.println("Nhap vi tri can sua: ");
            Scanner sc = new Scanner(System.in);
            int vitri = sc.nextInt();
            for(int i=0;i<DSBooking.n4;i++)
            {
                if(dsBooking[i].getMaBooking()==maBooking)
                {
                    Scanner reader= new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.println("Nhap ngay dat moi:");
                            dsBooking[i].setNgaydat(reader.nextLine());
                            System.out.println("Nhap ngay tra phong moi:");
                            dsBooking[i].setNgaytra(reader.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap ten khach hang moi:");
                            dsBooking[i].setTenkhachhang(reader.nextLine());
                            break;
                        case 3:
                            System.out.println("Nhap ma booking moi:");
                            dsBooking[i].setMaBooking(reader.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap loai phong moi:");
                            dsBooking[i].setLoaiphong(reader.nextInt());
                            break;
                    }
                }
            }

        }
    }
    @Override
    public void xoa (int ma) {
        if(DSBooking.n4==0)
        {
            System.out.println("Danh sach booking rong.Hay nhap du lieu vao");
        }
        else
        {
            for(int i = 0; i < n4; i++)
            {
                if(dsBooking[i].getMaBooking() == ma)
                {
                    for(int j = i; j < n4-1; j++){
                    dsBooking[j] = dsBooking[j+1];
                    }
                    dsBooking = Arrays.copyOf(dsBooking, n4-1);
                    n4--;
                    break;
                }
            }
        }
        
    }
    @Override
    public void timkiem (int ma){
        if(DSBooking.n4==0)
        {
            System.out.println("Danh sach booking rong.Hay nhap du lieu vao");
        }
        else
        {
            for(int i = 0; i < n4; i++)
            {
                if(dsBooking[i].getMaBooking() ==ma)
                {
                    System.out.println("Phòng bạn tìm kiếm có trong danh sách");
                }
            }
        }
    }
    @Override
    public void ReadFile() {
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocBooking.txt"))) {
            String line;
            n4 = 0;
            while ((line = input.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    n4++;
                }
            }
    
            // Khởi tạo mảng dsBooking
            dsBooking = new Booking[n4];
            input.close();
    
            BufferedReader inputAgain = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocBooking.txt"));
            int i = 0;
            while ((line = inputAgain.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] arr = line.split(",");
                    if (arr.length == 5) {
                        dsBooking[i] = new Booking();
                        dsBooking[i].setTenkhachhang(arr[0]);
                        dsBooking[i].setNgaydat(arr[1]);
                        dsBooking[i].setNgaytra(arr[2]);
                        dsBooking[i].setMaBooking(Integer.parseInt(arr[3]));
                        dsBooking[i].setLoaiphong(Integer.parseInt(arr[4]));
                        i++;
                    }
                }
            }
            inputAgain.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\duong\\Downloads\\GhiBooking.txt");
            for (int i = 0; i < dsBooking.length; i++)
            {
                fw.write("Thông tin Booking của khách hàng "+i+"\n");
                fw.write ("Tên khách hàng:"+dsBooking[i].getTenkhachhang()+"\n");
                fw.write ("Ngày đặt phòng:"+dsBooking[i].getNgaydat()+"\n");
                fw.write ("Ngày trả phòng:"+dsBooking[i].getNgaytra()+"\n");
                fw.write ("Mã Booking:"+dsBooking[i].getMaBooking()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }
}
