package zendesk.conversationkit.android;

import com.braze.models.inappmessage.InAppMessageBase;
import e90.a;
import e90.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y80.y1;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.ConversationKitStore;
import zendesk.conversationkit.android.internal.metadata.ConversationMetadataService;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.conversationkit.android.model.WaitTimeData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u001eH\u0096@¢\u0006\u0004\b%\u0010\u0013J\u0010\u0010&\u001a\u00020!H\u0096@¢\u0006\u0004\b&\u0010\u0013J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u001dH\u0096@¢\u0006\u0004\b'\u0010\u0013J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0004\b)\u0010 J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0004\b+\u0010$J&\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0004\b.\u0010/J,\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,020\u001d2\u0006\u0010*\u001a\u00020!2\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020!H\u0096@¢\u0006\u0004\b6\u0010$J \u00109\u001a\u00020\n2\u0006\u00108\u001a\u0002072\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0004\b9\u0010:J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001dH\u0096@¢\u0006\u0004\b<\u0010\u0013J\u0018\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020;H\u0096@¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020@H\u0096@¢\u0006\u0004\bB\u0010CJ\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020@0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bF\u0010EJ(\u0010G\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0004\bG\u0010HJ&\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001d2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0096@¢\u0006\u0004\bM\u0010NJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010OJ&\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010*\u001a\u00020!2\u0006\u0010P\u001a\u00020!H\u0096@¢\u0006\u0004\bQ\u0010RJ \u0010S\u001a\u00020\n2\u0006\u0010*\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\bS\u0010TJ\u001e\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u001d2\u0006\u0010*\u001a\u00020!H\u0096@¢\u0006\u0004\bV\u0010$J\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006d"}, d2 = {"Lzendesk/conversationkit/android/DefaultConversationKit;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "conversationKitStore", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "conversationMetadataService", "<init>", "(Lzendesk/conversationkit/android/internal/ConversationKitStore;Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;)V", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "", "addEventListener", "(Lzendesk/conversationkit/android/ConversationKitEventListener;)V", "removeEventListener", "Lzendesk/conversationkit/android/ConversationKitEvent;", "event", "dispatchEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent;)V", "pause", "(Lx70/c;)Ljava/lang/Object;", "resume", "Lzendesk/conversationkit/android/ConversationKitSettings;", "getSettings", "()Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "getConfig", "()Lzendesk/conversationkit/android/model/Config;", "", "proactiveMessageId", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "createUser", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "", "jwt", "loginUser", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getCurrentUser", "getClientId", "logoutUser", "Lzendesk/conversationkit/android/model/Conversation;", "createConversation", "conversationId", "getConversation", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "sendMessage", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "", "getMessages", "(Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "pushNotificationToken", "updatePushNotificationToken", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "sendActivityData", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/VisitType;", "getVisitType", "visitType", "setVisitType", "(Lzendesk/conversationkit/android/model/VisitType;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "addProactiveMessage", "(Lzendesk/conversationkit/android/model/ProactiveMessage;Lx70/c;)Ljava/lang/Object;", "getProactiveMessage", "(ILx70/c;)Ljava/lang/Object;", "clearProactiveMessage", "proactiveMessageReferral", "(Ljava/lang/Integer;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "offset", "", "fromCache", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "getConversations", "(IZLx70/c;)Ljava/lang/Object;", "()Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "actionId", "sendPostbackMessage", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "downloadAttachment", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/WaitTimeData;", "getWaitTimeForConversation", "invalidate", "()V", "Lzendesk/conversationkit/android/internal/ConversationKitStore;", "Lzendesk/conversationkit/android/internal/metadata/ConversationMetadataService;", "Le90/a;", "userCreationMutex", "Le90/a;", "Ly80/y1;", "Lzendesk/conversationkit/android/ConnectionStatus;", "connectionStatusFlow", "Ly80/y1;", "getConnectionStatusFlow", "()Ly80/y1;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKit.kt\nzendesk/conversationkit/android/DefaultConversationKit\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,507:1\n116#2,11:508\n116#2,11:519\n116#2,11:530\n*S KotlinDebug\n*F\n+ 1 ConversationKit.kt\nzendesk/conversationkit/android/DefaultConversationKit\n*L\n381#1:508,11\n384#1:519,11\n393#1:530,11\n*E\n"})
public final class DefaultConversationKit implements ConversationKit {

    @NotNull
    private final y1 connectionStatusFlow;

    @NotNull
    private final ConversationKitStore conversationKitStore;

    @NotNull
    private final ConversationMetadataService conversationMetadataService;

    @NotNull
    private final a userCreationMutex;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.DefaultConversationKit$createUser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.DefaultConversationKit", f = "ConversationKit.kt", l = {513, 381}, m = "createUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
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
            return DefaultConversationKit.this.createUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.DefaultConversationKit$loginUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.DefaultConversationKit", f = "ConversationKit.kt", l = {513, MLKEMEngine.KyberPolyBytes}, m = "loginUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02031 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02031(x70.c<? super C02031> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultConversationKit.this.loginUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.DefaultConversationKit$logoutUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.DefaultConversationKit", f = "ConversationKit.kt", l = {513, 393}, m = "logoutUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02041 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02041(x70.c<? super C02041> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultConversationKit.this.logoutUser(this);
        }
    }

