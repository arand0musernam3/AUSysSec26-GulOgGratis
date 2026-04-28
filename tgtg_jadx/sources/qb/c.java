package qb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f36791b;

    public c(String str, Long l) {
        this.f36790a = str;
        this.f36791b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f36790a, cVar.f36790a) && Intrinsics.areEqual(this.f36791b, cVar.f36791b);
    }

    public final int hashCode() {
        return this.f36791b.hashCode() + (this.f36790a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f36790a + ", value=" + this.f36791b + ')';
    }
}
