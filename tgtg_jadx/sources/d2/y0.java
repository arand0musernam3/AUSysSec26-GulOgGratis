package d2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f13974b;

    public /* synthetic */ y0(z0 z0Var, int i11) {
        this.f13973a = i11;
        this.f13974b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b5.q2 q2Var = (b5.q2) obj;
        switch (this.f13973a) {
            case 0:
                q2Var.getClass();
                z0 z0Var = (z0) q2Var;
                y2 y2Var = this.f13974b.f13982p;
                if (!Intrinsics.areEqual(z0Var.f13981o, y2Var)) {
                    z0Var.f13981o = y2Var;
                    z0Var.M0();
                }
                return b5.p2.SkipSubtreeAndContinueTraversal;
            default:
                q2Var.getClass();
                this.f13974b.f13981o = ((z0) q2Var).f13982p;
                return Boolean.FALSE;
        }
    }
}
