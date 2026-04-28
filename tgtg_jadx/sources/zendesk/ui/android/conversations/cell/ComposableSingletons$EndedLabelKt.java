package zendesk.ui.android.conversations.cell;

import g3.p0;
import g3.q7;
import g3.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$EndedLabelKt {

    @NotNull
    public static final ComposableSingletons$EndedLabelKt INSTANCE = new ComposableSingletons$EndedLabelKt();

    /* JADX INFO: renamed from: lambda$-2048542898, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f8lambda$2048542898 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversations.cell.ComposableSingletons$EndedLabelKt$lambda$-2048542898$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            EndedLabelKt.m1015EndedLabeleuL9pac(((p0) ((s) nVar).j(r0.f19375a)).f19280o, null, null, null, nVar, 0, 14);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, -2048542898);

    /* JADX INFO: renamed from: lambda$-818302861, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f9lambda$818302861 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversations.cell.ComposableSingletons$EndedLabelKt$lambda$-818302861$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$EndedLabelKt.INSTANCE.m1013getLambda$2048542898$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, -818302861);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-2048542898$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1013getLambda$2048542898$zendesk_ui_ui_android() {
        return f8lambda$2048542898;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-818302861$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1014getLambda$818302861$zendesk_ui_ui_android() {
        return f9lambda$818302861;
    }
}
