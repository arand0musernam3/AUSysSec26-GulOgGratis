package zendesk.ui.android.conversation.activitymessage;

import com.google.android.gms.internal.measurement.cg;
import g3.q7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import u3.d;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$ActivityMessageKt {

    @NotNull
    public static final ComposableSingletons$ActivityMessageKt INSTANCE = new ComposableSingletons$ActivityMessageKt();

    @NotNull
    private static Function2<n, Integer, Unit> lambda$319776215 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.activitymessage.ComposableSingletons$ActivityMessageKt$lambda$319776215$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            ActivityMessageKt.m1004ActivityMessage3IgeMak("This is an activity message", cg.l(nVar, R.color.colorOnBackground), null, nVar, 6, 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, 319776215);

    @NotNull
    private static Function2<n, Integer, Unit> lambda$231234172 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.activitymessage.ComposableSingletons$ActivityMessageKt$lambda$231234172$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ActivityMessageKt.INSTANCE.getLambda$319776215$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, 231234172);

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$231234172$zendesk_ui_ui_android() {
        return lambda$231234172;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$319776215$zendesk_ui_ui_android() {
        return lambda$319776215;
    }
}
