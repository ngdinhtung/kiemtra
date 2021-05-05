package kiemtra;
import java.util.Scanner;
public class NhaCungCapAb implements NhaCungCap {
	public String MaNCC;
	public String TenNCC;
	public String diachi;
	
	
	public void nhapThongTin() {
		System.out.println("Mã nhà cung cấp: ");
		Scanner sc= new Scanner(System.in);
		MaNCC= sc.nextLine();
		
		System.out.println("Tên nhà cung cấp: ");
		TenNCC= sc.nextLine();
		
		System.out.println("Địa chỉ nhà cung cấp: ");
		diachi= sc.nextLine();
		
	}
	
	public void xuatThongTin() {
		System.out.println("Mã nhà cung cấp: "+ MaNCC);
		System.out.println("Tên nhà cung cấp: "+ TenNCC);
		System.out.println("Địa chỉ nhà cung cấp: "+ diachi);
	}
	
	@Override
	public void NhapThongTin() {
		NhaCungCapAb NCC= new NhaCungCapAb();
		NCC.nhapThongTin();
		
	}
	@Override
	public void XuatThongTin() {
		NhaCungCapAb NCC= new NhaCungCapAb();
		NCC.xuatThongTin();
	}
}
