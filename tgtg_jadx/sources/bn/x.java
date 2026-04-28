package bn;

import android.net.Uri;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import g3.r9;
import h2.k0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.h1;
import m3.v1;
import nk.q0;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6534d;

    public /* synthetic */ x(int i11, k0 k0Var, Object obj) {
        this.f6531a = 10;
        this.f6534d = k0Var;
        this.f6533c = i11;
        this.f6532b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6531a) {
            case 0:
                ((Integer) obj2).intValue();
                lx.u.m((String) this.f6534d, (ym.y) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                m0.c.O((BaseItemMnuV2) this.f6534d, (ym.y) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                jb.u.u((h1) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                cp.a.b((Uri) this.f6534d, (Function0) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zz.f.f(this.f6533c, (bp.v) this.f6534d, (ap.n) this.f6532b, (m3.n) obj, m3.i.F(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((f2.n) this.f6534d).d(this.f6533c, this.f6532b, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((g2.k) this.f6534d).d(this.f6533c, this.f6532b, (m3.n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gn.a.l((fn.c) this.f6534d, (Function0) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                bx.o.C((go.a) this.f6534d, (Function0) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 9:
                Function0 function0 = (Function0) this.f6534d;
                ((Integer) obj2).intValue();
                bx.o.l(m3.i.F(this.f6533c | 1), (List) this.f6532b, function0, (m3.n) obj);
                break;
            case 10:
                k0 k0Var = (k0) this.f6534d;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k0Var.d(this.f6533c, this.f6532b, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 11:
                jl.d dVar = (jl.d) this.f6534d;
                hl.a aVar = (hl.a) this.f6532b;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i11 = this.f6533c;
                    if (i11 == 0) {
                        sVar2.a0(612780353);
                        wd.a.h(dVar, sVar2, 0);
                        sVar2.q(false);
                    } else if (i11 == 1 || i11 == 2) {
                        sVar2.a0(612783322);
                        boolean zH = sVar2.h(aVar) | sVar2.d(i11);
                        Object objM = sVar2.M();
                        if (zH || objM == m3.m.f29332a) {
                            objM = new b3.q(aVar, i11, 3);
                            sVar2.k0(objM);
                        }
                        xz.b.h(dVar, (Function1) objM, sVar2, 0);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(1816628537);
                        sVar2.q(false);
                    }
                } else {
                    sVar2.U();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((i2.r) this.f6534d).d(this.f6533c, this.f6532b, (m3.n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ji.i.c((b4.t) this.f6534d, (Product) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                lp.d.h(this.f6533c, (b4.t) this.f6534d, (i4.k0) this.f6532b, (m3.n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).intValue();
                m2.c.a((m5.h) this.f6534d, (List) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                m3.i.a((v1) this.f6534d, (Function2) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                m3.i.b((v1[]) this.f6534d, (Function2) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                oo.a.u((Function0) this.f6534d, (Function0) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                oo.a.G((Order) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                oo.a.d((Invitation) this.f6534d, (Function0) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 21:
                String str = (String) this.f6534d;
                h1 h1Var = (h1) this.f6532b;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iH = h1Var.h();
                    int i12 = this.f6533c;
                    r9.d(str, null, h1Var.h() == i12 ? lv.s.f28217b : lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, iH == i12 ? lv.v.f28275o : lv.v.f28274n, sVar3, 0, 0, 130042);
                } else {
                    sVar3.U();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                oo.a.M((String) this.f6534d, this.f6533c, (Function0) this.f6532b, (m3.n) obj, m3.i.F(1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                po.c.m((AllergensInfo) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                rk.e.c((q0) this.f6534d, (m1.a) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                rs.k.i((DiscountVoucher) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                rs.k.e((CountryBasedVoucher) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                rs.k.f((CurrencyBasedVoucher) this.f6534d, (Function1) this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                ((q1) this.f6534d).a(this.f6532b, (m3.n) obj, m3.i.F(this.f6533c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((u3.d) this.f6534d).d(this.f6532b, (m3.n) obj, m3.i.F(this.f6533c) | 1);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ x(int i11, Object obj, Object obj2, int i12) {
        this.f6531a = i12;
        this.f6533c = i11;
        this.f6534d = obj;
        this.f6532b = obj2;
    }

    public /* synthetic */ x(int i11, Object obj, Object obj2, int i12, int i13) {
        this.f6531a = i13;
        this.f6533c = i11;
        this.f6534d = obj;
        this.f6532b = obj2;
    }

    public /* synthetic */ x(Object obj, int i11, Object obj2, int i12, int i13) {
        this.f6531a = i13;
        this.f6534d = obj;
        this.f6533c = i11;
        this.f6532b = obj2;
    }

    public /* synthetic */ x(Object obj, Object obj2, int i11, int i12) {
        this.f6531a = i12;
        this.f6534d = obj;
        this.f6532b = obj2;
        this.f6533c = i11;
    }
}
