package am;

import b0.z;
import b4.t;
import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1604a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f1606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f1607d;

    public /* synthetic */ b(t tVar, f0 f0Var, Function1 function1, int i11) {
        this.f1605b = tVar;
        this.f1606c = f0Var;
        this.f1607d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1604a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i iVar = new i("");
                    Function1 function1 = this.f1607d;
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new defpackage.d(function1, 1);
                        sVar.k0(objM);
                    }
                    f0 f0Var = this.f1606c;
                    t tVar = this.f1605b;
                    nv.a aVar = nv.b.f31405f;
                    nv.a aVar2 = nv.b.f31406g;
                    z.g(f0Var, iVar, tVar, null, null, aVar, aVar2, aVar, aVar2, (Function1) objM, sVar, 920125440, 1080);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jf.e.i(this.f1605b, this.f1606c, this.f1607d, (n) obj, m3.i.F(7));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(f0 f0Var, t tVar, Function1 function1) {
        this.f1606c = f0Var;
        this.f1605b = tVar;
        this.f1607d = function1;
    }
}
