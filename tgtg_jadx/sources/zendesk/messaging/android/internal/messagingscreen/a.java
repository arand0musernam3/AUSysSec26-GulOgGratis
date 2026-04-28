package zendesk.messaging.android.internal.messagingscreen;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessagingActivity f47752b;

    public /* synthetic */ a(MessagingActivity messagingActivity, int i11) {
        this.f47751a = i11;
        this.f47752b = messagingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47751a) {
            case 0:
                return MessagingActivity.retryErrorViewRendering$lambda$3(this.f47752b, (RetryErrorRendering) obj);
            default:
                return MessagingActivity.retryErrorViewRendering$lambda$3$lambda$1(this.f47752b, (RetryErrorState) obj);
        }
    }
}
