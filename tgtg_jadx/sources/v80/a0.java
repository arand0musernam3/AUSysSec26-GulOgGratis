package v80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f42067b = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42068a;

    public a0(String str) {
        super(f42067b);
        this.f42068a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.areEqual(this.f42068a, ((a0) obj).f42068a);
    }

    public final int hashCode() {
        return this.f42068a.hashCode();
    }

    public final String toString() {
        return w2.l1.f(new StringBuilder("CoroutineName("), this.f42068a, ')');
    }
}
