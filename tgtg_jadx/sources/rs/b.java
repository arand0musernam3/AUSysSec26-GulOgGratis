package rs;

import androidx.compose.ui.tooling.PreviewActivity;
import androidx.lifecycle.LifecycleOwner;
import b0.a0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.app.tgtg.model.remote.profile.response.StoreSignupCardDetails;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import d2.n1;
import g3.r1;
import g3.r9;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m2.t0;
import m3.b1;
import m3.s;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import ss.c1;
import ti.t;
import ti.w;
import um.u;
import w4.v;
import z1.k3;
import z1.l3;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38180d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i11) {
        this.f38177a = i11;
        this.f38178b = obj;
        this.f38179c = obj2;
        this.f38180d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i11 = this.f38177a;
        m3.f fVar = m3.m.f29332a;
        b4.q qVar = b4.q.f5711a;
        Object obj3 = this.f38180d;
        Object obj4 = this.f38179c;
        Object obj5 = this.f38178b;
        switch (i11) {
            case 0:
                VoucherMode voucherMode = (VoucherMode) obj5;
                x60.j jVar = (x60.j) obj4;
                x60.h hVar = (x60.h) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r9.d(f0.U(sVar, voucherMode.getAddNewBottomSheetHint()), null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131066);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                k.q((n1) obj5, (List) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v0.n.g((nk.f) obj5, (m1.a) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                t.b((b4.t) obj5, (ti.s) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                w.b((YearMonth) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(433));
                break;
            case 5:
                ((Integer) obj2).getClass();
                v0.n.m((b4.t) obj5, (Order) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                x60.m mVar = (x60.m) obj5;
                c1 c1Var = (c1) obj4;
                t5.a aVar = (t5.a) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b4.t tVarA = d2.c.A(qVar, mVar.f44010f, mVar.f44015k);
                    String name = c1Var.f39144a.getName();
                    String shortDescription = c1Var.f39144a.getShortDescription();
                    PageHeaderState pageHeaderState = PageHeaderState.Full;
                    boolean zH = sVar2.h(aVar);
                    Object objM = sVar2.M();
                    if (zH || objM == fVar) {
                        objM = new l(3, aVar);
                        sVar2.k0(objM);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader(name, pageHeaderState, (Function0) objM, tVarA, shortDescription, null, null, null, null, null, sVar2, 48, 992);
                } else {
                    sVar2.U();
                }
                break;
            case 7:
                x60.m mVar2 = (x60.m) obj5;
                t5.a aVar2 = (t5.a) obj4;
                b1 b1Var = (b1) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b4.t tVarA2 = d2.c.A(qVar, mVar2.f44010f, mVar2.f44015k);
                    String strU = f0.U(sVar3, R.string.voucher_title);
                    PageHeaderState pageHeaderState2 = PageHeaderState.Full;
                    boolean zH2 = sVar3.h(aVar2);
                    Object objM2 = sVar3.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new l(6, aVar2);
                        sVar3.k0(objM2);
                    }
                    PagePantryPageHeaderKt.PagePantryPageHeader(strU, pageHeaderState2, (Function0) objM2, tVarA2, null, null, u3.e.e(-1842494028, sVar3, new r1(b1Var, 10)), null, null, null, sVar3, 1572912, 944);
                } else {
                    sVar3.U();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                vi.c.w((b1) obj5, (z) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                na0.a.F((BasketItem) obj5, (b1) obj4, (b4.t) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 10:
                ((Integer) obj2).getClass();
                na0.a.O((um.t) obj5, (u) obj4, (ym.z) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                w8.e.a((androidx.lifecycle.w) obj5, (LifecycleOwner) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 12:
                ((Integer) obj2).getClass();
                bx.k.h((StoreSignupCardDetails) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 13:
                Ref.LongRef longRef = (Ref.LongRef) obj5;
                x2.w wVar = (x2.w) obj4;
                v vVar = (v) obj;
                long jF = h4.b.f(longRef.element, ((h4.b) obj2).f21378a);
                longRef.element = jF;
                wVar.z(t0.Cursor, h4.b.f(((Ref.LongRef) obj3).element, jF));
                if (wVar.u(wVar.n())) {
                    vVar.a();
                    r4.a aVar3 = wVar.f43790j;
                    if (aVar3 != null) {
                        aVar3.a(9);
                    }
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                xi.f.a((CreateOrderResponse.CreateOrderState) obj5, (ItemType) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                xz.b.b((uq.e) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 16:
                String str = (String) obj5;
                String str2 = (String) obj4;
                Object[] objArr = (Object[]) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i12 = PreviewActivity.f2256c;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    a0.D(str, str2, sVar4, Arrays.copyOf(objArr, 0));
                } else {
                    sVar4.U();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                yl.a.c((b4.t) obj5, (yl.i) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 18:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj5;
                l3 l3Var = (l3) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = l3Var.h(l3Var.d(fFloatValue - floatRef.element));
                l3 l3Var2 = ((k3) obj3).f46577a;
                floatRef.element += l3Var.d(l3Var.g(l3Var2.c(l3Var2.f46594k, jH, 1)));
                break;
            default:
                ((Integer) obj2).getClass();
                zl.a.c((b4.t) obj5, (zl.g) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(7));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f38177a = i12;
        this.f38178b = obj;
        this.f38179c = obj2;
        this.f38180d = obj3;
    }
}
