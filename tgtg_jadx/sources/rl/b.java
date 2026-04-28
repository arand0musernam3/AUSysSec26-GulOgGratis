package rl;

import b0.a0;
import b0.x1;
import b0.z;
import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38128a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f38129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f38130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f38131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f38132e;

    public /* synthetic */ b(f0 f0Var, Function0 function0, Function0 function02, Function2 function2) {
        this.f38129b = f0Var;
        this.f38130c = function0;
        this.f38132e = function02;
        this.f38131d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38128a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVar = e.INSTANCE;
                    f0 f0Var = this.f38129b;
                    boolean zH = sVar.h(f0Var);
                    Function0 function0 = this.f38130c;
                    boolean zF = zH | sVar.f(function0);
                    Function0 function02 = this.f38132e;
                    boolean zF2 = zF | sVar.f(function02);
                    Function2 function2 = this.f38131d;
                    boolean zF3 = zF2 | sVar.f(function2);
                    Object objM = sVar.M();
                    if (zF3 || objM == m.f29332a) {
                        x1 x1Var = new x1(24, f0Var, function0, function02, function2);
                        sVar.k0(x1Var);
                        objM = x1Var;
                    }
                    z.g(f0Var, eVar, null, null, null, nv.b.f31400a, nv.b.f31401b, nv.b.f31402c, nv.b.f31403d, (Function1) objM, sVar, 920125488, 1084);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a0.e(this.f38129b, this.f38130c, this.f38131d, this.f38132e, (n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(f0 f0Var, Function0 function0, Function2 function2, Function0 function02, int i11) {
        this.f38129b = f0Var;
        this.f38130c = function0;
        this.f38131d = function2;
        this.f38132e = function02;
    }
}
