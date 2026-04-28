package f70;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17500a;

    public p(String str) {
        this.f17500a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f17500a, ((p) obj).f17500a);
    }

    public final int hashCode() {
        return this.f17500a.hashCode();
    }

    public final String toString() {
        return a0.p("SendEmail(email=", this.f17500a, ")");
    }
}
