package zendesk.conversationkit.android.internal;

import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.internal.Effect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47566b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f47565a = i11;
        this.f47566b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47565a) {
            case 0:
                return EffectMapper.mapUserAccessRevoked$lambda$5((Effect.UserAccessRevoked) this.f47566b, (EventReceiver) obj);
            case 1:
                return EffectMapper.mapRefreshUserResult$lambda$9((Effect.RefreshUserResult) this.f47566b, (EventReceiver) obj);
            case 2:
                return EffectMapper.mapPersistedUserReceived$lambda$41((Effect.PersistedUserReceived) this.f47566b, (EventReceiver) obj);
            case 3:
                return EffectMapper.mapConversationUpdated$lambda$50((Effect.ConversationUpdatedResult) this.f47566b, (EventReceiver) obj);
            case 4:
                return EffectMapper.mapProactiveMessageReferral$lambda$15((Effect.ProactiveMessageReferral) this.f47566b, (EventReceiver) obj);
            case 5:
                return EffectMapper.mapConnectionChanged$lambda$7((Effect.ConnectionChanged) this.f47566b, (EventReceiver) obj);
            case 6:
                return EffectMapper.mapPushRegistrationPending$lambda$34((Effect.PushTokenPrepared) this.f47566b, (EventReceiver) obj);
            case 7:
                return EffectMapper.mapLoadMoreMessages$lambda$26((Effect.LoadMoreMessages) this.f47566b, (EventReceiver) obj);
            case 8:
                return EffectMapper.mapOpenAttachmentFromFile$lambda$57((Effect.OpenAttachmentFromFile) this.f47566b, (EventReceiver) obj);
            case 9:
                return EffectMapper.mapMessagePrepared$lambda$28((Effect.MessagePrepared) this.f47566b, (EventReceiver) obj);
            case 10:
                return EffectMapper.mapRefreshConversationResult$lambda$18((Effect.RefreshConversationResult) this.f47566b, (EventReceiver) obj);
            case 11:
                return EffectMapper.mapGetConversationResult$lambda$13((Effect.GetConversationResult) this.f47566b, (EventReceiver) obj);
            case 12:
                return EffectMapper.mapMessageReceived$lambda$23((Effect.MessageReceived) this.f47566b, (EventReceiver) obj);
            case 13:
                return EffectMapper.mapConversationAdded$lambda$44((Effect.ConversationAddedResult) this.f47566b, (EventReceiver) obj);
            case 14:
                return EffectMapper.mapCreateConversationResult$lambda$11((Effect.CreateConversationResult) this.f47566b, (EventReceiver) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return EffectMapper.mapAttachmentDownloadStarted$lambda$55((Effect.AttachmentDownloadStarted) this.f47566b, (EventReceiver) obj);
            case 16:
                return EffectMapper.mapActivityEvent$lambda$39((Effect.ActivityEventReceived) this.f47566b, (EventReceiver) obj);
            case 17:
                return EffectMapper.mapCreateUserResult$lambda$1((Effect.CreateUserResult) this.f47566b, (EventReceiver) obj);
            case 18:
                return EffectMapper.mapPostbackSent$lambda$53((Effect.SendPostbackResult) this.f47566b, (EventReceiver) obj);
            case 19:
                return EffectMapper.mapPushRegistrationResult$lambda$36((Effect.PushTokenUpdateResult) this.f47566b, (EventReceiver) obj);
            case 20:
                return EffectMapper.mapLogoutUserResult$lambda$3((Effect.LogoutUserResult) this.f47566b, (EventReceiver) obj);
            case 21:
                return EffectMapper.mapConversationRemoved$lambda$47((Effect.ConversationRemovedResult) this.f47566b, (EventReceiver) obj);
            default:
                return Boolean.valueOf(ConversationKitStore.removeEventListener$lambda$0((ConversationKitEventListener) this.f47566b, (ConversationKitEventListener) obj));
        }
    }
}
