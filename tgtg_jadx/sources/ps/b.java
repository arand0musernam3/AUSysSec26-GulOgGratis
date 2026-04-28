package ps;

import b4.q;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import d2.c;
import f2.d;
import i80.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lv.t;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f35617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f35618c;

    public /* synthetic */ b(List list, Function1 function1, int i11) {
        this.f35616a = i11;
        this.f35617b = list;
        this.f35618c = function1;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f35616a;
        d dVar = (d) obj;
        int iIntValue = ((Integer) obj2).intValue();
        n nVar = (n) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        switch (i11) {
            case 0:
                dVar.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    float f11 = t.f28253g;
                    b4.t tVarD = c.D(q.f5711a, f11, 0.0f, f11, f11, 2);
                    SpecialReward specialReward = (SpecialReward) this.f35617b.get(iIntValue);
                    Function1 function1 = this.f35618c;
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new defpackage.d(function1, 28);
                        sVar.k0(objM);
                    }
                    os.a.e(tVarD, specialReward, false, (Function1) objM, sVar, 6, 4);
                } else {
                    sVar.U();
                }
                break;
            default:
                dVar.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    float f12 = t.f28253g;
                    b4.t tVarD2 = c.D(q.f5711a, f12, 0.0f, f12, f12, 2);
                    SpecialReward specialReward2 = (SpecialReward) this.f35617b.get(iIntValue);
                    Function1 function12 = this.f35618c;
                    boolean zF2 = sVar2.f(function12);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m.f29332a) {
                        objM2 = new defpackage.d(function12, 29);
                        sVar2.k0(objM2);
                    }
                    os.a.e(tVarD2, specialReward2, false, (Function1) objM2, sVar2, 6, 4);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
