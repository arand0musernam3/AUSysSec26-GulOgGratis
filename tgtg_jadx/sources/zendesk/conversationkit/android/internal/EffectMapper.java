package zendesk.conversationkit.android.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import yj.m;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageKt;
import zendesk.conversationkit.android.model.User;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u001eH\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020$H\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020&H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020(H\u0002J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020*H\u0002J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020,H\u0002J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020.H\u0002J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u000200H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u000202H\u0002J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u000204H\u0002J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u000206H\u0002¨\u00068"}, d2 = {"Lzendesk/conversationkit/android/internal/EffectMapper;", "", "<init>", "()V", "map", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "effect", "Lzendesk/conversationkit/android/internal/Effect;", "mapCreateUserResult", "Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "mapLogoutUserResult", "Lzendesk/conversationkit/android/internal/Effect$LogoutUserResult;", "mapUserAccessRevoked", "Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "mapConnectionChanged", "Lzendesk/conversationkit/android/internal/Effect$ConnectionChanged;", "mapRefreshUserResult", "Lzendesk/conversationkit/android/internal/Effect$RefreshUserResult;", "mapCreateConversationResult", "Lzendesk/conversationkit/android/internal/Effect$CreateConversationResult;", "mapGetConversationResult", "Lzendesk/conversationkit/android/internal/Effect$GetConversationResult;", "mapProactiveMessageReferral", "Lzendesk/conversationkit/android/internal/Effect$ProactiveMessageReferral;", "mapRefreshConversationResult", "Lzendesk/conversationkit/android/internal/Effect$RefreshConversationResult;", "mapMessageReceived", "Lzendesk/conversationkit/android/internal/Effect$MessageReceived;", "mapLoadMoreMessages", "Lzendesk/conversationkit/android/internal/Effect$LoadMoreMessages;", "mapMessagePrepared", "Lzendesk/conversationkit/android/internal/Effect$MessagePrepared;", "mapSendMessageResult", "Lzendesk/conversationkit/android/internal/Effect$SendMessageResult;", "mapPushRegistrationPending", "Lzendesk/conversationkit/android/internal/Effect$PushTokenPrepared;", "mapPushRegistrationResult", "Lzendesk/conversationkit/android/internal/Effect$PushTokenUpdateResult;", "mapActivityEvent", "Lzendesk/conversationkit/android/internal/Effect$ActivityEventReceived;", "mapPersistedUserReceived", "Lzendesk/conversationkit/android/internal/Effect$PersistedUserReceived;", "mapConversationAdded", "Lzendesk/conversationkit/android/internal/Effect$ConversationAddedResult;", "mapConversationRemoved", "Lzendesk/conversationkit/android/internal/Effect$ConversationRemovedResult;", "mapConversationUpdated", "Lzendesk/conversationkit/android/internal/Effect$ConversationUpdatedResult;", "mapPostbackSent", "Lzendesk/conversationkit/android/internal/Effect$SendPostbackResult;", "mapAttachmentDownloadStarted", "Lzendesk/conversationkit/android/internal/Effect$AttachmentDownloadStarted;", "mapOpenAttachmentFromFile", "Lzendesk/conversationkit/android/internal/Effect$OpenAttachmentFromFile;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EffectMapper {

    @NotNull
    private static final String LOG_TAG = "EffectMapper";

    private final List<ConversationKitEvent> mapActivityEvent(Effect.ActivityEventReceived effect) {
        return EffectMapperKt.mapEvents(new b(effect, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapActivityEvent$lambda$39(Effect.ActivityEventReceived activityEventReceived, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(activityEventReceived, 4));
        eventReceiver.event(activityEventReceived.getConversation(), new m(19));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapActivityEvent$lambda$39$lambda$37(Effect.ActivityEventReceived activityEventReceived) {
        return new ConversationKitEvent.ActivityEventReceived(activityEventReceived.getActivityEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapActivityEvent$lambda$39$lambda$38(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    private final List<ConversationKitEvent> mapAttachmentDownloadStarted(Effect.AttachmentDownloadStarted effect) {
        return EffectMapperKt.mapEvents(new b(effect, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapAttachmentDownloadStarted$lambda$55(Effect.AttachmentDownloadStarted attachmentDownloadStarted, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(attachmentDownloadStarted.getConversation(), new m(23));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapAttachmentDownloadStarted$lambda$55$lambda$54(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    private final List<ConversationKitEvent> mapConnectionChanged(Effect.ConnectionChanged effect) {
        return EffectMapperKt.mapEvents(new b(effect, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapConnectionChanged$lambda$7(Effect.ConnectionChanged connectionChanged, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(connectionChanged, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConnectionChanged$lambda$7$lambda$6(Effect.ConnectionChanged connectionChanged) {
        return new ConversationKitEvent.ConnectionStatusChanged(connectionChanged.getConnectionStatus());
    }

    private final List<ConversationKitEvent> mapConversationAdded(Effect.ConversationAddedResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapConversationAdded$lambda$44(final Effect.ConversationAddedResult conversationAddedResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        ConversationKitResult<Conversation> result = conversationAddedResult.getResult();
        if (result instanceof ConversationKitResult.Success) {
            final int i11 = 0;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return EffectMapper.mapConversationAdded$lambda$44$lambda$42(conversationAddedResult);
                        default:
                            return EffectMapper.mapConversationAdded$lambda$44$lambda$43(conversationAddedResult);
                    }
                }
            });
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            final int i12 = 1;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return EffectMapper.mapConversationAdded$lambda$44$lambda$42(conversationAddedResult);
                        default:
                            return EffectMapper.mapConversationAdded$lambda$44$lambda$43(conversationAddedResult);
                    }
                }
            });
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationAdded$lambda$44$lambda$42(Effect.ConversationAddedResult conversationAddedResult) {
        return new ConversationKitEvent.ConversationAddedSuccess((Conversation) ((ConversationKitResult.Success) conversationAddedResult.getResult()).getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationAdded$lambda$44$lambda$43(Effect.ConversationAddedResult conversationAddedResult) {
        return new ConversationKitEvent.ConversationAddedFailure(((ConversationKitResult.Failure) conversationAddedResult.getResult()).getCause());
    }

    private final List<ConversationKitEvent> mapConversationRemoved(Effect.ConversationRemovedResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapConversationRemoved$lambda$47(final Effect.ConversationRemovedResult conversationRemovedResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        ConversationKitResult<String> result = conversationRemovedResult.getResult();
        if (result instanceof ConversationKitResult.Success) {
            final int i11 = 0;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return EffectMapper.mapConversationRemoved$lambda$47$lambda$45(conversationRemovedResult);
                        default:
                            return EffectMapper.mapConversationRemoved$lambda$47$lambda$46(conversationRemovedResult);
                    }
                }
            });
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            final int i12 = 1;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return EffectMapper.mapConversationRemoved$lambda$47$lambda$45(conversationRemovedResult);
                        default:
                            return EffectMapper.mapConversationRemoved$lambda$47$lambda$46(conversationRemovedResult);
                    }
                }
            });
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationRemoved$lambda$47$lambda$45(Effect.ConversationRemovedResult conversationRemovedResult) {
        return new ConversationKitEvent.ConversationRemovedSuccess((String) ((ConversationKitResult.Success) conversationRemovedResult.getResult()).getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationRemoved$lambda$47$lambda$46(Effect.ConversationRemovedResult conversationRemovedResult) {
        return new ConversationKitEvent.ConversationRemovedFailure(((ConversationKitResult.Failure) conversationRemovedResult.getResult()).getCause());
    }

    private final List<ConversationKitEvent> mapConversationUpdated(Effect.ConversationUpdatedResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapConversationUpdated$lambda$50(Effect.ConversationUpdatedResult conversationUpdatedResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        ConversationKitResult<Conversation> result = conversationUpdatedResult.getResult();
        if (result instanceof ConversationKitResult.Success) {
            eventReceiver.event(new f((ConversationKitResult.Success) result, 1));
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            eventReceiver.event(new g((ConversationKitResult.Failure) result, 1));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationUpdated$lambda$50$lambda$48(ConversationKitResult conversationKitResult) {
        return new ConversationKitEvent.ConversationUpdated((Conversation) ((ConversationKitResult.Success) conversationKitResult).getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapConversationUpdated$lambda$50$lambda$49(ConversationKitResult conversationKitResult) {
        return new ConversationKitEvent.ConversationUpdatedFailure(((ConversationKitResult.Failure) conversationKitResult).getCause());
    }

    private final List<ConversationKitEvent> mapCreateConversationResult(Effect.CreateConversationResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapCreateConversationResult$lambda$11(Effect.CreateConversationResult createConversationResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (createConversationResult.getResult() instanceof ConversationKitResult.Success) {
            eventReceiver.event(new a(createConversationResult, 13));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapCreateConversationResult$lambda$11$lambda$10(Effect.CreateConversationResult createConversationResult) {
        return new ConversationKitEvent.ConversationUpdated((Conversation) ((ConversationKitResult.Success) createConversationResult.getResult()).getValue());
    }

    private final List<ConversationKitEvent> mapCreateUserResult(Effect.CreateUserResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapCreateUserResult$lambda$1(Effect.CreateUserResult createUserResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (createUserResult.getResult() instanceof ConversationKitResult.Success) {
            User user = (User) ((ConversationKitResult.Success) createUserResult.getResult()).getValue();
            if (user.getConversations().size() == 1) {
                eventReceiver.event(new a(user, 10));
            }
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapCreateUserResult$lambda$1$lambda$0(User user) {
        return new ConversationKitEvent.ConversationAddedSuccess((Conversation) CollectionsKt.O(user.getConversations()));
    }

    private final List<ConversationKitEvent> mapGetConversationResult(Effect.GetConversationResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapGetConversationResult$lambda$13(Effect.GetConversationResult getConversationResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (getConversationResult.getResult() instanceof ConversationKitResult.Success) {
            eventReceiver.event(new a(getConversationResult, 11));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapGetConversationResult$lambda$13$lambda$12(Effect.GetConversationResult getConversationResult) {
        return new ConversationKitEvent.ConversationUpdated((Conversation) ((ConversationKitResult.Success) getConversationResult.getResult()).getValue());
    }

    private final List<ConversationKitEvent> mapLoadMoreMessages(Effect.LoadMoreMessages effect) {
        return EffectMapperKt.mapEvents(new b(effect, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapLoadMoreMessages$lambda$26(Effect.LoadMoreMessages loadMoreMessages, EventReceiver eventReceiver) {
        Object obj;
        eventReceiver.getClass();
        ConversationKitResult<List<Message>> result = loadMoreMessages.getResult();
        if (result instanceof ConversationKitResult.Success) {
            obj = (List) ((ConversationKitResult.Success) loadMoreMessages.getResult()).getValue();
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            obj = n0.f26529a;
        }
        eventReceiver.event(new yl.e(2, obj, loadMoreMessages));
        eventReceiver.event(loadMoreMessages.getConversation(), new m(20));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapLoadMoreMessages$lambda$26$lambda$24(List list, Effect.LoadMoreMessages loadMoreMessages) {
        return new ConversationKitEvent.LoadMoreMessages(list, loadMoreMessages.getConversationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapLoadMoreMessages$lambda$26$lambda$25(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    private final List<ConversationKitEvent> mapLogoutUserResult(Effect.LogoutUserResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapLogoutUserResult$lambda$3(Effect.LogoutUserResult logoutUserResult, EventReceiver eventReceiver) {
        ConversationKitResult<Object> success;
        eventReceiver.getClass();
        ConversationKitResult<Object> result = logoutUserResult.getResult();
        if (result instanceof ConversationKitResult.Failure) {
            success = logoutUserResult.getResult();
        } else {
            if (!(result instanceof ConversationKitResult.Success)) {
                e40.a.f();
                return null;
            }
            success = new ConversationKitResult.Success<>(Unit.f26487a);
        }
        eventReceiver.event(new a(success, 9));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapLogoutUserResult$lambda$3$lambda$2(ConversationKitResult conversationKitResult) {
        return new ConversationKitEvent.LogoutUserCompleted(conversationKitResult);
    }

    private final List<ConversationKitEvent> mapMessagePrepared(Effect.MessagePrepared effect) {
        return EffectMapperKt.mapEvents(new b(effect, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapMessagePrepared$lambda$28(Effect.MessagePrepared messagePrepared, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(messagePrepared.getConversation(), new m(18));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapMessagePrepared$lambda$28$lambda$27(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    private final List<ConversationKitEvent> mapMessageReceived(Effect.MessageReceived effect) {
        return EffectMapperKt.mapEvents(new b(effect, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapMessageReceived$lambda$23(final Effect.MessageReceived messageReceived, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (messageReceived.getWasServedByAgent()) {
            final int i11 = 0;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return EffectMapper.mapMessageReceived$lambda$23$lambda$19(messageReceived);
                        default:
                            return EffectMapper.mapMessageReceived$lambda$23$lambda$20(messageReceived);
                    }
                }
            });
        }
        final int i12 = 1;
        eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return EffectMapper.mapMessageReceived$lambda$23$lambda$19(messageReceived);
                    default:
                        return EffectMapper.mapMessageReceived$lambda$23$lambda$20(messageReceived);
                }
            }
        });
        eventReceiver.event(messageReceived.getConversation(), new m(22));
        MessageAction.WebView webViewCheckMessageIsAWebViewWithOpenOnReceive = MessageKt.checkMessageIsAWebViewWithOpenOnReceive(messageReceived.getMessage().getContent());
        if (webViewCheckMessageIsAWebViewWithOpenOnReceive != null) {
            eventReceiver.event(new yl.e(3, webViewCheckMessageIsAWebViewWithOpenOnReceive, messageReceived));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapMessageReceived$lambda$23$lambda$19(Effect.MessageReceived messageReceived) {
        return new ConversationKitEvent.UserServedByAgent(messageReceived.getMessage(), messageReceived.getConversationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapMessageReceived$lambda$23$lambda$20(Effect.MessageReceived messageReceived) {
        return new ConversationKitEvent.MessageReceived(messageReceived.getMessage(), messageReceived.getConversationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapMessageReceived$lambda$23$lambda$21(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapMessageReceived$lambda$23$lambda$22(MessageAction.WebView webView, Effect.MessageReceived messageReceived) {
        return new ConversationKitEvent.OpenWebViewMessageReceived(webView.getUri(), webView.getSize(), messageReceived.getConversationId(), webView.getSourceType());
    }

    private final List<ConversationKitEvent> mapOpenAttachmentFromFile(Effect.OpenAttachmentFromFile effect) {
        return EffectMapperKt.mapEvents(new b(effect, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapOpenAttachmentFromFile$lambda$57(Effect.OpenAttachmentFromFile openAttachmentFromFile, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(openAttachmentFromFile, 3));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapOpenAttachmentFromFile$lambda$57$lambda$56(Effect.OpenAttachmentFromFile openAttachmentFromFile) {
        return new ConversationKitEvent.OpenFileAttachment(openAttachmentFromFile.getFile(), openAttachmentFromFile.getConversationId());
    }

    private final List<ConversationKitEvent> mapPersistedUserReceived(Effect.PersistedUserReceived effect) {
        return EffectMapperKt.mapEvents(new b(effect, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapPersistedUserReceived$lambda$41(Effect.PersistedUserReceived persistedUserReceived, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(persistedUserReceived, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapPersistedUserReceived$lambda$41$lambda$40(Effect.PersistedUserReceived persistedUserReceived) {
        return new ConversationKitEvent.PersistedUserReceived(persistedUserReceived.getUser());
    }

    private final List<ConversationKitEvent> mapPostbackSent(Effect.SendPostbackResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapPostbackSent$lambda$53(Effect.SendPostbackResult sendPostbackResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        ConversationKitResult<String> result = sendPostbackResult.getResult();
        if (result instanceof ConversationKitResult.Success) {
            eventReceiver.event(new f((ConversationKitResult.Success) result, 0));
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            eventReceiver.event(new g((ConversationKitResult.Failure) result, 0));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapPostbackSent$lambda$53$lambda$51(ConversationKitResult conversationKitResult) {
        return new ConversationKitEvent.PostbackSuccess((String) ((ConversationKitResult.Success) conversationKitResult).getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapPostbackSent$lambda$53$lambda$52(ConversationKitResult conversationKitResult) {
        return new ConversationKitEvent.PostbackFailure(((ConversationKitResult.Failure) conversationKitResult).getCause());
    }

    private final List<ConversationKitEvent> mapProactiveMessageReferral(Effect.ProactiveMessageReferral effect) {
        return EffectMapperKt.mapEvents(new b(effect, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapProactiveMessageReferral$lambda$15(Effect.ProactiveMessageReferral proactiveMessageReferral, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (proactiveMessageReferral.getResult() instanceof ConversationKitResult.Success) {
            eventReceiver.event(new a(proactiveMessageReferral, 5));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapProactiveMessageReferral$lambda$15$lambda$14(Effect.ProactiveMessageReferral proactiveMessageReferral) {
        return new ConversationKitEvent.ConversationUpdated((Conversation) ((ConversationKitResult.Success) proactiveMessageReferral.getResult()).getValue());
    }

    private final List<ConversationKitEvent> mapPushRegistrationPending(Effect.PushTokenPrepared effect) {
        return EffectMapperKt.mapEvents(new b(effect, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapPushRegistrationPending$lambda$34(Effect.PushTokenPrepared pushTokenPrepared, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(pushTokenPrepared, 8));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapPushRegistrationPending$lambda$34$lambda$33(Effect.PushTokenPrepared pushTokenPrepared) {
        return new ConversationKitEvent.PushTokenPrepared(pushTokenPrepared.getPushToken());
    }

    private final List<ConversationKitEvent> mapPushRegistrationResult(Effect.PushTokenUpdateResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapPushRegistrationResult$lambda$36(Effect.PushTokenUpdateResult pushTokenUpdateResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        eventReceiver.event(new a(pushTokenUpdateResult, 2));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapPushRegistrationResult$lambda$36$lambda$35(Effect.PushTokenUpdateResult pushTokenUpdateResult) {
        return new ConversationKitEvent.PushTokenUpdateResult(pushTokenUpdateResult.getResult(), pushTokenUpdateResult.getPushToken());
    }

    private final List<ConversationKitEvent> mapRefreshConversationResult(Effect.RefreshConversationResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapRefreshConversationResult$lambda$18(final Effect.RefreshConversationResult refreshConversationResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (refreshConversationResult.getResult() instanceof ConversationKitResult.Success) {
            if (refreshConversationResult.getWasServedByAgent() && refreshConversationResult.getAgentFirstMessage() != null) {
                final int i11 = 0;
                eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return EffectMapper.mapRefreshConversationResult$lambda$18$lambda$16(refreshConversationResult);
                            default:
                                return EffectMapper.mapRefreshConversationResult$lambda$18$lambda$17(refreshConversationResult);
                        }
                    }
                });
            }
            final int i12 = 1;
            eventReceiver.event(new Function0() { // from class: zendesk.conversationkit.android.internal.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return EffectMapper.mapRefreshConversationResult$lambda$18$lambda$16(refreshConversationResult);
                        default:
                            return EffectMapper.mapRefreshConversationResult$lambda$18$lambda$17(refreshConversationResult);
                    }
                }
            });
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapRefreshConversationResult$lambda$18$lambda$16(Effect.RefreshConversationResult refreshConversationResult) {
        return new ConversationKitEvent.UserServedByAgent(refreshConversationResult.getAgentFirstMessage(), ((Conversation) ((ConversationKitResult.Success) refreshConversationResult.getResult()).getValue()).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapRefreshConversationResult$lambda$18$lambda$17(Effect.RefreshConversationResult refreshConversationResult) {
        return new ConversationKitEvent.ConversationUpdated((Conversation) ((ConversationKitResult.Success) refreshConversationResult.getResult()).getValue());
    }

    private final List<ConversationKitEvent> mapRefreshUserResult(Effect.RefreshUserResult effect) {
        return EffectMapperKt.mapEvents(new b(effect, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapRefreshUserResult$lambda$9(Effect.RefreshUserResult refreshUserResult, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (refreshUserResult.getResult() instanceof ConversationKitResult.Success) {
            eventReceiver.event(new a(refreshUserResult, 7));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapRefreshUserResult$lambda$9$lambda$8(Effect.RefreshUserResult refreshUserResult) {
        return new ConversationKitEvent.UserUpdated((User) ((ConversationKitResult.Success) refreshUserResult.getResult()).getValue());
    }

    private final List<ConversationKitEvent> mapSendMessageResult(Effect.SendMessageResult effect) {
        return EffectMapperKt.mapEvents(new i(effect, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapSendMessageResult$lambda$32(Effect.SendMessageResult sendMessageResult, EventReceiver eventReceiver) {
        Message message;
        eventReceiver.getClass();
        ConversationKitResult<Message> result = sendMessageResult.getResult();
        if (result instanceof ConversationKitResult.Success) {
            message = (Message) ((ConversationKitResult.Success) sendMessageResult.getResult()).getValue();
        } else {
            if (!(result instanceof ConversationKitResult.Failure)) {
                e40.a.f();
                return null;
            }
            eventReceiver.event(new a(sendMessageResult, 6));
            message = sendMessageResult.getMessage();
        }
        eventReceiver.event(message, new i(sendMessageResult, 1));
        eventReceiver.event(sendMessageResult.getConversation(), new m(21));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapSendMessageResult$lambda$32$lambda$29(Effect.SendMessageResult sendMessageResult) {
        return new ConversationKitEvent.SendMessageFailed(((ConversationKitResult.Failure) sendMessageResult.getResult()).getCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapSendMessageResult$lambda$32$lambda$30(Effect.SendMessageResult sendMessageResult, Message message) {
        message.getClass();
        return new ConversationKitEvent.MessageUpdated(message, sendMessageResult.getConversationId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapSendMessageResult$lambda$32$lambda$31(Conversation conversation) {
        conversation.getClass();
        return new ConversationKitEvent.ConversationUpdated(conversation);
    }

    private final List<ConversationKitEvent> mapUserAccessRevoked(Effect.UserAccessRevoked effect) {
        return EffectMapperKt.mapEvents(new b(effect, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapUserAccessRevoked$lambda$5(Effect.UserAccessRevoked userAccessRevoked, EventReceiver eventReceiver) {
        eventReceiver.getClass();
        if (userAccessRevoked.getResult() instanceof ConversationKitResult.Failure) {
            eventReceiver.event(new a(userAccessRevoked, 12));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationKitEvent mapUserAccessRevoked$lambda$5$lambda$4(Effect.UserAccessRevoked userAccessRevoked) {
        return new ConversationKitEvent.UserAccessRevoked(((ConversationKitResult.Failure) userAccessRevoked.getResult()).getCause());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<ConversationKitEvent> map(@NotNull Effect effect) {
        effect.getClass();
        if (effect instanceof Effect.ConnectionChanged) {
            return mapConnectionChanged((Effect.ConnectionChanged) effect);
        }
        if (effect instanceof Effect.RefreshUserResult) {
            return mapRefreshUserResult((Effect.RefreshUserResult) effect);
        }
        if (effect instanceof Effect.CreateConversationResult) {
            return mapCreateConversationResult((Effect.CreateConversationResult) effect);
        }
        if (effect instanceof Effect.GetConversationResult) {
            return mapGetConversationResult((Effect.GetConversationResult) effect);
        }
        if (effect instanceof Effect.ProactiveMessageReferral) {
            return mapProactiveMessageReferral((Effect.ProactiveMessageReferral) effect);
        }
        if (effect instanceof Effect.RefreshConversationResult) {
            return mapRefreshConversationResult((Effect.RefreshConversationResult) effect);
        }
        if (effect instanceof Effect.MessageReceived) {
            return mapMessageReceived((Effect.MessageReceived) effect);
        }
        if (effect instanceof Effect.LoadMoreMessages) {
            return mapLoadMoreMessages((Effect.LoadMoreMessages) effect);
        }
        if (effect instanceof Effect.MessagePrepared) {
            return mapMessagePrepared((Effect.MessagePrepared) effect);
        }
        if (effect instanceof Effect.SendMessageResult) {
            return mapSendMessageResult((Effect.SendMessageResult) effect);
        }
        if (effect instanceof Effect.PushTokenPrepared) {
            return mapPushRegistrationPending((Effect.PushTokenPrepared) effect);
        }
        if (effect instanceof Effect.PushTokenUpdateResult) {
            return mapPushRegistrationResult((Effect.PushTokenUpdateResult) effect);
        }
        if (effect instanceof Effect.ActivityEventReceived) {
            return mapActivityEvent((Effect.ActivityEventReceived) effect);
        }
        if (effect instanceof Effect.PersistedUserReceived) {
            return mapPersistedUserReceived((Effect.PersistedUserReceived) effect);
        }
        if (effect instanceof Effect.UserAccessRevoked) {
            return mapUserAccessRevoked((Effect.UserAccessRevoked) effect);
        }
        if (effect instanceof Effect.LogoutUserResult) {
            return mapLogoutUserResult((Effect.LogoutUserResult) effect);
        }
        if (effect instanceof Effect.ConversationAddedResult) {
            return mapConversationAdded((Effect.ConversationAddedResult) effect);
        }
        if (effect instanceof Effect.ConversationRemovedResult) {
            return mapConversationRemoved((Effect.ConversationRemovedResult) effect);
        }
        if (effect instanceof Effect.ConversationUpdatedResult) {
            return mapConversationUpdated((Effect.ConversationUpdatedResult) effect);
        }
        if (effect instanceof Effect.SendPostbackResult) {
            return mapPostbackSent((Effect.SendPostbackResult) effect);
        }
        if (effect instanceof Effect.CreateUserResult) {
            return mapCreateUserResult((Effect.CreateUserResult) effect);
        }
        if (effect instanceof Effect.AttachmentDownloadStarted) {
            return mapAttachmentDownloadStarted((Effect.AttachmentDownloadStarted) effect);
        }
        if (effect instanceof Effect.OpenAttachmentFromFile) {
            return mapOpenAttachmentFromFile((Effect.OpenAttachmentFromFile) effect);
        }
        Logger.d(LOG_TAG, "Effect " + effect + " has no public counterpart, skipping.", new Object[0]);
        return n0.f26529a;
    }
}
