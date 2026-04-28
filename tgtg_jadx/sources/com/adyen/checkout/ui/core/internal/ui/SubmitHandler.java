package com.adyen.checkout.ui.core.internal.ui;

import androidx.lifecycle.c1;
import ba0.g;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.PaymentComponentUIEvent;
import com.adyen.checkout.ui.core.internal.ui.PaymentComponentUIState;
import com.braze.h2;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import x80.m;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 1*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u00011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e\"\u0004\b\u0016\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\r8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\r8\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&¨\u00062"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Landroidx/lifecycle/c1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/c1;)V", "", "resetUIState", "()V", "Lv80/b0;", "coroutineScope", "Ly80/i;", "componentStateFlow", "initialize", "(Lv80/b0;Ly80/i;)V", "state", "onSubmit", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "<set-?>", "isInteractionBlocked$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "Lx80/m;", "submitChannel", "Lx80/m;", "submitFlow", "Ly80/i;", "getSubmitFlow", "()Ly80/i;", "Ly80/f1;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "_uiStateFlow", "Ly80/f1;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventChannel", "uiEventFlow", "getUiEventFlow", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SubmitHandler<ComponentStateT extends PaymentComponentState<?>> implements SavedStateHandleContainer {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(SubmitHandler.class, "isInteractionBlocked", "isInteractionBlocked()Ljava/lang/Boolean;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String IS_INTERACTION_BLOCKED = "IS_INTERACTION_BLOCKED";

    @NotNull
    private final f1 _uiStateFlow;

    /* JADX INFO: renamed from: isInteractionBlocked$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty isInteractionBlocked;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final m submitChannel;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final m uiEventChannel;

    @NotNull
    private final i uiEventFlow;

    @NotNull
    private final i uiStateFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.SubmitHandler$initialize$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.ui.SubmitHandler$initialize$2", f = "SubmitHandler.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "state"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends z70.i implements Function2<ComponentStateT, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SubmitHandler<ComponentStateT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SubmitHandler<ComponentStateT> submitHandler, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = submitHandler;
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
        public final Object invoke(@NotNull ComponentStateT componentstatet, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(componentstatet, cVar)).invokeSuspend(Unit.f26487a);
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
            PaymentComponentState paymentComponentState = (PaymentComponentState) this.L$0;
            if (Intrinsics.areEqual((PaymentComponentUIState) ((a2) ((SubmitHandler) this.this$0)._uiStateFlow).getValue(), PaymentComponentUIState.PendingSubmit.INSTANCE)) {
                if (paymentComponentState.isValid()) {
                    ((SubmitHandler) this.this$0).submitChannel.h(paymentComponentState);
                }
                this.this$0.resetUIState();
            }
            return Unit.f26487a;
        }
    }

    public SubmitHandler(@NotNull c1 c1Var) {
        c1Var.getClass();
        this.savedStateHandle = c1Var;
        this.isInteractionBlocked = new SavedStateHandleProperty(IS_INTERACTION_BLOCKED);
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.submitChannel = mVarBufferedChannel;
        this.submitFlow = r.w(mVarBufferedChannel);
        a2 a2VarC = r.c(PaymentComponentUIState.Idle.INSTANCE);
        this._uiStateFlow = a2VarC;
        this.uiStateFlow = a2VarC;
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.uiEventChannel = mVarBufferedChannel2;
        this.uiEventFlow = r.w(mVarBufferedChannel2);
    }

    private final Boolean isInteractionBlocked() {
        return (Boolean) this.isInteractionBlocked.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetUIState() {
        Object obj;
        Boolean boolIsInteractionBlocked = isInteractionBlocked();
        if (boolIsInteractionBlocked == null) {
            obj = PaymentComponentUIState.Idle.INSTANCE;
        } else if (Intrinsics.areEqual(boolIsInteractionBlocked, Boolean.TRUE)) {
            obj = PaymentComponentUIState.Blocked.INSTANCE;
        } else {
            if (!Intrinsics.areEqual(boolIsInteractionBlocked, Boolean.FALSE)) {
                e40.a.f();
                return;
            }
            obj = PaymentComponentUIState.Idle.INSTANCE;
        }
        ((a2) this._uiStateFlow).j(obj);
    }

    private final void setInteractionBlocked(Boolean bool) {
        this.isInteractionBlocked.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], bool);
    }

    @Override // com.adyen.checkout.components.core.internal.SavedStateHandleContainer
    @NotNull
    public c1 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    public final i getSubmitFlow() {
        return this.submitFlow;
    }

    @NotNull
    public final i getUiEventFlow() {
        return this.uiEventFlow;
    }

    @NotNull
    public final i getUiStateFlow() {
        return this.uiStateFlow;
    }

    public final void initialize(@NotNull b0 coroutineScope, @NotNull i componentStateFlow) {
        coroutineScope.getClass();
        componentStateFlow.getClass();
        Boolean boolIsInteractionBlocked = isInteractionBlocked();
        if (boolIsInteractionBlocked != null) {
            setInteractionBlocked(boolIsInteractionBlocked.booleanValue());
        }
        r.u(coroutineScope, new w(componentStateFlow, new AnonymousClass2(this, null), 5));
    }

    public final void onSubmit(@NotNull ComponentStateT state) {
        state.getClass();
        if (!state.isInputValid()) {
            this.uiEventChannel.h(PaymentComponentUIEvent.InvalidUI.INSTANCE);
            return;
        }
        if (state.isValid()) {
            this.uiEventChannel.h(PaymentComponentUIEvent.HideKeyboard.INSTANCE);
            this.submitChannel.h(state);
        } else {
            if (state.isReady()) {
                resetUIState();
                return;
            }
            ((a2) this._uiStateFlow).j(PaymentComponentUIState.PendingSubmit.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler$Companion;", "", "()V", SubmitHandler.IS_INTERACTION_BLOCKED, "", "getIS_INTERACTION_BLOCKED$ui_core_release$annotations", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getIS_INTERACTION_BLOCKED$ui_core_release$annotations() {
        }
    }

    public final void setInteractionBlocked(boolean isInteractionBlocked) {
        setInteractionBlocked(Boolean.valueOf(isInteractionBlocked));
        resetUIState();
    }
}
