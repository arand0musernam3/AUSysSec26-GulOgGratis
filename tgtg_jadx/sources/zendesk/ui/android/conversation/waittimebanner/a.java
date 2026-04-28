package zendesk.ui.android.conversation.waittimebanner;

import j5.b0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47895a;

    public /* synthetic */ a(int i11) {
        this.f47895a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47895a) {
            case 0:
                return ComposableSingletons$WaitTimeBannerKt$lambda$505691145$1.invoke$lambda$2$lambda$1$lambda$0(((Boolean) obj).booleanValue());
            case 1:
                return ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1.invoke$lambda$8$lambda$1$lambda$0(((Boolean) obj).booleanValue());
            case 2:
                return ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1.invoke$lambda$8$lambda$3$lambda$2(((Boolean) obj).booleanValue());
            case 3:
                return ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1.invoke$lambda$8$lambda$5$lambda$4(((Boolean) obj).booleanValue());
            case 4:
                return ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1.invoke$lambda$8$lambda$7$lambda$6(((Boolean) obj).booleanValue());
            case 5:
                return WaitTimeBannerKt.WaitTimeBanner_cgPJBOs$lambda$4$lambda$3((b0) obj);
            default:
                return WaitTimeBannerView._init_$lambda$1((WaitTimeBannerRendering) obj);
        }
    }
}
