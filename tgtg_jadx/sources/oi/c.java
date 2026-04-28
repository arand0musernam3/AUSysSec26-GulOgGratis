package oi;

import b4.q;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.charity.CharityHomePartnerStore;
import dp.j;
import i80.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32566b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f32565a = i11;
        this.f32566b = obj;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13 = this.f32565a;
        Object obj5 = this.f32566b;
        switch (i13) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                n nVar = (n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = iIntValue2 | (((s) nVar).f(dVar) ? 4 : 2);
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    CharityHomePartnerStore charityHomePartnerStore = (CharityHomePartnerStore) ((List) obj5).get(iIntValue);
                    sVar.a0(-283555118);
                    a.a(charityHomePartnerStore, null, false, sVar, 0, 6);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                n nVar2 = (n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = iIntValue4 | (((s) nVar2).f(dVar2) ? 4 : 2);
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    CharityHomePartnerStore charityHomePartnerStore2 = (CharityHomePartnerStore) ((List) obj5).get(iIntValue3);
                    sVar2.a0(-2098743888);
                    a.a(charityHomePartnerStore2, null, false, sVar2, MLKEMEngine.KyberPolyBytes, 2);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                n nVar3 = (n) obj3;
                ((Number) obj4).intValue();
                ap.n nVar4 = (ap.n) obj5;
                ((l) obj).getClass();
                q qVar = q.f5711a;
                f fVar = m.f29332a;
                if (zBooleanValue) {
                    s sVar3 = (s) nVar3;
                    sVar3.a0(-1929453353);
                    String strU = f0.U(sVar3, R.string.rating_cta_skip_question);
                    boolean zH = sVar3.h(nVar4);
                    Object objM = sVar3.M();
                    if (zH || objM == fVar) {
                        objM = new j(nVar4, 1);
                        sVar3.k0(objM);
                    }
                    v0.n.o(qVar, strU, null, null, null, false, (Function0) objM, sVar3, 6, 0, 1020);
                    sVar3.q(false);
                } else {
                    s sVar4 = (s) nVar3;
                    sVar4.a0(-1929195619);
                    String strU2 = f0.U(sVar4, R.string.rating_cta_continue);
                    boolean zH2 = sVar4.h(nVar4);
                    Object objM2 = sVar4.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new j(nVar4, 2);
                        sVar4.k0(objM2);
                    }
                    v0.n.l(qVar, strU2, null, null, null, false, false, null, null, (Function0) objM2, sVar4, 6, 508);
                    sVar4.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
