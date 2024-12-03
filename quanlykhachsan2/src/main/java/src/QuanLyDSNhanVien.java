package src;

import java.util.Scanner;

public class QuanLyDSNhanVien {
    DSNhanVien ds1 = new DSNhanVien();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Xem danh sach nhan vien");
        System.out.println("2.Nhap danh sach nhan vien");
        System.out.println("3.Them moi nhan vien");
        System.out.println("4.Xoa nhân viên");
        System.out.println("5.Sua nhân viên");
        System.out.println("6.Tim kiem nhân vien theo ma");
        System.out.println("7.Doc File");
        System.out.println("8.Ghi File");
        System.out.println("9.Quay ve menu chinh");
        System.out.println("Chon chuc nang: ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                ds1.xuat();
                break;
            case 2:
                ds1.nhap();
                break;
            case 3:
                ds1.them();
            case 4:
                System.out.println("Nhap ma cua nhan vien muon xoa");
                int ma = sc.nextInt();
                ds1.xoa(ma);
                break;
            case 5:
                System.out.println("Nhap ma cua nhan vien muon sua");
                ma = sc.nextInt();
                ds1.sua(ma);
                break;
            case 6:
                System.out.println("Nhap ma cua nhan vien muon tim kiem");
                ma = sc.nextInt();
                ds1.timkiem(ma);
                break;
            case 7:
                ds1.ReadFile();
                break;
            case 8:
                ds1.WriteFile();
                break;
            case 9:
                break;
            default:
                System.out.println("Chon khong hơp le, vui long chon lai");
                break;
        }
    }
}
