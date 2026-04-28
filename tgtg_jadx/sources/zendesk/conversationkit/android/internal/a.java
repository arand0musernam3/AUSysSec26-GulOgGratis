package zendesk.conversationkit.android.internal;

import kotlin.jvm.functions.Function0;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47564b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f47563a = i11;
        this.f47564b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47563a) {
            case 0:
                return EffectMapper.mapPersistedUserReceived$lambda$41$lambda$40((Effect.PersistedUserReceived) this.f47564b);
            case 1:
                return EffectMapper.mapConnectionChanged$lambda$7$lambda$6((Effect.ConnectionChanged) this.f47564b);
            case 2:
                return EffectMapper.mapPushRegistrationResult$lambda$36$lambda$35((Effect.PushTokenUpdateResult) this.f47564b);
            case 3:
                return EffectMapper.mapOpenAttachmentFromFile$lambda$57$lambda$56((Effect.OpenAttachmentFromFile) this.f47564b);
            case 4:
                return EffectMapper.mapActivityEvent$lambda$39$lambda$37((Effect.ActivityEventReceived) this.f47564b);
            case 5:
                return EffectMapper.mapProactiveMessageReferral$lambda$15$lambda$14((Effect.ProactiveMessageReferral) this.f47564b);
            case 6:
                return EffectMapper.mapSendMessageResult$lambda$32$lambda$29((Effect.SendMessageResult) this.f47564b);
            case 7:
                return EffectMapper.mapRefreshUserResult$lambda$9$lambda$8((Effect.RefreshUserResult) this.f47564b);
            case 8:
                return EffectMapper.mapPushRegistrationPending$lambda$34$lambda$33((Effect.PushTokenPrepared) this.f47564b);
            case 9:
                return EffectMapper.mapLogoutUserResult$lambda$3$lambda$2((ConversationKitResult) this.f47564b);
            case 10:
                return EffectMapper.mapCreateUserResult$lambda$1$lambda$0((User) this.f47564b);
            case 11:
                return EffectMapper.mapGetConversationResult$lambda$13$lambda$12((Effect.GetConversationResult) this.f47564b);
            case 12:
                return EffectMapper.mapUserAccessRevoked$lambda$5$lambda$4((Effect.UserAccessRevoked) this.f47564b);
            case 13:
                return EffectMapper.mapCreateConversationResult$lambda$11$lambda$10((Effect.CreateConversationResult) this.f47564b);
            default:
                return MainEnvironment.connectivityManager_delegate$lambda$0((MainEnvironment) this.f47564b);
        }
    }
}
