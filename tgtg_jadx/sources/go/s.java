package go;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.OrderId;
import g3.c1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.h1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20764b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f20763a = i11;
        this.f20764b = obj;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f20763a;
        r2.n nVar = r2.n.f37572a;
        m3.f fVar = m3.m.f29332a;
        Object obj4 = this.f20764b;
        switch (i11) {
            case 0:
                b4.t tVar = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(1702118549);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = a0.g(sVar);
                }
                b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new c1((a) obj4, 1), 28);
                sVar.q(false);
                return tVarB;
            case 1:
                String strM217unboximpl = ((OrderId) obj).m217unboximpl();
                String str = (String) obj2;
                String str2 = (String) obj3;
                a0.C(strM217unboximpl, str, str2);
                ManufacturerOrderActivity manufacturerOrderActivity = (ManufacturerOrderActivity) obj4;
                int i12 = ManufacturerOrderActivity.f9167q;
                lo.m mVarF0 = manufacturerOrderActivity.f0();
                cv.i iVar = cv.i.TEMP_ACTION_TRACK_PARCEL;
                dv.b bVarE = h0.g.E(new Pair(dv.a.ORDER_ID, new dv.c(strM217unboximpl)));
                mVarF0.getClass();
                iVar.getClass();
                mVarF0.f27982c.c(iVar, bVarE);
                lo.m mVarF02 = manufacturerOrderActivity.f0();
                ct.a aVar = ct.a.FAQ_ITEM_MANUFACTURER;
                Integer numValueOf = Integer.valueOf(R.string.webview_track_and_trace_title);
                mVarF02.getClass();
                aVar.getClass();
                mVarF02.f27987h.b(str, aVar, numValueOf, true, str2);
                return Unit.f26487a;
            case 2:
                b4.t tVar2 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(1702118549);
                Object objM2 = sVar2.M();
                if (objM2 == fVar) {
                    objM2 = a0.g(sVar2);
                }
                b4.t tVarB2 = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, null, null, new c1((h1) obj4, 2), 28);
                sVar2.q(false);
                return tVarB2;
            case 3:
                b4.t tVar3 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar3.getClass();
                m3.s sVar3 = (m3.s) ((m3.n) obj2);
                sVar3.a0(1702118549);
                Object objM3 = sVar3.M();
                if (objM3 == fVar) {
                    objM3 = a0.g(sVar3);
                }
                b4.t tVarB3 = androidx.compose.foundation.b.b(tVar3, (b2.l) objM3, null, false, null, null, new c1((kn.d) obj4, 5), 28);
                sVar3.q(false);
                return tVarB3;
            case 4:
                long j9 = ((i4.v) obj).f23317a;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar2).e(j9) ? 4 : 2;
                }
                m3.s sVar4 = (m3.s) nVar2;
                if (sVar4.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    r2.h.b(j9, ((p2.d) obj4).f34132c, sVar4, (iIntValue << 3) & 112);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 5:
                long j11 = ((i4.v) obj).f23317a;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m3.s sVar5 = (m3.s) nVar3;
                if (sVar5.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nVar.a((Drawable) obj4, sVar5, 48);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 6:
                long j12 = ((i4.v) obj).f23317a;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m3.s sVar6 = (m3.s) nVar4;
                if (sVar6.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nVar.b(((RemoteAction) obj4).getIcon(), sVar6, 48);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 7:
                b4.t tVar4 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar4.getClass();
                m3.s sVar7 = (m3.s) ((m3.n) obj2);
                sVar7.a0(1702118549);
                Object objM4 = sVar7.M();
                if (objM4 == fVar) {
                    objM4 = a0.g(sVar7);
                }
                b4.t tVarB4 = androidx.compose.foundation.b.b(tVar4, (b2.l) objM4, null, false, null, null, new c1((Function1) obj4, 6), 28);
                sVar7.q(false);
                return tVarB4;
            default:
                b4.t tVar5 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar5.getClass();
                m3.s sVar8 = (m3.s) ((m3.n) obj2);
                sVar8.a0(1702118549);
                Object objM5 = sVar8.M();
                if (objM5 == fVar) {
                    objM5 = a0.g(sVar8);
                }
                b4.t tVarB5 = androidx.compose.foundation.b.b(tVar5, (b2.l) objM5, null, false, null, null, new c1((jd.f) obj4, 7), 28);
                sVar8.q(false);
                return tVarB5;
        }
    }
}
