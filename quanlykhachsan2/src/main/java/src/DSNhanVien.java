package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DSNhanVien implements GiaoDien {
    static int n; // Số lượng nhân viên có trong danh sach
    NhanVien [] dsNhanVien;
    public DSNhanVien() {
        n = 0;
        dsNhanVien = new NhanVien[0];
    }
    @Override
    public void nhap() {
    //nhập n từ bàn phím ……, nhập n NhanVien như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        n=sc.nextInt();
        dsNhanVien = new NhanVien[n];
        for (int i=0;i<n;i++) {
            System.out.println("Thong tin nhan vien thu "+(i+1)+": ");
            dsNhanVien[i]=new NhanVien();
            dsNhanVien[i].nhapThongtin();
        }
    }
    @Override
     public void xuat() {
        if(DSNhanVien.n==0)
        {
            System.out.println("Danh sach nhan vien rong.Hay nhap du lieu");
        }
        else
        {
            for (int i=0;i<n;i++) {
                dsNhanVien[i].inThongtin();
                }
        }
    } 
    @Override  
    public void them(){
        if(DSNhanVien.n==0)
        {
            System.out.println("Danh sach nhan vien rong.Hay nhap du lieu");
        }
        else
        {
            dsNhanVien = Arrays.copyOf(dsNhanVien, n+1);
            dsNhanVien[n]=new NhanVien();
            dsNhanVien[n].nhapThongtin();
            n++;
        }
    }
    @Override
    public void sua(int maNhanVien)
    {
        if(DSNhanVien.n == 0)
        {
            System.out.println("Danh sách nhân viên trống. Hãy nhập dữ liệu vào");
        }
        else 
        {
            System.out.println("Các thông tin:");
            System.out.println("1. Giới tính");
            System.out.println("2. CMND");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Số điện thoại");
            System.out.println("5. Địa chỉ");
            System.out.print("Nhập vị trí cần sửa: ");
            Scanner sc = new Scanner(System.in);
            int vitri = sc.nextInt();
            for(int i = 0; i < DSNhanVien.n; i++)
            {
                if(dsNhanVien[i].getCmnd() == maNhanVien)
                {
                    Scanner reader = new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.print("Nhập giới tính mới: ");
                            dsNhanVien[i].setGioitinh(reader.nextLine());
                            break;
                        case 2:
                            System.out.print("Nhập CMND mới: ");
                            dsNhanVien[i].setCmnd(reader.nextInt());
                            break;
                        case 3:
                            System.out.print("Nhập ngày sinh mới: ");
                            dsNhanVien[i].setNgaysinh(reader.nextLine());
                            break;
                        case 4:
                            System.out.print("Nhập số điện thoại mới: ");
                            dsNhanVien[i].setSoDienThoai(reader.nextInt());
                            break;
                        case 5:
                            System.out.print("Nhập địa chỉ mới: ");
                            dsNhanVien[i].setDiaChi(reader.nextLine());
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                }
            }
        }
    }

    @Override
    public void xoa (int ma) {
        if(DSNhanVien.n==0)
        {
            System.out.println("Danh sach nhan vien rong.Hay nhap du lieu");
        }
        else 
        {
            for(int i = 0; i < n; i++)
            {
                if(dsNhanVien[i].getMa() == ma)
                {
                    for(int j = i; j < n-1; j++){
                    dsNhanVien[j] = dsNhanVien[j+1];
                    }
                    dsNhanVien = Arrays.copyOf(dsNhanVien, n-1);
                    n--;
                    break;
                }
            }
        }
    }
    @Override
    public void timkiem (int ma){
        if(DSNhanVien.n==0)
        {
            System.out.println("Danh sach nhan vien rong.Hay nhap du lieu");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(dsNhanVien[i].getMa()==ma)
                {
                    System.out.println("Nhân viên bạn tìm kiếm có trong danh sách");
                }
            }
        }
    }
    @Override
    public void ReadFile() {
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocNhanVien.txt"))) {
            String line;
            n = 0;  // Đếm số nhân viên trong file
            while ((line = input.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    n++;
                }
            }
    
            // Cập nhật lại mảng dsNhanVien với số lượng nhân viên chính xác
            dsNhanVien = new NhanVien[n];
            input.close();
    
            // Đọc lại tệp để xử lý dữ liệu nhân viên
            BufferedReader inputAgain = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocNhanVien.txt"));
            int i = 0;
            while ((line = inputAgain.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] arr = line.split(",");
                    if (arr.length == 7) { // Giả sử mỗi nhân viên có 7 thông tin
                        NhanVien nv = new NhanVien();
                        nv.setTen(arr[0].trim());
                        nv.setMa(Integer.parseInt(arr[1].trim())); // Giả sử mã nhân viên là số nguyên
                        nv.setGioitinh(arr[2].trim());
                        nv.setCmnd(Integer.parseInt(arr[3].trim()));
                        nv.setNgaysinh(arr[4].trim());
                        nv.setSoDienThoai(Integer.parseInt(arr[5].trim()));
                        nv.setDiaChi(arr[6].trim());
                        dsNhanVien[i] = nv;
                        i++;
                    } else {
                        System.out.println("Dữ liệu nhân viên không hợp lệ tại dòng " + (i + 1));
                    }
                }
            }
            inputAgain.close();
    
            // In ra thông tin nhân viên để kiểm tra
            for (NhanVien nv : dsNhanVien) {
                System.out.println(nv);
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();  // In ra chi tiết lỗi nếu có
        }
    }
    
    @Override
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\duong\\Downloads\\GhiNhanVien.txt");
            for (int i = 0; i < dsNhanVien.length; i++)
            {
                fw.write ("Thông tin của khách hàng "+i+"\n");
                fw.write ("Tên nhân vien:"+dsNhanVien[i].getTen()+"\n");
                fw.write ("Mã nhan vien:"+dsNhanVien[i].getMa()+"\n");
                fw.write ("Địa chỉ:"+dsNhanVien[i].getDiaChi()+"\n");
                fw.write ("Số điện thoại:"+dsNhanVien[i].getGioitinh()+"\n");
                fw.write ("Email:"+dsNhanVien[i].getNgaysinh()+"\n");
                fw.write ("CMND:"+dsNhanVien[i].getCmnd()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }

}
