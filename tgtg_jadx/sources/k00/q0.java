package k00;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class q0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f25682c = new q0(r0.f25687a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25683a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25684b;

    static {
        int i11 = o0.f25674a;
    }

    public q0(byte[] bArr) {
        bArr.getClass();
        this.f25684b = bArr;
    }

    public static int i(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            org.bouncycastle.jce.provider.a.v(r8.k.h(i11, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i12 < i11) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("Beginning index larger than ending index: ", i11, i12, ", "));
            return 0;
        }
        org.bouncycastle.jce.provider.a.v(r8.k.k("End index: ", i12, i13, " >= "));
        return 0;
    }

    public static q0 j(int i11, byte[] bArr) {
        i(0, i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return new q0(bArr2);
    }

    public byte b(int i11) {
        return this.f25684b[i11];
    }

    public byte c(int i11) {
        return this.f25684b[i11];
    }

    public int d() {
        return 0;
    }

    public int e() {
        return this.f25684b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || e() != ((q0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return obj.equals(this);
        }
        q0 q0Var = (q0) obj;
        int i11 = this.f25683a;
        int i12 = q0Var.f25683a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        int iE = e();
        if (iE > q0Var.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > q0Var.e()) {
            i4.a.f(r8.k.k("Ran off end of other: 0, ", iE, q0Var.e(), ", "));
            return false;
        }
        byte[] bArr = q0Var.f25684b;
        int iD = d() + iE;
        int iD2 = d();
        int iD3 = q0Var.d();
        while (iD2 < iD) {
            if (this.f25684b[iD2] != bArr[iD3]) {
                return false;
            }
            iD2++;
            iD3++;
        }
        return true;
    }

    public void g(int i11, byte[] bArr) {
        System.arraycopy(this.f25684b, 0, bArr, 0, i11);
    }

    public final ByteArrayInputStream h() {
        return new ByteArrayInputStream(this.f25684b, d(), e());
    }

    public final int hashCode() {
        int i11 = this.f25683a;
        if (i11 != 0) {
            return i11;
        }
        int iE = e();
        int iD = d();
        byte[] bArr = r0.f25687a;
        int i12 = iE;
        for (int i13 = iD; i13 < iD + iE; i13++) {
            i12 = (i12 * 31) + this.f25684b[i13];
        }
        if (i12 == 0) {
            i12 = 1;
        }
        this.f25683a = i12;
        return i12;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.c(this);
    }

    public final byte[] l() {
        int iE = e();
        if (iE == 0) {
            return r0.f25687a;
        }
        byte[] bArr = new byte[iE];
        g(iE, bArr);
        return bArr;
    }

    public final String toString() {
        q0 p0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        if (e() <= 50) {
            strConcat = a.d(this);
        } else {
            int i11 = i(0, 47, e());
            if (i11 == 0) {
                p0Var = f25682c;
            } else {
                p0Var = new p0(this.f25684b, d(), i11);
            }
            strConcat = a.d(p0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iE);
        sb2.append(" contents=\"");
        return r8.k.p(sb2, strConcat, "\">");
    }
}
