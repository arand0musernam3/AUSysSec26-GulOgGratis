package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends rz.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25460g;

    public a(boolean z11, String str, String str2, boolean z12, String str3, ArrayList arrayList, boolean z13) {
        boolean z14 = true;
        if (z12 && z13) {
            z14 = false;
        }
        i0.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z14);
        this.f25454a = z11;
        if (z11) {
            i0.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f25455b = str;
        this.f25456c = str2;
        this.f25457d = z12;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f25459f = arrayList2;
        this.f25458e = str3;
        this.f25460g = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25454a == aVar.f25454a && i0.k(this.f25455b, aVar.f25455b) && i0.k(this.f25456c, aVar.f25456c) && this.f25457d == aVar.f25457d && i0.k(this.f25458e, aVar.f25458e) && i0.k(this.f25459f, aVar.f25459f) && this.f25460g == aVar.f25460g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f25454a), this.f25455b, this.f25456c, Boolean.valueOf(this.f25457d), this.f25458e, this.f25459f, Boolean.valueOf(this.f25460g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f25454a ? 1 : 0);
        u.b0(this.f25455b, parcel, 2);
        u.b0(this.f25456c, parcel, 3);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f25457d ? 1 : 0);
        u.b0(this.f25458e, parcel, 5);
        u.d0(parcel, 6, this.f25459f);
        u.g0(parcel, 7, 4);
        parcel.writeInt(this.f25460g ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
