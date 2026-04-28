package zendesk.ui.android.conversation.form;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FieldView f47845c;

    public /* synthetic */ b(String str, FieldView fieldView, int i11) {
        this.f47843a = i11;
        this.f47844b = str;
        this.f47845c = fieldView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47843a) {
            case 0:
                return FieldView.renderError$lambda$21$lambda$20(this.f47844b, this.f47845c, (MessageReceiptState) obj);
            default:
                return FieldView.renderError$lambda$21(this.f47844b, this.f47845c, (MessageReceiptRendering) obj);
        }
    }
}
