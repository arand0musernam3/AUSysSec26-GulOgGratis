package ts;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40439a = System.currentTimeMillis();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f40439a == ((b0) obj).f40439a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40439a);
    }

    public final String toString() {
        return l1.e("GoToHome(timestamp=", this.f40439a, ")");
    }
}
