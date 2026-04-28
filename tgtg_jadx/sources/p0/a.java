package p0;

import df.g;
import java.util.List;
import java.util.Set;
import m0.c0;
import m0.m1;
import s0.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34095c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f34096a = c0.f28479e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34097b = b.DYNAMIC_RANGE;

    @Override // n0.b
    public final b a() {
        return this.f34097b;
    }

    @Override // n0.b
    public final boolean b(g gVar, g0 g0Var) {
        Set setA = g0Var.a();
        setA.getClass();
        wd.a.p("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setA + ", this = " + this);
        c0 c0Var = this.f34096a;
        if (!setA.contains(c0Var)) {
            return false;
        }
        for (m1 m1Var : (List) gVar.f14899g) {
            Set setK = m1Var.k(g0Var);
            wd.a.p("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setK + ", this = " + this + ", useCases = " + m1Var);
            if (setK != null && !setK.contains(c0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f34096a + ')';
    }
}
