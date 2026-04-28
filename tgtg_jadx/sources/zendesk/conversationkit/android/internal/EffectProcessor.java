package zendesk.conversationkit.android.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKitError;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.internal.EffectProcessorResult;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.User;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001c2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020%2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020(2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020+2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020.2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b/\u00100J%\u00102\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u0002012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b2\u00103J%\u00105\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u0002042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b5\u00106J%\u00108\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u0002072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b:\u0010;J%\u0010=\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020<2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0018\u0010C\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020BH\u0086@¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010G¨\u0006H"}, d2 = {"Lzendesk/conversationkit/android/internal/EffectProcessor;", "", "Lzendesk/conversationkit/android/internal/EffectMapper;", "effectMapper", "Lzendesk/conversationkit/android/internal/AccessLevelBuilder;", "accessLevelBuilder", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "<init>", "(Lzendesk/conversationkit/android/internal/EffectMapper;Lzendesk/conversationkit/android/internal/AccessLevelBuilder;Lzendesk/core/ui/android/internal/local/LocaleProvider;)V", "Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "effect", "", "Lzendesk/conversationkit/android/ConversationKitEvent;", "mappedEvents", "Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "processUserAccessRevoked", "(Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "processCreateUserResult", "(Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Effect$LoginUserResult;", "processLoginUserResult", "(Lzendesk/conversationkit/android/internal/Effect$LoginUserResult;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Effect$AlreadyLoggedInResult;", "Lzendesk/conversationkit/android/internal/EffectProcessorResult$Ends;", "processAlreadyLoggedInResult", "(Lzendesk/conversationkit/android/internal/Effect$AlreadyLoggedInResult;)Lzendesk/conversationkit/android/internal/EffectProcessorResult$Ends;", "Lzendesk/conversationkit/android/internal/Effect$LogoutUserResult;", "processLogoutUserResult", "(Lzendesk/conversationkit/android/internal/Effect$LogoutUserResult;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$CheckForPersistedUserResult;", "processCheckForPersistedUserResult", "(Lzendesk/conversationkit/android/internal/Effect$CheckForPersistedUserResult;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Effect$CreateConversationResult;", "processCreateConversationResult", "(Lzendesk/conversationkit/android/internal/Effect$CreateConversationResult;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$GetConversationResult;", "processGetConversationResult", "(Lzendesk/conversationkit/android/internal/Effect$GetConversationResult;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$ProactiveMessageReferral;", "processProactiveMessageReferral", "(Lzendesk/conversationkit/android/internal/Effect$ProactiveMessageReferral;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$NetworkConnectionChanged;", "processNetworkConnectionChanged", "(Lzendesk/conversationkit/android/internal/Effect$NetworkConnectionChanged;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$RealtimeConnectionChanged;", "processRealtimeConnectionChanged", "(Lzendesk/conversationkit/android/internal/Effect$RealtimeConnectionChanged;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$MessagePrepared;", "processMessagePrepared", "(Lzendesk/conversationkit/android/internal/Effect$MessagePrepared;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$SendMessageResult;", "processSendMessageResult", "(Lzendesk/conversationkit/android/internal/Effect$SendMessageResult;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$PushTokenPrepared;", "processPushRegistrationPending", "(Lzendesk/conversationkit/android/internal/Effect$PushTokenPrepared;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "processPushRegistrationResult", "(Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$RefreshUserResult;", "processRefreshUserResult", "(Lzendesk/conversationkit/android/internal/Effect$RefreshUserResult;Ljava/util/List;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect$ReAuthenticateUser;", "processReAuthenticateUser", "(Lzendesk/conversationkit/android/internal/Effect$ReAuthenticateUser;)Lzendesk/conversationkit/android/internal/EffectProcessorResult;", "Lzendesk/conversationkit/android/internal/Effect;", "process", "(Lzendesk/conversationkit/android/internal/Effect;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/EffectMapper;", "Lzendesk/conversationkit/android/internal/AccessLevelBuilder;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectProcessor.kt\nzendesk/conversationkit/android/internal/EffectProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,617:1\n295#2,2:618\n*S KotlinDebug\n*F\n+ 1 EffectProcessor.kt\nzendesk/conversationkit/android/internal/EffectProcessor\n*L\n512#1:618,2\n*E\n"})
public final class EffectProcessor {

    @NotNull
    private final AccessLevelBuilder accessLevelBuilder;

    @NotNull
    private final EffectMapper effectMapper;

    @NotNull
    private final LocaleProvider localeProvider;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.EffectProcessor$processCheckForPersistedUserResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.EffectProcessor", f = "EffectProcessor.kt", l = {268}, m = "processCheckForPersistedUserResult")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
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
            return EffectProcessor.this.processCheckForPersistedUserResult(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.EffectProcessor$processCreateUserResult$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.EffectProcessor", f = "EffectProcessor.kt", l = {172}, m = "processCreateUserResult")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02131 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C02131(x70.c<? super C02131> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EffectProcessor.this.processCreateUserResult(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.EffectProcessor$processLoginUserResult$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.EffectProcessor", f = "EffectProcessor.kt", l = {207}, m = "processLoginUserResult")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02141 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02141(x70.c<? super C02141> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EffectProcessor.this.processLoginUserResult(null, this);
        }
    }

    public EffectProcessor(@NotNull EffectMapper effectMapper, @NotNull AccessLevelBuilder accessLevelBuilder, @NotNull LocaleProvider localeProvider) {
        effectMapper.getClass();
        accessLevelBuilder.getClass();
        localeProvider.getClass();
        this.effectMapper = effectMapper;
        this.accessLevelBuilder = accessLevelBuilder;
        this.localeProvider = localeProvider;
    }

    private final EffectProcessorResult.Ends processAlreadyLoggedInResult(Effect.AlreadyLoggedInResult effect) {
        ConversationKitResult<User> result = effect.getResult();
        if (result instanceof ConversationKitResult.Failure) {
            return new EffectProcessorResult.Ends(null, null, null, result, 7, null);
        }
        if (result instanceof ConversationKitResult.Success) {
            return new EffectProcessorResult.Ends(null, null, null, result, 7, null);
        }
        e40.a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processCheckForPersistedUserResult(zendesk.conversationkit.android.internal.Effect.CheckForPersistedUserResult r9, x70.c<? super zendesk.conversationkit.android.internal.EffectProcessorResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zendesk.conversationkit.android.internal.EffectProcessor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            zendesk.conversationkit.android.internal.EffectProcessor$processCheckForPersistedUserResult$1 r0 = (zendesk.conversationkit.android.internal.EffectProcessor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.EffectProcessor$processCheckForPersistedUserResult$1 r0 = new zendesk.conversationkit.android.internal.EffectProcessor$processCheckForPersistedUserResult$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.internal.Effect$CheckForPersistedUserResult r0 = (zendesk.conversationkit.android.internal.Effect.CheckForPersistedUserResult) r0
            ba0.g.M(r10)
            goto L5b
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L36:
            ba0.g.M(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            zendesk.conversationkit.android.model.User r2 = r9.getUser()
            if (r2 == 0) goto L80
            zendesk.conversationkit.android.internal.AccessLevelBuilder r2 = r8.accessLevelBuilder
            zendesk.conversationkit.android.model.User r4 = r9.getUser()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r0 = r2.buildUserAccess(r4, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L5b:
            zendesk.conversationkit.android.internal.AccessLevel r10 = (zendesk.conversationkit.android.internal.AccessLevel) r10
            zendesk.conversationkit.android.internal.Action$PersistedUserRetrieve r1 = new zendesk.conversationkit.android.internal.Action$PersistedUserRetrieve
            zendesk.conversationkit.android.model.User r2 = r0.getUser()
            r1.<init>(r2)
            r9.add(r1)
            zendesk.conversationkit.android.model.User r1 = r0.getUser()
            java.util.List r1 = r1.getConversations()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7c
            zendesk.conversationkit.android.internal.Action$StartRealtimeConnection r1 = zendesk.conversationkit.android.internal.Action.StartRealtimeConnection.INSTANCE
            r9.add(r1)
        L7c:
            r3 = r9
            r1 = r10
            r9 = r0
            goto L83
        L80:
            r0 = 0
            r3 = r10
            r1 = r0
        L83:
            zendesk.conversationkit.android.internal.EffectProcessorResult$Ends r0 = new zendesk.conversationkit.android.internal.EffectProcessorResult$Ends
            zendesk.conversationkit.android.ConversationKitResult$Success r4 = r9.getResult()
            r5 = 2
            r6 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.EffectProcessor.processCheckForPersistedUserResult(zendesk.conversationkit.android.internal.Effect$CheckForPersistedUserResult, x70.c):java.lang.Object");
    }

    private final EffectProcessorResult processCreateConversationResult(Effect.CreateConversationResult effect) {
        return new EffectProcessorResult.Ends(null, null, ((effect.getResult() instanceof ConversationKitResult.Success) && (effect.getUser().getConversations().size() == 1)) ? c0.c(Action.StartRealtimeConnection.INSTANCE) : n0.f26529a, effect.getResult(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processCreateUserResult(zendesk.conversationkit.android.internal.Effect.CreateUserResult r7, java.util.List<? extends zendesk.conversationkit.android.ConversationKitEvent> r8, x70.c<? super zendesk.conversationkit.android.internal.EffectProcessorResult> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.EffectProcessor.C02131
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.EffectProcessor$processCreateUserResult$1 r0 = (zendesk.conversationkit.android.internal.EffectProcessor.C02131) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.EffectProcessor$processCreateUserResult$1 r0 = new zendesk.conversationkit.android.internal.EffectProcessor$processCreateUserResult$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$3
            zendesk.conversationkit.android.model.User r7 = (zendesk.conversationkit.android.model.User) r7
            java.lang.Object r8 = r0.L$2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            zendesk.conversationkit.android.internal.Effect$CreateUserResult r0 = (zendesk.conversationkit.android.internal.Effect.CreateUserResult) r0
            ba0.g.M(r9)
            goto L72
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L3e:
            ba0.g.M(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            zendesk.conversationkit.android.ConversationKitResult r2 = r7.getResult()
            boolean r2 = r2 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r2 == 0) goto L95
            zendesk.conversationkit.android.ConversationKitResult r2 = r7.getResult()
            zendesk.conversationkit.android.ConversationKitResult$Success r2 = (zendesk.conversationkit.android.ConversationKitResult.Success) r2
            java.lang.Object r2 = r2.getValue()
            zendesk.conversationkit.android.model.User r2 = (zendesk.conversationkit.android.model.User) r2
            zendesk.conversationkit.android.internal.AccessLevelBuilder r4 = r6.accessLevelBuilder
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r0 = r4.buildUserAccess(r2, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r1 = r8
            r8 = r9
            r9 = r0
            r0 = r7
            r7 = r2
        L72:
            zendesk.conversationkit.android.internal.AccessLevel r9 = (zendesk.conversationkit.android.internal.AccessLevel) r9
            java.util.List r7 = r7.getConversations()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L83
            zendesk.conversationkit.android.internal.Action$StartRealtimeConnection r7 = zendesk.conversationkit.android.internal.Action.StartRealtimeConnection.INSTANCE
            r8.add(r7)
        L83:
            java.lang.String r7 = r0.getPendingPushToken()
            if (r7 == 0) goto L91
            zendesk.conversationkit.android.internal.Action$UpdatePushToken r2 = new zendesk.conversationkit.android.internal.Action$UpdatePushToken
            r2.<init>(r7)
            r8.add(r2)
        L91:
            r7 = r0
            r0 = r8
            r8 = r1
            goto L99
        L95:
            r0 = 0
            r5 = r0
            r0 = r9
            r9 = r5
        L99:
            zendesk.conversationkit.android.ConversationKitResult r7 = r7.getResult()
            zendesk.conversationkit.android.internal.EffectProcessorResult$Ends r1 = new zendesk.conversationkit.android.internal.EffectProcessorResult$Ends
            r1.<init>(r9, r8, r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.EffectProcessor.processCreateUserResult(zendesk.conversationkit.android.internal.Effect$CreateUserResult, java.util.List, x70.c):java.lang.Object");
    }

    private final EffectProcessorResult processGetConversationResult(Effect.GetConversationResult effect, List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Ends(null, mappedEvents, ((effect.getResult() instanceof ConversationKitResult.Success) && effect.getShouldRefresh()) ? c0.c(new Action.RefreshConversation(((Conversation) ((ConversationKitResult.Success) effect.getResult()).getValue()).getId())) : n0.f26529a, effect.getResult(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processLoginUserResult(zendesk.conversationkit.android.internal.Effect.LoginUserResult r8, x70.c<? super zendesk.conversationkit.android.internal.EffectProcessorResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.EffectProcessor.C02141
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.EffectProcessor$processLoginUserResult$1 r0 = (zendesk.conversationkit.android.internal.EffectProcessor.C02141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.EffectProcessor$processLoginUserResult$1 r0 = new zendesk.conversationkit.android.internal.EffectProcessor$processLoginUserResult$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.ConversationKitResult r8 = (zendesk.conversationkit.android.ConversationKitResult) r8
            ba0.g.M(r9)
            goto L63
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
        L30:
            r8 = 0
            return r8
        L32:
            ba0.g.M(r9)
            zendesk.conversationkit.android.ConversationKitResult r4 = r8.getResult()
            boolean r8 = r4 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r8 == 0) goto L48
            zendesk.conversationkit.android.internal.EffectProcessorResult$Ends r0 = new zendesk.conversationkit.android.internal.EffectProcessorResult$Ends
            r5 = 7
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L48:
            boolean r8 = r4 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r8 == 0) goto L95
            zendesk.conversationkit.android.internal.AccessLevelBuilder r8 = r7.accessLevelBuilder
            r9 = r4
            zendesk.conversationkit.android.ConversationKitResult$Success r9 = (zendesk.conversationkit.android.ConversationKitResult.Success) r9
            java.lang.Object r9 = r9.getValue()
            zendesk.conversationkit.android.model.User r9 = (zendesk.conversationkit.android.model.User) r9
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r9 = r8.buildUserAccess(r9, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r8 = r4
        L63:
            r1 = r9
            zendesk.conversationkit.android.internal.AccessLevel r1 = (zendesk.conversationkit.android.internal.AccessLevel) r1
            r4 = r8
            zendesk.conversationkit.android.ConversationKitResult$Success r4 = (zendesk.conversationkit.android.ConversationKitResult.Success) r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r8 = r4.getValue()
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.util.List r8 = r8.getConversations()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L83
            zendesk.conversationkit.android.internal.Action$StartRealtimeConnection r8 = zendesk.conversationkit.android.internal.Action.StartRealtimeConnection.INSTANCE
            r3.add(r8)
        L83:
            zendesk.conversationkit.android.internal.Action$GetConversations r8 = new zendesk.conversationkit.android.internal.Action$GetConversations
            r9 = 0
            r8.<init>(r9, r9)
            r3.add(r8)
            zendesk.conversationkit.android.internal.EffectProcessorResult$Ends r0 = new zendesk.conversationkit.android.internal.EffectProcessorResult$Ends
            r5 = 2
            r6 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L95:
            e40.a.f()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.EffectProcessor.processLoginUserResult(zendesk.conversationkit.android.internal.Effect$LoginUserResult, x70.c):java.lang.Object");
    }

    private final EffectProcessorResult processLogoutUserResult(Effect.LogoutUserResult effect, List<? extends ConversationKitEvent> mappedEvents) {
        ConversationKitResult<Object> result = effect.getResult();
        if (result instanceof ConversationKitResult.Failure) {
            return new EffectProcessorResult.Ends(null, null, null, result, 7, null);
        }
        if (result instanceof ConversationKitResult.Success) {
            return new EffectProcessorResult.Ends(this.accessLevelBuilder.buildAppAccess(), mappedEvents, null, effect.getResult(), 4, null);
        }
        e40.a.f();
        return null;
    }

    private final EffectProcessorResult processMessagePrepared(Effect.MessagePrepared effect, List<? extends ConversationKitEvent> mappedEvents) {
        if (!effect.getShouldUpdateConversation()) {
            return new EffectProcessorResult.Continues(null, mappedEvents, null, new Action.SendMessage(effect.getMessage(), effect.getConversationId()), 5, null);
        }
        return new EffectProcessorResult.Continues(null, mappedEvents, c0.c(new Action.SendMessage(effect.getMessage(), effect.getConversationId())), new Action.UpdateConversationMetadata(effect.getMetadata(), effect.getConversationId()), 1, null);
    }

    private final EffectProcessorResult processNetworkConnectionChanged(Effect.NetworkConnectionChanged effect, List<? extends ConversationKitEvent> mappedEvents) {
        return effect.getConnectionStatus() == ConnectionStatus.CONNECTED ? new EffectProcessorResult.Continues(null, mappedEvents, null, Action.StartRealtimeConnection.INSTANCE, 5, null) : new EffectProcessorResult.Ends(null, mappedEvents, null, null, 13, null);
    }

    private final EffectProcessorResult processProactiveMessageReferral(Effect.ProactiveMessageReferral effect, List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Ends(null, mappedEvents, ((effect.getResult() instanceof ConversationKitResult.Success) && effect.getShouldRefresh()) ? c0.c(new Action.RefreshConversation(((Conversation) ((ConversationKitResult.Success) effect.getResult()).getValue()).getId())) : n0.f26529a, effect.getResult(), 1, null);
    }

    private final EffectProcessorResult processPushRegistrationPending(Effect.PushTokenPrepared effect, List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Continues(null, mappedEvents, null, new Action.UpdatePushToken(effect.getPushToken()), 5, null);
    }

    private final EffectProcessorResult processPushRegistrationResult(List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Ends(null, mappedEvents, null, null, 13, null);
    }

    private final EffectProcessorResult processReAuthenticateUser(Effect.ReAuthenticateUser effect) {
        return new EffectProcessorResult.Ends(null, null, c0.c(new Action.LoginUser(effect.getJwt())), null, 11, null);
    }

    private final EffectProcessorResult processRealtimeConnectionChanged(Effect.RealtimeConnectionChanged effect, List<? extends ConversationKitEvent> mappedEvents) {
        return effect.getConnectionStatus() == ConnectionStatus.CONNECTED_REALTIME ? new EffectProcessorResult.Continues(null, mappedEvents, null, Action.RefreshUser.INSTANCE, 5, null) : new EffectProcessorResult.Ends(null, mappedEvents, null, null, 13, null);
    }

    private final EffectProcessorResult processRefreshUserResult(Effect.RefreshUserResult effect, List<? extends ConversationKitEvent> mappedEvents) {
        Message message;
        Object next;
        List<Message> messages;
        ArrayList arrayList = new ArrayList();
        String languageTag = this.localeProvider.getLocale().toLanguageTag();
        ConversationKitResult<User> result = effect.getResult();
        if (result instanceof ConversationKitResult.Success) {
            ConversationKitResult.Success success = (ConversationKitResult.Success) result;
            if (!((User) success.getValue()).getConversations().isEmpty()) {
                Iterator<T> it = ((User) success.getValue()).getConversations().iterator();
                while (true) {
                    message = null;
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
                Conversation persistedConversation = effect.getPersistedConversation();
                if (persistedConversation != null && !persistedConversation.getMessages().isEmpty()) {
                    if (conversation != null && (messages = conversation.getMessages()) != null) {
                        message = (Message) CollectionsKt.X(messages);
                    }
                    if (!Intrinsics.areEqual(message, CollectionsKt.W(persistedConversation.getMessages()))) {
                        arrayList.add(new Action.RefreshConversation(((Conversation) CollectionsKt.O(((User) success.getValue()).getConversations())).getId()));
                    }
                }
            }
            if (!Intrinsics.areEqual(((User) success.getValue()).getLocale(), languageTag)) {
                languageTag.getClass();
                arrayList.add(new Action.UpdateAppUserLocale(languageTag));
            }
        }
        return new EffectProcessorResult.Ends(null, mappedEvents, arrayList, effect.getResult(), 1, null);
    }

    private final EffectProcessorResult processSendMessageResult(Effect.SendMessageResult effect, List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Ends(null, mappedEvents, null, effect.getResult(), 5, null);
    }

    private final EffectProcessorResult processUserAccessRevoked(Effect.UserAccessRevoked effect, List<? extends ConversationKitEvent> mappedEvents) {
        return new EffectProcessorResult.Ends(null, mappedEvents, null, effect.getResult(), 5, null);
    }

    @Nullable
    public final Object process(@NotNull Effect effect, @NotNull x70.c<? super EffectProcessorResult> cVar) {
        List<ConversationKitEvent> map = this.effectMapper.map(effect);
        return Intrinsics.areEqual(effect, Effect.IncorrectAccessLevel.INSTANCE) ? new EffectProcessorResult.Ends(null, null, null, new ConversationKitResult.Failure(ConversationKitError.IncorrectAccessLevelForAction.INSTANCE), 7, null) : effect instanceof Effect.UserAccessRevoked ? processUserAccessRevoked((Effect.UserAccessRevoked) effect, map) : effect instanceof Effect.CreateUserResult ? processCreateUserResult((Effect.CreateUserResult) effect, map, cVar) : effect instanceof Effect.LoginUserResult ? processLoginUserResult((Effect.LoginUserResult) effect, cVar) : effect instanceof Effect.AlreadyLoggedInResult ? processAlreadyLoggedInResult((Effect.AlreadyLoggedInResult) effect) : effect instanceof Effect.LogoutUserResult ? processLogoutUserResult((Effect.LogoutUserResult) effect, map) : effect instanceof Effect.MessageReceived ? new EffectProcessorResult.Ends(null, map, null, null, 13, null) : effect instanceof Effect.CheckForPersistedUserResult ? processCheckForPersistedUserResult((Effect.CheckForPersistedUserResult) effect, cVar) : effect instanceof Effect.RefreshUserResult ? processRefreshUserResult((Effect.RefreshUserResult) effect, map) : effect instanceof Effect.CreateConversationResult ? processCreateConversationResult((Effect.CreateConversationResult) effect) : effect instanceof Effect.GetConversationResult ? processGetConversationResult((Effect.GetConversationResult) effect, map) : effect instanceof Effect.RefreshConversationResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.RefreshConversationResult) effect).getResult(), 5, null) : effect instanceof Effect.NetworkConnectionChanged ? processNetworkConnectionChanged((Effect.NetworkConnectionChanged) effect, map) : effect instanceof Effect.RealtimeConnectionChanged ? processRealtimeConnectionChanged((Effect.RealtimeConnectionChanged) effect, map) : effect instanceof Effect.MessagePrepared ? processMessagePrepared((Effect.MessagePrepared) effect, map) : effect instanceof Effect.SendMessageResult ? processSendMessageResult((Effect.SendMessageResult) effect, map) : effect instanceof Effect.PushTokenPrepared ? processPushRegistrationPending((Effect.PushTokenPrepared) effect, map) : effect instanceof Effect.PushTokenUpdateResult ? processPushRegistrationResult(map) : effect instanceof Effect.ActivityEventReceived ? new EffectProcessorResult.Ends(null, map, null, new ConversationKitResult.Success(((Effect.ActivityEventReceived) effect).getActivityEvent()), 5, null) : effect instanceof Effect.LoadMoreMessages ? new EffectProcessorResult.Ends(null, map, null, ((Effect.LoadMoreMessages) effect).getResult(), 5, null) : effect instanceof Effect.GetVisitType ? new EffectProcessorResult.Ends(null, map, null, new ConversationKitResult.Success(((Effect.GetVisitType) effect).getVisitType()), 5, null) : effect instanceof Effect.GetProactiveMessage ? new EffectProcessorResult.Ends(null, map, null, ((Effect.GetProactiveMessage) effect).getResult(), 5, null) : effect instanceof Effect.ProactiveMessageReferral ? processProactiveMessageReferral((Effect.ProactiveMessageReferral) effect, map) : effect instanceof Effect.ReAuthenticateUser ? processReAuthenticateUser((Effect.ReAuthenticateUser) effect) : effect instanceof Effect.ConversationAddedResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.ConversationAddedResult) effect).getResult(), 5, null) : effect instanceof Effect.ConversationRemovedResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.ConversationRemovedResult) effect).getResult(), 5, null) : effect instanceof Effect.ConversationUpdatedResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.ConversationUpdatedResult) effect).getResult(), 5, null) : effect instanceof Effect.GetConversationsResult ? new EffectProcessorResult.Ends(null, null, null, ((Effect.GetConversationsResult) effect).getResult(), 7, null) : effect instanceof Effect.SendPostbackResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.SendPostbackResult) effect).getResult(), 5, null) : effect instanceof Effect.OpenAttachmentFromFile ? new EffectProcessorResult.Ends(null, map, c0.c(new Action.RefreshConversation(((Effect.OpenAttachmentFromFile) effect).getConversationId())), null, 9, null) : effect instanceof Effect.FetchWaitTimeResult ? new EffectProcessorResult.Ends(null, map, null, ((Effect.FetchWaitTimeResult) effect).getResult(), 5, null) : new EffectProcessorResult.Ends(null, map, null, null, 13, null);
    }
}
