package us;

import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import i2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ss.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f41552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t5.a f41553c;

    public /* synthetic */ r(d1 d1Var, t5.a aVar, int i11) {
        this.f41551a = i11;
        this.f41552b = d1Var;
        this.f41553c = aVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f41551a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    b4.t tVarD = d2.c.D(b4.q.f5711a, 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7);
                    SpecialReward specialReward = (SpecialReward) this.f41552b.f39155b.get(iIntValue);
                    t5.a aVar = this.f41553c;
                    boolean zH = sVar.h(aVar);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new sg.c(aVar, 12);
                        sVar.k0(objM);
                    }
                    os.a.e(tVarD, specialReward, false, (Function1) objM, sVar, 6, 4);
                } else {
                    sVar.U();
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).intValue();
                ((w) obj).getClass();
                d1 d1Var = this.f41552b;
                t5.a aVar2 = this.f41553c;
                if (iIntValue3 == 0) {
                    m3.s sVar2 = (m3.s) nVar2;
                    sVar2.a0(397549675);
                    a.q(d1Var, aVar2, sVar2, 0);
                    sVar2.q(false);
                } else if (iIntValue3 != 1) {
                    m3.s sVar3 = (m3.s) nVar2;
                    sVar3.a0(-560575242);
                    sVar3.q(false);
                } else {
                    m3.s sVar4 = (m3.s) nVar2;
                    sVar4.a0(397554597);
                    a.g(d1Var, aVar2, sVar4, 0);
                    sVar4.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
