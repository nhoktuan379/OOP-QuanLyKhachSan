package src;

abstract class ThucThe {
    //Thuộc tính 
    String ten;
    int maSo;
    //Contractor
    public ThucThe() {
        this.ten = "";
        this.maSo = 0;
    }
    //Phương thức thường
    public String getTen() {
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public int getMa()
    {
        return maSo;
    }
    public void setMa(int maSo)
    {
        this.maSo=maSo;
    }
    //Phương thức trừu tượng
    public abstract void nhapThongtin();
    public abstract void inThongtin();
}
