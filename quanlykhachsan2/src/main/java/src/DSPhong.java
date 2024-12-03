package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
public class DSPhong implements GiaoDien {
    static int n1; // Số phòng có tồn tại trong danh sách
    static Phong [] dsPhong;
    public DSPhong() {
        this.n1 = 0;
        dsPhong = new Phong[0];
    }
    @Override
    public void nhap(){
        System.out.println("Nhap so luong phong muon nhap trong danh sach:");
        Scanner sc=new Scanner(System.in);
        n1 = sc.nextInt();
        dsPhong=new Phong[n1];
        int loaiphong;
        for(int i=0;i<n1;i++)
        {
            System.out.println("Hay nhap phong thu "+(i+1));
            System.out.println("Chọn loại phòng:");
            loaiphong=sc.nextInt();
            switch(loaiphong)
            {
                case 1:
                    dsPhong[i]=new PhongDon();
                    break;
                case 2:
                    dsPhong[i]=new PhongDoi();
                    break;
                case 3:
                    dsPhong[i]=new PhongVip();
                    break;
                default:
                    System.out.println("Chọn không hợp lệ");
            }
            dsPhong[i].nhapThongtin();
        }
    }
    @Override
    public void xuat(){
        if(DSPhong.n1==0)
        {
            System.out.println("Danh sach phong rong.Hay nhap du lieu");
        }
        else
        {
            for(int i=0;i<n1;i++)
            {   
                System.out.println("Thong tin phong thu "+(i+1));
                dsPhong[i].inThongtin();
            }
        }
    }
    @Override
    public void them(){
        if(DSPhong.n1==0)
        {
            System.out.println("Danh sach phong rong.Hay nhap du lieu");
        }
        else 
        {
            dsPhong=Arrays.copyOf(dsPhong,n1+1);
            System.out.println("Chọn loại phòng:");
            int loaiphong;
            Scanner sc=new Scanner(System.in);
            loaiphong=sc.nextInt();
            switch(loaiphong)
            {
                case 1:
                    dsPhong[n1]=new PhongDon();
                    break;
                case 2:
                    dsPhong[n1]=new PhongDoi();
                    break;
                case 3:
                    dsPhong[n1]=new PhongVip();
                    break;
                default:
                    System.out.println("Chọn không hợp lệ");
            }
            System.out.println("Thong tin hien tai cua phong vua moi them");
            dsPhong[n1].inThongtin();
            System.out.println("Nhap thong tin moi cho phong moi them");
            dsPhong[n1].nhapThongtin();
            n1++;
        }
    }
    @Override
    public void sua(int ma)
    {
        if(DSPhong.n1==0)
        {
            System.out.println("Danh sach phong rong.Hay nhap du lieu");
        }
        else 
        {
            for(int i=0;i<DSPhong.n1;i++)
            {
                if(DSPhong.dsPhong[i].getMa()==ma && DSPhong.dsPhong[i].getLoaiPhong()==1)
                {
                    
                    System.out.println("Các thông tin:");
                    System.out.println("1. Ten phong");
                    System.out.println("2. Ma phong");
                    System.out.println("3. So phong");
                    System.out.println("4. Loai phong");
                    System.out.println("5. Trang thai");
                    System.out.println("6. Dien tich");
                    System.out.println("7. Quay ve menu chinh");
                    System.out.print("Nhập vị trí cần sửa: ");
                    Scanner sc = new Scanner(System.in);
                    int vitri = sc.nextInt();
                    Scanner reader = new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.println("Nhap ten phong moi: ");
                            dsPhong[i].setTen(reader.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap ma phong moi:");
                            dsPhong[i].setMa(reader.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap so phong moi:");
                            dsPhong[i].setSoPhong(reader.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap loai phong moi:");
                            dsPhong[i].setLoaiPhong(reader.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap trang thai phong moi:");
                            dsPhong[i].settrangthaiPhong(reader.nextBoolean());
                            break;
                        case 6:
                            if(dsPhong[i] instanceof PhongDon)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Nhap dien tich phong moi:");
                                PhongDon m=(PhongDon) dsPhong[i];
                                m.setDienTich(sc.nextDouble());
                            }
                            break;
                        case 7:
                            break;
                        default:
                            break;
                    }    
                }
                else if(DSPhong.dsPhong[i].getMa()==ma && DSPhong.dsPhong[i].getLoaiPhong()==2)
                {
                    System.out.println("1. Ma phong");
                    System.out.println("2. Ten phong");
                    System.out.println("3. So phong");
                    System.out.println("4. Loai phong");
                    System.out.println("5. Trang thai phong");
                    System.out.println("6. Dien tich");
                    System.out.println("7. Co giuong doi");
                    System.out.println("8. Quay ve menu chinh");
                    Scanner sc = new Scanner(System.in);
                    int vitri = sc.nextInt();
                    Scanner reader = new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.println("Nhap ten phong moi: ");
                            dsPhong[i].setTen(reader.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap ma phong moi:");
                            dsPhong[i].setMa(reader.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap so phong moi:");
                            dsPhong[i].setSoPhong(reader.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap loai phong moi:");
                            dsPhong[i].setLoaiPhong(reader.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap trang thai phong moi:");
                            dsPhong[i].settrangthaiPhong(reader.nextBoolean());
                            break;
                        case 6:
                            if(dsPhong[i] instanceof PhongDon)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Nhap dien tich phong moi:");
                                PhongDon m=(PhongDon) dsPhong[i];
                                m.setDienTich(sc.nextDouble());
                            }
                            break;
                        case 7:
                            if(dsPhong[i] instanceof PhongDoi)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Nhap xac nhan co giuong doi moi:");
                                PhongDoi m=(PhongDoi) dsPhong[i];
                                m.setIsGiuongDoi(reader.nextBoolean());
                            }
                            break;
                        case 8:
                            break;
                        default:
                            break;
                    }
                }
                else if(DSPhong.dsPhong[i].getMa()==ma && DSPhong.dsPhong[i].getLoaiPhong()==3)
                {
                    System.out.println("1. Ma phong");
                    System.out.println("2. Ten phong");
                    System.out.println("3. So phong");
                    System.out.println("4. Loai phong");
                    System.out.println("5. Trang thai phong");
                    System.out.println("6. Dien tich");
                    System.out.println("7. Xac nhan nguoi phuc vu rieng");
                    System.out.println("8. Xac nhan ho boi rieng");
                    System.out.println("9. Xac nhan view bien");
                    System.out.println("10. Quay ve menu chinh");
                    Scanner sc = new Scanner(System.in);
                    int vitri = sc.nextInt();
                    Scanner reader = new Scanner(System.in);
                    switch(vitri)
                    {
                        case 1:
                            System.out.println("Nhap ten phong moi: ");
                            dsPhong[i].setTen(reader.nextLine());
                            break;
                        case 2:
                            System.out.println("Nhap ma phong moi:");
                            dsPhong[i].setMa(reader.nextInt());
                            break;
                        case 3:
                            System.out.println("Nhap so phong moi:");
                            dsPhong[i].setSoPhong(reader.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap loai phong moi:");
                            dsPhong[i].setLoaiPhong(reader.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap trang thai phong moi:");
                            dsPhong[i].settrangthaiPhong(reader.nextBoolean());
                            break;
                        case 6:
                            if(dsPhong[i] instanceof PhongVip)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Nhap dien tich phong moi:");
                                PhongVip m=(PhongVip) dsPhong[i];
                                m.setDientich(sc.nextDouble());
                            }
                            break;
                        case 7:
                            if(dsPhong[i] instanceof PhongVip)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                PhongVip m=(PhongVip) dsPhong[i];
                                System.out.println("Nhap xac nhan nguoi phuc vu rieng moi:");
                                m.setNguoiPhucvurieng(sc1.nextBoolean());
                            }
                            break;
                        case 8:
                            if(dsPhong[i] instanceof PhongVip)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                PhongVip m=(PhongVip) dsPhong[i];
                                System.out.println("Nhap xac nhan ho boi rieng moi");
                                m.setHoboirieng(sc1.nextBoolean());
                            }
                        case 9:
                            if(dsPhong[i] instanceof PhongVip)
                            {
                                Scanner sc1 = new Scanner(System.in);
                                PhongVip m=(PhongVip) dsPhong[i];
                                System.out.println("Nhap xac nhan view bien moi:");
                                m.setViewBien(sc1.nextBoolean());
                            }
                        case 10:
                            break;
                        default:
                            break;    
                    }
                }
                    
            }
        }
    }
    @Override
    public void xoa (int ma) {
        if(DSPhong.n1==0)
        {
            System.out.println("Danh sach phong rong.Hay nhap du lieu");
        }
        else
        {
            for (int i = 0; i < n1; i++) {
                if (dsPhong[i] != null && dsPhong[i].getMa() == ma) {
                    // Dịch chuyển các phần tử sau phần tử cần xóa lên trước
                    for (int j = i; j < n1 - 1; j++) {
                        dsPhong[j] = dsPhong[j + 1];
                    }
                    // Giảm kích thước mảng và giảm giá trị n
                    dsPhong = Arrays.copyOf(dsPhong, n1 - 1);
                    n1--;
                    break;  // Thoát khỏi vòng lặp khi đã xóa xong
                }
            } 
        } 
    }
    @Override
    public void timkiem (int ma){
        if(DSPhong.n1==0)
        {
            System.out.println("Danh sach phong rong.Hay nhap du lieu");
        }
        else
        {
            for(int i = 0; i < n1; i++)
            {
                if(dsPhong[i].getMa()==ma)
                {
                    System.out.println("Phòng bạn tìm kiếm có trong danh sách");
                }
            }
        }
    }
    @Override
    public void ReadFile() {
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocPhong.txt"));
            String line;
            n1 = 0;
            // Đếm số phòng
            while ((line = input.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    n1++;
                }
            }
    
            // Khởi tạo mảng dsPhong với số phòng (n1)
            dsPhong = new Phong[n1];
            input.close();
    
            // Đọc lại tệp để xử lý dữ liệu
            BufferedReader inputAgain = new BufferedReader(new FileReader("C:\\Users\\duong\\Downloads\\DocPhong.txt"));
            int i = 0;
            while ((line = inputAgain.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] arr = line.split(",");
                    int temp = Integer.parseInt(arr[0]);
    
                    if (temp == 1) {
                        dsPhong[i] = new PhongDon();
                        dsPhong[i].setTen(arr[1]);
                        dsPhong[i].setMa(Integer.parseInt(arr[2]));
                        dsPhong[i].setLoaiPhong(temp);
                        dsPhong[i].setSoPhong(n1);
                        dsPhong[i].settrangthaiPhong(Boolean.parseBoolean(arr[3]));
    
                        if (dsPhong[i] instanceof PhongDon) {
                            PhongDon phongDon = (PhongDon) dsPhong[i];
                            phongDon.setDienTich(Double.parseDouble(arr[4]));
                        }
                    } else if (temp == 2) {
                        dsPhong[i] = new PhongDoi();
                        dsPhong[i].setTen(arr[1]);
                        dsPhong[i].setMa(Integer.parseInt(arr[2]));
                        dsPhong[i].setLoaiPhong(temp);
                        dsPhong[i].setSoPhong(n1);
                        dsPhong[i].settrangthaiPhong(Boolean.parseBoolean(arr[3]));
    
                        if (dsPhong[i] instanceof PhongDoi) {
                            PhongDoi phongDoi = (PhongDoi) dsPhong[i];
                            phongDoi.setDienTich(Double.parseDouble(arr[4]));
                            phongDoi.setIsGiuongDoi(Boolean.parseBoolean(arr[5]));
                        }
                    } else if (temp == 3) {
                        dsPhong[i] = new PhongVip();
                        dsPhong[i].setTen(arr[1]);
                        dsPhong[i].setMa(Integer.parseInt(arr[2]));
                        dsPhong[i].setLoaiPhong(temp);
                        dsPhong[i].setSoPhong(n1);
                        dsPhong[i].settrangthaiPhong(Boolean.parseBoolean(arr[3]));
    
                        if (dsPhong[i] instanceof PhongVip) {
                            PhongVip phongVip = (PhongVip) dsPhong[i];
                            phongVip.setDientich(Double.parseDouble(arr[4]));
                            phongVip.setNguoiPhucvurieng(Boolean.parseBoolean(arr[5]));
                            phongVip.setHoboirieng(Boolean.parseBoolean(arr[6]));
                            phongVip.setViewBien(Boolean.parseBoolean(arr[7]));
                        }
                    }
                    i++;
                }
            }
            inputAgain.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\duong\\Downloads\\GhiPhong.txt");
            for (int i = 0; i < dsPhong.length; i++)
            {
                fw.write ("Thông tin của phòng: "+i+"\n");
                fw.write ("Tên phong:"+dsPhong[i].getTen()+"\n");
                fw.write ("Mã phong:"+dsPhong[i].getMa()+"\n");
                if(dsPhong[i].getLoaiPhong()==1)
                    fw.write("Gia phong (Phong don):"+PhongDon.getGiaPhongdon());
                else if(dsPhong[i].getLoaiPhong()==2)
                    fw.write("Gia phong (Phong doi):"+PhongDoi.getGiaPhongdoi());
                else if(dsPhong[i].getLoaiPhong()==3)
                    fw.write("Gia phong (Phong vip):"+PhongVip.getGiaPhongVip());
                fw.write ("Trang thai phong:"+dsPhong[i].gettrangthaiPhong()+"\n");
                fw.write ("So phong:"+dsPhong[i].getsoPhong()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }

}

