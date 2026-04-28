package zq;

import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mv.a0;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MoneySavedActivity f48037b;

    public /* synthetic */ b(MoneySavedActivity moneySavedActivity, int i11) {
        this.f48036a = i11;
        this.f48037b = moneySavedActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f48036a;
        MoneySavedActivity moneySavedActivity = this.f48037b;
        switch (i11) {
            case 0:
                int i12 = MoneySavedActivity.f9312g;
                moneySavedActivity.getOnBackPressedDispatcher().d();
                break;
            default:
                int i13 = MoneySavedActivity.f9312g;
                a0 a0Var = new a0();
                z zVar = z.DISCOVER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                a0Var.f30144g = true;
                a0Var.c(moneySavedActivity);
                break;
        }
        return Unit.f26487a;
    }
}
