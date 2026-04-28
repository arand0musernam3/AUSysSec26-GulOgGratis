package bn;

import androidx.recyclerview.widget.y1;
import c5.f1;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.QuickFilter;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import f0.f2;
import hp.p1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import m3.h1;
import ok.n0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.c2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6414c;

    public /* synthetic */ b0(int i11, Object obj, Object obj2) {
        this.f6412a = i11;
        this.f6413b = obj;
        this.f6414c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        switch (this.f6412a) {
            case 0:
                ym.y yVar = (ym.y) this.f6413b;
                if (yVar != null) {
                    String str = (String) this.f6414c;
                    ym.u uVar = (ym.u) yVar;
                    if (str != null) {
                        if (uVar.f46243r == null) {
                            uVar.f46243r = uVar.f46242q;
                        }
                        c2 c2Var = uVar.f46233g;
                        c2Var.getClass();
                        y1 layoutManager = c2Var.C.getLayoutManager();
                        uVar.f46244s = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
                        uVar.f46245t = true;
                        uVar.f46237k = true;
                        uVar.z(str);
                    }
                }
                return Unit.f26487a;
            case 1:
                ((dq.i) this.f6413b).f15157b.b(cv.i.ACTION_SKIP_BBM_SURVEY);
                ((Function0) this.f6414c).invoke();
                return Unit.f26487a;
            case 2:
                ((Function0) this.f6413b).invoke();
                ((Function0) this.f6414c).invoke();
                return Unit.f26487a;
            case 3:
                ((Function1) this.f6413b).invoke((String) this.f6414c);
                return Unit.f26487a;
            case 4:
                z3.r rVar = (z3.r) this.f6413b;
                ListIterator listIterator = rVar.listIterator();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    v70.b bVar = (v70.b) listIterator;
                    if (!bVar.hasNext()) {
                        i12 = -1;
                    } else if (!(((nq.d) bVar.next()) instanceof nq.k)) {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    rVar.remove(i12);
                }
                ListIterator listIterator2 = rVar.listIterator();
                while (true) {
                    v70.b bVar2 = (v70.b) listIterator2;
                    if (!bVar2.hasNext()) {
                        i11 = -1;
                    } else if (!(((nq.d) bVar2.next()) instanceof kp.b)) {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    rVar.remove(i11);
                }
                ((fn.c) this.f6414c).f17794a.f4431p = 0L;
                return Unit.f26487a;
            case 5:
                ((gq.b) this.f6413b).f20787a.b(cv.i.ACTION_SKIP_REWARDS_NOT_REDEEMED_SURVEY);
                ((Function0) this.f6414c).invoke();
                return Unit.f26487a;
            case 6:
                ((gq.d) this.f6413b).f20797b.b(cv.i.ACTION_SKIP_REWARDS_REDEEMED_SURVEY);
                ((Function0) this.f6414c).invoke();
                return Unit.f26487a;
            case 7:
                ((Function1) this.f6413b).invoke(ItemId.m197boximpl(((CharityItem) this.f6414c).getInformation().mo340getItemIdFvU5WIY()));
                return Unit.f26487a;
            case 8:
                ((Function1) this.f6413b).invoke((Item) this.f6414c);
                return Unit.f26487a;
            case 9:
                ((Function1) this.f6413b).invoke((LoyaltyCardDetails) this.f6414c);
                return Unit.f26487a;
            case 10:
                ((f1) this.f6413b).a((String) this.f6414c);
                return Unit.f26487a;
            case 11:
                ((Function1) this.f6413b).invoke((QuickFilter) this.f6414c);
                return Unit.f26487a;
            case 12:
                ek.q qVar = (ek.q) this.f6413b;
                hk.c cVar = (hk.c) this.f6414c;
                qVar.getClass();
                int i13 = ek.p.$EnumSwitchMapping$0[cVar.f22090b.ordinal()];
                if (i13 == 1) {
                    qVar.c(new ek.m());
                } else if (i13 == 2) {
                    qVar.c(new ek.i());
                } else {
                    if (i13 != 3) {
                        e40.a.f();
                        return null;
                    }
                    qVar.c(new ek.k());
                }
                return Unit.f26487a;
            case 13:
                if (((h1) this.f6413b).h() != 0) {
                    h1 h1Var = (h1) this.f6414c;
                    h1Var.i(h1Var.h() + 1);
                }
                return Unit.f26487a;
            case 14:
                ((Function1) this.f6413b).invoke(((p1) this.f6414c).f22317a);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new m90.k((KSerializer) ((Function1) ((m90.q) this.f6413b).f29841b).invoke((KClass) this.f6414c));
            case 16:
                jd.f fVar = (jd.f) this.f6413b;
                BasicItem basicItem = (BasicItem) this.f6414c;
                fVar.getClass();
                basicItem.getClass();
                ((lh.w) fVar.f24983b).f27834f.i(new lh.b(basicItem));
                return Unit.f26487a;
            case 17:
                ((Function1) this.f6413b).invoke((CharityDayScheduleStore) this.f6414c);
                return Unit.f26487a;
            case 18:
                ((Function0) this.f6413b).invoke();
                pi.m mVar = (pi.m) this.f6414c;
                cv.i iVar = cv.i.ACTION_PLANNED_DONATIONS_TOOLTIP_CLICKED;
                mVar.getClass();
                iVar.getClass();
                mVar.f35401d.b(iVar);
                return Unit.f26487a;
            case 19:
                m1.a aVar = (m1.a) this.f6413b;
                DiscountVoucher discountVoucher = ((aj.i) this.f6414c).f1502a;
                aVar.getClass();
                discountVoucher.getClass();
                ((m1) ((f2) aVar.f28697a).f16653f).i(new ok.u(discountVoucher));
                return Unit.f26487a;
            case 20:
                LatLngInfo latLngInfo = (LatLngInfo) this.f6413b;
                if (latLngInfo != null) {
                    m1.a aVar2 = (m1.a) this.f6414c;
                    aVar2.getClass();
                    ((m1) ((f2) aVar2.f28697a).f16653f).i(new ok.n(new ok.e0(latLngInfo)));
                }
                return Unit.f26487a;
            case 21:
                m1.a aVar3 = (m1.a) this.f6413b;
                String str2 = (String) this.f6414c;
                aVar3.getClass();
                ((m1) ((f2) aVar3.f28697a).f16653f).i(new ok.n(new n0(str2)));
                return Unit.f26487a;
            case 22:
                ((Function1) this.f6413b).invoke(((op.f) this.f6414c).f32904c);
                return Unit.f26487a;
            case 23:
                tg.i iVar2 = (tg.i) this.f6413b;
                Address address = (Address) this.f6414c;
                iVar2.getClass();
                address.getClass();
                LatLngInfo center = address.getCenter();
                if (center == null || !center.isValid()) {
                    String placeId = address.getPlaceId();
                    if (placeId == null || placeId.length() == 0) {
                        iVar2.h();
                    } else {
                        v80.f0.B(androidx.lifecycle.m1.d(iVar2), null, null, new tg.g(iVar2, placeId, address, null, 0), 3);
                    }
                } else {
                    iVar2.a(address);
                }
                return Unit.f26487a;
            case 24:
                cj.q qVar2 = (cj.q) this.f6413b;
                DiscountVoucher discountVoucher2 = ((aj.i) this.f6414c).f1502a;
                qVar2.getClass();
                discountVoucher2.getClass();
                v80.f0.B(androidx.lifecycle.m1.d(qVar2), null, null, new a3.x(qVar2, discountVoucher2, null, 26), 3);
                return Unit.f26487a;
            case 25:
                f2.s sVarJ = ((f2.c0) this.f6413b).j();
                List list = sVarJ.f17192k;
                BasicItem basicItem2 = (BasicItem) this.f6414c;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.areEqual(((f2.t) ((f2.m) next)).l, basicItem2.getInformation().mo340getItemIdFvU5WIY())) {
                        }
                    } else {
                        next = null;
                    }
                }
                f2.m mVar2 = (f2.m) next;
                if (mVar2 == null) {
                    return new Pair(Float.valueOf(0.5f), Float.valueOf(0.0f));
                }
                int i14 = sVarJ.l;
                int i15 = sVarJ.f17193m;
                f2.t tVar = (f2.t) mVar2;
                int i16 = tVar.f17214q;
                int i17 = tVar.f17213p;
                float fMax = Math.max(0, Math.min(i17 + i16, i15) - Math.max(i17, i14)) / i16;
                return new Pair(Float.valueOf((0.12f * fMax) + 0.88f), Float.valueOf(fMax >= 0.2f ? fMax * fMax : 0.0f));
            default:
                ((yk.h) this.f6413b).c(jl.b.SELECTED);
                ((Function0) this.f6414c).invoke();
                return Unit.f26487a;
        }
    }
}
