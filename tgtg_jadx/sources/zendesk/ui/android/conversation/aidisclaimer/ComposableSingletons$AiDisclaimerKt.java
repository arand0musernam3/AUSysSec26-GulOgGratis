package zendesk.ui.android.conversation.aidisclaimer;

import g3.p0;
import g3.q7;
import g3.r0;
import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.d3;
import m3.n;
import m3.s;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u3.d;
import zendesk.ui.android.R;
import zendesk.ui.android.compose.utils.ResourceUtilsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$AiDisclaimerKt {

    @NotNull
    public static final ComposableSingletons$AiDisclaimerKt INSTANCE = new ComposableSingletons$AiDisclaimerKt();

    /* JADX INFO: renamed from: lambda$-694102130, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f5lambda$694102130 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.aidisclaimer.ComposableSingletons$AiDisclaimerKt$lambda$-694102130$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            d3 d3Var = r0.f19375a;
            s sVar2 = (s) nVar;
            AiDisclaimerKt.m1005AiDisclaimervc5YOHI(v.b(ResourceUtilsKt.floatResources(R.integer.zuia_ai_disclaimer_text_alpha, nVar, 0), ((p0) sVar2.j(d3Var)).f19280o), v.b(ResourceUtilsKt.floatResources(R.integer.zuia_ai_disclaimer_icon_alpha, nVar, 0), ((p0) sVar2.j(d3Var)).f19280o), null, f0.U(nVar, R.string.zuia_generated_by_ai), null, nVar, 0, 20);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, -694102130);

    @NotNull
    private static Function2<n, Integer, Unit> lambda$1911825737 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversation.aidisclaimer.ComposableSingletons$AiDisclaimerKt$lambda$1911825737$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AiDisclaimerKt.INSTANCE.m1006getLambda$694102130$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, 1911825737);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-694102130$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1006getLambda$694102130$zendesk_ui_ui_android() {
        return f5lambda$694102130;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$1911825737$zendesk_ui_ui_android() {
        return lambda$1911825737;
    }
}
