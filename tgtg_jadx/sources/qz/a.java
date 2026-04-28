package qz;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.h f37309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.d f37310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37311d;

    public a(com.google.android.gms.common.api.h hVar, com.google.android.gms.common.api.d dVar, String str) {
        this.f37309b = hVar;
        this.f37310c = dVar;
        this.f37311d = str;
        this.f37308a = Arrays.hashCode(new Object[]{hVar, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.i0.k(this.f37309b, aVar.f37309b) && com.google.android.gms.common.internal.i0.k(this.f37310c, aVar.f37310c) && com.google.android.gms.common.internal.i0.k(this.f37311d, aVar.f37311d);
    }

    public final int hashCode() {
        return this.f37308a;
    }
}
