package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends rz.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new s(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11053b;

    public Scope(int i11, String str) {
        i0.f(str, "scopeUri must not be null or empty");
        this.f11052a = i11;
        this.f11053b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11053b.equals(((Scope) obj).f11053b);
    }

    public final int hashCode() {
        return this.f11053b.hashCode();
    }

    public final String toString() {
        return this.f11053b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11052a);
        u.b0(this.f11053b, parcel, 2);
        u.i0(iH0, parcel);
    }
}
