/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CUONG GT
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    //Ham tao co doi
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException(
                "Mau so khong duoc bang 0"
            );
        }

        this.tuSo = tuSo;
        this.mauSo = mauSo;
        chuanHoa();
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException(
                "Mau so khong duoc bang 0"
            );
        }

        this.mauSo = mauSo;
        chuanHoa();
    }

    private void chuanHoa() {
        if (tuSo == 0) {
            mauSo = 1;
            return;
        }

        int uoc = ucln(tuSo, mauSo);
        tuSo /= uoc;
        mauSo /= uoc;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public void rutGon() {
        chuanHoa();
    }

    @Override
    public String toString() {
        if (mauSo == 1) {
            return String.valueOf(tuSo);
        }

        return tuSo + "/" + mauSo;
    }

    public PhanSo cong(PhanSo p) {
        return new PhanSo(
            tuSo * p.mauSo + p.tuSo * mauSo,
            mauSo * p.mauSo
        );
    }

    public PhanSo tru(PhanSo p) {
        return new PhanSo(
            tuSo * p.mauSo - p.tuSo * mauSo,
            mauSo * p.mauSo
        );
    }

    public PhanSo nhan(PhanSo p) {
        return new PhanSo(
            tuSo * p.tuSo,
            mauSo * p.mauSo
        );
    }

    public PhanSo chia(PhanSo p) {
        if (p.tuSo == 0) {
            throw new ArithmeticException(
                "Khong the chia cho 0"
            );
        }

        return new PhanSo(
            tuSo * p.mauSo,
            mauSo * p.tuSo
        );
    }

    public int soSanh(PhanSo p) {
        long a = (long) tuSo * p.mauSo;
        long b = (long) p.tuSo * mauSo;

        return Long.compare(a, b);
    }
}
