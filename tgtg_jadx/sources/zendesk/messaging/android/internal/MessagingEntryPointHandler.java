package zendesk.messaging.android.internal;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.android.messaging.MessagingScreen;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.messaging.android.internal.extension.ConversationKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006$"}, d2 = {"Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/messaging/model/MessagingSettings;)V", "", "Lzendesk/conversationkit/android/model/Conversation;", "conversations", "", "canUserSeeConversationList", "canUserCreateMoreConversations", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreen", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "handleSuccess", "(Ljava/util/List;ZZLzendesk/android/messaging/MessagingScreen;Lx70/c;)Ljava/lang/Object;", "conversationListEntryPoint", "(Ljava/util/List;ZZ)Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "messagingScreenNavigation", "newConversationScreenEntryPoint", "(Lzendesk/android/messaging/MessagingScreen;Ljava/util/List;ZZ)Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "", "conversationId", "conversationIdEntryPoint", "(Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen;Ljava/util/List;ZZLx70/c;)Ljava/lang/Object;", "Lzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;", "mostRecentActiveConversationEntryPoint", "(Ljava/util/List;ZZLzendesk/android/messaging/MessagingScreen$MostRecentActiveConversation;)Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "resolveEntryPoint", "(Lzendesk/android/messaging/MessagingScreen;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/messaging/model/MessagingSettings;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingEntryPointHandler {
    public static final int ONE_CONVERSATION = 1;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final MessagingSettings messagingSettings;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.MessagingEntryPointHandler$conversationIdEntryPoint$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.MessagingEntryPointHandler", f = "MessagingEntryPointHandler.kt", l = {256}, m = "conversationIdEntryPoint")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
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
            return MessagingEntryPointHandler.this.conversationIdEntryPoint(null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.MessagingEntryPointHandler$resolveEntryPoint$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.MessagingEntryPointHandler", f = "MessagingEntryPointHandler.kt", l = {32, 46, 47}, m = "resolveEntryPoint")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03841 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03841(x70.c<? super C03841> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessagingEntryPointHandler.this.resolveEntryPoint(null, this);
        }
    }

    public MessagingEntryPointHandler(@NotNull ConversationKit conversationKit, @NotNull MessagingSettings messagingSettings) {
        conversationKit.getClass();
        messagingSettings.getClass();
        this.conversationKit = conversationKit;
        this.messagingSettings = messagingSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object conversationIdEntryPoint(java.lang.String r10, zendesk.android.messaging.MessagingScreen r11, java.util.List<zendesk.conversationkit.android.model.Conversation> r12, boolean r13, boolean r14, x70.c<? super zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof zendesk.messaging.android.internal.MessagingEntryPointHandler.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r15
            zendesk.messaging.android.internal.MessagingEntryPointHandler$conversationIdEntryPoint$1 r0 = (zendesk.messaging.android.internal.MessagingEntryPointHandler.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.MessagingEntryPointHandler$conversationIdEntryPoint$1 r0 = new zendesk.messaging.android.internal.MessagingEntryPointHandler$conversationIdEntryPoint$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3b
            boolean r14 = r0.Z$1
            boolean r13 = r0.Z$0
            java.lang.Object r10 = r0.L$2
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r10 = r0.L$1
            r11 = r10
            zendesk.android.messaging.MessagingScreen r11 = (zendesk.android.messaging.MessagingScreen) r11
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            ba0.g.M(r15)
        L38:
            r3 = r10
            r5 = r11
            goto L5a
        L3b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
        L40:
            r10 = 0
            return r10
        L42:
            ba0.g.M(r15)
            zendesk.conversationkit.android.ConversationKit r15 = r9.conversationKit
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.Z$0 = r13
            r0.Z$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.getConversation(r10, r0)
            if (r15 != r1) goto L38
            return r1
        L5a:
            zendesk.conversationkit.android.ConversationKitResult r15 = (zendesk.conversationkit.android.ConversationKitResult) r15
            boolean r10 = r15 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r10 == 0) goto L6b
            zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen$ConversationFragmentScreen r2 = new zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen$ConversationFragmentScreen
            r7 = 10
            r8 = 0
            r4 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L6b:
            boolean r10 = r15 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r10 == 0) goto L74
            zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen r10 = r9.conversationListEntryPoint(r12, r13, r14)
            return r10
        L74:
            e40.a.f()
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.MessagingEntryPointHandler.conversationIdEntryPoint(java.lang.String, zendesk.android.messaging.MessagingScreen, java.util.List, boolean, boolean, x70.c):java.lang.Object");
    }

    private final MessagingFragmentScreen conversationListEntryPoint(List<Conversation> conversations, boolean canUserSeeConversationList, boolean canUserCreateMoreConversations) {
        if (conversations.size() == 1 && canUserSeeConversationList && canUserCreateMoreConversations) {
            return MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE;
        }
        if (conversations.size() == 1 && !canUserSeeConversationList) {
            Conversation conversationLatestUpdatedTopConversation = ConversationKtxKt.latestUpdatedTopConversation(conversations);
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation != null ? conversationLatestUpdatedTopConversation.getId() : null, null, null, null, 14, null);
        }
        if (conversations.size() == 1 && canUserSeeConversationList && !canUserCreateMoreConversations) {
            Conversation conversationLatestUpdatedTopConversation2 = ConversationKtxKt.latestUpdatedTopConversation(conversations);
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation2 != null ? conversationLatestUpdatedTopConversation2.getId() : null, null, null, null, 14, null);
        }
        if (conversations.size() <= 1 || canUserSeeConversationList) {
            return (conversations.size() <= 1 || !canUserSeeConversationList) ? MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE : MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE;
        }
        Conversation conversationLatestUpdatedTopConversation3 = ConversationKtxKt.latestUpdatedTopConversation(conversations);
        return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation3 != null ? conversationLatestUpdatedTopConversation3.getId() : null, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSuccess(List<Conversation> list, boolean z11, boolean z12, MessagingScreen messagingScreen, x70.c<? super MessagingFragmentScreen> cVar) {
        if (list.isEmpty()) {
            return new MessagingFragmentScreen.ConversationFragmentScreen(null, null, null, null, 15, null);
        }
        if (messagingScreen instanceof MessagingScreen.Conversation) {
            return conversationIdEntryPoint(((MessagingScreen.Conversation) messagingScreen).getId(), messagingScreen, list, z11, z12, cVar);
        }
        if (messagingScreen instanceof MessagingScreen.ConversationsList) {
            return conversationListEntryPoint(list, z11, z12);
        }
        if (messagingScreen instanceof MessagingScreen.NewConversation) {
            return newConversationScreenEntryPoint(messagingScreen, list, z11, z12);
        }
        if (messagingScreen instanceof MessagingScreen.MostRecentActiveConversation) {
            return mostRecentActiveConversationEntryPoint(list, z11, z12, (MessagingScreen.MostRecentActiveConversation) messagingScreen);
        }
        e40.a.f();
        return null;
    }

    private final MessagingFragmentScreen mostRecentActiveConversationEntryPoint(List<Conversation> conversations, boolean canUserSeeConversationList, boolean canUserCreateMoreConversations, MessagingScreen.MostRecentActiveConversation messagingScreenNavigation) {
        Conversation conversationLatestUpdatedTopConversation = ConversationKtxKt.latestUpdatedTopConversation(conversations, ConversationStatus.ACTIVE);
        if (conversations.size() == 1 && !canUserCreateMoreConversations) {
            Conversation conversationLatestUpdatedTopConversation2 = ConversationKtxKt.latestUpdatedTopConversation(conversations);
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation2 != null ? conversationLatestUpdatedTopConversation2.getId() : null, null, messagingScreenNavigation, null, 10, null);
        }
        if (conversations.size() == 1 && conversationLatestUpdatedTopConversation != null) {
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation.getId(), null, messagingScreenNavigation, null, 10, null);
        }
        if (conversations.size() == 1 && !canUserSeeConversationList) {
            Conversation conversationLatestUpdatedTopConversation3 = ConversationKtxKt.latestUpdatedTopConversation(conversations);
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation3 != null ? conversationLatestUpdatedTopConversation3.getId() : null, null, messagingScreenNavigation, null, 10, null);
        }
        if (conversations.size() == 1) {
            return MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE;
        }
        if (conversations.size() > 1 && conversationLatestUpdatedTopConversation != null) {
            return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation.getId(), null, messagingScreenNavigation, null, 10, null);
        }
        if (conversations.size() <= 1 || canUserSeeConversationList) {
            return conversations.size() > 1 ? MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE : MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE;
        }
        Conversation conversationLatestUpdatedTopConversation4 = ConversationKtxKt.latestUpdatedTopConversation(conversations);
        return new MessagingFragmentScreen.ConversationFragmentScreen(conversationLatestUpdatedTopConversation4 != null ? conversationLatestUpdatedTopConversation4.getId() : null, null, messagingScreenNavigation, null, 10, null);
    }

    private final MessagingFragmentScreen newConversationScreenEntryPoint(MessagingScreen messagingScreenNavigation, List<Conversation> conversations, boolean canUserSeeConversationList, boolean canUserCreateMoreConversations) {
        return (conversations.size() < 1 || !canUserCreateMoreConversations) ? (conversations.size() < 1 || canUserCreateMoreConversations) ? MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE : conversationListEntryPoint(conversations, canUserSeeConversationList, canUserCreateMoreConversations) : new MessagingFragmentScreen.ConversationFragmentScreen(null, null, messagingScreenNavigation, null, 11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveEntryPoint(@org.jetbrains.annotations.NotNull zendesk.android.messaging.MessagingScreen r19, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen> r20) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.MessagingEntryPointHandler.resolveEntryPoint(zendesk.android.messaging.MessagingScreen, x70.c):java.lang.Object");
    }
}
