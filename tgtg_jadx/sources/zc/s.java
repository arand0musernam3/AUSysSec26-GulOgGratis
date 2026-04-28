package zc;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f47515b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47516a;

    static {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        f47515b = new s(o0Var);
    }

    public s(Map map) {
        this.f47516a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f47516a, ((s) obj).f47516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47516a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f47516a + ')';
    }
}
