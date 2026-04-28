package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f20727c;

    public /* synthetic */ i(CharityOrderActivity charityOrderActivity, b1 b1Var, int i11) {
        this.f20725a = i11;
        this.f20726b = charityOrderActivity;
        this.f20727c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f20725a;
        b1 b1Var = this.f20727c;
        CharityOrderActivity charityOrderActivity = this.f20726b;
        switch (i11) {
            case 0:
                int i12 = CharityOrderActivity.f9162o;
                charityOrderActivity.Q().n();
                b1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                int i13 = CharityOrderActivity.f9162o;
                charityOrderActivity.Q().l(cv.i.ACTION_CANCEL_DONATION, null);
                b1Var.setValue(Boolean.TRUE);
                break;
            default:
                int i14 = CharityOrderActivity.f9162o;
                charityOrderActivity.Q().n();
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
