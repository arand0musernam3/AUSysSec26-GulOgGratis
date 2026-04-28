package i2;

import a3.v2;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;
import z4.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f22895c;

    public /* synthetic */ s(b1 b1Var, ArrayList arrayList) {
        this.f22893a = 0;
        this.f22895c = b1Var;
        this.f22894b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f22893a;
        b1 b1Var = this.f22895c;
        ArrayList arrayList = this.f22894b;
        switch (i11) {
            case 0:
                l1 l1Var = (l1) obj;
                v2 v2Var = new v2(1, arrayList);
                l1Var.f47177a = true;
                v2Var.invoke(l1Var);
                l1Var.f47177a = false;
                b1Var.getValue();
                break;
            case 1:
                f2.l lVar = (f2.l) obj;
                int i12 = PaymentOptionsActivity.f9428g;
                lVar.getClass();
                lVar.r(arrayList.size(), null, new ks.c(0, arrayList), new u3.d(new ks.d(arrayList, b1Var, 0), true, 802480018));
                break;
            default:
                f2.l lVar2 = (f2.l) obj;
                int i13 = PaymentOptionsActivity.f9428g;
                lVar2.getClass();
                lVar2.r(arrayList.size(), null, new ks.c(1, arrayList), new u3.d(new ks.d(arrayList, b1Var, 1), true, 802480018));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ s(ArrayList arrayList, b1 b1Var, int i11) {
        this.f22893a = i11;
        this.f22894b = arrayList;
        this.f22895c = b1Var;
    }
}
