package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q9 extends rz.a implements Comparable {
    public static final Parcelable.Creator<q9> CREATOR = new k6(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9[] f11787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f11788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeMap f11789d = new TreeMap();

    public q9(int i11, u9[] u9VarArr, String[] strArr) {
        this.f11786a = i11;
        this.f11787b = u9VarArr;
        for (u9 u9Var : u9VarArr) {
            this.f11789d.put(u9Var.f11925a, u9Var);
        }
        this.f11788c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f11786a - ((q9) obj).f11786a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return this.f11786a == q9Var.f11786a && gg.c(this.f11789d, q9Var.f11789d) && Arrays.equals(this.f11788c, q9Var.f11788c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.f11786a);
        sb2.append(", (");
        Iterator it = this.f11789d.values().iterator();
        while (it.hasNext()) {
            sb2.append((u9) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.f11788c;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        sb2.append("))");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11786a);
        lx.u.e0(parcel, 3, this.f11787b, i11);
        lx.u.c0(parcel, 4, this.f11788c);
        lx.u.i0(iH0, parcel);
    }
}
