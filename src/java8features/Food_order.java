package java8features;

public class Food_order {
	private String fid;
	private String fname;
	private String fprice;
	public Food_order(String fid, String fname, String fprice) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}
	/**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @return the fprice
	 */
	public String getFprice() {
		return fprice;
	}
	/**
	 * @param fid the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @param fprice the fprice to set
	 */
	public void setFprice(String fprice) {
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "Food_order [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + "]";
	}
	
	

}
