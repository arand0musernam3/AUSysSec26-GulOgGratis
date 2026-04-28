package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12051e;

    public y0(byte[] bArr, int i11) {
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            i4.a.f(r8.k.k("Array range is invalid. Buffer.length=", length, i11, ", offset=0, length="));
            throw null;
        }
        this.f12049c = bArr;
        this.f12051e = 0;
        this.f12050d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void c(int i11, int i12, byte[] bArr) throws zzacy {
        w(i11, i12, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void d(int i11, int i12) throws zzacy {
        r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void e(int i11, int i12) throws zzacy {
        r(i11 << 3);
        q(i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void f(int i11, int i12) throws zzacy {
        r(i11 << 3);
        r(i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void g(int i11, int i12) throws zzacy {
        r((i11 << 3) | 5);
        s(i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void h(int i11, long j9) throws zzacy {
        r(i11 << 3);
        t(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void i(int i11, long j9) throws zzacy {
        r((i11 << 3) | 1);
        u(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void j(int i11, boolean z11) throws zzacy {
        r(i11 << 3);
        p(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void k(int i11, String str) throws zzacy {
        r((i11 << 3) | 2);
        v(str);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void l(int i11, u0 u0Var) throws zzacy {
        r((i11 << 3) | 2);
        m(u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void m(u0 u0Var) throws zzacy {
        r(u0Var.c());
        u0Var.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void n(int i11, byte[] bArr) throws zzacy {
        r(i11);
        w(0, i11, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void o(n0 n0Var) throws zzacy {
        k1 k1Var = (k1) n0Var;
        r(k1Var.m());
        k1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void p(byte b8) throws zzacy {
        int i11 = this.f12051e;
        try {
            int i12 = i11 + 1;
            try {
                this.f12049c[i11] = b8;
                this.f12051e = i12;
            } catch (IndexOutOfBoundsException e5) {
                e = e5;
                i11 = i12;
                throw new zzacy(i11, this.f12050d, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void q(int i11) throws zzacy {
        if (i11 >= 0) {
            r(i11);
        } else {
            t(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void r(int i11) throws zzacy {
        int i12;
        int i13 = this.f12051e;
        while (true) {
            int i14 = i11 & (-128);
            byte[] bArr = this.f12049c;
            if (i14 == 0) {
                i12 = i13 + 1;
                bArr[i13] = (byte) i11;
                this.f12051e = i12;
                return;
            } else {
                i12 = i13 + 1;
                try {
                    bArr[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e5) {
                    throw new zzacy(i12, this.f12050d, 1, e5);
                }
            }
            throw new zzacy(i12, this.f12050d, 1, e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void s(int i11) throws zzacy {
        int i12 = this.f12051e;
        try {
            byte[] bArr = this.f12049c;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.f12051e = i12 + 4;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacy(i12, this.f12050d, 4, e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void t(long j9) throws zzacy {
        int i11;
        int i12 = this.f12051e;
        byte[] bArr = this.f12049c;
        int i13 = this.f12050d;
        if (!b1.f11268b || i13 - i12 < 10) {
            while ((j9 & (-128)) != 0) {
                int i14 = i12 + 1;
                try {
                    bArr[i12] = (byte) (((int) j9) | 128);
                    j9 >>>= 7;
                    i12 = i14;
                } catch (IndexOutOfBoundsException e5) {
                    e = e5;
                    i11 = i14;
                    throw new zzacy(i11, i13, 1, e);
                }
            }
            i11 = i12 + 1;
            try {
                bArr[i12] = (byte) j9;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new zzacy(i11, i13, 1, e);
            }
        } else {
            while ((j9 & (-128)) != 0) {
                w2.k(bArr, (byte) (((int) j9) | 128), i12);
                j9 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            w2.k(bArr, (byte) j9, i12);
        }
        this.f12051e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void u(long j9) throws zzacy {
        int i11 = this.f12051e;
        try {
            byte[] bArr = this.f12049c;
            bArr[i11] = (byte) j9;
            bArr[i11 + 1] = (byte) (j9 >> 8);
            bArr[i11 + 2] = (byte) (j9 >> 16);
            bArr[i11 + 3] = (byte) (j9 >> 24);
            bArr[i11 + 4] = (byte) (j9 >> 32);
            bArr[i11 + 5] = (byte) (j9 >> 40);
            bArr[i11 + 6] = (byte) (j9 >> 48);
            bArr[i11 + 7] = (byte) (j9 >> 56);
            this.f12051e = i11 + 8;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacy(i11, this.f12050d, 8, e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void v(String str) throws zzacy {
        int i11 = this.f12051e;
        try {
            int iA = b1.a(str.length() * 3);
            int iA2 = b1.a(str.length());
            byte[] bArr = this.f12049c;
            if (iA2 != iA) {
                r(y2.b(str));
                int i12 = this.f12051e;
                this.f12051e = y2.c(str, bArr, i12, bArr.length - i12);
            } else {
                int i13 = i11 + iA2;
                this.f12051e = i13;
                int iC = y2.c(str, bArr, i13, bArr.length - i13);
                this.f12051e = i11;
                r((iC - i11) - iA2);
                this.f12051e = iC;
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacy(e5);
        }
    }

    public final void w(int i11, int i12, byte[] bArr) throws zzacy {
        try {
            System.arraycopy(bArr, i11, this.f12049c, this.f12051e, i12);
            this.f12051e += i12;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacy(this.f12051e, this.f12050d, i12, e5);
        }
    }

    public final int x() {
        return this.f12050d - this.f12051e;
    }
}
