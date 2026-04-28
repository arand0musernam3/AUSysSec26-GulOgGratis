package dq;

import b0.z;
import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15143a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f15145c;

    public /* synthetic */ d(f0 f0Var, Function0 function0) {
        this.f15144b = f0Var;
        this.f15145c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15143a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f0 f0Var = this.f15144b;
                    boolean zH = sVar.h(f0Var);
                    Function0 function0 = this.f15145c;
                    boolean zF = zH | sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new e(f0Var, function0);
                        sVar.k0(objM);
                    }
                    z.h(f0Var, "Question", null, null, null, null, null, null, null, (Function1) objM, sVar, 48, 1020);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j.b(this.f15144b, this.f15145c, (n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(f0 f0Var, Function0 function0, int i11) {
        this.f15144b = f0Var;
        this.f15145c = function0;
    }
}
