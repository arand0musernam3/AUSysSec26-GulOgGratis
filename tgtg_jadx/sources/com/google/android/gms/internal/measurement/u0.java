package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f11915b = new t0(r1.f11808a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11916a;

    static {
        int i11 = p0.f11740a;
    }

    public static t0 j(int i11, int i12, byte[] bArr) {
        try {
            return l(i11, i12, bArr);
        } catch (zzaeh e5) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e5);
        }
    }

    public static t0 l(int i11, int i12, byte[] bArr) {
        if (i12 == 0) {
            return f11915b;
        }
        n(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new t0(bArr2);
    }

    public static int n(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < i11) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 44 + String.valueOf(i12).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 15 + String.valueOf(i13).length());
        sb4.append("End index: ");
        sb4.append(i12);
        sb4.append(" >= ");
        sb4.append(i13);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean o(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        int i14 = i11 + i13;
        n(i11, i14, bArr.length);
        n(i12, i13 + i12, bArr2.length);
        while (i11 < i14) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public abstract byte b(int i11);

    public abstract int c();

    public abstract s0 d(int i11, int i12);

    public abstract void e(int i11, byte[] bArr);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        int iC = c();
        if (iC != u0Var.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i11 = this.f11916a;
        int i12 = u0Var.f11916a;
        if (i11 == 0 || i12 == 0 || i11 == i12) {
            return h(u0Var);
        }
        return false;
    }

    public abstract void g(b1 b1Var);

    public abstract boolean h(u0 u0Var);

    public final int hashCode() {
        int i11 = this.f11916a;
        if (i11 == 0) {
            int iC = c();
            i11 = i(iC, iC);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f11916a = i11;
        }
        return i11;
    }

    public abstract int i(int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.c(this);
    }

    public final byte[] m() {
        int iC = c();
        if (iC == 0) {
            return r1.f11808a;
        }
        byte[] bArr = new byte[iC];
        e(iC, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iC = c();
        String strD = c() <= 50 ? la.d(m()) : la.d(d(0, 47).m()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iC);
        sb2.append(" contents=\"");
        return r8.k.p(sb2, strD, "\">");
    }
}
