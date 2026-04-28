package zendesk.ui.android.conversation.waittimebanner;

import g3.q7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$WaitTimeBannerKt {

    @NotNull
    public static final ComposableSingletons$WaitTimeBannerKt INSTANCE = new ComposableSingletons$WaitTimeBannerKt();

    @NotNull
    private static Function2<n, Integer, Unit> lambda$1458536225 = new u3.d(ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1.INSTANCE, false, 1458536225);

    /* JADX INFO: renamed from: lambda$-1734279268, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f6lambda$1734279268 = new u3.d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.waittimebanner.ComposableSingletons$WaitTimeBannerKt$lambda$-1734279268$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$WaitTimeBannerKt.INSTANCE.getLambda$1458536225$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, -1734279268);

    /* JADX INFO: renamed from: lambda$-505691145, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f7lambda$505691145 = new u3.d(ComposableSingletons$WaitTimeBannerKt$lambda$505691145$1.INSTANCE, false, -505691145);

    @NotNull
    private static Function2<n, Integer, Unit> lambda$111858460 = new u3.d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.waittimebanner.ComposableSingletons$WaitTimeBannerKt$lambda$111858460$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$WaitTimeBannerKt.INSTANCE.m1008getLambda$505691145$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, 111858460);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1734279268$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1007getLambda$1734279268$zendesk_ui_ui_android() {
        return f6lambda$1734279268;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-505691145$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1008getLambda$505691145$zendesk_ui_ui_android() {
        return f7lambda$505691145;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$111858460$zendesk_ui_ui_android() {
        return lambda$111858460;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$1458536225$zendesk_ui_ui_android() {
        return lambda$1458536225;
    }
}
