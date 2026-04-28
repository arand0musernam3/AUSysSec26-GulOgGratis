package p9;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f34617b;

    public /* synthetic */ h(q1 q1Var, int i11) {
        this.f34616a = i11;
        this.f34617b = q1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f34616a) {
            case 0:
                return Boolean.valueOf(this.f34617b.f39543g.h() != Long.MIN_VALUE);
            case 1:
                q1 q1Var = this.f34617b;
                return Boolean.valueOf((Intrinsics.areEqual(q1Var.f39540d.getValue(), q1Var.f39537a.j()) && q1Var.f39543g.h() == Long.MIN_VALUE && !((Boolean) q1Var.f39544h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f34617b.b());
        }
    }
}
