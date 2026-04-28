package z1;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g3 f46421b;

    public /* synthetic */ b3(g3 g3Var, int i11) {
        this.f46420a = i11;
        this.f46421b = g3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46420a) {
            case 0:
                return Boolean.valueOf(this.f46421b.isAttached());
            default:
                b5.l lVar = this.f46421b.P;
                if (!((b4.s) lVar).getNode().isAttached()) {
                    return null;
                }
                g4.b0 b0VarQ0 = ((g4.g0) lVar).Q0();
                if (!b0VarQ0.a()) {
                    return null;
                }
                if (b0VarQ0.c()) {
                    return ((g4.g0) lVar).O0(null);
                }
                g4.g0 g0VarH = ((g4.p) ((c5.y) b5.m.h(lVar)).getFocusOwner()).h();
                if (g0VarH != null) {
                    return g0VarH.O0(b5.m.f(lVar));
                }
                return null;
        }
    }
}
