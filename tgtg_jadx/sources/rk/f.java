package rk;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import f0.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nk.q0;
import ok.f0;
import ok.l0;
import ok.m0;
import ok.r0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1.a f38061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f38062c;

    public /* synthetic */ f(m1.a aVar, q0 q0Var, int i11) {
        this.f38060a = i11;
        this.f38061b = aVar;
        this.f38062c = q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DiscountVoucher discountVoucher;
        switch (this.f38060a) {
            case 0:
                StoreInformation storeInformationM = mv.d.m(this.f38062c.f31035a);
                m1.a aVar = this.f38061b;
                aVar.getClass();
                storeInformationM.getClass();
                ((m1) ((f2) aVar.f28697a).f16653f).i(new ok.n(new f0(storeInformationM, ok.a.ADDRESS)));
                break;
            case 1:
                BasicItem basicItem = this.f38062c.f31035a;
                m1.a aVar2 = this.f38061b;
                aVar2.getClass();
                ((m1) ((f2) aVar2.f28697a).f16653f).i(new ok.p(new r0(basicItem)));
                break;
            case 2:
                LatLngInfo latLngInfo = this.f38062c.f31035a.getPickupLocation().getLatLngInfo();
                if (latLngInfo != null) {
                    m1.a aVar3 = this.f38061b;
                    aVar3.getClass();
                    ((m1) ((f2) aVar3.f28697a).f16653f).i(new ok.n(new ok.e0(latLngInfo)));
                }
                break;
            case 3:
                ((m1) ((f2) this.f38061b.f28697a).f16653f).i(new ok.f(this.f38062c.f31035a));
                break;
            case 4:
                StoreInformation storeInformationM2 = mv.d.m(this.f38062c.f31035a);
                m1.a aVar4 = this.f38061b;
                aVar4.getClass();
                storeInformationM2.getClass();
                ((m1) ((f2) aVar4.f28697a).f16653f).i(new ok.n(new f0(storeInformationM2, ok.a.LOGO)));
                break;
            case 5:
                String strMo340getItemIdFvU5WIY = this.f38062c.f31035a.getInformation().mo340getItemIdFvU5WIY();
                m1.a aVar5 = this.f38061b;
                aVar5.getClass();
                strMo340getItemIdFvU5WIY.getClass();
                ((m1) ((f2) aVar5.f28697a).f16653f).i(new ok.n(new m0(strMo340getItemIdFvU5WIY)));
                break;
            case 6:
                q0 q0Var = this.f38062c;
                String strMo340getItemIdFvU5WIY2 = q0Var.f31035a.getInformation().mo340getItemIdFvU5WIY();
                boolean z11 = !q0Var.f31035a.getSubscribedForNotification();
                m1.a aVar6 = this.f38061b;
                aVar6.getClass();
                strMo340getItemIdFvU5WIY2.getClass();
                ((m1) ((f2) aVar6.f28697a).f16653f).i(new ok.h(strMo340getItemIdFvU5WIY2, z11));
                break;
            case 7:
                ((m1) ((f2) this.f38061b.f28697a).f16653f).i(new ok.f(this.f38062c.f31035a));
                break;
            case 8:
                q0 q0Var2 = this.f38062c;
                if (q0Var2.f31035a.getInformation().getDynamicPriceInfo() != null) {
                    BasicItem basicItem2 = q0Var2.f31035a;
                    m1.a aVar7 = this.f38061b;
                    aVar7.getClass();
                    ((m1) ((f2) aVar7.f28697a).f16653f).i(new ok.d(basicItem2));
                }
                break;
            default:
                q0 q0Var3 = this.f38062c;
                aj.n nVar = q0Var3.f31044j;
                String strMo529getIdVUJ7vw4 = null;
                aj.l lVar = nVar instanceof aj.l ? (aj.l) nVar : null;
                if (lVar != null && (discountVoucher = lVar.f1504a) != null) {
                    strMo529getIdVUJ7vw4 = discountVoucher.mo529getIdVUJ7vw4();
                }
                ((m1) ((f2) this.f38061b.f28697a).f16653f).i(new ok.n(new l0(q0Var3.f31035a, q0Var3.f31040f, strMo529getIdVUJ7vw4, q0Var3.f31044j instanceof aj.k)));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(q0 q0Var, m1.a aVar, int i11) {
        this.f38060a = i11;
        this.f38062c = q0Var;
        this.f38061b = aVar;
    }
}
