package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ax.n0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class UserAddress extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new n0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11227k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11230o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f11217a, parcel, 2);
        u.b0(this.f11218b, parcel, 3);
        u.b0(this.f11219c, parcel, 4);
        u.b0(this.f11220d, parcel, 5);
        u.b0(this.f11221e, parcel, 6);
        u.b0(this.f11222f, parcel, 7);
        u.b0(this.f11223g, parcel, 8);
        u.b0(this.f11224h, parcel, 9);
        u.b0(this.f11225i, parcel, 10);
        u.b0(this.f11226j, parcel, 11);
        u.b0(this.f11227k, parcel, 12);
        u.b0(this.l, parcel, 13);
        boolean z11 = this.f11228m;
        u.g0(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        u.b0(this.f11229n, parcel, 15);
        u.b0(this.f11230o, parcel, 16);
        u.i0(iH0, parcel);
    }
}
