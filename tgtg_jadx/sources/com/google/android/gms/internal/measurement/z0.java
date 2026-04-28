package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OutputStream f12077f;

    public z0(OutputStream outputStream, int i11) {
        if (outputStream == null) {
            c50.w.l("out");
            throw null;
        }
        this.f12077f = outputStream;
        if (i11 < 0) {
            i4.a.f("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i11, 20)];
        this.f12074c = bArr;
        this.f12075d = bArr.length;
    }

    public final void A(int i11) {
        if (this.f12075d - this.f12076e < i11) {
            B();
        }
    }

    public final void B() {
        this.f12077f.write(this.f12074c, 0, this.f12076e);
        this.f12076e = 0;
    }

    public final void C(int i11) {
        boolean z11 = b1.f11268b;
        byte[] bArr = this.f12074c;
        if (z11) {
            while (true) {
                int i12 = i11 & (-128);
                int i13 = this.f12076e;
                if (i12 == 0) {
                    this.f12076e = i13 + 1;
                    w2.k(bArr, (byte) i11, i13);
                    return;
                } else {
                    this.f12076e = i13 + 1;
                    w2.k(bArr, (byte) (i11 | 128), i13);
                    i11 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i14 = i11 & (-128);
                int i15 = this.f12076e;
                if (i14 == 0) {
                    this.f12076e = i15 + 1;
                    bArr[i15] = (byte) i11;
                    return;
                } else {
                    this.f12076e = i15 + 1;
                    bArr[i15] = (byte) (i11 | 128);
                    i11 >>>= 7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void c(int i11, int i12, byte[] bArr) throws IOException {
        z(i11, i12, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void d(int i11, int i12) {
        r((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void e(int i11, int i12) {
        A(20);
        C(i11 << 3);
        if (i12 >= 0) {
            C(i12);
        } else {
            w(i12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void f(int i11, int i12) {
        A(20);
        C(i11 << 3);
        C(i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void g(int i11, int i12) {
        A(14);
        C((i11 << 3) | 5);
        x(i12);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void h(int i11, long j9) {
        A(20);
        C(i11 << 3);
        w(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void i(int i11, long j9) {
        A(18);
        C((i11 << 3) | 1);
        y(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void j(int i11, boolean z11) {
        A(11);
        C(i11 << 3);
        int i12 = this.f12076e;
        this.f12074c[i12] = z11 ? (byte) 1 : (byte) 0;
        this.f12076e = i12 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void k(int i11, String str) throws IOException {
        r((i11 << 3) | 2);
        v(str);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void l(int i11, u0 u0Var) {
        r((i11 << 3) | 2);
        m(u0Var);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void m(u0 u0Var) {
        r(u0Var.c());
        u0Var.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void n(int i11, byte[] bArr) throws IOException {
        r(i11);
        z(0, i11, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void o(n0 n0Var) {
        k1 k1Var = (k1) n0Var;
        r(k1Var.m());
        k1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void p(byte b8) {
        if (this.f12076e == this.f12075d) {
            B();
        }
        int i11 = this.f12076e;
        this.f12074c[i11] = b8;
        this.f12076e = i11 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void q(int i11) {
        if (i11 >= 0) {
            r(i11);
        } else {
            t(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void r(int i11) {
        A(5);
        C(i11);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void s(int i11) {
        A(4);
        x(i11);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void t(long j9) {
        A(10);
        w(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void u(long j9) {
        A(8);
        y(j9);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void v(String str) throws IOException {
        int length = str.length() * 3;
        int iA = b1.a(length);
        int i11 = iA + length;
        int i12 = this.f12075d;
        if (i11 > i12) {
            byte[] bArr = new byte[length];
            int iC = y2.c(str, bArr, 0, length);
            r(iC);
            z(0, iC, bArr);
            return;
        }
        if (i11 > i12 - this.f12076e) {
            B();
        }
        int iA2 = b1.a(str.length());
        int i13 = this.f12076e;
        byte[] bArr2 = this.f12074c;
        try {
            if (iA2 == iA) {
                int i14 = i13 + iA2;
                this.f12076e = i14;
                int iC2 = y2.c(str, bArr2, i14, i12 - i14);
                this.f12076e = i13;
                C((iC2 - i13) - iA2);
                this.f12076e = iC2;
            } else {
                int iB = y2.b(str);
                C(iB);
                this.f12076e = y2.c(str, bArr2, this.f12076e, iB);
            }
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new zzacy(e5);
        }
    }

    public final void w(long j9) {
        boolean z11 = b1.f11268b;
        byte[] bArr = this.f12074c;
        if (z11) {
            while (true) {
                long j11 = j9 & (-128);
                int i11 = (int) j9;
                int i12 = this.f12076e;
                if (j11 == 0) {
                    this.f12076e = i12 + 1;
                    w2.k(bArr, (byte) i11, i12);
                    return;
                } else {
                    this.f12076e = i12 + 1;
                    w2.k(bArr, (byte) (i11 | 128), i12);
                    j9 >>>= 7;
                }
            }
        } else {
            while (true) {
                long j12 = j9 & (-128);
                int i13 = (int) j9;
                int i14 = this.f12076e;
                if (j12 == 0) {
                    this.f12076e = i14 + 1;
                    bArr[i14] = (byte) i13;
                    return;
                } else {
                    this.f12076e = i14 + 1;
                    bArr[i14] = (byte) (i13 | 128);
                    j9 >>>= 7;
                }
            }
        }
    }

    public final void x(int i11) {
        int i12 = this.f12076e;
        byte[] bArr = this.f12074c;
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
        this.f12076e = i12 + 4;
    }

    public final void y(long j9) {
        int i11 = this.f12076e;
        byte[] bArr = this.f12074c;
        bArr[i11] = (byte) j9;
        bArr[i11 + 1] = (byte) (j9 >> 8);
        bArr[i11 + 2] = (byte) (j9 >> 16);
        bArr[i11 + 3] = (byte) (j9 >> 24);
        bArr[i11 + 4] = (byte) (j9 >> 32);
        bArr[i11 + 5] = (byte) (j9 >> 40);
        bArr[i11 + 6] = (byte) (j9 >> 48);
        bArr[i11 + 7] = (byte) (j9 >> 56);
        this.f12076e = i11 + 8;
    }

    public final void z(int i11, int i12, byte[] bArr) throws IOException {
        int i13 = this.f12076e;
        int i14 = this.f12075d;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f12074c;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f12076e += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        this.f12076e = i14;
        B();
        int i17 = i12 - i15;
        if (i17 > i14) {
            this.f12077f.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f12076e = i17;
        }
    }
}
