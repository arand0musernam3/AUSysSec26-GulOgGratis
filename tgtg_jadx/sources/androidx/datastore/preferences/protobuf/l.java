package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f3001f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f3002g = n1.f3020e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f3003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.g1 f3007e;

    public l(d8.g1 g1Var, int i11) {
        if (i11 < 0) {
            i4.a.f("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i11, 20);
        this.f3004b = new byte[iMax];
        this.f3005c = iMax;
        this.f3007e = g1Var;
    }

    public static int f(int i11, f fVar) {
        int iH = h(i11);
        int size = fVar.size();
        return i(size) + size + iH;
    }

    public static int g(String str) {
        int length;
        try {
            length = q1.a(str);
        } catch (p1 unused) {
            length = str.getBytes(b0.f2930a).length;
        }
        return i(length) + length;
    }

    public static int h(int i11) {
        return i(i11 << 3);
    }

    public static int i(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int j(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public final void A(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i11 = i(length);
            int i12 = i11 + length;
            int i13 = this.f3005c;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int iR = q1.f3043a.r(str, bArr, 0, length);
                D(iR);
                n(bArr, 0, iR);
                return;
            }
            if (i12 > i13 - this.f3006d) {
                k();
            }
            int i14 = i(str.length());
            int i15 = this.f3006d;
            byte[] bArr2 = this.f3004b;
            try {
                if (i14 == i11) {
                    int i16 = i15 + i14;
                    this.f3006d = i16;
                    int iR2 = q1.f3043a.r(str, bArr2, i16, i13 - i16);
                    this.f3006d = i15;
                    d((iR2 - i15) - i14);
                    this.f3006d = iR2;
                } else {
                    int iA = q1.a(str);
                    d(iA);
                    this.f3006d = q1.f3043a.r(str, bArr2, this.f3006d, iA);
                }
            } catch (p1 e5) {
                this.f3006d = i15;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new IOException(e11) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        } catch (p1 e12) {
            f3001f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(b0.f2930a);
            try {
                D(bytes.length);
                x(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e13) {
                throw new IOException(e13) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        }
    }

    public final void B(int i11, int i12) {
        D((i11 << 3) | i12);
    }

    public final void C(int i11, int i12) throws IOException {
        l(20);
        c(i11, 0);
        d(i12);
    }

    public final void D(int i11) throws IOException {
        l(5);
        d(i11);
    }

    public final void E(int i11, long j9) throws IOException {
        l(20);
        c(i11, 0);
        e(j9);
    }

    public final void F(long j9) throws IOException {
        l(10);
        e(j9);
    }

    public final void a(int i11) {
        int i12 = this.f3006d;
        int i13 = i12 + 1;
        this.f3006d = i13;
        byte[] bArr = this.f3004b;
        bArr[i12] = (byte) (i11 & 255);
        int i14 = i12 + 2;
        this.f3006d = i14;
        bArr[i13] = (byte) ((i11 >> 8) & 255);
        int i15 = i12 + 3;
        this.f3006d = i15;
        bArr[i14] = (byte) ((i11 >> 16) & 255);
        this.f3006d = i12 + 4;
        bArr[i15] = (byte) ((i11 >> 24) & 255);
    }

    public final void b(long j9) {
        int i11 = this.f3006d;
        int i12 = i11 + 1;
        this.f3006d = i12;
        byte[] bArr = this.f3004b;
        bArr[i11] = (byte) (j9 & 255);
        int i13 = i11 + 2;
        this.f3006d = i13;
        bArr[i12] = (byte) ((j9 >> 8) & 255);
        int i14 = i11 + 3;
        this.f3006d = i14;
        bArr[i13] = (byte) ((j9 >> 16) & 255);
        int i15 = i11 + 4;
        this.f3006d = i15;
        bArr[i14] = (byte) (255 & (j9 >> 24));
        int i16 = i11 + 5;
        this.f3006d = i16;
        bArr[i15] = (byte) (((int) (j9 >> 32)) & 255);
        int i17 = i11 + 6;
        this.f3006d = i17;
        bArr[i16] = (byte) (((int) (j9 >> 40)) & 255);
        int i18 = i11 + 7;
        this.f3006d = i18;
        bArr[i17] = (byte) (((int) (j9 >> 48)) & 255);
        this.f3006d = i11 + 8;
        bArr[i18] = (byte) (((int) (j9 >> 56)) & 255);
    }

    public final void c(int i11, int i12) {
        d((i11 << 3) | i12);
    }

    public final void d(int i11) {
        boolean z11 = f3002g;
        byte[] bArr = this.f3004b;
        if (z11) {
            while (true) {
                int i12 = i11 & (-128);
                int i13 = this.f3006d;
                if (i12 == 0) {
                    this.f3006d = i13 + 1;
                    n1.j(bArr, (byte) i11, i13);
                    return;
                } else {
                    this.f3006d = i13 + 1;
                    n1.j(bArr, (byte) ((i11 | 128) & 255), i13);
                    i11 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i14 = i11 & (-128);
                int i15 = this.f3006d;
                if (i14 == 0) {
                    this.f3006d = i15 + 1;
                    bArr[i15] = (byte) i11;
                    return;
                } else {
                    this.f3006d = i15 + 1;
                    bArr[i15] = (byte) ((i11 | 128) & 255);
                    i11 >>>= 7;
                }
            }
        }
    }

    public final void e(long j9) {
        boolean z11 = f3002g;
        byte[] bArr = this.f3004b;
        if (z11) {
            while (true) {
                long j11 = j9 & (-128);
                int i11 = this.f3006d;
                if (j11 == 0) {
                    this.f3006d = i11 + 1;
                    n1.j(bArr, (byte) j9, i11);
                    return;
                } else {
                    this.f3006d = i11 + 1;
                    n1.j(bArr, (byte) ((((int) j9) | 128) & 255), i11);
                    j9 >>>= 7;
                }
            }
        } else {
            while (true) {
                long j12 = j9 & (-128);
                int i12 = this.f3006d;
                if (j12 == 0) {
                    this.f3006d = i12 + 1;
                    bArr[i12] = (byte) j9;
                    return;
                } else {
                    this.f3006d = i12 + 1;
                    bArr[i12] = (byte) ((((int) j9) | 128) & 255);
                    j9 >>>= 7;
                }
            }
        }
    }

    public final void k() throws IOException {
        this.f3007e.write(this.f3004b, 0, this.f3006d);
        this.f3006d = 0;
    }

    public final void l(int i11) throws IOException {
        if (this.f3005c - this.f3006d < i11) {
            k();
        }
    }

    public final void m(byte b8) throws IOException {
        if (this.f3006d == this.f3005c) {
            k();
        }
        int i11 = this.f3006d;
        this.f3006d = i11 + 1;
        this.f3004b[i11] = b8;
    }

    public final void n(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f3006d;
        int i14 = this.f3005c;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f3004b;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f3006d += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f3006d = i14;
        k();
        if (i17 > i14) {
            this.f3007e.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f3006d = i17;
        }
    }

    public final void o(int i11, boolean z11) throws IOException {
        l(11);
        c(i11, 0);
        byte b8 = z11 ? (byte) 1 : (byte) 0;
        int i12 = this.f3006d;
        this.f3006d = i12 + 1;
        this.f3004b[i12] = b8;
    }

    public final void p(int i11, f fVar) {
        B(i11, 2);
        q(fVar);
    }

    public final void q(f fVar) throws IOException {
        D(fVar.size());
        x(fVar.g(), fVar.size(), fVar.f2959b);
    }

    public final void r(int i11, int i12) throws IOException {
        l(14);
        c(i11, 5);
        a(i12);
    }

    public final void s(int i11) throws IOException {
        l(4);
        a(i11);
    }

    public final void t(int i11, long j9) throws IOException {
        l(18);
        c(i11, 1);
        b(j9);
    }

    public final void u(long j9) throws IOException {
        l(8);
        b(j9);
    }

    public final void v(int i11, int i12) throws IOException {
        l(20);
        c(i11, 0);
        if (i12 >= 0) {
            d(i12);
        } else {
            e(i12);
        }
    }

    public final void w(int i11) throws IOException {
        if (i11 >= 0) {
            D(i11);
        } else {
            F(i11);
        }
    }

    public final void x(int i11, int i12, byte[] bArr) throws IOException {
        n(bArr, i11, i12);
    }

    public final void y(int i11, a aVar, a1 a1Var) throws IOException {
        B(i11, 2);
        D(aVar.a(a1Var));
        a1Var.b(aVar, this.f3003a);
    }

    public final void z(int i11, String str) throws IOException {
        B(i11, 2);
        A(str);
    }
}
