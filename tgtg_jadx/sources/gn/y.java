package gn;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f20687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fn.c f20688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f20691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f20692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f20693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3.r f20694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z3.u f20695i;

    public y(List list, fn.c cVar, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, z3.r rVar, z3.u uVar) {
        this.f20687a = list;
        this.f20688b = cVar;
        this.f20689c = function1;
        this.f20690d = function12;
        this.f20691e = function2;
        this.f20692f = function13;
        this.f20693g = function0;
        this.f20694h = rVar;
        this.f20695i = uVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        f2.d dVar = (f2.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.n nVar = (m3.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
        }
        boolean z11 = true;
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
            nq.d dVar2 = (nq.d) this.f20687a.get(iIntValue);
            sVar.a0(-293416789);
            z3.r rVar = this.f20694h;
            boolean zF = sVar.f(rVar);
            fn.c cVar = this.f20688b;
            boolean zH = zF | sVar.h(cVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new bn.b0(4, rVar, cVar);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            if ((((i11 & 112) ^ 48) <= 32 || !sVar.d(iIntValue)) && (i11 & 48) != 32) {
                z11 = false;
            }
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new x(this.f20695i, iIntValue);
                sVar.k0(objM2);
            }
            a.c(dVar2, this.f20688b, this.f20689c, this.f20690d, this.f20691e, this.f20692f, this.f20693g, function0, (Function1) objM2, sVar, 0);
            sVar.q(false);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
