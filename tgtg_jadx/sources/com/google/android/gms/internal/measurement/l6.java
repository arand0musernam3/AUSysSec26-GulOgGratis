package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends rz.a {
    public static final Parcelable.Creator<l6> CREATOR = new k6(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f11593c;

    public l6(int i11, String str, Intent intent) {
        this.f11591a = i11;
        this.f11592b = str;
        this.f11593c = intent;
    }

    public static l6 d(Activity activity) {
        return new l6(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.f11591a == l6Var.f11591a && Objects.equals(this.f11592b, l6Var.f11592b) && Objects.equals(this.f11593c, l6Var.f11593c);
    }

    public final int hashCode() {
        return this.f11591a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11591a);
        lx.u.b0(this.f11592b, parcel, 2);
        lx.u.a0(parcel, 3, this.f11593c, i11);
        lx.u.i0(iH0, parcel);
    }
}
