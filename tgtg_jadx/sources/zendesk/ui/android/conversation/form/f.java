package zendesk.ui.android.conversation.form;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FieldResponse f47854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FormResponseView f47855c;

    public /* synthetic */ f(FieldResponse fieldResponse, FormResponseView formResponseView, int i11) {
        this.f47853a = i11;
        this.f47854b = fieldResponse;
        this.f47855c = formResponseView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47853a) {
            case 0:
                return FormResponseView.render$lambda$3$lambda$2$lambda$1(this.f47854b, this.f47855c, (FieldResponseState) obj);
            default:
                return FormResponseView.render$lambda$3$lambda$2(this.f47854b, this.f47855c, (FieldResponseRendering) obj);
        }
    }
}
