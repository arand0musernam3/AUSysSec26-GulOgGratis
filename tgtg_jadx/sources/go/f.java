package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import g3.q3;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f20715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w6 f20716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f20717d;

    public /* synthetic */ f(b0 b0Var, w6 w6Var, b1 b1Var, int i11) {
        this.f20714a = i11;
        this.f20715b = b0Var;
        this.f20716c = w6Var;
        this.f20717d = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f20714a;
        b1 b1Var = this.f20717d;
        w6 w6Var = this.f20716c;
        b0 b0Var = this.f20715b;
        switch (i11) {
            case 0:
                int i12 = CharityOrderActivity.f9162o;
                f0.B(b0Var, null, null, new fi.h(w6Var, b1Var, null, 2), 3);
                break;
            case 1:
                int i13 = CharityOrderActivity.f9162o;
                f0.B(b0Var, null, null, new fi.h(w6Var, b1Var, null, 3), 3);
                break;
            case 2:
                int i14 = SurpriseBagOrderActivity.f9178y;
                f0.B(b0Var, null, null, new fi.h(w6Var, b1Var, null, 5), 3);
                break;
            case 3:
                int i15 = SurpriseBagOrderActivity.f9178y;
                f0.B(b0Var, null, null, new fi.h(w6Var, b1Var, null, 6), 3);
                break;
            case 4:
                f0.B(b0Var, null, null, new q3(w6Var, null, 14), 3).J(new sn.c(b1Var, 9));
                break;
            case 5:
                f0.B(b0Var, null, null, new q3(w6Var, null, 13), 3).J(new sn.c(b1Var, 10));
                break;
            default:
                f0.B(b0Var, null, null, new fi.h(w6Var, b1Var, null, 8), 3);
                break;
        }
        return Unit.f26487a;
    }
}
