package sb0;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.quickreply.QuickReplyOptionRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyOptionState;
import zendesk.ui.android.conversation.quickreply.QuickReplyView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QuickReplyView f38966d;

    public /* synthetic */ b(String str, String str2, QuickReplyView quickReplyView, int i11) {
        this.f38963a = i11;
        this.f38964b = str;
        this.f38965c = str2;
        this.f38966d = quickReplyView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38963a) {
            case 0:
                return QuickReplyView.addQuickReplyOption$lambda$5$lambda$4(this.f38964b, this.f38965c, this.f38966d, (QuickReplyOptionRendering) obj);
            default:
                return QuickReplyView.addQuickReplyOption$lambda$5$lambda$4$lambda$1(this.f38964b, this.f38965c, this.f38966d, (QuickReplyOptionState) obj);
        }
    }
}
