package h10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import e10.b0;
import java.util.ArrayList;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends rz.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new b0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21005c;

    public b(String str, String str2, ArrayList arrayList) {
        this.f21003a = str;
        this.f21004b = str2;
        this.f21005c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f21003a, parcel, 2);
        u.b0(this.f21004b, parcel, 3);
        u.f0(parcel, 4, this.f21005c);
        u.i0(iH0, parcel);
    }
}
