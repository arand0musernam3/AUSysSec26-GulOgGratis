package com.adyen.checkout.sessions.core.internal;

import ba0.g;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.BaseComponentCallback;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.sessions.core.SessionComponentCallback;
import com.adyen.checkout.sessions.core.SessionPaymentResult;
import com.adyen.checkout.sessions.core.internal.SessionCallResult;
import com.braze.h2;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import y80.j;
import y80.r;
import y80.w;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001d\u001a\u00020\f*\u00020\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J-\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b,\u0010-J%\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b5\u00106J%\u0010;\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u00104\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/sessions/core/internal/SessionInteractor;", "sessionInteractor", "Lcom/adyen/checkout/sessions/core/internal/SessionSavedStateHandleContainer;", "sessionSavedStateHandleContainer", "<init>", "(Lcom/adyen/checkout/sessions/core/internal/SessionInteractor;Lcom/adyen/checkout/sessions/core/internal/SessionSavedStateHandleContainer;)V", "", "sessionData", "", "updateSessionData", "(Ljava/lang/String;)V", "paymentComponentState", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "sessionComponentCallback", "onPaymentsCallRequested", "(Lcom/adyen/checkout/components/core/PaymentComponentState;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "Lcom/adyen/checkout/components/core/ActionComponentData;", "actionComponentData", "onDetailsCallRequested", "(Lcom/adyen/checkout/components/core/ActionComponentData;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "Lv80/b0;", "Lkotlin/Function2;", "Lx70/c;", "", "block", "launchWithLoadingState", "(Lv80/b0;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Lkotlin/jvm/functions/Function2;)V", "state", "onState", "requiredPermission", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "permissionCallback", "onPermissionRequest", "(Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "Lcom/adyen/checkout/components/core/ComponentError;", StatusResponseUtils.RESULT_ERROR, "onComponentError", "(Lcom/adyen/checkout/components/core/ComponentError;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "", "throwable", "onSessionError", "(Ljava/lang/Throwable;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "result", "onFinished", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;)V", "setFlowTakenOver", "()V", "coroutineScope", "initialize", "(Lv80/b0;)V", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "event", "Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;", "componentCallback", "onPaymentComponentEvent", "(Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;)V", "onCleared", "Lcom/adyen/checkout/sessions/core/internal/SessionInteractor;", "Lcom/adyen/checkout/sessions/core/internal/SessionSavedStateHandleContainer;", "_coroutineScope", "Lv80/b0;", "getCoroutineScope", "()Lv80/b0;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionComponentEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionComponentEventHandler.kt\ncom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,178:1\n56#2:179\n59#2:183\n46#3:180\n51#3:182\n105#4:181\n16#5,17:184\n16#5,17:201\n16#5,17:218\n16#5,17:235\n*S KotlinDebug\n*F\n+ 1 SessionComponentEventHandler.kt\ncom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler\n*L\n43#1:179\n43#1:183\n43#1:180\n43#1:182\n43#1:181\n49#1:184,17\n57#1:201,17\n164#1:218,17\n171#1:235,17\n*E\n"})
public final class SessionComponentEventHandler<T extends PaymentComponentState<?>> implements ComponentEventHandler<T> {

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final SessionInteractor sessionInteractor;

    @NotNull
    private final SessionSavedStateHandleContainer sessionSavedStateHandleContainer;

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$2", f = "SessionComponentEventHandler.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<String, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SessionComponentEventHandler<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionComponentEventHandler<T> sessionComponentEventHandler, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = sessionComponentEventHandler;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull String str, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            this.this$0.updateSessionData((String) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$launchWithLoadingState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$launchWithLoadingState$1", f = "SessionComponentEventHandler.kt", l = {134}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Function2<b0, c<? super Unit>, Object> $block;
        final /* synthetic */ SessionComponentCallback<T> $sessionComponentCallback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SessionComponentCallback<T> sessionComponentCallback, Function2<? super b0, ? super c<? super Unit>, ? extends Object> function2, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$sessionComponentCallback = sessionComponentCallback;
            this.$block = function2;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionComponentCallback, this.$block, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                b0 b0Var = (b0) this.L$0;
                this.$sessionComponentCallback.onLoading(true);
                Function2<b0, c<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (function2.invoke(b0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            this.$sessionComponentCallback.onLoading(false);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$onDetailsCallRequested$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$onDetailsCallRequested$1", f = "SessionComponentEventHandler.kt", l = {108}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C01091 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ActionComponentData $actionComponentData;
        final /* synthetic */ SessionComponentCallback<T> $sessionComponentCallback;
        int label;
        final /* synthetic */ SessionComponentEventHandler<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01091(SessionComponentEventHandler<T> sessionComponentEventHandler, ActionComponentData actionComponentData, SessionComponentCallback<T> sessionComponentCallback, c<? super C01091> cVar) {
            super(2, cVar);
            this.this$0 = sessionComponentEventHandler;
            this.$actionComponentData = actionComponentData;
            this.$sessionComponentCallback = sessionComponentCallback;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C01091(this.this$0, this.$actionComponentData, this.$sessionComponentCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C01091) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                SessionInteractor sessionInteractor = ((SessionComponentEventHandler) this.this$0).sessionInteractor;
                ActionComponentData actionComponentData = this.$actionComponentData;
                SessionComponentEventHandler$onDetailsCallRequested$1$result$1 sessionComponentEventHandler$onDetailsCallRequested$1$result$1 = new SessionComponentEventHandler$onDetailsCallRequested$1$result$1(this.$sessionComponentCallback);
                this.label = 1;
                obj = sessionInteractor.onDetailsCallRequested(actionComponentData, sessionComponentEventHandler$onDetailsCallRequested$1$result$1, "onAdditionalDetails", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            SessionCallResult.Details details = (SessionCallResult.Details) obj;
            if (details instanceof SessionCallResult.Details.Action) {
                this.$sessionComponentCallback.onAction(((SessionCallResult.Details.Action) details).getAction());
            } else if (details instanceof SessionCallResult.Details.Error) {
                this.this$0.onSessionError(((SessionCallResult.Details.Error) details).getThrowable(), this.$sessionComponentCallback);
            } else if (details instanceof SessionCallResult.Details.Finished) {
                this.this$0.onFinished(((SessionCallResult.Details.Finished) details).getResult(), this.$sessionComponentCallback);
            } else if (Intrinsics.areEqual(details, SessionCallResult.Details.TakenOver.INSTANCE)) {
                this.this$0.setFlowTakenOver();
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$onPaymentsCallRequested$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$onPaymentsCallRequested$1", f = "SessionComponentEventHandler.kt", l = {77}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C01101 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ T $paymentComponentState;
        final /* synthetic */ SessionComponentCallback<T> $sessionComponentCallback;
        int label;
        final /* synthetic */ SessionComponentEventHandler<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01101(SessionComponentEventHandler<T> sessionComponentEventHandler, T t9, SessionComponentCallback<T> sessionComponentCallback, c<? super C01101> cVar) {
            super(2, cVar);
            this.this$0 = sessionComponentEventHandler;
            this.$paymentComponentState = t9;
            this.$sessionComponentCallback = sessionComponentCallback;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C01101(this.this$0, this.$paymentComponentState, this.$sessionComponentCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C01101) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                SessionInteractor sessionInteractor = ((SessionComponentEventHandler) this.this$0).sessionInteractor;
                T t9 = this.$paymentComponentState;
                SessionComponentEventHandler$onPaymentsCallRequested$1$result$1 sessionComponentEventHandler$onPaymentsCallRequested$1$result$1 = new SessionComponentEventHandler$onPaymentsCallRequested$1$result$1(this.$sessionComponentCallback);
                this.label = 1;
                obj = sessionInteractor.onPaymentsCallRequested(t9, sessionComponentEventHandler$onPaymentsCallRequested$1$result$1, "onSubmit", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            SessionCallResult.Payments payments = (SessionCallResult.Payments) obj;
            if (payments instanceof SessionCallResult.Payments.Action) {
                this.$sessionComponentCallback.onAction(((SessionCallResult.Payments.Action) payments).getAction());
            } else if (payments instanceof SessionCallResult.Payments.Error) {
                this.this$0.onSessionError(((SessionCallResult.Payments.Error) payments).getThrowable(), this.$sessionComponentCallback);
            } else if (payments instanceof SessionCallResult.Payments.Finished) {
                this.this$0.onFinished(((SessionCallResult.Payments.Finished) payments).getResult(), this.$sessionComponentCallback);
            } else if (payments instanceof SessionCallResult.Payments.NotFullyPaidOrder) {
                this.this$0.onFinished(((SessionCallResult.Payments.NotFullyPaidOrder) payments).getResult(), this.$sessionComponentCallback);
            } else if (payments instanceof SessionCallResult.Payments.RefusedPartialPayment) {
                this.this$0.onFinished(((SessionCallResult.Payments.RefusedPartialPayment) payments).getResult(), this.$sessionComponentCallback);
            } else if (payments instanceof SessionCallResult.Payments.TakenOver) {
                this.this$0.setFlowTakenOver();
            }
            return Unit.f26487a;
        }
    }

    public SessionComponentEventHandler(@NotNull SessionInteractor sessionInteractor, @NotNull SessionSavedStateHandleContainer sessionSavedStateHandleContainer) {
        sessionInteractor.getClass();
        sessionSavedStateHandleContainer.getClass();
        this.sessionInteractor = sessionInteractor;
        this.sessionSavedStateHandleContainer = sessionSavedStateHandleContainer;
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final void launchWithLoadingState(b0 b0Var, SessionComponentCallback<T> sessionComponentCallback, Function2<? super b0, ? super c<? super Unit>, ? extends Object> function2) {
        f0.B(b0Var, null, null, new AnonymousClass1(sessionComponentCallback, function2, null), 3);
    }

    private final void onComponentError(ComponentError error, SessionComponentCallback<T> sessionComponentCallback) {
        sessionComponentCallback.onError(error);
    }

    private final void onDetailsCallRequested(ActionComponentData actionComponentData, SessionComponentCallback<T> sessionComponentCallback) {
        launchWithLoadingState(getCoroutineScope(), sessionComponentCallback, new C01091(this, actionComponentData, sessionComponentCallback, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinished(SessionPaymentResult result, SessionComponentCallback<T> sessionComponentCallback) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = SessionComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("Finished: ", result.getResultCode()), null);
        }
        sessionComponentCallback.onFinished(result);
    }

    private final void onPaymentsCallRequested(T paymentComponentState, SessionComponentCallback<T> sessionComponentCallback) {
        launchWithLoadingState(getCoroutineScope(), sessionComponentCallback, new C01101(this, paymentComponentState, sessionComponentCallback, null));
    }

    private final void onPermissionRequest(String requiredPermission, PermissionHandlerCallback permissionCallback, SessionComponentCallback<T> sessionComponentCallback) {
        sessionComponentCallback.onPermissionRequest(requiredPermission, permissionCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSessionError(Throwable throwable, SessionComponentCallback<T> sessionComponentCallback) {
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        sessionComponentCallback.onError(new ComponentError(new CheckoutException(message, throwable)));
    }

    private final void onState(T state, SessionComponentCallback<T> sessionComponentCallback) {
        sessionComponentCallback.onStateChanged(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFlowTakenOver() {
        Boolean boolIsFlowTakenOver = this.sessionSavedStateHandleContainer.isFlowTakenOver();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolIsFlowTakenOver, bool)) {
            return;
        }
        this.sessionSavedStateHandleContainer.setFlowTakenOver(bool);
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.INFO;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = SessionComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Flow was taken over.", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionData(String sessionData) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = SessionComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("Updating session data - ", sessionData), null);
        }
        this.sessionSavedStateHandleContainer.updateSessionData(sessionData);
    }

    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        final y80.i sessionFlow = this.sessionInteractor.getSessionFlow();
        r.u(coroutineScope, new w(new y80.i() { // from class: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SessionComponentEventHandler.kt\ncom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler\n*L\n1#1,49:1\n57#2:50\n58#2:52\n43#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2", f = "SessionComponentEventHandler.kt", l = {52}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r6)
                        goto L44
                    L27:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r5)
                        r5 = 0
                        return r5
                    L2e:
                        ba0.g.M(r6)
                        y80.j r6 = r4.$this_unsafeFlow
                        com.adyen.checkout.sessions.core.SessionModel r5 = (com.adyen.checkout.sessions.core.SessionModel) r5
                        java.lang.String r5 = r5.getSessionData()
                        if (r5 == 0) goto L44
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L44
                        return r1
                    L44:
                        kotlin.Unit r5 = kotlin.Unit.f26487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler$initialize$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(j jVar, c cVar) {
                Object objCollect = sessionFlow.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, new AnonymousClass2(this, null), 5));
    }

    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void onCleared() {
        this._coroutineScope = null;
    }

    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void onPaymentComponentEvent(@NotNull PaymentComponentEvent<T> event, @NotNull BaseComponentCallback componentCallback) {
        event.getClass();
        componentCallback.getClass();
        SessionComponentCallback<T> sessionComponentCallback = componentCallback instanceof SessionComponentCallback ? (SessionComponentCallback) componentCallback : null;
        if (sessionComponentCallback == null) {
            throw new CheckoutException(f.k("Callback must be type of ", SessionComponentCallback.class.getCanonicalName()), null, 2, null);
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = SessionComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "Event received " + event, null);
        }
        if (event instanceof PaymentComponentEvent.ActionDetails) {
            onDetailsCallRequested(((PaymentComponentEvent.ActionDetails) event).getData(), sessionComponentCallback);
            return;
        }
        if (event instanceof PaymentComponentEvent.Error) {
            onComponentError(((PaymentComponentEvent.Error) event).getError(), sessionComponentCallback);
            return;
        }
        if (event instanceof PaymentComponentEvent.StateChanged) {
            onState(((PaymentComponentEvent.StateChanged) event).getState(), sessionComponentCallback);
            return;
        }
        if (event instanceof PaymentComponentEvent.PermissionRequest) {
            PaymentComponentEvent.PermissionRequest permissionRequest = (PaymentComponentEvent.PermissionRequest) event;
            onPermissionRequest(permissionRequest.getRequiredPermission(), permissionRequest.getPermissionCallback(), sessionComponentCallback);
        } else if (event instanceof PaymentComponentEvent.Submit) {
            onPaymentsCallRequested(((PaymentComponentEvent.Submit) event).getState(), sessionComponentCallback);
        }
    }
}
