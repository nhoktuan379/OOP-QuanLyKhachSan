package src;

import java.util.Scanner;

class QuanLyDSBooking {
    DSBooking ds1 = new DSBooking();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Xem danh sach booking");
        System.out.println("2.Nhap danh sach booking");
        System.out.println("3.Book phong");
        System.out.println("4.Them moi booking");
        System.out.println("5.Xoa booking");
        System.out.println("6.Sua booking");
        System.out.println("7.Tim kiem booking");
        System.out.println("8.Quay lai menu chinh");
        System.out.println("9.Doc file");
        System.out.println("10.Ghi file");
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
                ds1.bookPhong();
                break;
            case 4:
                ds1.them();
            case 5:
                System.out.println("Nhap ma cua booking muon xoa");
                int ma = sc.nextInt();
                ds1.xoa(ma);
                break;
            case 6:
                System.out.println("Nhap ma cua booking muon sua");
                ma = sc.nextInt();
                ds1.sua(ma);
                break;
            case 7:
                System.out.println("Nhap ma cua booking muon tim kiem");
                ma = sc.nextInt();
                ds1.timkiem(ma);
                break;
            case 8:
                break;
            case 9:
                ds1.ReadFile();
                break;
            case 10:
                ds1.WriteFile();
                break;
            default:
                System.out.println("Chon khong hop le");
                break;
        }
    }
}