    public DefaultConversationKit(@NotNull ConversationKitStore conversationKitStore, @NotNull ConversationMetadataService conversationMetadataService) {
        conversationKitStore.getClass();
        conversationMetadataService.getClass();
        this.conversationKitStore = conversationKitStore;
        this.conversationMetadataService = conversationMetadataService;
        this.userCreationMutex = d.a();
        this.connectionStatusFlow = conversationKitStore.getConnectionStatusFlow();
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void addEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        this.conversationKitStore.addEventListener(listener);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object addProactiveMessage(@NotNull ProactiveMessage proactiveMessage, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.AddProactiveMessage(proactiveMessage), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object clearProactiveMessage(int i11, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.ClearProactiveMessage(i11), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    /* JADX INFO: renamed from: conversationMetadataService, reason: from getter */
    public ConversationMetadataService getConversationMetadataService() {
        return this.conversationMetadataService;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object createConversation(@Nullable Integer num, @NotNull x70.c<? super ConversationKitResult<Conversation>> cVar) {
        return this.conversationKitStore.dispatch(new Action.CreateConversation(num), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zendesk.conversationkit.android.ConversationKit
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createUser(@org.jetbrains.annotations.Nullable java.lang.Integer r8, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.ConversationKitResult<zendesk.conversationkit.android.model.User>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.DefaultConversationKit.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.DefaultConversationKit$createUser$1 r0 = (zendesk.conversationkit.android.DefaultConversationKit.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.DefaultConversationKit$createUser$1 r0 = new zendesk.conversationkit.android.DefaultConversationKit$createUser$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            e90.a r8 = (e90.a) r8
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r9 = move-exception
            goto L79
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r8 = r0.L$1
            e90.a r8 = (e90.a) r8
            java.lang.Object r2 = r0.L$0
            java.lang.Integer r2 = (java.lang.Integer) r2
            ba0.g.M(r9)
            r9 = r8
            r8 = r2
            goto L58
        L46:
            ba0.g.M(r9)
            e90.a r9 = r7.userCreationMutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r9.g(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            zendesk.conversationkit.android.internal.ConversationKitStore r2 = r7.conversationKitStore     // Catch: java.lang.Throwable -> L75
            zendesk.conversationkit.android.internal.Action$CreateUser r4 = new zendesk.conversationkit.android.internal.Action$CreateUser     // Catch: java.lang.Throwable -> L75
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L75
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L75
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L75
            r0.label = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r2.dispatch(r4, r0)     // Catch: java.lang.Throwable -> L75
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            zendesk.conversationkit.android.ConversationKitResult r9 = (zendesk.conversationkit.android.ConversationKitResult) r9     // Catch: java.lang.Throwable -> L2f
            r8.e(r5)
            return r9
        L75:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L79:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.DefaultConversationKit.createUser(java.lang.Integer, x70.c):java.lang.Object");
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void dispatchEvent(@NotNull ConversationKitEvent event) {
        event.getClass();
        this.conversationKitStore.notifyAllEventListeners$zendesk_conversationkit_conversationkit_android(c0.c(event));
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object downloadAttachment(@NotNull String str, @NotNull Message message, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.DownloadAttachmentAction(str, message), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getClientId(@NotNull x70.c<? super String> cVar) {
        return this.conversationKitStore.getAccessLevel().getClientId(cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public Config getConfig() {
        return this.conversationKitStore.getConfig();
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public y1 getConnectionStatusFlow() {
        return this.connectionStatusFlow;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getConversation(@NotNull String str, @NotNull x70.c<? super ConversationKitResult<Conversation>> cVar) {
        return this.conversationKitStore.dispatch(new Action.GetConversation(str), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getConversations(int i11, boolean z11, @NotNull x70.c<? super ConversationKitResult<ConversationsPagination>> cVar) {
        return this.conversationKitStore.dispatch(new Action.GetConversations(i11, z11), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getCurrentUser(@NotNull x70.c<? super User> cVar) {
        return this.conversationKitStore.getCurrentUser(cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getMessages(@NotNull String str, double d3, @NotNull x70.c<? super ConversationKitResult<? extends List<Message>>> cVar) {
        return this.conversationKitStore.dispatch(new Action.LoadMoreMessages(str, d3), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getProactiveMessage(int i11, @NotNull x70.c<? super ConversationKitResult<ProactiveMessage>> cVar) {
        return this.conversationKitStore.dispatch(new Action.GetProactiveMessage(i11), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @NotNull
    public ConversationKitSettings getSettings() {
        return this.conversationKitStore.getConversationKitSettings();
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getVisitType(@NotNull x70.c<? super ConversationKitResult<? extends VisitType>> cVar) {
        return this.conversationKitStore.dispatch(Action.GetVisitType.INSTANCE, cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object getWaitTimeForConversation(@NotNull String str, @NotNull x70.c<? super ConversationKitResult<WaitTimeData>> cVar) {
        return this.conversationKitStore.dispatch(new Action.GetWaitTimeForConversation(str), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void invalidate() {
        this.conversationKitStore.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zendesk.conversationkit.android.ConversationKit
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.ConversationKitResult<zendesk.conversationkit.android.model.User>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.DefaultConversationKit.C02031
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.DefaultConversationKit$loginUser$1 r0 = (zendesk.conversationkit.android.DefaultConversationKit.C02031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.DefaultConversationKit$loginUser$1 r0 = new zendesk.conversationkit.android.DefaultConversationKit$loginUser$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            e90.a r8 = (e90.a) r8
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r9 = move-exception
            goto L79
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r8 = r0.L$1
            e90.a r8 = (e90.a) r8
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r9)
            r9 = r8
            r8 = r2
            goto L58
        L46:
            ba0.g.M(r9)
            e90.a r9 = r7.userCreationMutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r9.g(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            zendesk.conversationkit.android.internal.ConversationKitStore r2 = r7.conversationKitStore     // Catch: java.lang.Throwable -> L75
            zendesk.conversationkit.android.internal.Action$LoginUser r4 = new zendesk.conversationkit.android.internal.Action$LoginUser     // Catch: java.lang.Throwable -> L75
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L75
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L75
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L75
            r0.label = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r2.dispatch(r4, r0)     // Catch: java.lang.Throwable -> L75
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            zendesk.conversationkit.android.ConversationKitResult r9 = (zendesk.conversationkit.android.ConversationKitResult) r9     // Catch: java.lang.Throwable -> L2f
            r8.e(r5)
            return r9
        L75:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L79:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.DefaultConversationKit.loginUser(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zendesk.conversationkit.android.ConversationKit
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object logoutUser(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.ConversationKitResult<kotlin.Unit>> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.DefaultConversationKit.C02041
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.DefaultConversationKit$logoutUser$1 r0 = (zendesk.conversationkit.android.DefaultConversationKit.C02041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.DefaultConversationKit$logoutUser$1 r0 = new zendesk.conversationkit.android.DefaultConversationKit$logoutUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2f
            goto L63
        L2f:
            r8 = move-exception
            goto L6d
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r2 = r0.L$0
            e90.a r2 = (e90.a) r2
            ba0.g.M(r8)
            r8 = r2
            goto L51
        L41:
            ba0.g.M(r8)
            e90.a r8 = r7.userCreationMutex
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r2 = r8.g(r0)
            if (r2 != r1) goto L51
            goto L5f
        L51:
            zendesk.conversationkit.android.internal.ConversationKitStore r2 = r7.conversationKitStore     // Catch: java.lang.Throwable -> L69
            zendesk.conversationkit.android.internal.Action$LogoutUser r4 = zendesk.conversationkit.android.internal.Action.LogoutUser.INSTANCE     // Catch: java.lang.Throwable -> L69
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L69
            r0.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r2.dispatch(r4, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 != r1) goto L60
        L5f:
            return r1
        L60:
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            zendesk.conversationkit.android.ConversationKitResult r8 = (zendesk.conversationkit.android.ConversationKitResult) r8     // Catch: java.lang.Throwable -> L2f
            r0.e(r5)
            return r8
        L69:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L6d:
            r0.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.DefaultConversationKit.logoutUser(x70.c):java.lang.Object");
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object pause(@NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(Action.PauseRealtimeConnection.INSTANCE, cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object proactiveMessageReferral(@Nullable Integer num, @NotNull String str, @NotNull x70.c<? super ConversationKitResult<Conversation>> cVar) {
        return this.conversationKitStore.dispatch(new Action.ProactiveMessageReferral(str, num), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    public void removeEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        this.conversationKitStore.removeEventListener(listener);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object resume(@NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(Action.StartRealtimeConnection.INSTANCE, cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendActivityData(@NotNull ActivityData activityData, @NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.SendActivityData(activityData, str), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendMessage(@NotNull Message message, @NotNull String str, @NotNull x70.c<? super ConversationKitResult<Message>> cVar) {
        return this.conversationKitStore.dispatch(new Action.PrepareMessage(message, str), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object sendPostbackMessage(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super ConversationKitResult<Unit>> cVar) {
        return this.conversationKitStore.dispatch(new Action.SendPostbackAction(str, str2), cVar);
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object setVisitType(@NotNull VisitType visitType, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.SetVisitType(visitType), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }

    @Override // zendesk.conversationkit.android.ConversationKit
    @Nullable
    public Object updatePushNotificationToken(@NotNull String str, @NotNull x70.c<? super Unit> cVar) {
        Object objDispatch = this.conversationKitStore.dispatch(new Action.PreparePushToken(str), cVar);
        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
    }
}
