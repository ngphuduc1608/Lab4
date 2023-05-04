
public class Test {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("Benh vien Phuong dong", "HA NOI", "DUC");
		BenhNhan bn = new BenhNhan("Nguyen Phu Duc",20 ,"Nam", "Khong", "Khong", bv);
		System.out.println(bn.toString());
	}
}
