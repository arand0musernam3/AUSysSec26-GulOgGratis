package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x9 extends rz.a implements Comparable {
    public static final Parcelable.Creator<x9> CREATOR = new k6(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12035b;

    public x9(int i11, int i12) {
        this.f12034a = i11;
        this.f12035b = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x9 x9Var = (x9) obj;
        int i11 = x9Var.f12034a;
        int i12 = this.f12034a;
        if (i12 < i11) {
            return -1;
        }
        if (i12 > i11) {
            return 1;
        }
        int i13 = x9Var.f12035b;
        int i14 = this.f12035b;
        if (i14 < i13) {
            return -1;
        }
        return i14 > i13 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.x9) r3).f12034a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f12035b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.x9
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.x9 r3 = (com.google.android.gms.internal.measurement.x9) r3
            int r0 = r3.f12034a
            int r1 = r2.f12034a
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f12035b
            int r0 = r2.f12035b
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f12034a * 31) + this.f12035b;
    }

    public final String toString() {
        int i11 = this.f12034a;
        int length = String.valueOf(i11).length();
        int i12 = this.f12035b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i12).length() + 1);
        sb2.append("GenericDimension(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f12034a);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f12035b);
        lx.u.i0(iH0, parcel);
    }
}
