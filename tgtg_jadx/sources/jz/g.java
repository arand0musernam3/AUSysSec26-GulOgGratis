package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new b0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25481f;

    public g(String str, String str2, String str3, String str4, boolean z11, int i11) {
        i0.h(str);
        this.f25476a = str;
        this.f25477b = str2;
        this.f25478c = str3;
        this.f25479d = str4;
        this.f25480e = z11;
        this.f25481f = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i0.k(this.f25476a, gVar.f25476a) && i0.k(this.f25479d, gVar.f25479d) && i0.k(this.f25477b, gVar.f25477b) && i0.k(Boolean.valueOf(this.f25480e), Boolean.valueOf(gVar.f25480e)) && this.f25481f == gVar.f25481f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25476a, this.f25477b, this.f25479d, Boolean.valueOf(this.f25480e), Integer.valueOf(this.f25481f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f25476a, parcel, 1);
        u.b0(this.f25477b, parcel, 2);
        u.b0(this.f25478c, parcel, 3);
        u.b0(this.f25479d, parcel, 4);
        u.g0(parcel, 5, 4);
        parcel.writeInt(this.f25480e ? 1 : 0);
        u.g0(parcel, 6, 4);
        parcel.writeInt(this.f25481f);
        u.i0(iH0, parcel);
    }
}
