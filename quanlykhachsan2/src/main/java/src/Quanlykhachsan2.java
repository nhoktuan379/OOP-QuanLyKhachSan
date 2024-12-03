/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src;

/**
 *
 * @author duong
 */
import java.util.Scanner;

public class Quanlykhachsan2 {

    public static void main(String[] args) {
        QuanLyDSBooking ds1 = new QuanLyDSBooking();
        QuanLyDSKhachHang ds2 = new QuanLyDSKhachHang();
        QuanLyDSPhong ds3 = new QuanLyDSPhong();
        QuanLyDSNhanVien ds4 = new QuanLyDSNhanVien();

        Scanner sc = new Scanner(System.in);
        int chon, chon1, chon2, chon3;

        // Menu chính
        while (true) {
            System.out.println("Chon truy cap chuc nang duoi tu cach:");
            System.out.println("1. Quan tri vien");
            System.out.println("2. Nhan vien");
            System.out.println("3. Khach hang");
            System.out.println("4. Thoat chuong trinh");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("");
                    System.out.println("Chon menu chuc nang:");
                    System.out.println("1. Quan ly phong");
                    System.out.println("2. Quan ly nhan vien");
                    System.out.println("3. Quan ly khach hang");
                    System.out.println("4. Quan ly dat phong");
                    System.out.println("5. Quay lai");
                    chon1 = sc.nextInt();
                    switch (chon1) {
                        case 1:
                            System.out.println("");
                            ds3.menu();
                            break;
                        case 2:
                            System.out.println("");
                            ds4.menu();
                            break;
                        case 3:
                            System.out.println("");
                            ds2.menu();
                            break;
                        case 4:
                            System.out.println("");
                            ds1.menu();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("");
                            System.out.println("Chon khong hop le,vui long chon lai !");
                    }
                    continue;
                case 2:
                    System.out.println("");
                    System.out.println("Chon menu chuc nang:");
                    System.out.println("1. Quan ly nhan vien");
                    System.out.println("2. Quay lai");
                    chon2 = sc.nextInt();
                    switch (chon2) {
                        case 1:
                            System.out.println("");
                            ds4.menu();
                        case 2:
                            System.out.println("");
                            System.out.println("Chon khong hop le, vui long chon lai");
                    }
                    continue;
                case 3:
                    System.out.println("");
                    System.out.println("Chon menu chuc nang:");
                    System.out.println("1. Quan ly khach hang");
                    System.out.println("2. Quay lai");
                    chon3 = sc.nextInt();
                    switch (chon3) {
                        case 1:
                            System.out.println("");
                            ds2.menu();
                        case 2:
                            System.out.println("");
                            System.out.println("Chon khong hop le, vui long chon lai");
                    }
                    continue;
                case 4:
                    break;
                default:
                    System.out.println("");
                    System.out.println("Lua chon khong hop le, vui long chon lai ");
                    continue;
            }
            break;
        }
    }
}
