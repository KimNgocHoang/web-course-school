package Model.BEAN;

public class KhachHang {
	private String makh;
	private String hotenkh;
	private String sodienthoai;
	private String diachikh;
	private String ngaysinh;
	private String gioitinh;
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHotenkh() {
		return hotenkh;
	}
	public void setHotenkh(String hotenkh) {
		this.hotenkh = hotenkh;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getDiachikh() {
		return diachikh;
	}
	public void setDiachikh(String diachikh) {
		this.diachikh = diachikh;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public KhachHang(String makh, String hotenkh, String sodienthoai, String diachikh, String ngaysinh,
			String gioitinh) {
		//super();
		this.makh = makh;
		this.hotenkh = hotenkh;
		this.sodienthoai = sodienthoai;
		this.diachikh = diachikh;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
	}
	public KhachHang() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
