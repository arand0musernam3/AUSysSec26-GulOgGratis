package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t9 extends rz.a {
    public static final Parcelable.Creator<t9> CREATOR = new k6(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f11877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[][] f11878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f11879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f11880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f11881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[][] f11882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f11883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[][] f11884j;

    public t9(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f11875a = str;
        this.f11876b = bArr;
        this.f11877c = bArr2;
        this.f11878d = bArr3;
        this.f11879e = bArr4;
        this.f11880f = bArr5;
        this.f11881g = iArr;
        this.f11882h = bArr6;
        this.f11883i = iArr2;
        this.f11884j = bArr7;
    }

    public static void d(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            return;
        }
        sb2.append("(");
        boolean z11 = true;
        int i11 = 0;
        while (i11 < bArr.length) {
            byte[] bArr2 = bArr[i11];
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append("'");
            com.google.android.gms.common.internal.i0.h(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i11++;
            z11 = false;
        }
        sb2.append(")");
    }

    public static Set g(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetS0 = na0.a.s0(length);
        for (byte[] bArr2 : bArr) {
            com.google.android.gms.common.internal.i0.h(bArr2);
            hashSetS0.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetS0;
    }

    public static List h(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i11 = 0; i11 < iArr.length; i11 += 2) {
            arrayList.add(new x9(iArr[i11], iArr[i11 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set e() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f11882h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f11876b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return g((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objS0;
        Object objS02;
        int length;
        int length2;
        if (obj instanceof t9) {
            t9 t9Var = (t9) obj;
            if (gg.c(this.f11875a, t9Var.f11875a) && gg.c(e(), t9Var.e()) && gg.c(g(this.f11877c), g(t9Var.f11877c)) && gg.c(g(this.f11878d), g(t9Var.f11878d)) && gg.c(g(this.f11879e), g(t9Var.f11879e)) && gg.c(g(this.f11880f), g(t9Var.f11880f))) {
                int[] iArr = this.f11881g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objS0 = Collections.EMPTY_SET;
                } else {
                    objS0 = na0.a.s0(length2);
                    for (int i11 : iArr) {
                        objS0.add(Integer.valueOf(i11));
                    }
                }
                int[] iArr2 = t9Var.f11881g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objS02 = Collections.EMPTY_SET;
                } else {
                    objS02 = na0.a.s0(length);
                    for (int i12 : iArr2) {
                        objS02.add(Integer.valueOf(i12));
                    }
                }
                if (gg.c(objS0, objS02) && gg.c(h(this.f11883i), h(t9Var.f11883i)) && gg.c(g(this.f11884j), g(t9Var.f11884j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f11875a;
        sb2.append(str == null ? Address.ADDRESS_NULL_PLACEHOLDER : e0.f.n(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb2.append(", direct==");
        byte[] bArr = this.f11876b;
        if (bArr == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        d(sb2, "GAIA=", this.f11877c);
        sb2.append(", ");
        d(sb2, "PSEUDO=", this.f11878d);
        sb2.append(", ");
        d(sb2, "ALWAYS=", this.f11879e);
        sb2.append(", ");
        d(sb2, "OTHER=", this.f11880f);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.f11881g));
        sb2.append(", ");
        d(sb2, "directs=", this.f11882h);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(h(this.f11883i).toArray()));
        sb2.append(", ");
        d(sb2, "external=", this.f11884j);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f11875a, parcel, 2);
        lx.u.T(parcel, 3, this.f11876b);
        lx.u.U(parcel, 4, this.f11877c);
        lx.u.U(parcel, 5, this.f11878d);
        lx.u.U(parcel, 6, this.f11879e);
        lx.u.U(parcel, 7, this.f11880f);
        lx.u.X(parcel, 8, this.f11881g);
        lx.u.U(parcel, 9, this.f11882h);
        lx.u.X(parcel, 10, this.f11883i);
        lx.u.U(parcel, 11, this.f11884j);
        lx.u.i0(iH0, parcel);
    }
}
