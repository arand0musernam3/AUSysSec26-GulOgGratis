package no;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31269b;

    public /* synthetic */ n(SurpriseBagOrderActivity surpriseBagOrderActivity, int i11) {
        this.f31268a = i11;
        this.f31269b = surpriseBagOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f31268a;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31269b;
        switch (i11) {
            case 0:
                int i12 = SurpriseBagOrderActivity.f9178y;
                m0 m0VarC = surpriseBagOrderActivity.C();
                m0VarC.getClass();
                v80.f0.B(m1.d(m0VarC), null, null, new z(m0VarC, (x70.c) null, 4), 3);
                break;
            case 1:
                int i13 = SurpriseBagOrderActivity.f9178y;
                m0 m0VarC2 = surpriseBagOrderActivity.C();
                m0VarC2.getClass();
                v80.f0.B(m1.d(m0VarC2), null, null, new z(m0VarC2, (x70.c) null, 2), 3);
                break;
            case 2:
                int i14 = SurpriseBagOrderActivity.f9178y;
                break;
            case 3:
                int i15 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.R();
                break;
            case 4:
                int i16 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.getOnBackPressedDispatcher().d();
                break;
            case 5:
                int i17 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.C().l(cv.i.TEMP_BUTTON_ASK_A_FRIEND, null);
                break;
            case 6:
                int i18 = SurpriseBagOrderActivity.f9178y;
                m0 m0VarC3 = surpriseBagOrderActivity.C();
                m0VarC3.getClass();
                String email = m0VarC3.A.m().getEmail();
                if (email == null || StringsKt.H(email)) {
                    v80.f0.B(m1.d(m0VarC3), null, null, new z(m0VarC3, (x70.c) null, 8), 3);
                } else {
                    v80.f0.B(m1.d(m0VarC3), null, null, new mn.g(m0VarC3, surpriseBagOrderActivity, null, 8), 3);
                }
                break;
            default:
                int i19 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.R();
                break;
        }
        return Unit.f26487a;
    }
}
