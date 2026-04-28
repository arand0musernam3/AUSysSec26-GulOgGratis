package zendesk.conversationkit.android.internal.user.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.internal.ConversationKitStorage;
import zendesk.conversationkit.android.internal.app.AppStorage;
import zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage;
import zendesk.conversationkit.android.internal.rest.RestClientFiles;
import zendesk.conversationkit.android.internal.user.UserStorage;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010\u0010J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b#\u0010\u0010J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010\"J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b'\u0010\"J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b0\u0010/J\u0018\u00101\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b1\u0010\"J\u0012\u00102\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b2\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107¨\u00068"}, d2 = {"Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource;", "", "Lzendesk/conversationkit/android/internal/user/UserStorage;", "userStorage", "Lzendesk/conversationkit/android/internal/app/AppStorage;", "appStorage", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "conversationKitStorage", "Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "proactiveMessagingStorage", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "restClientFiles", "<init>", "(Lzendesk/conversationkit/android/internal/user/UserStorage;Lzendesk/conversationkit/android/internal/app/AppStorage;Lzendesk/conversationkit/android/internal/ConversationKitStorage;Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;Lzendesk/conversationkit/android/internal/rest/RestClientFiles;)V", "", "getClientId", "(Lx70/c;)Ljava/lang/Object;", "getPushToken", "Lzendesk/conversationkit/android/model/VisitType;", "visitType", "", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "getVisitType", "Lzendesk/conversationkit/android/model/User;", "newUser", "updateUser", "(Lzendesk/conversationkit/android/model/User;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/Conversation;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "saveConversation", "(Lzendesk/conversationkit/android/model/Conversation;Lx70/c;)Ljava/lang/Object;", "conversationId", "getConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "clear", "pushToken", "setPushToken", "integrationId", "setIntegrationId", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "setProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "", "proactiveMessageId", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "removeConversationById", "getUser", "Lzendesk/conversationkit/android/internal/user/UserStorage;", "Lzendesk/conversationkit/android/internal/app/AppStorage;", "Lzendesk/conversationkit/android/internal/ConversationKitStorage;", "Lzendesk/conversationkit/android/internal/proactivemessaging/ProactiveMessagingStorage;", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserActionProcessorLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActionProcessorLocalDataSource.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n295#2,2:166\n*S KotlinDebug\n*F\n+ 1 UserActionProcessorLocalDataSource.kt\nzendesk/conversationkit/android/internal/user/data/UserActionProcessorLocalDataSource\n*L\n93#1:166,2\n*E\n"})
public final class UserActionProcessorLocalDataSource {

    @NotNull
    private final AppStorage appStorage;

    @NotNull
    private final ConversationKitStorage conversationKitStorage;

    @NotNull
    private final ProactiveMessagingStorage proactiveMessagingStorage;

    @NotNull
    private final RestClientFiles restClientFiles;

