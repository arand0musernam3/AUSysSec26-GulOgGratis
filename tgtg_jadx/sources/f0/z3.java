package f0;

import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f17023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f17024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f17026g;

    public z3(int i11, ArrayList arrayList, ArrayList arrayList2, Executor executor, s2 s2Var, int i12, Map map) {
        executor.getClass();
        s2Var.getClass();
        map.getClass();
        this.f17020a = i11;
        this.f17021b = arrayList;
        this.f17022c = arrayList2;
        this.f17023d = executor;
        this.f17024e = s2Var;
        this.f17025f = i12;
        this.f17026g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.f17020a == z3Var.f17020a && Intrinsics.areEqual(this.f17021b, z3Var.f17021b) && Intrinsics.areEqual(this.f17022c, z3Var.f17022c) && Intrinsics.areEqual(this.f17023d, z3Var.f17023d) && Intrinsics.areEqual(this.f17024e, z3Var.f17024e) && this.f17025f == z3Var.f17025f && Intrinsics.areEqual(this.f17026g, z3Var.f17026g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17020a) * 31;
        List list = this.f17021b;
        return w.a0.f(this.f17026g, r8.k.b(this.f17025f, (this.f17024e.hashCode() + ((this.f17023d.hashCode() + ((this.f17022c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.f17020a + ", inputConfiguration=" + this.f17021b + ", outputConfigurations=" + this.f17022c + ", executor=" + this.f17023d + ", stateCallback=" + this.f17024e + ", sessionTemplateId=" + this.f17025f + ", sessionParameters=" + this.f17026g + ", sessionColorSpace=" + ((Object) Address.ADDRESS_NULL_PLACEHOLDER) + ')';
    }
}
