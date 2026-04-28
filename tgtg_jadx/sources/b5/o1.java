package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f5911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(s1 s1Var, int i11) {
        super(0);
        this.f5910a = i11;
        this.f5911b = s1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5910a) {
            case 0:
                s1 s1Var = this.f5911b;
                i4.t tVar = s1Var.I;
                tVar.getClass();
                s1Var.X0(tVar, s1Var.H);
                break;
            default:
                s1 s1Var2 = this.f5911b.f5968r;
                if (s1Var2 != null) {
                    s1Var2.k1();
                }
                break;
        }
        return Unit.f26487a;
    }
}
