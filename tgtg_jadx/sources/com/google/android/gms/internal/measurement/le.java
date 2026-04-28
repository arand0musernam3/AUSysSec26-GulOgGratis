package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f11602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb f11603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.i f11604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k30.h f11605d;

    public le(Uri uri, zb zbVar, j30.i iVar, k30.h hVar) {
        this.f11602a = uri;
        this.f11603b = zbVar;
        this.f11604c = iVar;
        this.f11605d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        if (!this.f11602a.equals(leVar.f11602a) || !this.f11603b.equals(leVar.f11603b) || !this.f11604c.equals(leVar.f11604c) || !this.f11605d.equals(leVar.f11605d)) {
            return false;
        }
        Object obj2 = h1.f11446c;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((((((this.f11602a.hashCode() ^ 1000003) * 1000003) ^ this.f11603b.hashCode()) * 1000003) ^ this.f11604c.hashCode()) * 1000003) ^ this.f11605d.hashCode()) * 1000003) ^ h1.f11446c.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f11602a.toString();
        int length = string.length();
        String string2 = this.f11603b.toString();
        int length2 = string2.length();
        h1 h1Var = h1.f11446c;
        String strValueOf = String.valueOf(this.f11604c);
        String strValueOf2 = String.valueOf(this.f11605d);
        String string3 = h1Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        j4.s.A(sb2, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        j4.s.A(sb2, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return e0.f.n(sb2, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
