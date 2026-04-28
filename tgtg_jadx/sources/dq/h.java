package dq;

import com.app.tgtg.R;
import d2.j2;
import g3.r9;
import i80.n;
import kotlin.Unit;
import lv.v;
import m3.s;
import m5.u0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15155b;

    public /* synthetic */ h(boolean z11, int i11) {
        this.f15154a = i11;
        this.f15155b = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        int i12;
        int i13 = this.f15154a;
        boolean z11 = this.f15155b;
        switch (i13) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (z11) {
                        i11 = -270885272;
                        i12 = R.string.bring_back_magic_skip;
                    } else {
                        i11 = -270882870;
                        i12 = R.string.bring_back_magic_submit;
                    }
                    r9.d(b3.i.j(i11, i12, sVar, sVar, false), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(v.f28274n, ((i4.v) d1.a(z11 ? lv.s.D : lv.s.J, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10).getValue()).f23317a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar, 0, 0, 131070);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    r9.d(f0.U(sVar2, !z11 ? R.string.orderview_delegate_tab_invitation_send_invitation_btn : R.string.orderview_delegate_tab_invitation_send_invitation_has_been_offered_btn), null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28281u, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
