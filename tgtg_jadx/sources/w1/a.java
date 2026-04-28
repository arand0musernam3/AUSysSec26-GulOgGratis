package w1;

import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f42825b = new a("text/*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42826c = new a("*/*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42827a;

    public a(String str) {
        this.f42827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.f42827a, ((a) obj).f42827a);
    }

    public final int hashCode() {
        return this.f42827a.hashCode();
    }

    public final String toString() {
        return k.p(new StringBuilder("MediaType(representation='"), this.f42827a, "')");
    }
}
