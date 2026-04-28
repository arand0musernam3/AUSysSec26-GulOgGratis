package go;

import aa.l0;
import androidx.lifecycle.m1;
import b0.a1;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.order.Changes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20719b;

    public /* synthetic */ g(CharityOrderActivity charityOrderActivity, int i11) {
        this.f20718a = i11;
        this.f20719b = charityOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f20718a;
        CharityOrderActivity charityOrderActivity = this.f20719b;
        switch (i11) {
            case 0:
                ((Boolean) obj).getClass();
                int i12 = CharityOrderActivity.f9162o;
                charityOrderActivity.A();
                break;
            case 1:
                Changes changes = (Changes) obj;
                int i13 = CharityOrderActivity.f9162o;
                changes.getClass();
                v vVarC = charityOrderActivity.C();
                f0.B(m1.d(vVarC), null, null, new l0(vVarC, changes, (x70.c) null, 27), 3);
                break;
            case 2:
                Changes changes2 = (Changes) obj;
                int i14 = CharityOrderActivity.f9162o;
                changes2.getClass();
                v vVarC2 = charityOrderActivity.C();
                f0.B(m1.d(vVarC2), null, null, new l0(vVarC2, changes2, (x70.c) null, 27), 3);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                int i15 = CharityOrderActivity.f9162o;
                f0.B(m1.c(charityOrderActivity), null, null, new a1(charityOrderActivity, iIntValue, null, 3), 3);
                break;
        }
        return Unit.f26487a;
    }
}
