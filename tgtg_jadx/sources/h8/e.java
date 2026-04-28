package h8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21665a;

    public e(String str) {
        str.getClass();
        this.f21665a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f21665a, ((e) obj).f21665a);
    }

    public final int hashCode() {
        return this.f21665a.hashCode();
    }

    public final String toString() {
        return this.f21665a;
    }
}
