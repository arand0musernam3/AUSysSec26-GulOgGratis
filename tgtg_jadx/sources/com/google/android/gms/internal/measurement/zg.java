package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zg implements rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg f12096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12097b;

    public zg(rg rgVar, Object obj) {
        this.f12096a = rgVar;
        g1.c(obj, "log site qualifier");
        this.f12097b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj;
        return this.f12096a.equals(zgVar.f12096a) && this.f12097b.equals(zgVar.f12097b);
    }

    public final int hashCode() {
        return this.f12096a.hashCode() ^ this.f12097b.hashCode();
    }

    public final String toString() {
        String string = this.f12096a.toString();
        int length = string.length();
        String string2 = this.f12097b.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        j4.s.A(sb2, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
