package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import jz.l;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new l(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f11033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11034c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f11033b = googleSignInAccount;
        i0.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f11032a = str;
        i0.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f11034c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f11032a, parcel, 4);
        u.a0(parcel, 7, this.f11033b, i11);
        u.b0(this.f11034c, parcel, 8);
        u.i0(iH0, parcel);
    }
}
