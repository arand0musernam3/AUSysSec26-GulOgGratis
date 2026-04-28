package zendesk.ui.android.conversation.waittimebanner;

import g4.z;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47919b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f47918a = i11;
        this.f47919b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47918a) {
            case 0:
                return WaitTimeBannerView$composeView$1$1.invoke$lambda$5$lambda$4((b1) this.f47919b, ((Boolean) obj).booleanValue());
            default:
                return WaitTimeBannerKt.WaitTimeBanner_cgPJBOs$lambda$2$lambda$1((Function1) this.f47919b, (z) obj);
        }
    }
}
