package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u9 extends rz.a implements Comparable {
    public static final Parcelable.Creator<u9> CREATOR = new k6(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f11930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11933i;

    public u9(String str, long j9, boolean z11, double d3, String str2, byte[] bArr, int i11, int i12, int i13) {
        this.f11925a = str;
        this.f11926b = j9;
        this.f11927c = z11;
        this.f11928d = d3;
        this.f11929e = str2;
        this.f11930f = bArr;
        this.f11931g = i11;
        this.f11932h = i12;
        this.f11933i = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.u9 r9 = (com.google.android.gms.internal.measurement.u9) r9
            java.lang.String r0 = r9.f11925a
            java.lang.String r1 = r8.f11925a
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r9.f11931g
            r1 = -1
            r2 = 0
            r3 = 1
            int r4 = r8.f11931g
            if (r4 >= r0) goto L18
            r0 = r1
            goto L1d
        L18:
            if (r4 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            if (r4 == r3) goto L98
            r0 = 2
            if (r4 == r0) goto L8e
            r0 = 3
            if (r4 == r0) goto L85
            r0 = 4
            if (r4 == r0) goto L73
            r0 = 5
            if (r4 != r0) goto L59
            byte[] r9 = r9.f11930f
            byte[] r0 = r8.f11930f
            if (r0 != r9) goto L36
            goto La3
        L36:
            if (r0 != 0) goto L3a
            goto La0
        L3a:
            if (r9 != 0) goto L3e
            goto La4
        L3e:
            r4 = r2
        L3f:
            int r5 = r9.length
            int r6 = r0.length
            int r7 = java.lang.Math.min(r6, r5)
            if (r4 >= r7) goto L52
            r5 = r0[r4]
            r6 = r9[r4]
            int r5 = r5 - r6
            if (r5 == 0) goto L4f
            return r5
        L4f:
            int r4 = r4 + 1
            goto L3f
        L52:
            if (r6 >= r5) goto L55
            return r1
        L55:
            if (r6 == r5) goto L58
            return r3
        L58:
            return r2
        L59:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r9 = r9.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r9 = r9 + 20
            r0.<init>(r9)
            java.lang.String r9 = "Invalid enum value: "
            java.lang.String r9 = e0.f.h(r4, r9, r0)
            i4.a.d(r9)
            r9 = 0
            return r9
        L73:
            java.lang.String r9 = r9.f11929e
            java.lang.String r0 = r8.f11929e
            if (r0 != r9) goto L7a
            goto La3
        L7a:
            if (r0 != 0) goto L7d
            goto La0
        L7d:
            if (r9 != 0) goto L80
            goto La4
        L80:
            int r9 = r0.compareTo(r9)
            return r9
        L85:
            double r0 = r8.f11928d
            double r2 = r9.f11928d
            int r9 = java.lang.Double.compare(r0, r2)
            return r9
        L8e:
            boolean r9 = r9.f11927c
            boolean r0 = r8.f11927c
            if (r0 != r9) goto L95
            goto La3
        L95:
            if (r0 == 0) goto La0
            goto La4
        L98:
            long r4 = r8.f11926b
            long r6 = r9.f11926b
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto La1
        La0:
            return r1
        La1:
            if (r9 != 0) goto La4
        La3:
            return r2
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u9.compareTo(java.lang.Object):int");
    }

    public final void d(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.f11925a;
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f11931g;
        if (i11 == 1) {
            sb2.append(this.f11926b);
        } else if (i11 == 2) {
            sb2.append(this.f11927c);
        } else if (i11 == 3) {
            sb2.append(this.f11928d);
        } else if (i11 == 4) {
            sb2.append("'");
            String str2 = this.f11929e;
            com.google.android.gms.common.internal.i0.h(str2);
            sb2.append(str2);
            sb2.append("'");
        } else {
            if (i11 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i11).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i11);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            byte[] bArr = this.f11930f;
            com.google.android.gms.common.internal.i0.h(bArr);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(this.f11932h);
        sb2.append(", ");
        sb2.append(this.f11933i);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u9) {
            u9 u9Var = (u9) obj;
            if (gg.c(this.f11925a, u9Var.f11925a)) {
                int i11 = u9Var.f11931g;
                int i12 = this.f11931g;
                if (i12 == i11 && this.f11932h == u9Var.f11932h && this.f11933i == u9Var.f11933i) {
                    if (i12 == 1) {
                        return this.f11926b == u9Var.f11926b;
                    }
                    if (i12 == 2) {
                        return this.f11927c == u9Var.f11927c;
                    }
                    if (i12 == 3) {
                        return this.f11928d == u9Var.f11928d;
                    }
                    if (i12 == 4) {
                        return gg.c(this.f11929e, u9Var.f11929e);
                    }
                    if (i12 == 5) {
                        return Arrays.equals(this.f11930f, u9Var.f11930f);
                    }
                    i4.a.d(e0.f.h(i12, "Invalid enum value: ", new StringBuilder(String.valueOf(i12).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        d(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f11925a;
        boolean z11 = str == null;
        int iH0 = lx.u.h0(20293, parcel);
        if (!z11) {
            lx.u.b0(str, parcel, 2);
        }
        long j9 = this.f11926b;
        if (j9 != 0) {
            lx.u.g0(parcel, 3, 8);
            parcel.writeLong(j9);
        }
        if (this.f11927c) {
            lx.u.g0(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d3 = this.f11928d;
        if (d3 != 0.0d) {
            lx.u.g0(parcel, 5, 8);
            parcel.writeDouble(d3);
        }
        String str2 = this.f11929e;
        if (str2 != null) {
            lx.u.b0(str2, parcel, 6);
        }
        byte[] bArr = this.f11930f;
        if (bArr != null) {
            lx.u.T(parcel, 7, bArr);
        }
        int i12 = this.f11931g;
        if (i12 != 0) {
            lx.u.g0(parcel, 8, 4);
            parcel.writeInt(i12);
        }
        int i13 = this.f11932h;
        if (i13 != 0) {
            lx.u.g0(parcel, 9, 4);
            parcel.writeInt(i13);
        }
        int i14 = this.f11933i;
        if (i14 != 0) {
            lx.u.g0(parcel, 10, 4);
            parcel.writeInt(i14);
        }
        lx.u.i0(iH0, parcel);
    }
}
