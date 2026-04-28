package s1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f38729b = new x0(new l1((z0) null, (j1) null, (c0) null, (c1) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f38730a;

    public x0(l1 l1Var) {
        this.f38730a = l1Var;
    }

    public final x0 a(x0 x0Var) {
        l1 l1Var = x0Var.f38730a;
        z0 z0Var = l1Var.f38641a;
        l1 l1Var2 = this.f38730a;
        if (z0Var == null) {
            z0Var = l1Var2.f38641a;
        }
        j1 j1Var = l1Var.f38642b;
        if (j1Var == null) {
            j1Var = l1Var2.f38642b;
        }
        c0 c0Var = l1Var.f38643c;
        if (c0Var == null) {
            c0Var = l1Var2.f38643c;
        }
        c1 c1Var = l1Var.f38644d;
        if (c1Var == null) {
            c1Var = l1Var2.f38644d;
        }
        return new x0(new l1(z0Var, j1Var, c0Var, c1Var, kotlin.collections.x0.g(l1Var2.f38646f, l1Var.f38646f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && Intrinsics.areEqual(((x0) obj).f38730a, this.f38730a);
    }

    public final int hashCode() {
        return this.f38730a.hashCode();
    }

    public final String toString() {
        if (Intrinsics.areEqual(this, f38729b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        l1 l1Var = this.f38730a;
        z0 z0Var = l1Var.f38641a;
        sb2.append(z0Var != null ? z0Var.toString() : null);
        sb2.append(",\nSlide - ");
        j1 j1Var = l1Var.f38642b;
        sb2.append(j1Var != null ? j1Var.toString() : null);
        sb2.append(",\nShrink - ");
        c0 c0Var = l1Var.f38643c;
        sb2.append(c0Var != null ? c0Var.toString() : null);
        sb2.append(",\nScale - ");
        c1 c1Var = l1Var.f38644d;
        sb2.append(c1Var != null ? c1Var.toString() : null);
        return sb2.toString();
    }
}
