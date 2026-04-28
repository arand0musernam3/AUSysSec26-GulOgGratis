package zl;

import androidx.lifecycle.m1;
import at.c0;
import cj.q;
import com.app.tgtg.R;
import cv.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import v80.f0;
import y80.a2;
import yi.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47968a = 0;

    public c(Object obj) {
        super(1, obj, r.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47968a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                g gVar = (g) this.receiver;
                gVar.getClass();
                i iVar = i.CHARITY_LOGIN_EMAIL_PROVIDED;
                iVar.getClass();
                gVar.f47978c.b(iVar);
                boolean zS = r0.s(str);
                a2 a2Var = gVar.f47979d;
                if (zS) {
                    d dVar = new d(false, 2, Integer.valueOf(R.string.login_charity_error_invalid_email));
                    a2Var.getClass();
                    a2Var.k(null, dVar);
                } else {
                    d dVar2 = new d(true, 1, null);
                    a2Var.getClass();
                    a2Var.k(null, dVar2);
                    f0.B(m1.d(gVar), null, null, new f(gVar, str, null), 3);
                }
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                r rVar = (r) this.receiver;
                Integer numValueOf = Integer.valueOf(R.string.webview_terms_and_condition_title);
                if (Intrinsics.areEqual(str2, rVar.v().f8333b.n().getPrivacyUrl())) {
                    q.o(rVar.v(), str2, ct.a.PRIVACY, Integer.valueOf(R.string.webview_privacy_title));
                } else if (Intrinsics.areEqual(str2, rVar.v().k())) {
                    q.o(rVar.v(), str2, ct.a.TERMS_AND_CONDITIONS, numValueOf);
                } else if (Intrinsics.areEqual(str2, rVar.v().f8333b.n().getManufacturerTermsUrl())) {
                    q qVarV = rVar.v();
                    ct.a aVar = ct.a.PRIVACY;
                    aVar.getClass();
                    c0.c(qVarV.f8339e, str2, aVar, numValueOf, true, 16);
                } else {
                    q qVarV2 = rVar.v();
                    ct.a aVar2 = ct.a.ALLERGENS;
                    Integer numValueOf2 = Integer.valueOf(R.string.webview_ingredients_and_allergens_title);
                    aVar2.getClass();
                    c0.c(qVarV2.f8339e, str2, aVar2, numValueOf2, true, 16);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(i11, obj, cls, str, str2, i12);
    }
}
