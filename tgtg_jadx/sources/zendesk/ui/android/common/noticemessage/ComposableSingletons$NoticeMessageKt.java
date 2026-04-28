package zendesk.ui.android.common.noticemessage;

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
public final class ComposableSingletons$NoticeMessageKt {

    @NotNull
    public static final ComposableSingletons$NoticeMessageKt INSTANCE = new ComposableSingletons$NoticeMessageKt();

    @NotNull
    private static Function2<n, Integer, Unit> lambda$1285659432 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.common.noticemessage.ComposableSingletons$NoticeMessageKt$lambda$1285659432$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            NoticeMessageKt.m1003NoticeMessage3IgeMak("This is a notice message", cg.l(nVar, R.color.colorOnBackground), null, nVar, 6, 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, 1285659432);

    /* JADX INFO: renamed from: lambda$-1865375923, reason: not valid java name */
    @NotNull
    private static Function2<n, Integer, Unit> f4lambda$1865375923 = new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.common.noticemessage.ComposableSingletons$NoticeMessageKt$lambda$-1865375923$1
        public final void invoke(n nVar, int i11) {
            if ((i11 & 3) == 2) {
                s sVar = (s) nVar;
                if (sVar.B()) {
                    sVar.U();
                    return;
                }
            }
            q7.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$NoticeMessageKt.INSTANCE.getLambda$1285659432$zendesk_ui_ui_android(), nVar, 12582912, 127);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((n) obj, ((Number) obj2).intValue());
            return Unit.f26487a;
        }
    }, false, -1865375923);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1865375923$zendesk_ui_ui_android, reason: not valid java name */
    public final Function2<n, Integer, Unit> m1002getLambda$1865375923$zendesk_ui_ui_android() {
        return f4lambda$1865375923;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getLambda$1285659432$zendesk_ui_ui_android() {
        return lambda$1285659432;
    }
}
