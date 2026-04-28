package zendesk.messaging.android.internal.conversationscreen;

import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.internal.measurement.cg;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.AuthenticationType;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.User;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepositoryEvent;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 n2\u00020\u0001:\u0001nB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001a2\b\u0010&\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J,\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0016010\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b2\u00103J<\u0010:\u001a\u0002092\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b>\u0010=J \u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b@\u0010\u001fJ \u0010A\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bA\u0010\u001fJ \u0010C\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bC\u0010\u001fJ(\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bF\u0010GJ$\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020I0H2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bJ\u0010=J\u0012\u0010K\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\bK\u0010%J \u0010L\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bL\u0010MJ\u0018\u0010O\u001a\u0002092\u0006\u0010N\u001a\u00020'H\u0082@¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u0004\u0018\u00010\u00182\u0006\u0010N\u001a\u00020'H\u0002¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u000209H\u0082@¢\u0006\u0004\bS\u0010%J\u0010\u0010T\u001a\u00020'H\u0082@¢\u0006\u0004\bT\u0010%J\u001d\u0010W\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020'0UH\u0002¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\bY\u0010%J\u0018\u0010Z\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\bZ\u0010=J\u0018\u0010[\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b[\u0010=J\u0010\u0010\\\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\\\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020b0e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010m¨\u0006o"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage;", "messagingStorage", "Lv80/x;", "defaultDispatcher", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage;Lv80/x;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;)V", "", "proactiveNotificationId", "hasSendReferralInfo", "", "updateProactiveParams", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "userAccessHasBeenRevoked", "updateUserAccessHasBeenRevoked", "(Z)V", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "", "conversationId", "Lzendesk/conversationkit/android/ConversationKitResult;", "sendMessage", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "actionId", "sendPostbackMessage", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "sendActivityData", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "resume", "(Lx70/c;)Ljava/lang/Object;", "proactiveMessageId", "Lzendesk/conversationkit/android/model/User;", "createUser", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "addEventListener", "(Lzendesk/conversationkit/android/ConversationKitEventListener;)V", "removeEventListener", "", "beforeTimestamp", "", "getMessages", "(Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "canUserCreateMoreConversations", "isMultiConvoEnabled", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreenNavigation", "shouldStartDefaultConversation", "Lzendesk/conversationkit/android/model/Conversation;", "resolveConversation", "(Ljava/lang/String;ZZLzendesk/android/messaging/MessagingScreen;ZLx70/c;)Ljava/lang/Object;", "getRemoteConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "retrieveInitialText", "composerText", "persistComposerText", "updateComposerText", "formId", "removeStoredForm", "Lzendesk/ui/android/conversation/form/DisplayedField;", "field", "updateLocalStoredForm", "(Lzendesk/ui/android/conversation/form/DisplayedField;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "getLocalStoredForms", "getUserAuthToken", "downloadAttachment", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "user", "getUserDefaultConversation", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "defaultConversationId", "(Lzendesk/conversationkit/android/model/User;)Ljava/lang/String;", "createConversation", "getUser", "Lzendesk/conversationkit/android/ConversationKitResult$Success;", "result", "handleConversationStartedForAnonymousUser", "(Lzendesk/conversationkit/android/ConversationKitResult$Success;)V", "latestClosedConversationId", "resolveProactiveConversation", "getProactiveMessageReferral", "updateProactiveReferralLocalData", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingStorage;", "Lv80/x;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepositoryEvent;", "_eventsChannel", "Lx80/m;", "Ly80/i;", "eventsChannel", "Ly80/i;", "getEventsChannel", "()Ly80/i;", "Lzendesk/messaging/android/internal/conversationscreen/ProactiveParams;", "proactiveParams", "Lzendesk/messaging/android/internal/conversationscreen/ProactiveParams;", "Z", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationScreenRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenRepository.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,507:1\n295#2,2:508\n774#2:510\n865#2,2:511\n1068#2:513\n216#3:514\n216#3,2:515\n217#3:517\n*S KotlinDebug\n*F\n+ 1 ConversationScreenRepository.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository\n*L\n253#1:508,2\n338#1:510\n338#1:511,2\n341#1:513\n486#1:514\n489#1:515,2\n486#1:517\n*E\n"})
public final class ConversationScreenRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationScreenRepository";

    @NotNull
    private final x80.m _eventsChannel;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final x defaultDispatcher;

    @NotNull
    private final y80.i eventsChannel;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final MessagingStorage messagingStorage;

    @NotNull
    private final ProactiveParams proactiveParams;
    private boolean userAccessHasBeenRevoked;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$createConversation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {263, 269}, m = "createConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.createConversation(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getLocalStoredForms$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {485}, m = "getLocalStoredForms")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03911 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03911(x70.c<? super C03911> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.getLocalStoredForms(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getProactiveMessageReferral$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {377, MLKEMEngine.KyberPolyBytes}, m = "getProactiveMessageReferral")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03921 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03921(x70.c<? super C03921> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.getProactiveMessageReferral(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getRemoteConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {395}, m = "getRemoteConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03931 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03931(x70.c<? super C03931> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.getRemoteConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {285, 293, 295, 303}, m = "getUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03941 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03941(x70.c<? super C03941> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.getUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUserAuthToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {496}, m = "getUserAuthToken")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03951 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03951(x70.c<? super C03951> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.getUserAuthToken(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {332}, m = "latestClosedConversationId")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03961 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03961(x70.c<? super C03961> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.latestClosedConversationId(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$persistComposerText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {422, 424}, m = "persistComposerText")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03971 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03971(x70.c<? super C03971> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.persistComposerText(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$resolveConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {195, 196, AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, Primes.SMALL_FACTOR_LIMIT, 216, AppConstants.GPS_SETTINGS, 226}, m = "resolveConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03981 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        /* synthetic */ Object result;

        public C03981(x70.c<? super C03981> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.resolveConversation(null, false, false, null, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$retrieveInitialText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {414}, m = "retrieveInitialText")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03991 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03991(x70.c<? super C03991> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.retrieveInitialText(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateLocalStoredForm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository", f = "ConversationScreenRepository.kt", l = {460, 474}, m = "updateLocalStoredForm")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04001 extends z70.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C04001(x70.c<? super C04001> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenRepository.this.updateLocalStoredForm(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateProactiveReferralLocalData$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateProactiveReferralLocalData$2", f = "ConversationScreenRepository.kt", l = {406}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenRepository.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                x80.m mVar = ConversationScreenRepository.this._eventsChannel;
                ConversationScreenRepositoryEvent.UpdateProactiveReferralData updateProactiveReferralData = ConversationScreenRepositoryEvent.UpdateProactiveReferralData.INSTANCE;
                this.label = 1;
                if (mVar.f(updateProactiveReferralData, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    public ConversationScreenRepository(@NotNull ConversationKit conversationKit, @NotNull MessagingStorage messagingStorage, @NotNull x xVar, @NotNull MessagingEventDispatcher messagingEventDispatcher) {
        conversationKit.getClass();
        messagingStorage.getClass();
        xVar.getClass();
        messagingEventDispatcher.getClass();
        this.conversationKit = conversationKit;
        this.messagingStorage = messagingStorage;
        this.defaultDispatcher = xVar;
        this.messagingEventDispatcher = messagingEventDispatcher;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._eventsChannel = iVarA;
        this.eventsChannel = y80.r.w(iVarA);
        this.proactiveParams = new ProactiveParams(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createConversation(x70.c<? super zendesk.conversationkit.android.model.Conversation> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$createConversation$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$createConversation$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$createConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.ConversationKitResult r0 = (zendesk.conversationkit.android.ConversationKitResult) r0
            ba0.g.M(r9)
            goto L63
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L35:
            ba0.g.M(r9)
            goto L4d
        L39:
            ba0.g.M(r9)
            zendesk.conversationkit.android.ConversationKit r9 = r8.conversationKit
            zendesk.messaging.android.internal.conversationscreen.ProactiveParams r2 = r8.proactiveParams
            java.lang.Integer r2 = r2.getHasSendReferralInfo()
            r0.label = r4
            java.lang.Object r9 = r9.createConversation(r2, r0)
            if (r9 != r1) goto L4d
            goto L61
        L4d:
            zendesk.conversationkit.android.ConversationKitResult r9 = (zendesk.conversationkit.android.ConversationKitResult) r9
            boolean r2 = r9 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r2 != 0) goto L85
            boolean r2 = r9 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r2 == 0) goto L80
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r0 = r8.updateProactiveReferralLocalData(r0)
            if (r0 != r1) goto L62
        L61:
            return r1
        L62:
            r0 = r9
        L63:
            zendesk.messaging.android.internal.events.MessagingEventDispatcher r1 = r8.messagingEventDispatcher
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = (zendesk.conversationkit.android.ConversationKitResult.Success) r0
            java.lang.Object r9 = r0.getValue()
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            java.lang.String r2 = r9.getId()
            r6 = 6
            r7 = 0
            r3 = 0
            r5 = 0
            zendesk.messaging.android.internal.events.MessagingEventDispatcher.handleConversationStartedEvent$zendesk_messaging_messaging_android$default(r1, r2, r3, r5, r6, r7)
            java.lang.Object r9 = r0.getValue()
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            return r9
        L80:
            e40.a.f()
            r9 = 0
            return r9
        L85:
            zendesk.conversationkit.android.ConversationKitResult$Failure r9 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r9
            java.lang.Throwable r9 = r9.getCause()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.createConversation(x70.c):java.lang.Object");
    }

    private final String defaultConversationId(User user) {
        Object next;
        Iterator<T> it = user.getConversations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Conversation) next).isDefault()) {
                break;
            }
        }
        Conversation conversation = (Conversation) next;
        if (conversation != null) {
            return conversation.getId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (updateProactiveReferralLocalData(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveMessageReferral(java.lang.String r6, x70.c<? super zendesk.conversationkit.android.model.Conversation> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03921
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getProactiveMessageReferral$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getProactiveMessageReferral$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getProactiveMessageReferral$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            ba0.g.M(r7)
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r7)
            goto L4d
        L39:
            ba0.g.M(r7)
            zendesk.conversationkit.android.ConversationKit r7 = r5.conversationKit
            zendesk.messaging.android.internal.conversationscreen.ProactiveParams r2 = r5.proactiveParams
            java.lang.Integer r2 = r2.getProactiveNotificationId()
            r0.label = r4
            java.lang.Object r7 = r7.proactiveMessageReferral(r2, r6, r0)
            if (r7 != r1) goto L4d
            goto L62
        L4d:
            r6 = r7
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            boolean r7 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r7 != 0) goto L71
            boolean r7 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r7 == 0) goto L6c
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.updateProactiveReferralLocalData(r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            zendesk.conversationkit.android.ConversationKitResult$Success r6 = (zendesk.conversationkit.android.ConversationKitResult.Success) r6
            java.lang.Object r6 = r6.getValue()
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            return r6
        L6c:
            e40.a.f()
            r6 = 0
            return r6
        L71:
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r6
            java.lang.Throwable r6 = r6.getCause()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.getProactiveMessageReferral(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUser(x70.c<? super zendesk.conversationkit.android.model.User> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03941
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUser$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUser$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            ba0.g.M(r8)
            goto Lad
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.ConversationKitResult r0 = (zendesk.conversationkit.android.ConversationKitResult) r0
            ba0.g.M(r8)
            goto L8a
        L40:
            ba0.g.M(r8)
            goto L78
        L44:
            ba0.g.M(r8)
            goto L56
        L48:
            ba0.g.M(r8)
            zendesk.conversationkit.android.ConversationKit r8 = r7.conversationKit
            r0.label = r6
            java.lang.Object r8 = r8.getCurrentUser(r0)
            if (r8 != r1) goto L56
            goto Lac
        L56:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            if (r8 == 0) goto L5b
            return r8
        L5b:
            boolean r8 = r7.userAccessHasBeenRevoked
            if (r8 != 0) goto Lbf
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r2 = "ConversationScreenRepository"
            java.lang.String r6 = "No user created yet, creating user to show the conversation."
            zendesk.logger.Logger.i(r2, r6, r8)
            zendesk.messaging.android.internal.conversationscreen.ProactiveParams r8 = r7.proactiveParams
            java.lang.Integer r8 = r8.getHasSendReferralInfo()
            r0.label = r5
            java.lang.Object r8 = r7.createUser(r8, r0)
            if (r8 != r1) goto L78
            goto Lac
        L78:
            zendesk.conversationkit.android.ConversationKitResult r8 = (zendesk.conversationkit.android.ConversationKitResult) r8
            boolean r2 = r8 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r2 == 0) goto L94
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r0 = r7.updateProactiveReferralLocalData(r0)
            if (r0 != r1) goto L89
            goto Lac
        L89:
            r0 = r8
        L8a:
            zendesk.conversationkit.android.ConversationKitResult$Success r0 = (zendesk.conversationkit.android.ConversationKitResult.Success) r0
            r7.handleConversationStartedForAnonymousUser(r0)
            java.lang.Object r8 = r0.getValue()
            return r8
        L94:
            boolean r2 = r8 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r2 == 0) goto Lba
            zendesk.conversationkit.android.ConversationKitResult$Failure r8 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r8
            java.lang.Throwable r2 = r8.getCause()
            boolean r2 = r2 instanceof zendesk.conversationkit.android.ConversationKitError.UserAlreadyExists
            if (r2 == 0) goto Lb5
            zendesk.conversationkit.android.ConversationKit r8 = r7.conversationKit
            r0.label = r3
            java.lang.Object r8 = r8.getCurrentUser(r0)
            if (r8 != r1) goto Lad
        Lac:
            return r1
        Lad:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            if (r8 == 0) goto Lb2
            return r8
        Lb2:
            zendesk.conversationkit.android.ConversationKitError$FailedToInitialize r8 = zendesk.conversationkit.android.ConversationKitError.FailedToInitialize.INSTANCE
            throw r8
        Lb5:
            java.lang.Throwable r8 = r8.getCause()
            throw r8
        Lba:
            e40.a.f()
            r8 = 0
            return r8
        Lbf:
            java.lang.String r8 = "User access has been revoked."
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.getUser(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getUserDefaultConversation(User user, x70.c<? super Conversation> cVar) {
        String strDefaultConversationId = defaultConversationId(user);
        if (strDefaultConversationId != null) {
            return resolveProactiveConversation(strDefaultConversationId, cVar);
        }
        Logger.i(LOG_TAG, "No default conversation found creating a new conversation with proactive " + (this.proactiveParams.getProactiveNotificationId() != null), new Object[0]);
        return createConversation(cVar);
    }

    private final void handleConversationStartedForAnonymousUser(ConversationKitResult.Success<User> result) {
        String strDefaultConversationId = defaultConversationId(result.getValue());
        if (!(result.getValue().getAuthenticationType() instanceof AuthenticationType.SessionToken) || strDefaultConversationId == null) {
            return;
        }
        MessagingEventDispatcher.handleConversationStartedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, strDefaultConversationId, 0L, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object latestClosedConversationId(x70.c<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03961
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3d
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L2c:
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.ConversationKit r6 = r5.conversationKit
            r0.label = r3
            r2 = 0
            java.lang.Object r6 = r6.getConversations(r2, r3, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            boolean r0 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            r1 = 0
            if (r0 == 0) goto L45
            return r1
        L45:
            boolean r0 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r0 == 0) goto L8e
            zendesk.conversationkit.android.ConversationKitResult$Success r6 = (zendesk.conversationkit.android.ConversationKitResult.Success) r6
            java.lang.Object r6 = r6.getValue()
            zendesk.conversationkit.android.model.ConversationsPagination r6 = (zendesk.conversationkit.android.model.ConversationsPagination) r6
            java.util.List r6 = r6.getConversations()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r6.next()
            r3 = r2
            zendesk.conversationkit.android.model.Conversation r3 = (zendesk.conversationkit.android.model.Conversation) r3
            zendesk.conversationkit.android.model.ConversationStatus r3 = r3.getStatus()
            zendesk.conversationkit.android.model.ConversationStatus r4 = zendesk.conversationkit.android.model.ConversationStatus.IDLE
            if (r3 != r4) goto L5e
            r0.add(r2)
            goto L5e
        L77:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$$inlined$sortedByDescending$1 r6 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$latestClosedConversationId$$inlined$sortedByDescending$1
            r6.<init>()
            java.util.List r6 = kotlin.collections.CollectionsKt.l0(r0, r6)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
            zendesk.conversationkit.android.model.Conversation r6 = (zendesk.conversationkit.android.model.Conversation) r6
            if (r6 == 0) goto L8d
            java.lang.String r6 = r6.getId()
            return r6
        L8d:
            return r1
        L8e:
            e40.a.f()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.latestClosedConversationId(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagingUIPersistence removeStoredForm$lambda$5(String str, MessagingUIPersistence messagingUIPersistence) {
        messagingUIPersistence.getClass();
        messagingUIPersistence.getForms().remove(str);
        return MessagingUIPersistence.copy$default(messagingUIPersistence, null, null, messagingUIPersistence.getForms(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resolveProactiveConversation(String str, x70.c<? super Conversation> cVar) {
        if (this.proactiveParams.getHasSendReferralInfo() != null) {
            Logger.i(LOG_TAG, "Fetching proactive message referral conversation", new Object[0]);
            return getProactiveMessageReferral(str, cVar);
        }
        Logger.i(LOG_TAG, "No proactive conversation, fetching the remote conversation.", new Object[0]);
        return getRemoteConversation(str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagingUIPersistence updateComposerText$lambda$4(String str, MessagingUIPersistence messagingUIPersistence) {
        messagingUIPersistence.getClass();
        return MessagingUIPersistence.copy$default(messagingUIPersistence, null, str, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateProactiveReferralLocalData(x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.defaultDispatcher, new AnonymousClass2(null), cVar);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    public final void addEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        this.conversationKit.addEventListener(listener);
    }

    @Nullable
    public final Object createUser(@Nullable Integer num, @NotNull x70.c<? super ConversationKitResult<User>> cVar) {
        return this.conversationKit.createUser(num, cVar);
    }

    @Nullable
    public final Object downloadAttachment(@NotNull String str, @NotNull Message message, @NotNull x70.c<? super Unit> cVar) {
        Object objDownloadAttachment = this.conversationKit.downloadAttachment(str, message, cVar);
        return objDownloadAttachment == y70.a.COROUTINE_SUSPENDED ? objDownloadAttachment : Unit.f26487a;
    }

    @NotNull
    public final y80.i getEventsChannel() {
        return this.eventsChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLocalStoredForms(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull x70.c<? super java.util.Map<java.lang.String, zendesk.ui.android.conversation.form.DisplayedForm>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03911
            if (r0 == 0) goto L13
            r0 = r10
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getLocalStoredForms$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getLocalStoredForms$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getLocalStoredForms$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            ba0.g.M(r10)
            goto L4a
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L32:
            ba0.g.M(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r2 = r8.messagingStorage
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r9 = r2.getMessagingPersistence(r9, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            r7 = r10
            r10 = r9
            r9 = r7
        L4a:
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r10 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r10
            java.util.Map r10 = r10.getForms()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L58:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            zendesk.messaging.android.internal.conversationscreen.cache.StoredForm r0 = (zendesk.messaging.android.internal.conversationscreen.cache.StoredForm) r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r2 = r0.getFields()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L7b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            zendesk.ui.android.conversation.form.DisplayedField r6 = new zendesk.ui.android.conversation.form.DisplayedField
            r6.<init>(r4, r3)
            r1.put(r5, r6)
            goto L7b
        La5:
            java.lang.String r2 = r0.getFormId()
            zendesk.ui.android.conversation.form.DisplayedForm r3 = new zendesk.ui.android.conversation.form.DisplayedForm
            java.lang.String r0 = r0.getFormId()
            r3.<init>(r0, r1)
            r9.put(r2, r3)
            goto L58
        Lb6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.getLocalStoredForms(java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object getMessages(@NotNull String str, double d3, @NotNull x70.c<? super ConversationKitResult<? extends List<Message>>> cVar) {
        return this.conversationKit.getMessages(str, d3, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRemoteConversation(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03931
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getRemoteConversation$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getRemoteConversation$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getRemoteConversation$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.ConversationKit r6 = r4.conversationKit
            r0.label = r3
            java.lang.Object r6 = r6.getConversation(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            boolean r5 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r5 == 0) goto L4b
            zendesk.conversationkit.android.ConversationKitResult$Success r6 = (zendesk.conversationkit.android.ConversationKitResult.Success) r6
            java.lang.Object r5 = r6.getValue()
            zendesk.conversationkit.android.model.Conversation r5 = (zendesk.conversationkit.android.model.Conversation) r5
            return r5
        L4b:
            boolean r5 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r5 != 0) goto L54
            e40.a.f()
            r5 = 0
            return r5
        L54:
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r6
            java.lang.Throwable r5 = r6.getCause()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.getRemoteConversation(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserAuthToken(@org.jetbrains.annotations.NotNull x70.c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03951
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUserAuthToken$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUserAuthToken$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$getUserAuthToken$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.ConversationKit r5 = r4.conversationKit
            r0.label = r3
            java.lang.Object r5 = r5.getCurrentUser(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.User r5 = (zendesk.conversationkit.android.model.User) r5
            if (r5 == 0) goto L45
            java.lang.String r5 = zendesk.conversationkit.android.internal.user.UserExtensionsKt.getAuthorization(r5)
            return r5
        L45:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.getUserAuthToken(x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r12.setMessagingPersistence(r11, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistComposerText(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03971
            if (r0 == 0) goto L13
            r0 = r13
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$persistComposerText$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$persistComposerText$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$persistComposerText$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r13)
            goto L64
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L31:
            java.lang.Object r11 = r0.L$0
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            ba0.g.M(r13)
        L39:
            r6 = r12
            goto L4b
        L3b:
            ba0.g.M(r13)
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r13 = r10.messagingStorage
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = r13.getMessagingPersistence(r11, r0)
            if (r13 != r1) goto L39
            goto L63
        L4b:
            r4 = r13
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r4 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r4
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r11 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence.copy$default(r4, r5, r6, r7, r8, r9)
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r12 = r10.messagingStorage
            r13 = 0
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r11 = r12.setMessagingPersistence(r11, r0)
            if (r11 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.persistComposerText(java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    public final void removeEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        this.conversationKit.removeEventListener(listener);
    }

    @Nullable
    public final Object removeStoredForm(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdateMessagingUIPersistence = this.messagingStorage.updateMessagingUIPersistence(str, new p(str2, 0), cVar);
        return objUpdateMessagingUIPersistence == y70.a.COROUTINE_SUSPENDED ? objUpdateMessagingUIPersistence : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveConversation(@org.jetbrains.annotations.Nullable java.lang.String r8, boolean r9, boolean r10, @org.jetbrains.annotations.Nullable zendesk.android.messaging.MessagingScreen r11, boolean r12, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.resolveConversation(java.lang.String, boolean, boolean, zendesk.android.messaging.MessagingScreen, boolean, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object resume(@NotNull x70.c<? super Unit> cVar) {
        Object objResume = this.conversationKit.resume(cVar);
        return objResume == y70.a.COROUTINE_SUSPENDED ? objResume : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveInitialText(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03991
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$retrieveInitialText$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C03991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$retrieveInitialText$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$retrieveInitialText$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r6 = r4.messagingStorage
            r0.label = r3
            java.lang.Object r6 = r6.getMessagingPersistence(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r6 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r6
            java.lang.String r5 = r6.getComposerText()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.retrieveInitialText(java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object sendActivityData(@NotNull ActivityData activityData, @NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object objSendActivityData = this.conversationKit.sendActivityData(activityData, str, cVar);
        return objSendActivityData == y70.a.COROUTINE_SUSPENDED ? objSendActivityData : Unit.f26487a;
    }

    @Nullable
    public final Object sendMessage(@NotNull Message message, @NotNull String str, @NotNull x70.c<? super ConversationKitResult<Message>> cVar) {
        return this.conversationKit.sendMessage(message, str, cVar);
    }

    @Nullable
    public final Object sendPostbackMessage(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super ConversationKitResult<Unit>> cVar) {
        return this.conversationKit.sendPostbackMessage(str, str2, cVar);
    }

    @Nullable
    public final Object updateComposerText(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdateMessagingUIPersistence = this.messagingStorage.updateMessagingUIPersistence(str, new p(str2, 1), cVar);
        return objUpdateMessagingUIPersistence == y70.a.COROUTINE_SUSPENDED ? objUpdateMessagingUIPersistence : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r12.setMessagingPersistence(r13, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateLocalStoredForm(@org.jetbrains.annotations.NotNull zendesk.ui.android.conversation.form.DisplayedField r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C04001
            if (r0 == 0) goto L13
            r0 = r15
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateLocalStoredForm$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.C04001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateLocalStoredForm$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository$updateLocalStoredForm$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2b
            ba0.g.M(r15)
            goto La9
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L32:
            java.lang.Object r12 = r0.L$1
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.L$0
            zendesk.ui.android.conversation.form.DisplayedField r12 = (zendesk.ui.android.conversation.form.DisplayedField) r12
            ba0.g.M(r15)
            goto L51
        L3f:
            ba0.g.M(r15)
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r15 = r11.messagingStorage
            r0.L$0 = r12
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.getMessagingPersistence(r13, r0)
            if (r15 != r1) goto L51
            goto La8
        L51:
            r5 = r15
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r5 = (zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence) r5
            java.util.Map r8 = r5.getForms()
            java.lang.Object r13 = r8.get(r14)
            zendesk.messaging.android.internal.conversationscreen.cache.StoredForm r13 = (zendesk.messaging.android.internal.conversationscreen.cache.StoredForm) r13
            r15 = 0
            if (r13 == 0) goto L76
            java.util.Map r2 = r13.getFields()
            int r3 = r12.getIndex()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            java.lang.String r12 = r12.getValue()
            r2.put(r6, r12)
            goto L8f
        L76:
            zendesk.messaging.android.internal.conversationscreen.cache.StoredForm r13 = new zendesk.messaging.android.internal.conversationscreen.cache.StoredForm
            r13.<init>(r14, r15, r4, r15)
            java.util.Map r2 = r13.getFields()
            int r3 = r12.getIndex()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            java.lang.String r12 = r12.getValue()
            r2.put(r6, r12)
        L8f:
            r8.put(r14, r13)
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage r12 = r11.messagingStorage
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence r13 = zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence.copy$default(r5, r6, r7, r8, r9, r10)
            r0.L$0 = r15
            r0.L$1 = r15
            r0.label = r4
            java.lang.Object r12 = r12.setMessagingPersistence(r13, r0)
            if (r12 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository.updateLocalStoredForm(zendesk.ui.android.conversation.form.DisplayedField, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    public final void updateProactiveParams(@Nullable Integer proactiveNotificationId, @Nullable Integer hasSendReferralInfo) {
        ProactiveParams proactiveParams = this.proactiveParams;
        proactiveParams.setProactiveNotificationId(proactiveNotificationId);
        proactiveParams.setHasSendReferralInfo(hasSendReferralInfo);
    }

    public final void updateUserAccessHasBeenRevoked(boolean userAccessHasBeenRevoked) {
        this.userAccessHasBeenRevoked = userAccessHasBeenRevoked;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRepository$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
