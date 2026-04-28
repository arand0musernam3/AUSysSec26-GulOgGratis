package us;

import at.c0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ss.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41534a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.a f41535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f41536c;

    public /* synthetic */ l(c1 c1Var, t5.a aVar) {
        this.f41536c = c1Var;
        this.f41535b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f41534a;
        c1 c1Var = this.f41536c;
        t5.a aVar = this.f41535b;
        switch (i11) {
            case 0:
                String termsLink = c1Var.f39144a.getTermsLink();
                if (termsLink != null) {
                    aVar.getClass();
                    c0.c((c0) aVar.f39793d, termsLink, ct.a.TERMS_AND_CONDITIONS, Integer.valueOf(R.string.webview_terms_and_condition_title), false, 24);
                }
                break;
            default:
                String termsLink2 = ((DiscountVoucher) c1Var.f39144a).getTermsLink();
                aVar.getClass();
                termsLink2.getClass();
                c0.c((c0) aVar.f39793d, termsLink2, ct.a.TERMS_AND_CONDITIONS, Integer.valueOf(R.string.webview_terms_and_condition_title), false, 24);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(t5.a aVar, c1 c1Var) {
        this.f41535b = aVar;
        this.f41536c = c1Var;
    }
}
