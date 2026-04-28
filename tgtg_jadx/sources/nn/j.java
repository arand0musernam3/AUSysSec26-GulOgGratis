package nn;

import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn.l f31150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31151c;

    public /* synthetic */ j(mn.l lVar, b1 b1Var, int i11) {
        this.f31149a = i11;
        this.f31150b = lVar;
        this.f31151c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        switch (this.f31149a) {
            case 0:
                cv.i iVar = cv.i.ACTION_SEE_LOYALTY_CARD_VOUCHER;
                iVar.getClass();
                mn.l lVar = this.f31150b;
                lVar.f30024f.b(iVar);
                LoyaltyCardDetails loyaltyCardDetails = ((ProfileFeature) this.f31151c.getValue()).getLoyaltyCardDetails();
                lVar.c(loyaltyCardDetails != null ? loyaltyCardDetails.m484getVoucherIdsIL_j68() : null);
                break;
            default:
                this.f31151c.setValue(Boolean.TRUE);
                mn.l lVar2 = this.f31150b;
                lVar2.getClass();
                f0.E(kotlin.coroutines.g.f26549a, new mn.f(lVar2, null, 7));
                break;
        }
        return Unit.f26487a;
    }
}
