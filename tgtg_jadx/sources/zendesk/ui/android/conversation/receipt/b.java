package zendesk.ui.android.conversation.receipt;

import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageReceiptView f47885b;

    public /* synthetic */ b(MessageReceiptView messageReceiptView, int i11) {
        this.f47884a = i11;
        this.f47885b = messageReceiptView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47884a) {
            case 0:
                return MessageReceiptView.buildLabelAndIconViews$lambda$12(this.f47885b, (LinearLayout) obj);
            case 1:
                return MessageReceiptView.buildLabelAndIconViews$lambda$13(this.f47885b, (LinearLayout) obj);
            default:
                return MessageReceiptView.formatIconView$lambda$15(this.f47885b, (LinearLayout) obj);
        }
    }
}
