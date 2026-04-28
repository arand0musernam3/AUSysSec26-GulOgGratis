package zendesk.ui.android.conversation.waittimebanner;

import j5.b0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47897b;

    public /* synthetic */ b(String str, int i11) {
        this.f47896a = i11;
        this.f47897b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47896a) {
            case 0:
                return WaitTimeBannerKt.WaitTimeText_M3jwhU8$lambda$12$lambda$11(this.f47897b, (b0) obj);
            default:
                return WaitTimeBannerKt.WaitTimeBanner_cgPJBOs$lambda$8$lambda$7$lambda$6$lambda$5(this.f47897b, (b0) obj);
        }
    }
}
