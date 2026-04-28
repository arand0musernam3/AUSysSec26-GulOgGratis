package zendesk.ui.android.conversation.form;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FormView f47865b;

    public /* synthetic */ i(FormView formView, int i11) {
        this.f47864a = i11;
        this.f47865b = formView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47864a) {
            case 0:
                return FormView.sendActionButtonClicked$lambda$26(this.f47865b, (ButtonRendering) obj);
            case 1:
                return FormView.render$lambda$1(this.f47865b, (ButtonRendering) obj);
            case 2:
                return FormView.render$lambda$1$lambda$0(this.f47865b, (ButtonState) obj);
            default:
                return FormView.sendActionButtonClicked$lambda$26$lambda$25(this.f47865b, (ButtonState) obj);
        }
    }
}
