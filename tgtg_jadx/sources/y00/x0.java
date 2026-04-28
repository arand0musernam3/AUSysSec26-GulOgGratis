package y00;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f45298e;

    public x0(long j9, long j11, Bundle bundle, String str, String str2) {
        this.f45294a = str;
        this.f45295b = str2;
        this.f45298e = bundle;
        this.f45296c = j9;
        this.f45297d = j11;
    }

    public static x0 a(u uVar) {
        String str = uVar.f45195a;
        String str2 = uVar.f45197c;
        return new x0(uVar.f45198d, uVar.f45199e, uVar.f45196b.h(), str, str2);
    }

    public final u b() {
        t tVar = new t(new Bundle(this.f45298e));
        return new u(this.f45294a, tVar, this.f45295b, this.f45296c, this.f45297d);
    }

    public final String toString() {
        String string = this.f45298e.toString();
        String str = this.f45295b;
        int length = String.valueOf(str).length();
        String str2 = this.f45294a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        j4.s.A(sb2, "origin=", str, ",name=", str2);
        return r8.k.p(sb2, ",params=", string);
    }
}
