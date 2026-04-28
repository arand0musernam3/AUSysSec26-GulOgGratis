package cg;

import com.app.tgtg.R;
import d2.j2;
import g3.d8;
import g3.i2;
import g3.p8;
import g3.r9;
import kotlin.Unit;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8116b;

    public /* synthetic */ t(int i11, int i12) {
        this.f8115a = i12;
        this.f8116b = i11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f8115a;
        int i12 = this.f8116b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r9.d(o30.f0.U(sVar, i12), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                pd.g.e(o30.f0.T(R.string.blob_info_row_multiple_orders, new Object[]{Integer.valueOf(i12)}, nVar2), false, nVar2, 0, 2);
                break;
            case 2:
                m3.n nVar3 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                pd.g.e(o30.f0.G(R.plurals.blob_info_row_unread_messages, i12, new Object[]{Integer.valueOf(i12)}, nVar3), false, nVar3, 0, 2);
                break;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.t) obj).getClass();
                m3.s sVar2 = (m3.s) nVar4;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i2.a(o00.x0.z(i12, sVar2, 0), "", null, 0L, sVar2, 56, 12);
                } else {
                    sVar2.U();
                }
                break;
            case 4:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar3 = (m3.s) nVar5;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    r9.d(o30.f0.U(sVar3, i12), null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar3.U();
                }
                break;
            default:
                d8 d8Var = (d8) obj;
                ((Integer) obj3).getClass();
                d8Var.getClass();
                p8.f19327a.c(d8Var.a(i12, false), 0.0f, lv.s.f28217b, (m3.n) obj2, MLKEMEngine.KyberPolyBytes, 2);
                break;
        }
        return Unit.f26487a;
    }
}
