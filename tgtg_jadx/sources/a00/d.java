package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new g0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f83a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f84b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f85c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f86d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f87e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f88f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f89g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f90h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f91i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l0 f92j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f93k;
    public final k0 l;

    public d(o oVar, r0 r0Var, c0 c0Var, t0 t0Var, h0 h0Var, i0 i0Var, s0 s0Var, j0 j0Var, p pVar, l0 l0Var, m0 m0Var, k0 k0Var) {
        this.f83a = oVar;
        this.f85c = c0Var;
        this.f84b = r0Var;
        this.f86d = t0Var;
        this.f87e = h0Var;
        this.f88f = i0Var;
        this.f89g = s0Var;
        this.f90h = j0Var;
        this.f91i = pVar;
        this.f92j = l0Var;
        this.f93k = m0Var;
        this.l = k0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.google.android.gms.common.internal.i0.k(this.f83a, dVar.f83a) && com.google.android.gms.common.internal.i0.k(this.f84b, dVar.f84b) && com.google.android.gms.common.internal.i0.k(this.f85c, dVar.f85c) && com.google.android.gms.common.internal.i0.k(this.f86d, dVar.f86d) && com.google.android.gms.common.internal.i0.k(this.f87e, dVar.f87e) && com.google.android.gms.common.internal.i0.k(this.f88f, dVar.f88f) && com.google.android.gms.common.internal.i0.k(this.f89g, dVar.f89g) && com.google.android.gms.common.internal.i0.k(this.f90h, dVar.f90h) && com.google.android.gms.common.internal.i0.k(this.f91i, dVar.f91i) && com.google.android.gms.common.internal.i0.k(this.f92j, dVar.f92j) && com.google.android.gms.common.internal.i0.k(this.f93k, dVar.f93k) && com.google.android.gms.common.internal.i0.k(this.l, dVar.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83a, this.f84b, this.f85c, this.f86d, this.f87e, this.f88f, this.f89g, this.f90h, this.f91i, this.f92j, this.f93k, this.l});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f83a);
        String strValueOf2 = String.valueOf(this.f84b);
        String strValueOf3 = String.valueOf(this.f85c);
        String strValueOf4 = String.valueOf(this.f86d);
        String strValueOf5 = String.valueOf(this.f87e);
        String strValueOf6 = String.valueOf(this.f88f);
        String strValueOf7 = String.valueOf(this.f89g);
        String strValueOf8 = String.valueOf(this.f90h);
        String strValueOf9 = String.valueOf(this.f91i);
        String strValueOf10 = String.valueOf(this.f92j);
        String strValueOf11 = String.valueOf(this.f93k);
        StringBuilder sbT = e0.f.t("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        j4.s.A(sbT, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        j4.s.A(sbT, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        j4.s.A(sbT, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        j4.s.A(sbT, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return r8.k.p(sbT, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 2, this.f83a, i11);
        lx.u.a0(parcel, 3, this.f84b, i11);
        lx.u.a0(parcel, 4, this.f85c, i11);
        lx.u.a0(parcel, 5, this.f86d, i11);
        lx.u.a0(parcel, 6, this.f87e, i11);
        lx.u.a0(parcel, 7, this.f88f, i11);
        lx.u.a0(parcel, 8, this.f89g, i11);
        lx.u.a0(parcel, 9, this.f90h, i11);
        lx.u.a0(parcel, 10, this.f91i, i11);
        lx.u.a0(parcel, 11, this.f92j, i11);
        lx.u.a0(parcel, 12, this.f93k, i11);
        lx.u.a0(parcel, 13, this.l, i11);
        lx.u.i0(iH0, parcel);
    }
}
