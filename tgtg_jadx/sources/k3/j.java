package k3;

import b5.h1;
import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk3/j;", "Lb5/h1;", "Lk3/s;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f25827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f25828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f25829e;

    public j(boolean z11, Function0 function0, t tVar, float f11) {
        this.f25826b = z11;
        this.f25827c = function0;
        this.f25828d = tVar;
        this.f25829e = f11;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new s(this.f25826b, this.f25827c, this.f25828d, this.f25829e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f25826b == jVar.f25826b && this.f25827c == jVar.f25827c && Intrinsics.areEqual(this.f25828d, jVar.f25828d) && z5.f.c(this.f25829e, jVar.f25829e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25829e) + ((this.f25828d.hashCode() + ((this.f25827c.hashCode() + r8.k.e(Boolean.hashCode(this.f25826b) * 31, 31, true)) * 31)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "PullToRefreshModifierNode";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Boolean.valueOf(this.f25826b), "isRefreshing");
        l3Var.b(this.f25827c, "onRefresh");
        l3Var.b(Boolean.TRUE, FeatureFlag.ENABLED);
        l3Var.b(this.f25828d, "state");
        l3Var.b(new z5.f(this.f25829e), "threshold");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s sVar2 = (s) sVar;
        sVar2.f25861r = this.f25827c;
        sVar2.f25862s = true;
        sVar2.f25863t = this.f25828d;
        sVar2.f25864u = this.f25829e;
        boolean z11 = sVar2.f25860q;
        boolean z12 = this.f25826b;
        if (z11 != z12) {
            sVar2.f25860q = z12;
            f0.B(sVar2.getCoroutineScope(), null, null, new p(sVar2, null, 2), 3);
        }
    }
}
