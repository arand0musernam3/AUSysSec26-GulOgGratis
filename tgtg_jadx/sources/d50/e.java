package d50;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14424a;

    public e(String str) {
        str.getClass();
        this.f14424a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f14424a, ((e) obj).f14424a);
    }

    public final int hashCode() {
        return this.f14424a.hashCode();
    }

    public final String toString() {
        return l1.f(new StringBuilder("SessionDetails(sessionId="), this.f14424a, ')');
    }
}
