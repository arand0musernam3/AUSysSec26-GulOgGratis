package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.l f11490b;

    public ia(Context context, j30.l lVar) {
        this.f11489a = context;
        this.f11490b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        if (!this.f11489a.equals(iaVar.f11489a)) {
            return false;
        }
        j30.l lVar = iaVar.f11490b;
        j30.l lVar2 = this.f11490b;
        return lVar2 == null ? lVar == null : lVar2.equals(lVar);
    }

    public final int hashCode() {
        int iHashCode = this.f11489a.hashCode() ^ 1000003;
        j30.l lVar = this.f11490b;
        return (iHashCode * 1000003) ^ (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        String string = this.f11489a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f11490b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        j4.s.A(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
