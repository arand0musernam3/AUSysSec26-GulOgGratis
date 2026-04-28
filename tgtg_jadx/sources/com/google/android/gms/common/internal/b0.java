package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends rz.a {
    public static final Parcelable.Creator<b0> CREATOR = new v(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f11097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f11099d;

    public b0(int i11, Account account, int i12, GoogleSignInAccount googleSignInAccount) {
        this.f11096a = i11;
        this.f11097b = account;
        this.f11098c = i12;
        this.f11099d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f11096a);
        lx.u.a0(parcel, 2, this.f11097b, i11);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f11098c);
        lx.u.a0(parcel, 4, this.f11099d, i11);
        lx.u.i0(iH0, parcel);
    }
}
