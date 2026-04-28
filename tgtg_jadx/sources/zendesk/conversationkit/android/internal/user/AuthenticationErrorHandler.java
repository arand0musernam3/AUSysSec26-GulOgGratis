package zendesk.conversationkit.android.internal.user;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import e90.a;
import e90.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.q;
import v80.k;
import v80.l;
import y70.f;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.AuthenticationDelegate;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.ConversationKitResultKt;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.internal.extension.AuthenticatedUserUtilKt;
import zendesk.conversationkit.android.internal.faye.SunCoFayeClient;
import zendesk.conversationkit.android.internal.user.Jwt;
import zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository;
import zendesk.conversationkit.android.model.RestRetryPolicy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0013\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J.\u0010&\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0086@¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020)2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R(\u00104\u001a\u0002038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler;", "", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;", "userActionProcessorRepository", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "sunCoFayeClient", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "jwtDecoder", "Lzendesk/conversationkit/android/model/RestRetryPolicy;", "restRetryPolicy", "<init>", "(Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;Lzendesk/conversationkit/android/model/RestRetryPolicy;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", StatusResponseUtils.RESULT_ERROR, "Lkotlin/Function1;", "Lx70/c;", "Lzendesk/conversationkit/android/internal/Effect;", "block", "retryInvalidAuthentication", "(Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/AuthenticationDelegate;", "authenticationDelegate", "", "retrieveJWT", "(Lzendesk/conversationkit/android/AuthenticationDelegate;Ljava/lang/Exception;Lx70/c;)Ljava/lang/Object;", "", "", "onInvalidAuthSuspend", "(Lzendesk/conversationkit/android/AuthenticationDelegate;Ljava/lang/Throwable;Lx70/c;)Ljava/lang/Object;", "jwt", "", "isJwtExpired", "(Ljava/lang/String;)Z", "Lretrofit2/HttpException;", "exception", "reAuthenticateUser", "(Lretrofit2/HttpException;Lx70/c;)Ljava/lang/Object;", "executeWithAuthErrorHandling", "(Lkotlin/jvm/functions/Function1;Lx70/c;)Ljava/lang/Object;", "throwable", "Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "revokeUser", "(Ljava/lang/Throwable;)Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRepository;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "Lzendesk/conversationkit/android/model/RestRetryPolicy;", "Le90/a;", "mutex", "Le90/a;", "", "retries", "I", "getRetries$zendesk_conversationkit_conversationkit_android", "()I", "setRetries$zendesk_conversationkit_conversationkit_android", "(I)V", "getRetries$zendesk_conversationkit_conversationkit_android$annotations", "()V", "isSuccessful", "Z", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationErrorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationErrorHandler.kt\nzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n116#2,11:238\n116#2,11:249\n426#3,11:260\n1#4:271\n*S KotlinDebug\n*F\n+ 1 AuthenticationErrorHandler.kt\nzendesk/conversationkit/android/internal/user/AuthenticationErrorHandler\n*L\n145#1:238,11\n163#1:249,11\n180#1:260,11\n*E\n"})
public final class AuthenticationErrorHandler {

    @NotNull
    private static final String LOG_TAG = "AuthenticationErrorHandler";
    private boolean isSuccessful;

    @NotNull
    private final Jwt.Decoder jwtDecoder;

    @NotNull
    private final a mutex;

    @NotNull
    private final RestRetryPolicy restRetryPolicy;
    private int retries;

    @NotNull
    private final SunCoFayeClient sunCoFayeClient;

    @NotNull
    private final UserActionProcessorRepository userActionProcessorRepository;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$executeWithAuthErrorHandling$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler", f = "AuthenticationErrorHandler.kt", l = {75, 78, 80, 85, 88}, m = "executeWithAuthErrorHandling")
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
            return AuthenticationErrorHandler.this.executeWithAuthErrorHandling(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$reAuthenticateUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler", f = "AuthenticationErrorHandler.kt", l = {BERTags.FLAGS, 225, 227}, m = "reAuthenticateUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02551 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02551(x70.c<? super C02551> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationErrorHandler.this.reAuthenticateUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retrieveJWT$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler", f = "AuthenticationErrorHandler.kt", l = {143, 243, 147, 152, 254}, m = "retrieveJWT")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02561 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02561(x70.c<? super C02561> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationErrorHandler.this.retrieveJWT(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retryInvalidAuthentication$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler", f = "AuthenticationErrorHandler.kt", l = {108, 110}, m = "retryInvalidAuthentication")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02571 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C02571(x70.c<? super C02571> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationErrorHandler.this.retryInvalidAuthentication(null, null, this);
        }
    }

    public AuthenticationErrorHandler(@NotNull UserActionProcessorRepository userActionProcessorRepository, @NotNull SunCoFayeClient sunCoFayeClient, @NotNull Jwt.Decoder decoder, @NotNull RestRetryPolicy restRetryPolicy) {
        userActionProcessorRepository.getClass();
        sunCoFayeClient.getClass();
        decoder.getClass();
        restRetryPolicy.getClass();
        this.userActionProcessorRepository = userActionProcessorRepository;
        this.sunCoFayeClient = sunCoFayeClient;
        this.jwtDecoder = decoder;
        this.restRetryPolicy = restRetryPolicy;
        this.mutex = d.a();
    }

    private final boolean isJwtExpired(String jwt) {
        Jwt jwt2 = jwt != null ? (Jwt) ConversationKitResultKt.getOrThrow(this.jwtDecoder.decode(jwt)) : null;
        return jwt2 != null && AuthenticatedUserUtilKt.isJwtExpired$default(jwt2, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onInvalidAuthSuspend(AuthenticationDelegate authenticationDelegate, Throwable th2, x70.c<? super String> cVar) {
        final l lVar = new l(1, f.b(cVar));
        lVar.t();
        authenticationDelegate.onInvalidAuth(th2, new Function1<String, Unit>() { // from class: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$onInvalidAuthSuspend$2$1
            public final void invoke(String str) {
                str.getClass();
                k kVar = lVar;
                o oVar = q.f40850b;
                kVar.resumeWith(str);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.f26487a;
            }
        });
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reAuthenticateUser(retrofit2.HttpException r7, x70.c<? super zendesk.conversationkit.android.internal.Effect> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.C02551
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$reAuthenticateUser$1 r0 = (zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.C02551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$reAuthenticateUser$1 r0 = new zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$reAuthenticateUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            ba0.g.M(r8)
            goto L7f
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L38:
            java.lang.Object r7 = r0.L$0
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            ba0.g.M(r8)
            goto L6d
        L40:
            java.lang.Object r7 = r0.L$0
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            ba0.g.M(r8)
            goto L58
        L48:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = r6.userActionProcessorRepository
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.shouldReAuthenticateUser(r0)
            if (r8 != r1) goto L58
            goto L7e
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L92
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = r6.userActionProcessorRepository
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.updateReAuthenticateUser(r5, r0)
            if (r8 != r1) goto L6d
            goto L7e
        L6d:
            zendesk.conversationkit.android.internal.faye.SunCoFayeClient r8 = r6.sunCoFayeClient
            r8.disconnect()
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRepository r8 = r6.userActionProcessorRepository
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.getUser(r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            zendesk.conversationkit.android.model.User r8 = (zendesk.conversationkit.android.model.User) r8
            java.lang.String r8 = r8.getJwt$zendesk_conversationkit_conversationkit_android()
            if (r8 == 0) goto L8d
            zendesk.conversationkit.android.internal.Effect$ReAuthenticateUser r7 = new zendesk.conversationkit.android.internal.Effect$ReAuthenticateUser
            r7.<init>(r8)
            return r7
        L8d:
            zendesk.conversationkit.android.internal.Effect$UserAccessRevoked r7 = r6.revokeUser(r7)
            return r7
        L92:
            zendesk.conversationkit.android.internal.Effect$UserAccessRevoked r7 = r6.revokeUser(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.reAuthenticateUser(retrofit2.HttpException, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(5:45|46|74|47|(1:49)(8:50|(1:52)|53|54|60|61|32|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[Catch: all -> 0x0067, Exception -> 0x0152, PHI: r0 r2 r4 r13 r14 r16
      0x0118: PHI (r0v11 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r2v8 zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retrieveJWT$1) = 
      (r2v9 zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retrieveJWT$1)
      (r2v2 zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retrieveJWT$1)
     binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r4v6 ??) = (r4v31 ??), (r4v32 ??) binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r13v4 java.lang.Exception) = (r13v5 java.lang.Exception), (r13v16 java.lang.Exception) binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r14v4 zendesk.conversationkit.android.AuthenticationDelegate) = 
      (r14v5 zendesk.conversationkit.android.AuthenticationDelegate)
      (r14v14 zendesk.conversationkit.android.AuthenticationDelegate)
     binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r16v4 int) = (r16v5 int), (r16v9 int) binds: [B:48:0x0115, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0067, blocks: (B:45:0x00f1, B:47:0x0100, B:50:0x0118, B:53:0x012b, B:56:0x0153, B:58:0x0157, B:62:0x0168, B:20:0x0060, B:27:0x007b), top: B:71:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:45:0x00f1, B:47:0x0100, B:50:0x0118, B:53:0x012b, B:56:0x0153, B:58:0x0157, B:62:0x0168, B:20:0x0060, B:27:0x007b), top: B:71:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168 A[Catch: all -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:45:0x00f1, B:47:0x0100, B:50:0x0118, B:53:0x012b, B:56:0x0153, B:58:0x0157, B:62:0x0168, B:20:0x0060, B:27:0x007b), top: B:71:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x015f -> B:61:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x017b -> B:16:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveJWT(zendesk.conversationkit.android.AuthenticationDelegate r18, java.lang.Exception r19, x70.c<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.retrieveJWT(zendesk.conversationkit.android.AuthenticationDelegate, java.lang.Exception, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(2:59|13)|14|55|35|57|36|37|24|(2:50|(2:52|53)(1:54))(3:28|(2:31|32)|34)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r13 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r10.retries >= r10.restRetryPolicy.getMaxRetries()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        zendesk.logger.Logger.e(zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.LOG_TAG, "Failed to fetch JWT from delegate.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        throw r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:42:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryInvalidAuthentication(java.lang.Exception r11, kotlin.jvm.functions.Function1<? super x70.c<? super zendesk.conversationkit.android.internal.Effect>, ? extends java.lang.Object> r12, x70.c<? super zendesk.conversationkit.android.internal.Effect> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.retryInvalidAuthentication(java.lang.Exception, kotlin.jvm.functions.Function1, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Effect.UserAccessRevoked revokeUser$default(AuthenticationErrorHandler authenticationErrorHandler, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        return authenticationErrorHandler.revokeUser(th2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeWithAuthErrorHandling(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super x70.c<? super zendesk.conversationkit.android.internal.Effect>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.internal.Effect> r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler.executeWithAuthErrorHandling(kotlin.jvm.functions.Function1, x70.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: getRetries$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final int getRetries() {
        return this.retries;
    }

    @NotNull
    public final Effect.UserAccessRevoked revokeUser(@Nullable Throwable throwable) {
        this.sunCoFayeClient.disconnect();
        return new Effect.UserAccessRevoked(throwable != null ? new ConversationKitResult.Failure(throwable) : new ConversationKitResult.Success(Unit.f26487a));
    }

    public final void setRetries$zendesk_conversationkit_conversationkit_android(int i11) {
        this.retries = i11;
    }

    public static /* synthetic */ void getRetries$zendesk_conversationkit_conversationkit_android$annotations() {
    }

    public /* synthetic */ AuthenticationErrorHandler(UserActionProcessorRepository userActionProcessorRepository, SunCoFayeClient sunCoFayeClient, Jwt.Decoder decoder, RestRetryPolicy restRetryPolicy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userActionProcessorRepository, sunCoFayeClient, (i11 & 4) != 0 ? new Jwt.Decoder() : decoder, restRetryPolicy);
    }
}
