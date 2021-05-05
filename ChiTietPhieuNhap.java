package kiemtra;

import java.util.Scanner;

public class ChiTietPhieuNhap extends PhieuNhap{
	public String MaSP;
	public String TenSp;
	public String SoLuong;
	public String HanSuDung;
	
	Scanner sc= new Scanner(System.in);
	
	public void nhapThongTin() {
		System.out.println("Nhap mã sp: ");
		MaSP= sc.nextLine();
		
		System.out.println("Nhap tên sp: ");
		TenSp= sc.nextLine();
		
		System.out.println("So Luong sp: ");
		SoLuong= sc.nextLine();
		
		System.out.println("Hạn sử dụng sp: ");
		HanSuDung= sc.nextLine();
	}
	
	public void xuatThongTin() {
		System.out.println("Mã sp: " + MaSP);
		System.out.println("Tên sp: " + TenSp);
		System.out.println("Số lượng sp: " + SoLuong);
		System.out.println("Hạn sử dụng sp: " + HanSuDung);
	}
	
}
