package mz;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import jz.l;
import lx.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new l(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f30265a;

    public e(Bundle bundle) {
        bundle.getClass();
        this.f30265a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = u.h0(20293, parcel);
        u.S(parcel, 1, this.f30265a);
        u.i0(iH0, parcel);
    }
}
