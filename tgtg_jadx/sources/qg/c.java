package qg;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37051a;

    public c(String str) {
        this.f37051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f37051a, ((c) obj).f37051a);
    }

    public final int hashCode() {
        return this.f37051a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return a0.p("OrderException(code=", this.f37051a, ")");
    }
}
