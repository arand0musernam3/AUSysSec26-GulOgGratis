package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import jz.l;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f11036b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        i0.e(str);
        this.f11035a = str;
        this.f11036b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f11035a.equals(signInConfiguration.f11035a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f11036b;
            GoogleSignInOptions googleSignInOptions2 = this.f11036b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = 1 * 31;
        String str = this.f11035a;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f11036b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f11035a, parcel, 2);
        u.a0(parcel, 5, this.f11036b, i11);
        u.i0(iH0, parcel);
    }
}
