package kiemtra;
import java.util.Scanner;
public class PhieuNhap {
	public String MaPN; 
	public String ngayNhap;
	public String tenNV;
	
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Mã phiếu nhập: ");
		MaPN= sc.nextLine();
		
		System.out.println("Ngày nhập: ");
		ngayNhap= sc.nextLine();
		
		System.out.println("Tên Nhân Viên: ");
		tenNV= sc.nextLine();
		
	}
	public void xuatThongTin() {
		System.out.println("Mã phiếu nhập: " + MaPN);
		System.out.println("Ngày nhập: " + ngayNhap);
		System.out.println("Tên Nhân Viên: " + tenNV);
	}
}
