package zendesk.ui.android.conversation.textcell;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.actionbutton.ActionButtonState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47887a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionButton f47888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextCellView f47889c;

    public /* synthetic */ b(ActionButton actionButton, TextCellView textCellView) {
        this.f47888b = actionButton;
        this.f47889c = textCellView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47887a) {
            case 0:
                return TextCellView.buildActionButtonView$lambda$12$lambda$11(this.f47889c, this.f47888b, (ActionButtonRendering) obj);
            default:
                return TextCellView.buildActionButtonView$lambda$12$lambda$11$lambda$10(this.f47888b, this.f47889c, (ActionButtonState) obj);
        }
    }

    public /* synthetic */ b(TextCellView textCellView, ActionButton actionButton) {
        this.f47889c = textCellView;
        this.f47888b = actionButton;
    }
}
