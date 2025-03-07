package Java_Lab;

import java.util.Scanner;
class PhanSo{
    int tu, mau;
    public PhanSo (int tu, int mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    private int UCLN ( int tu, int mau)
    {
        return mau==0? tu : UCLN(mau,tu%mau);
    }
    public PhanSo rutGon ()
    {
        int ucln = UCLN(tu,mau);
        tu /=ucln;
        mau/=ucln;
        return this;
    }
    public PhanSo Cong (PhanSo other)
    {
        int tu = this.tu*other.mau + other.tu*this.mau;
        int mau = this.mau*other.mau;
        return new PhanSo(tu, mau).rutGon();
    }
    public PhanSo Tru (PhanSo other)
    {
        int tu = this.tu*other.mau - other.tu*this.mau;
        int mau = this.mau*other.mau;
        return new PhanSo(tu, mau).rutGon();
    }
    public PhanSo Nhan (PhanSo other)
    {
        int tu = this.tu*other.tu;
        int mau = this.mau*other.mau;
        return new PhanSo(tu, mau).rutGon();
    }
    public PhanSo Chia (PhanSo other)
    {
        int tu = this.tu*other.mau ;
        int mau = this.mau*other.tu;
        return new PhanSo(tu, mau).rutGon();
    }

    @Override
    public String toString() 
    {
        if (tu == 0)
            return "0";
        if (mau < 0) {
            tu*=-1;
            mau*=-1;
        }   
        if (mau == 1) return tu + ""; // Nếu mẫu số là 1, chỉ in tử số
        return tu + "/" + mau; // In theo dạng "tử/mẫu"
    }


}

public class bt3 
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so cua phan so thu nhat: ");
        int tu = sc.nextInt();
        System.out.println("Nhap mau so cua phan so thu nhat: ");
        int mau = sc.nextInt();
        while (mau == 0) {
            System.out.println("Nhap lai mau so: ");
            mau = sc.nextInt();
        }
        PhanSo a = new PhanSo(tu,mau);
        System.out.println("Nhap tu so cua phan so thu hai: ");
        tu = sc.nextInt();
        System.out.println("Nhap mau so cua phan so thu hait: ");
        mau = sc.nextInt();
        while (mau == 0) {
            System.out.println("Nhap lai mau so: ");
            mau = sc.nextInt();
        }
        PhanSo b = new PhanSo(tu,mau);
        System.out.println("Tong cau hai phan so: "+ a.Cong(b));
        System.out.println("Hieu cau hai phan so: "+ a.Tru(b));
        System.out.println("Tich cau hai phan so: "+ a.Nhan(b));
        System.out.println("Thuong cau hai phan so: "+ a.Chia(b));
        sc.close();
    }
}
