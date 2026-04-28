package ks;

import b3.i;
import b4.q;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import d2.m2;
import i80.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f26662c;

    public /* synthetic */ d(ArrayList arrayList, b1 b1Var, int i11) {
        this.f26660a = i11;
        this.f26661b = arrayList;
        this.f26662c = b1Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f26660a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                n nVar = (n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    BasicSavedPaymentMethod basicSavedPaymentMethod = (BasicSavedPaymentMethod) this.f26661b.get(iIntValue);
                    sVar.a0(-1847897159);
                    float f11 = 4;
                    q qVar = q.f5711a;
                    d2.c.f(m2.m(qVar, f11), sVar);
                    boolean zF = sVar.f(basicSavedPaymentMethod);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new b(this.f26662c, basicSavedPaymentMethod, 0);
                        sVar.k0(objM);
                    }
                    ls.a.a(basicSavedPaymentMethod, (Function0) objM, sVar, 0);
                    i.y(qVar, f11, sVar, false);
                } else {
                    sVar.U();
                }
                break;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                n nVar2 = (n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    BasicSavedPaymentMethod basicSavedPaymentMethod2 = (BasicSavedPaymentMethod) this.f26661b.get(iIntValue3);
                    sVar2.a0(-1934616932);
                    float f12 = 4;
                    q qVar2 = q.f5711a;
                    d2.c.f(m2.m(qVar2, f12), sVar2);
                    boolean zF2 = sVar2.f(basicSavedPaymentMethod2);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m.f29332a) {
                        objM2 = new b(this.f26662c, basicSavedPaymentMethod2, 1);
                        sVar2.k0(objM2);
                    }
                    ls.a.a(basicSavedPaymentMethod2, (Function0) objM2, sVar2, 0);
                    i.y(qVar2, f12, sVar2, false);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
