package rk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38048a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f38049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f38050c;

    public b0(Function1 function1, b1 b1Var) {
        this.f38050c = function1;
        this.f38049b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e0 e0Var;
        Function1 function1;
        switch (this.f38048a) {
            case 0:
                b1 b1Var = this.f38049b;
                int i11 = d0.$EnumSwitchMapping$0[((e0) b1Var.getValue()).ordinal()];
                if (i11 == 1) {
                    e0Var = e0.ORIGINAL;
                } else if (i11 != 2) {
                    e40.a.f();
                } else {
                    e0Var = e0.TRANSLATED;
                }
                b1Var.setValue(e0Var);
                this.f38050c.invoke((e0) b1Var.getValue());
                break;
            default:
                if (!((Boolean) this.f38049b.getValue()).booleanValue() && (function1 = this.f38050c) != null) {
                    function1.invoke(0);
                }
                break;
        }
        return Unit.f26487a;
    }

    public b0(b1 b1Var, Function1 function1) {
        this.f38049b = b1Var;
        this.f38050c = function1;
    }
}
