package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends rz.a {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = s.f11090b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f11066d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11069c;

    static {
        i iVar = new i(null, false);
        iVar.f11069c = false;
        f11066d = iVar;
    }

    public i(j jVar, boolean z11) {
        this.f11067a = jVar;
        this.f11068b = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return i0.k(this.f11067a, iVar.f11067a) && this.f11069c == iVar.f11069c && this.f11068b == iVar.f11068b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11067a, Boolean.valueOf(this.f11069c), Boolean.valueOf(this.f11068b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11067a);
        return e0.f.n(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f11069c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f11067a, i11);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f11068b ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
