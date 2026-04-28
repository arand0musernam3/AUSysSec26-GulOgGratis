package s1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f38641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f38642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f38643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f38644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f38646f;

    /* JADX WARN: Illegal instructions before constructor call */
    public l1(z0 z0Var, j1 j1Var, c0 c0Var, c1 c1Var, LinkedHashMap linkedHashMap, int i11) {
        z0 z0Var2 = (i11 & 1) != 0 ? null : z0Var;
        j1 j1Var2 = (i11 & 2) != 0 ? null : j1Var;
        c0 c0Var2 = (i11 & 4) != 0 ? null : c0Var;
        c1 c1Var2 = (i11 & 8) != 0 ? null : c1Var;
        boolean z11 = (i11 & 32) == 0;
        Map map = linkedHashMap;
        if ((i11 & 64) != 0) {
            kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
            o0Var.getClass();
            map = o0Var;
        }
        this(z0Var2, j1Var2, c0Var2, c1Var2, z11, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.areEqual(this.f38641a, l1Var.f38641a) && Intrinsics.areEqual(this.f38642b, l1Var.f38642b) && Intrinsics.areEqual(this.f38643c, l1Var.f38643c) && Intrinsics.areEqual(this.f38644d, l1Var.f38644d) && Intrinsics.areEqual((Object) null, (Object) null) && this.f38645e == l1Var.f38645e && Intrinsics.areEqual(this.f38646f, l1Var.f38646f);
    }

    public final int hashCode() {
        z0 z0Var = this.f38641a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        j1 j1Var = this.f38642b;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        c0 c0Var = this.f38643c;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        c1 c1Var = this.f38644d;
        return this.f38646f.hashCode() + r8.k.e((iHashCode3 + (c1Var != null ? c1Var.hashCode() : 0)) * 961, 31, this.f38645e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f38641a + ", slide=" + this.f38642b + ", changeSize=" + this.f38643c + ", scale=" + this.f38644d + ", veil=null, hold=" + this.f38645e + ", effectsMap=" + this.f38646f + ')';
    }

    public l1(z0 z0Var, j1 j1Var, c0 c0Var, c1 c1Var, boolean z11, Map map) {
        this.f38641a = z0Var;
        this.f38642b = j1Var;
        this.f38643c = c0Var;
        this.f38644d = c1Var;
        this.f38645e = z11;
        this.f38646f = map;
    }
}
