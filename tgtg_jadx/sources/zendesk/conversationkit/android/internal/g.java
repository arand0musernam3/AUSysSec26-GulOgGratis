package zendesk.conversationkit.android.internal;

import kotlin.jvm.functions.Function0;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationKitResult.Failure f47580b;

    public /* synthetic */ g(ConversationKitResult.Failure failure, int i11) {
        this.f47579a = i11;
        this.f47580b = failure;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47579a) {
            case 0:
                return EffectMapper.mapPostbackSent$lambda$53$lambda$52(this.f47580b);
            default:
                return EffectMapper.mapConversationUpdated$lambda$50$lambda$49(this.f47580b);
        }
    }
}
