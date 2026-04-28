package xl;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44453a;

    public g(String str) {
        str.getClass();
        this.f44453a = str;
    }

    @Override // xl.j
    public final String a() {
        return this.f44453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f44453a, ((g) obj).f44453a);
    }

    public final int hashCode() {
        return this.f44453a.hashCode();
    }

    public final String toString() {
        return a0.p("EnterEmail(email=", this.f44453a, ")");
    }
}