    @NotNull
    private final UserStorage userStorage;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource", f = "UserActionProcessorLocalDataSource.kt", l = {100, 101, 103}, m = "clear")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return UserActionProcessorLocalDataSource.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$getConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource", f = "UserActionProcessorLocalDataSource.kt", l = {92, 93}, m = "getConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03321 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03321(x70.c<? super C03321> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorLocalDataSource.this.getConversation(null, this);
        }
    }

    public UserActionProcessorLocalDataSource(@NotNull UserStorage userStorage, @NotNull AppStorage appStorage, @NotNull ConversationKitStorage conversationKitStorage, @NotNull ProactiveMessagingStorage proactiveMessagingStorage, @NotNull RestClientFiles restClientFiles) {
        userStorage.getClass();
        appStorage.getClass();
        conversationKitStorage.getClass();
        proactiveMessagingStorage.getClass();
        restClientFiles.getClass();
        this.userStorage = userStorage;
        this.appStorage = appStorage;
        this.conversationKitStorage = conversationKitStorage;
        this.proactiveMessagingStorage = proactiveMessagingStorage;
        this.restClientFiles = restClientFiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r7.clear(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$clear$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$clear$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$clear$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r7)
            goto L65
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L34:
            ba0.g.M(r7)
            goto L55
        L38:
            ba0.g.M(r7)
            goto L4a
        L3c:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.user.UserStorage r7 = r6.userStorage
            r0.label = r5
            java.lang.Object r7 = r7.clear(r0)
            if (r7 != r1) goto L4a
            goto L64
        L4a:
            zendesk.conversationkit.android.internal.app.AppStorage r7 = r6.appStorage
            r0.label = r4
            java.lang.Object r7 = r7.clearUser(r0)
            if (r7 != r1) goto L55
            goto L64
        L55:
            zendesk.conversationkit.android.internal.rest.RestClientFiles r7 = r6.restClientFiles
            r7.clearCache()
            zendesk.conversationkit.android.internal.proactivemessaging.ProactiveMessagingStorage r7 = r6.proactiveMessagingStorage
            r0.label = r3
            java.lang.Object r7 = r7.clear(r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.clear(x70.c):java.lang.Object");
    }

    @Nullable
    public final Object clearProactiveMessage(int i11, @NotNull x70.c<? super Unit> cVar) {
        Object objClearProactiveMessage = this.proactiveMessagingStorage.clearProactiveMessage(i11, cVar);
        return objClearProactiveMessage == a.COROUTINE_SUSPENDED ? objClearProactiveMessage : Unit.f26487a;
    }

    @Nullable
    public final Object getClientId(@NotNull x70.c<? super String> cVar) {
        return this.conversationKitStorage.getClientId(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversation(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.C03321
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$getConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.C03321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$getConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource$getConversation$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            ba0.g.M(r7)
            goto L5e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            ba0.g.M(r7)
            goto L4d
        L3d:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.user.UserStorage r7 = r5.userStorage
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getConversation(r6, r0)
            if (r7 != r1) goto L4d
            goto L5d
        L4d:
            zendesk.conversationkit.android.model.Conversation r7 = (zendesk.conversationkit.android.model.Conversation) r7
            if (r7 != 0) goto L88
            zendesk.conversationkit.android.internal.app.AppStorage r7 = r5.appStorage
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getUser(r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            zendesk.conversationkit.android.model.User r7 = (zendesk.conversationkit.android.model.User) r7
            r0 = 0
            if (r7 == 0) goto L87
            java.util.List r7 = r7.getConversations()
            if (r7 == 0) goto L87
            java.util.Iterator r7 = r7.iterator()
        L6d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r7.next()
            r2 = r1
            zendesk.conversationkit.android.model.Conversation r2 = (zendesk.conversationkit.android.model.Conversation) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r2 == 0) goto L6d
            r0 = r1
        L85:
            zendesk.conversationkit.android.model.Conversation r0 = (zendesk.conversationkit.android.model.Conversation) r0
        L87:
            return r0
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorLocalDataSource.getConversation(java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object getProactiveMessage(int i11, @NotNull x70.c<? super ProactiveMessage> cVar) {
        return this.proactiveMessagingStorage.getProactiveMessage(i11, cVar);
    }

    @Nullable
    public final Object getPushToken(@NotNull x70.c<? super String> cVar) {
        return this.conversationKitStorage.getPushToken(cVar);
    }

    @Nullable
    public final Object getUser(@NotNull x70.c<? super User> cVar) {
        return this.appStorage.getUser(cVar);
    }

    @Nullable
    public final Object getVisitType(@NotNull x70.c<? super VisitType> cVar) {
        return this.conversationKitStorage.getVisitType(cVar);
    }

    @Nullable
    public final Object removeConversationById(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object objRemoveConversationById = this.userStorage.removeConversationById(str, cVar);
        return objRemoveConversationById == a.COROUTINE_SUSPENDED ? objRemoveConversationById : Unit.f26487a;
    }

    @Nullable
    public final Object saveConversation(@NotNull Conversation conversation, @NotNull x70.c<? super Unit> cVar) {
        Object objSaveConversation = this.userStorage.saveConversation(conversation, cVar);
        return objSaveConversation == a.COROUTINE_SUSPENDED ? objSaveConversation : Unit.f26487a;
    }

    @Nullable
    public final Object setIntegrationId(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object integrationId = this.conversationKitStorage.setIntegrationId(str, cVar);
        return integrationId == a.COROUTINE_SUSPENDED ? integrationId : Unit.f26487a;
    }

    @Nullable
    public final Object setProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull x70.c<? super Unit> cVar) {
        Object proactiveMessage2 = this.proactiveMessagingStorage.setProactiveMessage(proactiveMessage, cVar);
        return proactiveMessage2 == a.COROUTINE_SUSPENDED ? proactiveMessage2 : Unit.f26487a;
    }

    @Nullable
    public final Object setPushToken(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object pushToken = this.conversationKitStorage.setPushToken(str, cVar);
        return pushToken == a.COROUTINE_SUSPENDED ? pushToken : Unit.f26487a;
    }

    @Nullable
    public final Object setVisitType(@NotNull VisitType visitType, @NotNull x70.c<? super Unit> cVar) {
        Object visitType2 = this.conversationKitStorage.setVisitType(visitType, cVar);
        return visitType2 == a.COROUTINE_SUSPENDED ? visitType2 : Unit.f26487a;
    }

    @Nullable
    public final Object updateUser(@NotNull User user, @NotNull x70.c<? super Unit> cVar) {
        Object user2 = this.appStorage.setUser(user, cVar);
        return user2 == a.COROUTINE_SUSPENDED ? user2 : Unit.f26487a;
    }
}
