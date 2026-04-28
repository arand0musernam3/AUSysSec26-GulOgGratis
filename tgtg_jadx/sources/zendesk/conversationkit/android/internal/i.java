package zendesk.conversationkit.android.internal;

import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.model.Message;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Effect.SendMessageResult f47584b;

    public /* synthetic */ i(Effect.SendMessageResult sendMessageResult, int i11) {
        this.f47583a = i11;
        this.f47584b = sendMessageResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47583a) {
            case 0:
                return EffectMapper.mapSendMessageResult$lambda$32(this.f47584b, (EventReceiver) obj);
            default:
                return EffectMapper.mapSendMessageResult$lambda$32$lambda$30(this.f47584b, (Message) obj);
        }
    }
}
