package zendesk.messaging.android.internal.messagingscreen;

import kotlin.Metadata;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.android.messaging.MessagingScreen;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/BackNavigationResolver;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreenNavigation", "", "shouldGoToConversationListScreen", "(Lzendesk/android/messaging/MessagingScreen;Lx70/c;)Ljava/lang/Object;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "resolveBackNavigation", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/messaging/model/MessagingSettings;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackNavigationResolver {

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final MessagingSettings messagingSettings;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver$resolveBackNavigation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver", f = "BackNavigationResolver.kt", l = {58}, m = "resolveBackNavigation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
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
            return BackNavigationResolver.this.resolveBackNavigation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver$shouldGoToConversationListScreen$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver", f = "BackNavigationResolver.kt", l = {BERTags.DURATION}, m = "shouldGoToConversationListScreen")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04581 extends c {
        int label;
        /* synthetic */ Object result;

        public C04581(x70.c<? super C04581> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BackNavigationResolver.this.shouldGoToConversationListScreen(null, this);
        }
    }

    public BackNavigationResolver(@NotNull ConversationKit conversationKit, @NotNull MessagingSettings messagingSettings) {
        conversationKit.getClass();
        messagingSettings.getClass();
        this.conversationKit = conversationKit;
        this.messagingSettings = messagingSettings;
    }

    public static /* synthetic */ Object resolveBackNavigation$default(BackNavigationResolver backNavigationResolver, MessagingScreen messagingScreen, x70.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messagingScreen = null;
        }
        return backNavigationResolver.resolveBackNavigation(messagingScreen, cVar);
    }

    public static /* synthetic */ Object shouldGoToConversationListScreen$default(BackNavigationResolver backNavigationResolver, MessagingScreen messagingScreen, x70.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messagingScreen = null;
        }
        return backNavigationResolver.shouldGoToConversationListScreen(messagingScreen, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveBackNavigation(@org.jetbrains.annotations.Nullable zendesk.android.messaging.MessagingScreen r11, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen> r12) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver.resolveBackNavigation(zendesk.android.messaging.MessagingScreen, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldGoToConversationListScreen(@org.jetbrains.annotations.Nullable zendesk.android.messaging.MessagingScreen r5, @org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver.C04581
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver$shouldGoToConversationListScreen$1 r0 = (zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver.C04581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver$shouldGoToConversationListScreen$1 r0 = new zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver$shouldGoToConversationListScreen$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            r0.label = r3
            java.lang.Object r6 = r4.resolveBackNavigation(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen$ConversationListFragmentScreen r5 = zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen.ConversationListFragmentScreen.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver.shouldGoToConversationListScreen(zendesk.android.messaging.MessagingScreen, x70.c):java.lang.Object");
    }
}
