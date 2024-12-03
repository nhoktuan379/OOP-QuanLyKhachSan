package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class DSKhachHang implements GiaoDien{
   static int n;
   KhachHang []dsKhachhang;
   public DSKhachHang() {
    n=0;
    dsKhachhang = new KhachHang[0];
   }
   @Override
   public void nhap() {
    //nhập n từ bàn phím ……, nhập n dsKhachhang như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng khách hàng: ");
        n=sc.nextInt();
        dsKhachhang = new KhachHang[n];
        for (int i=0;i<n;i++) {
                System.out.println("Nhap thong tin khach hang thu"+(i+1));
                dsKhachhang[i]=new KhachHang();
                dsKhachhang[i].nhapThongtin();
        }
    }
    @Override
    public void xuat() {
        if(DSKhachHang.n==0)
        {
            System.out.println("Danh sach khach hang dang rong.Hay nhap du lieu vao");
        }
        else
        {
            for (int i=0;i<n;i++) {
                System.out.println("Thong tin khach hang thu "+(i+1));  
                dsKhachhang[i].inThongtin();
                }
        }
    }   
    @Override
    public void them(){
        if(DSKhachHang.n==0)
        {
            System.out.println("Danh sach khach hang dang rong.Hay nhap du lieu vao");
        }
        else
        {
            dsKhachhang = Arrays.copyOf(dsKhachhang, n+1);
            dsKhachhang[n]=new KhachHang();
            dsKhachhang[n].nhapThongtin();
            System.out.println("Thong tin phong ban vua moi nhap:");
            dsKhachhang[n].inThongtin();
            n++;
        }
    }
    @Override
    public void sua(int ma)
    {
        if(DSKhachHang.n==0)
        {
            System.out.println("Danh sach dsKhachhang rong.Hay nhap du lieu vao");
        }
        else 
        {
            System.out.println("Cac thong tin:");
            System.out.println("1.Ten khach hang");
            System.out.println("2.Ma khach hang");
            System.out.println("3.Dia chi khach hang");
            System.out.println("4.So dien thoai");
            System.out.println("5.Email");
            System.out.println("Nhap vi tri can sua: ");
            Scanner sc = new Scanner(System.in);
            int vitri = sc.nextInt();
            for(int i=0;i<DSKhachHang.n;i++)
            {
                if(dsKhachhang[i].getMa()==ma)
                {
                    Scanner reader= new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.println("Nhap ten khach hang moi:");
                            dsKhachhang[i].setTen(reader.nextLine());
                        case 2:
                            System.out.println("Nhap ma khach hang moi:");
                            dsKhachhang[i].setMa(reader.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap dia chi khach hang moi:");
                            dsKhachhang[i].setDiachi(reader.nextLine());
                            break;
                        case 4:
                            System.out.println("Nhap so dien thoai moi:");
                            dsKhachhang[i].setSdt(reader.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap email moi:");
                            dsKhachhang[i].setEmail(reader.nextLine());
                            break;
                    }
                }
            }

        }
    }
    @Override
    public void xoa (int ma) {
        if(DSKhachHang.n==0)
        {
            System.out.println("Danh sach khach hang dang rong.Hay nhap du lieu vao");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(dsKhachhang[i].getMa()==ma)
                {
                    for(int j = i; j < n-1; j++){
                    dsKhachhang[j] = dsKhachhang[j+1];
                    }
                    dsKhachhang = Arrays.copyOf(dsKhachhang, n-1);
                    n--;
                    break;
                }
            }
        }
    }
    @Override
    public void timkiem (int ma){
        if(DSKhachHang.n==0)
        {
            System.out.println("Danh sach khach hang rong.Hay nhap du lieu");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(dsKhachhang[i].getMa()==ma)
                {
                    System.out.println("Phòng bạn tìm kiếm có trong danh sách");
                }
            }
        }     
    }
    @Override
    public void ReadFile() {
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocKhachHang.txt"))) {
            String line;
            int tempN = 0; // Biến tạm để đếm số lượng khách hàng
    
            // Đếm số khách hàng trong file
            while ((line = input.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    tempN++;
                }
            }
    
            // Cập nhật số lượng khách hàng
            n = tempN;
            dsKhachhang = new KhachHang[n]; // Cập nhật lại mảng khách hàng với đúng kích thước
    
            input.close(); // Đóng reader sau khi đếm số khách hàng
    
            // Đọc lại tệp để xử lý dữ liệu khách hàng
            BufferedReader inputAgain = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocKhachHang.txt"));
            int i = 0;
            while ((line = inputAgain.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] arr = line.split(",");
                    if (arr.length == 6) { // Giả sử mỗi khách hàng có 6 thông tin
                        KhachHang kh = new KhachHang();
                        kh.setTen(arr[0].trim());
                        kh.setMa(Integer.parseInt(arr[1].trim())); // Giả sử ma là một số nguyên
                        kh.setDiachi(arr[2].trim());
                        kh.setSdt(Integer.parseInt(arr[3].trim()));
                        kh.setEmail(arr[4].trim());
                        kh.setCmnd(Integer.parseInt(arr[5].trim())); // Thêm trường CMND, giả sử có trong file
                        dsKhachhang[i] = kh;
                        i++;
                    } else {
                        System.out.println("Dữ liệu khách hàng không hợp lệ tại dòng " + (i + 1));
                    }
                }
            }
            inputAgain.close();
    
            // In ra thông tin khách hàng để kiểm tra
            for (KhachHang kh : dsKhachhang) {
                System.out.println(kh);
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();  // In ra chi tiết lỗi nếu có
        }
    }
    
    
    @Override
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\duong\\Downloads\\GhiKhachHang.txt");
            for (int i = 0; i < dsKhachhang.length; i++)
            {
                fw.write ("Thông tin của khách hàng "+i+"\n");
                fw.write ("Tên khách hàng:"+dsKhachhang[i].getTen()+"\n");
                fw.write ("Mã khách hàng:"+dsKhachhang[i].getMa()+"\n");
                fw.write ("Cmnd:"+dsKhachhang[i].getCmnd());
                fw.write ("Ngay sinh:"+dsKhachhang[i].getNgaySinh());
                fw.write ("Gioi tinh:"+dsKhachhang[i].getGioitinh());
                fw.write ("Địa chỉ:"+dsKhachhang[i].getDiachi()+"\n");
                fw.write ("Số điện thoại:"+dsKhachhang[i].getSdt()+"\n");
                fw.write ("Email:"+dsKhachhang[i].getEmail()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }
   
}
