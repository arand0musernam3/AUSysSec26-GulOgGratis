package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.adyen.checkout.components.core.Address;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r9 extends rz.a {
    public static final Parcelable.Creator<r9> CREATOR = new k6(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q9[] f11823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f11824e = new TreeMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11826g;

    public r9(String str, String str2, q9[] q9VarArr, boolean z11, byte[] bArr, long j9) {
        this.f11820a = str;
        this.f11822c = str2;
        this.f11823d = q9VarArr;
        this.f11825f = z11;
        this.f11821b = bArr;
        this.f11826g = j9;
        for (q9 q9Var : q9VarArr) {
            this.f11824e.put(Integer.valueOf(q9Var.f11786a), q9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return gg.c(this.f11820a, r9Var.f11820a) && gg.c(this.f11822c, r9Var.f11822c) && this.f11824e.equals(r9Var.f11824e) && this.f11825f == r9Var.f11825f && Arrays.equals(this.f11821b, r9Var.f11821b) && this.f11826g == r9Var.f11826g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11820a, this.f11822c, this.f11824e, Boolean.valueOf(this.f11825f), this.f11821b, Long.valueOf(this.f11826g)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.f11820a);
        sb2.append("', '");
        sb2.append(this.f11822c);
        sb2.append("', (");
        Iterator it = this.f11824e.values().iterator();
        while (it.hasNext()) {
            sb2.append((q9) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.f11825f);
        sb2.append(", ");
        byte[] bArr = this.f11821b;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        return w.a0.r(sb2, this.f11826g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f11820a, parcel, 2);
        lx.u.b0(this.f11822c, parcel, 3);
        lx.u.e0(parcel, 4, this.f11823d, i11);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f11825f ? 1 : 0);
        lx.u.T(parcel, 6, this.f11821b);
        lx.u.g0(parcel, 7, 8);
        parcel.writeLong(this.f11826g);
        lx.u.i0(iH0, parcel);
    }
}
