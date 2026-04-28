package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47700b;

    public /* synthetic */ p(String str, int i11) {
        this.f47699a = i11;
        this.f47700b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47699a) {
            case 0:
                return ConversationScreenRepository.removeStoredForm$lambda$5(this.f47700b, (MessagingUIPersistence) obj);
            default:
                return ConversationScreenRepository.updateComposerText$lambda$4(this.f47700b, (MessagingUIPersistence) obj);
        }
    }
}
