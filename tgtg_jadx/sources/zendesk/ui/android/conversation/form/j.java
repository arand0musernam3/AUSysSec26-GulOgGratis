package zendesk.ui.android.conversation.form;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FormView f47867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47869d;

    public /* synthetic */ j(FormView formView, int i11, int i12, int i13) {
        this.f47866a = i13;
        this.f47867b = formView;
        this.f47868c = i11;
        this.f47869d = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47866a) {
            case 0:
                return FormView.addFieldView$lambda$12$lambda$11$lambda$10$lambda$9(this.f47867b, this.f47868c, this.f47869d);
            default:
                return FormView.addFieldView$lambda$15$lambda$14(this.f47867b, this.f47868c, this.f47869d);
        }
    }
}
