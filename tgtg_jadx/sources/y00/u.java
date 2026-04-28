package y00;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends rz.a {
    public static final Parcelable.Creator<u> CREATOR = new s00.e(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f45196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45199e;

    public u(u uVar, long j9, long j11) {
        com.google.android.gms.common.internal.i0.h(uVar);
        this.f45195a = uVar.f45195a;
        this.f45196b = uVar.f45196b;
        this.f45197c = uVar.f45197c;
        this.f45198d = j9;
        this.f45199e = j11;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f45196b);
        String str = this.f45197c;
        int length = String.valueOf(str).length();
        String str2 = this.f45195a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        j4.s.A(sb2, "origin=", str, ",name=", str2);
        return r8.k.p(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        s00.e.a(this, parcel, i11);
    }

    public u(String str, t tVar, String str2, long j9, long j11) {
        this.f45195a = str;
        this.f45196b = tVar;
        this.f45197c = str2;
        this.f45198d = j9;
        this.f45199e = j11;
    }
}
