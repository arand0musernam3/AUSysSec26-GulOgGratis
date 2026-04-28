package gn;

import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentDetailActivity;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchElement;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.tgtg.componentlibrary.component.chip.DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import g3.q9;
import h2.i0;
import h2.j0;
import h2.k0;
import h2.l1;
import i3.n0;
import ii.m0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20612c;

    public /* synthetic */ i(int i11, Object obj, Object obj2) {
        this.f20610a = i11;
        this.f20611b = obj;
        this.f20612c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20610a;
        m3.f fVar = m3.m.f29332a;
        Object obj3 = this.f20612c;
        Object obj4 = this.f20611b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                a.e((fn.c) obj4, (dn.k) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gq.a.a((gq.b) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gq.a.b((gq.d) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                TrackingConsentDetailActivity trackingConsentDetailActivity = (TrackingConsentDetailActivity) obj4;
                pj.b bVar = (pj.b) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = TrackingConsentDetailActivity.f9342g;
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String string = trackingConsentDetailActivity.getString(bVar.f35418b);
                    string.getClass();
                    boolean zH = sVar.h(trackingConsentDetailActivity);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new cw.b(trackingConsentDetailActivity, 25);
                        sVar.k0(objM);
                    }
                    cg.j.s(string, null, 0L, 0L, (Function0) objM, null, null, null, sVar, 0, 238);
                } else {
                    sVar.U();
                }
                break;
            case 4:
                j0 j0Var = (j0) obj4;
                i0 i0Var = (i0) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k0 k0Var = (k0) j0Var.f21143b.invoke();
                    int iE = i0Var.f21134c;
                    Object obj5 = i0Var.f21132a;
                    if ((iE >= k0Var.a() || !Intrinsics.areEqual(k0Var.b(iE), obj5)) && (iE = k0Var.e(obj5)) != -1) {
                        i0Var.f21134c = iE;
                    }
                    int i13 = iE;
                    if (i13 != -1) {
                        sVar2.a0(-1664741271);
                        h2.q.d(k0Var, j0Var.f21142a, i13, i0Var.f21132a, sVar2, 0);
                    } else {
                        sVar2.a0(-1668376610);
                    }
                    sVar2.q(false);
                    boolean zH2 = sVar2.h(i0Var);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new q9(i0Var, 10);
                        sVar2.k0(objM2);
                    }
                    m3.i.d(obj5, (Function1) objM2, sVar2);
                } else {
                    sVar2.U();
                }
                break;
            case 5:
                break;
            case 6:
                u3.d dVar = (u3.d) obj4;
                l1 l1Var = (l1) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dVar.invoke(l1Var, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                a.a.l((BasicVoucher) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 8:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                floatRef.element += ((f2.x) obj3).f17230b.a(fFloatValue - floatRef.element);
                break;
            case 9:
                i80.n nVar4 = (i80.n) obj4;
                n0 n0Var = (n0) obj3;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar5;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nVar4.invoke(n0Var, sVar4, 6);
                } else {
                    sVar4.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                i9.n.b((List) obj4, (Collection) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                z20.b.h((y3.b) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ig.b.c((DiscountVoucher) obj4, (ig.d) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ig.b.b((Price) obj4, (ig.d) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 14:
                m0 m0Var = (m0) obj4;
                v1.u uVar = (v1.u) obj3;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar6;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zF = sVar5.f(uVar);
                    Object objM3 = sVar5.M();
                    if (zF || objM3 == fVar) {
                        objM3 = new hi.d(uVar, 17);
                        sVar5.k0(objM3);
                    }
                    ii.l.n(m0Var, (Function0) objM3, sVar5, 0);
                } else {
                    sVar5.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                ii.l.f((LifecycleOwner) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ii.l.l((OrderChanges) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ii.l.n((m0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 18:
                i80.n nVar7 = (i80.n) obj4;
                jl.c cVar = (jl.c) obj3;
                jl.a aVar = (jl.a) obj;
                op.l lVar = (op.l) obj2;
                aVar.getClass();
                if (nVar7 != null) {
                    nVar7.invoke(cVar, aVar, lVar);
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                xz.b.g((DiscoverBucket) obj4, (b4.t) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                DemoPantryChipKt.e((ChipVariant) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ji.i.d((b4.t) obj4, (Product) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ji.i.f((ji.h) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                wd.a.a((FilterCategory) obj4, (b4.t) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 24:
                ((Integer) obj2).getClass();
                kg.a.d((Function0) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 25:
                g4.l lVar2 = (g4.l) obj4;
                Function2 function2 = (Function2) obj3;
                String str = (String) obj;
                AddressSearchElement addressSearchElement = (AddressSearchElement) obj2;
                str.getClass();
                addressSearchElement.getClass();
                if (addressSearchElement.isFound()) {
                    ((g4.p) lVar2).b(false);
                }
                function2.invoke(str, addressSearchElement);
                break;
            case 26:
                ((Integer) obj2).getClass();
                kg.a.c((List) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                kg.a.a((AddressSearchElement) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((g40.b) obj4).a((u3.d) obj3, (m3.n) obj, m3.i.F(7));
                break;
            default:
                ((Integer) obj2).getClass();
                xz.b.h((jl.d) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i11, int i12) {
        this.f20610a = i12;
        this.f20611b = obj;
        this.f20612c = obj2;
    }
}
