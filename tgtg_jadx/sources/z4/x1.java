package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f47247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(y1 y1Var, int i11) {
        super(2);
        this.f47246a = i11;
        this.f47247b = y1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47246a) {
            case 0:
                this.f47247b.a().f47201b = (m3.x) obj2;
                break;
            case 1:
                q0 q0VarA = this.f47247b.a();
                ((b5.m0) obj).f0(new n0(q0VarA, (Function2) obj2, q0VarA.f47214p));
                break;
            default:
                b5.m0 m0Var = (b5.m0) obj;
                y1 y1Var = this.f47247b;
                a2 a2Var = y1Var.f47250a;
                q0 q0Var = m0Var.I;
                if (q0Var == null) {
                    q0Var = new q0(m0Var, a2Var);
                    m0Var.I = q0Var;
                }
                y1Var.f47251b = q0Var;
                y1Var.a().g();
                q0 q0VarA2 = y1Var.a();
                if (q0VarA2.f47202c != a2Var) {
                    q0VarA2.f47202c = a2Var;
                    q0VarA2.h(false);
                    b5.m0.Y(q0VarA2.f47200a, false, 7);
                }
                break;
        }
        return Unit.f26487a;
    }
}
