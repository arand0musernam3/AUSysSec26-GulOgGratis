package zendesk.conversationkit.android.internal;

import kotlin.jvm.functions.Function0;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationKitResult.Success f47577b;

    public /* synthetic */ f(ConversationKitResult.Success success, int i11) {
        this.f47576a = i11;
        this.f47577b = success;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47576a) {
            case 0:
                return EffectMapper.mapPostbackSent$lambda$53$lambda$51(this.f47577b);
            default:
                return EffectMapper.mapConversationUpdated$lambda$50$lambda$48(this.f47577b);
        }
    }
}
