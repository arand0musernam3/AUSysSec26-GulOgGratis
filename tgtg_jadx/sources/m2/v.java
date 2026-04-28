package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f29095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f29096c;

    public /* synthetic */ v(e2 e2Var, Function1 function1, int i11) {
        this.f29094a = i11;
        this.f29095b = e2Var;
        this.f29096c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29094a) {
            case 0:
                m5.q0 q0Var = (m5.q0) obj;
                e2 e2Var = this.f29095b;
                if (e2Var != null) {
                    e2Var.f28843a.setValue(q0Var);
                }
                Function1 function1 = this.f29096c;
                if (function1 != null) {
                    function1.invoke(q0Var);
                }
                return Unit.f26487a;
            default:
                e2 e2Var2 = this.f29095b;
                z3.r rVar = e2Var2.f28845c;
                Function1 function12 = this.f29096c;
                rVar.add(function12);
                return new c5.s0(11, e2Var2, function12);
        }
    }
}
