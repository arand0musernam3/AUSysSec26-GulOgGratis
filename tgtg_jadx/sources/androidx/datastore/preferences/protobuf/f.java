package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f2956c = new f(b0.f2931b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f2957d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2958a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2959b;

    static {
        f2957d = b.a() ? new d(1) : new d(0);
    }

    public f(byte[] bArr) {
        bArr.getClass();
        this.f2959b = bArr;
    }

    public static int c(int i11, int i12, int i13) {
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

    public static f d(int i11, int i12, byte[] bArr) {
        byte[] bArrCopyOfRange;
        c(i11, i11 + i12, bArr.length);
        switch (f2957d.f2945a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12 + i11);
                break;
            default:
                bArrCopyOfRange = new byte[i12];
                System.arraycopy(bArr, i11, bArrCopyOfRange, 0, i12);
                break;
        }
        return new f(bArrCopyOfRange);
    }

    public byte b(int i11) {
        return this.f2959b[i11];
    }

    public void e(int i11, byte[] bArr) {
        System.arraycopy(this.f2959b, 0, bArr, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || size() != ((f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f)) {
            return obj.equals(this);
        }
        f fVar = (f) obj;
        int i11 = this.f2958a;
        int i12 = fVar.f2958a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        int size = size();
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > fVar.size()) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(size, "Ran off end of other: 0, ", ", ");
            sbK.append(fVar.size());
            throw new IllegalArgumentException(sbK.toString());
        }
        byte[] bArr = fVar.f2959b;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = fVar.g();
        while (iG2 < iG) {
            if (this.f2959b[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    public byte h(int i11) {
        return this.f2959b[i11];
    }

    public final int hashCode() {
        int i11 = this.f2958a;
        if (i11 != 0) {
            return i11;
        }
        int size = size();
        int iG = g();
        int i12 = size;
        for (int i13 = iG; i13 < iG + size; i13++) {
            i12 = (i12 * 31) + this.f2959b[i13];
        }
        if (i12 == 0) {
            i12 = 1;
        }
        this.f2958a = i12;
        return i12;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this);
    }

    public int size() {
        return this.f2959b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = m0.c.b0(this);
        } else {
            int iC = c(0, 47, size());
            strConcat = m0.c.b0(iC == 0 ? f2956c : new e(this.f2959b, g(), iC)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return r8.k.p(sb2, strConcat, "\">");
    }
}
