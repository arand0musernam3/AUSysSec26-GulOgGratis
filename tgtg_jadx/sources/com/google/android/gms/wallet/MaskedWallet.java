package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.identity.intents.model.UserAddress;
import e10.e;
import e10.g;
import e10.h;
import e10.w;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new v(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f12170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f12172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f12173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g[] f12174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h[] f12175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UserAddress f12176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserAddress f12177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e[] f12178k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f12168a, parcel, 2);
        u.b0(this.f12169b, parcel, 3);
        u.c0(parcel, 4, this.f12170c);
        u.b0(this.f12171d, parcel, 5);
        u.a0(parcel, 6, this.f12172e, i11);
        u.a0(parcel, 7, this.f12173f, i11);
        u.e0(parcel, 8, this.f12174g, i11);
        u.e0(parcel, 9, this.f12175h, i11);
        u.a0(parcel, 10, this.f12176i, i11);
        u.a0(parcel, 11, this.f12177j, i11);
        u.e0(parcel, 12, this.f12178k, i11);
        u.i0(iH0, parcel);
    }
}
