package ep;

import g9.f0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f16277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f16278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f16279d;

    public /* synthetic */ f(c3 c3Var, d0 d0Var, f0 f0Var) {
        this.f16276a = 0;
        this.f16278c = c3Var;
        this.f16277b = d0Var;
        this.f16279d = f0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        s1.l lVar = (s1.l) obj;
        g9.l lVar2 = (g9.l) obj2;
        switch (this.f16276a) {
            case 0:
                ((Integer) obj4).getClass();
                lVar.getClass();
                lVar2.getClass();
                lp.d.g(null, (List) this.f16278c.getValue(), this.f16277b, this.f16279d, (m3.n) obj3, 0);
                return Unit.f26487a;
            case 1:
                ((Integer) obj4).getClass();
                lVar.getClass();
                lVar2.getClass();
                Unit unit = Unit.f26487a;
                m3.s sVar = (m3.s) ((m3.n) obj3);
                d0 d0Var = this.f16277b;
                boolean zH = sVar.h(d0Var);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (zH || objM == fVar) {
                    objM = new n(d0Var, null, 1);
                    sVar.k0(objM);
                }
                m3.i.h(unit, (Function2) objM, sVar);
                List list = (List) this.f16278c.getValue();
                boolean zH2 = sVar.h(d0Var);
                f0 f0Var = this.f16279d;
                boolean zH3 = zH2 | sVar.h(f0Var);
                Object objM2 = sVar.M();
                if (zH3 || objM2 == fVar) {
                    objM2 = new k(d0Var, f0Var, 3);
                    sVar.k0(objM2);
                }
                Function1 function1 = (Function1) objM2;
                boolean zH4 = sVar.h(d0Var);
                Object objM3 = sVar.M();
                if (zH4 || objM3 == fVar) {
                    objM3 = new j(d0Var, 4);
                    sVar.k0(objM3);
                }
                Function1 function12 = (Function1) objM3;
                boolean zH5 = sVar.h(f0Var);
                Object objM4 = sVar.M();
                if (zH5 || objM4 == fVar) {
                    objM4 = new dq.g(f0Var, 3);
                    sVar.k0(objM4);
                }
                lp.r.d(list, function1, function12, (Function0) objM4, sVar, 0);
                return unit;
            default:
                ((Integer) obj4).getClass();
                lVar.getClass();
                lVar2.getClass();
                Unit unit2 = Unit.f26487a;
                m3.s sVar2 = (m3.s) ((m3.n) obj3);
                d0 d0Var2 = this.f16277b;
                boolean zH6 = sVar2.h(d0Var2);
                Object objM5 = sVar2.M();
                m3.f fVar2 = m3.m.f29332a;
                if (zH6 || objM5 == fVar2) {
                    objM5 = new n(d0Var2, null, 3);
                    sVar2.k0(objM5);
                }
                m3.i.h(unit2, (Function2) objM5, sVar2);
                List list2 = (List) this.f16278c.getValue();
                boolean zH7 = sVar2.h(d0Var2);
                Object objM6 = sVar2.M();
                if (zH7 || objM6 == fVar2) {
                    objM6 = new j(d0Var2, 0);
                    sVar2.k0(objM6);
                }
                Function1 function13 = (Function1) objM6;
                f0 f0Var2 = this.f16279d;
                boolean zH8 = sVar2.h(f0Var2) | sVar2.h(d0Var2);
                Object objM7 = sVar2.M();
                if (zH8 || objM7 == fVar2) {
                    objM7 = new bs.b(28, f0Var2, d0Var2);
                    sVar2.k0(objM7);
                }
                lp.r.f(0, list2, (Function0) objM7, function13, sVar2);
                return unit2;
        }
    }

    public /* synthetic */ f(d0 d0Var, c3 c3Var, f0 f0Var, int i11) {
        this.f16276a = i11;
        this.f16277b = d0Var;
        this.f16278c = c3Var;
        this.f16279d = f0Var;
    }
}
