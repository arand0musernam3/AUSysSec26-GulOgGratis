package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2.l1 f645b;

    public /* synthetic */ z0(m2.l1 l1Var, int i11) {
        this.f644a = i11;
        this.f645b = l1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f644a) {
            case 0:
                w4.v vVar = (w4.v) obj;
                this.f645b.e(w4.u.h(vVar, false));
                vVar.a();
                break;
            case 1:
                w4.v vVar2 = (w4.v) obj;
                this.f645b.e(w4.u.h(vVar2, false));
                vVar2.a();
                break;
            default:
                this.f645b.a(((h4.b) obj).f21378a, k0.f431d);
                break;
        }
        return Unit.f26487a;
    }
}
