package xl;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44454a;

    public h(String str) {
        str.getClass();
        this.f44454a = str;
    }

    @Override // xl.j
    public final String a() {
        return this.f44454a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f44454a, ((h) obj).f44454a);
    }

    public final int hashCode() {
        return this.f44454a.hashCode();
    }

    public final String toString() {
        return a0.p("SelectCountry(email=", this.f44454a, ")");
    }
}
