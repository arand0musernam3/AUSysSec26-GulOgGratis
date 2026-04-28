package com.adyen.checkout.issuerlist.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.components.core.Issuer;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.issuerlist.IssuerListViewType;
import com.adyen.checkout.issuerlist.internal.ui.IssuerListComponentViewType;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListComponentParams;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListInputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListOutputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.braze.h2;
import i80.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 r*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001rB\u0081\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012$\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J9\u0010'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%\u0012\u0004\u0012\u00020\u001f0$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\u001f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0$H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010*J\u0017\u00108\u001a\u00020\u001f2\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0017H\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001fH\u0016¢\u0006\u0004\bB\u0010*J\u0017\u0010C\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bC\u0010!J\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010GH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001fH\u0002¢\u0006\u0004\bJ\u0010*J\u000f\u0010K\u001a\u000204H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00028\u00012\b\b\u0002\u00105\u001a\u000204H\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u001c\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010UR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010VR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010WR2\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010XR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010YR\u0014\u0010Z\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u0002040\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010_\u001a\b\u0012\u0004\u0012\u0002040G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010IR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010^R \u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bd\u0010IR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010^R\"\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010IR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00010G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010`\u001a\u0004\bj\u0010IR \u0010l\u001a\b\u0012\u0004\u0012\u00020k0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010`\u001a\u0004\bm\u0010IR \u0010o\u001a\b\u0012\u0004\u0012\u00020n0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010IR\u0014\u00105\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010L¨\u0006s"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate;", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "IssuerListPaymentMethodT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "submitHandler", "Lkotlin/Function0;", "typedPaymentMethodFactory", "Lkotlin/Function3;", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "", "componentStateFactory", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lkotlin/jvm/functions/Function0;Li80/n;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "getIssuers", "()Ljava/util/List;", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "onSubmit", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;", "outputData", "updateComponentState$issuer_list_release", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;)V", "updateComponentState", "", "getPaymentMethodType", "()Ljava/lang/String;", "isConfirmationRequired", "()Z", "shouldShowSubmitButton", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "onCleared", "initializeAnalytics", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType;", "getIssuerListComponentViewType", "()Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType;", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "onInputDataChanged", "createOutputData", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;", "createComponentState", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;)Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lkotlin/jvm/functions/Function0;", "Li80/n;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "inputData", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListInputData;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "submitFlow", "getSubmitFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventFlow", "getUiEventFlow", "getOutputData", "Companion", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultIssuerListDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultIssuerListDelegate.kt\ncom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,201:1\n16#2,17:202\n*S KotlinDebug\n*F\n+ 1 DefaultIssuerListDelegate.kt\ncom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate\n*L\n84#1:202,17\n*E\n"})
public final class DefaultIssuerListDelegate<IssuerListPaymentMethodT extends IssuerListPaymentMethod, ComponentStateT extends PaymentComponentState<IssuerListPaymentMethodT>> implements IssuerListDelegate<IssuerListPaymentMethodT, ComponentStateT> {

    @NotNull
    public static final String ANALYTICS_TARGET = "list";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final f1 _componentStateFlow;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final IssuerListComponentParams componentParams;

    @NotNull
    private final n componentStateFactory;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final IssuerListInputData inputData;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PaymentMethod paymentMethod;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<ComponentStateT> submitHandler;

    @NotNull
    private final Function0<IssuerListPaymentMethodT> typedPaymentMethodFactory;

    @NotNull
    private final i uiEventFlow;

    @NotNull
    private final i uiStateFlow;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IssuerListViewType.values().length];
            try {
                iArr[IssuerListViewType.RECYCLER_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssuerListViewType.SPINNER_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate$getTrackedSubmitFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate$getTrackedSubmitFlow$1", f = "DefaultIssuerListDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\u008a@"}, d2 = {"<anonymous>", "", "IssuerListPaymentMethodT", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<ComponentStateT, c<? super Unit>, Object> {
        int label;
        final /* synthetic */ DefaultIssuerListDelegate<IssuerListPaymentMethodT, ComponentStateT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultIssuerListDelegate<IssuerListPaymentMethodT, ComponentStateT> defaultIssuerListDelegate, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultIssuerListDelegate;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ComponentStateT componentstatet, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(componentstatet, cVar)).invokeSuspend(Unit.f26487a);
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
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = ((DefaultIssuerListDelegate) this.this$0).paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            ((DefaultIssuerListDelegate) this.this$0).analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultIssuerListDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull IssuerListComponentParams issuerListComponentParams, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull AnalyticsManager analyticsManager, @NotNull SubmitHandler<ComponentStateT> submitHandler, @NotNull Function0<? extends IssuerListPaymentMethodT> function0, @NotNull n nVar, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        issuerListComponentParams.getClass();
        paymentMethod.getClass();
        analyticsManager.getClass();
        submitHandler.getClass();
        function0.getClass();
        nVar.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.componentParams = issuerListComponentParams;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.analyticsManager = analyticsManager;
        this.submitHandler = submitHandler;
        this.typedPaymentMethodFactory = function0;
        this.componentStateFactory = nVar;
        this.sdkDataProvider = sdkDataProvider;
        this.inputData = new IssuerListInputData(null, 1, null);
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        a2 a2VarC2 = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC2;
        this.componentStateFlow = a2VarC2;
        a2 a2VarC3 = r.c(getIssuerListComponentViewType());
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        this.submitFlow = getTrackedSubmitFlow();
        this.uiStateFlow = submitHandler.getUiStateFlow();
        this.uiEventFlow = submitHandler.getUiEventFlow();
    }

    private final ComponentStateT createComponentState(IssuerListOutputData outputData) {
        IssuerListPaymentMethod issuerListPaymentMethod = (IssuerListPaymentMethod) this.typedPaymentMethodFactory.invoke();
        issuerListPaymentMethod.setType(getPaymentMethodType());
        issuerListPaymentMethod.setCheckoutAttemptId(this.analyticsManager.getCheckoutAttemptId());
        issuerListPaymentMethod.setSdkData(SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null));
        IssuerModel selectedIssuer = outputData.getSelectedIssuer();
        String id2 = selectedIssuer != null ? selectedIssuer.getId() : null;
        if (id2 == null) {
            id2 = "";
        }
        issuerListPaymentMethod.setIssuer(id2);
        return (ComponentStateT) this.componentStateFactory.invoke(new PaymentComponentData(issuerListPaymentMethod, this.order, getComponentParams().getAmount(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), Boolean.valueOf(outputData.getIsValid()), Boolean.TRUE);
    }

    public static /* synthetic */ PaymentComponentState createComponentState$default(DefaultIssuerListDelegate defaultIssuerListDelegate, IssuerListOutputData issuerListOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            issuerListOutputData = defaultIssuerListDelegate.getOutputData();
        }
        return defaultIssuerListDelegate.createComponentState(issuerListOutputData);
    }

    private final IssuerListOutputData createOutputData() {
        return new IssuerListOutputData(this.inputData.getSelectedIssuer());
    }

    private final IssuerListComponentViewType getIssuerListComponentViewType() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getComponentParams().getViewType().ordinal()];
        if (i11 == 1) {
            return IssuerListComponentViewType.RecyclerView.INSTANCE;
        }
        if (i11 == 2) {
            return IssuerListComponentViewType.SpinnerView.INSTANCE;
        }
        e40.a.f();
        return null;
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new AnonymousClass1(this, null), 5);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultIssuerListDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "initializeAnalytics", null);
        }
        this.analyticsManager.initialize(this, coroutineScope);
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String type = this.paymentMethod.getType();
        if (type == null) {
            type = "";
        }
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, null, null, null, 14, null));
    }

    private final void onInputDataChanged() {
        IssuerListOutputData issuerListOutputDataCreateOutputData = createOutputData();
        ((a2) this._outputDataFlow).j(issuerListOutputDataCreateOutputData);
        updateComponentState$issuer_list_release(issuerListOutputDataCreateOutputData);
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String type = this.paymentMethod.getType();
        if (type == null) {
            type = "";
        }
        IssuerModel selectedIssuer = issuerListOutputDataCreateOutputData.getSelectedIssuer();
        String name = selectedIssuer != null ? selectedIssuer.getName() : null;
        this.analyticsManager.trackEvent(GenericEvents.selected$default(genericEvents, type, ANALYTICS_TARGET, name == null ? "" : name, null, 8, null));
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    @NotNull
    public List<IssuerModel> getIssuers() {
        List<IssuerModel> listMapToModel;
        List<Issuer> issuers = this.paymentMethod.getIssuers();
        return (issuers == null || (listMapToModel = IssuersUtilsKt.mapToModel(issuers, getComponentParams().getEnvironment())) == null) ? IssuersUtilsKt.getLegacyIssuers(this.paymentMethod.getDetails(), getComponentParams().getEnvironment()) : listMapToModel;
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    @NotNull
    public IssuerListOutputData getOutputData() {
        return (IssuerListOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public String getPaymentMethodType() {
        String type = this.paymentMethod.getType();
        return type == null ? PaymentMethodTypes.UNKNOWN : type;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public i getSubmitFlow() {
        return this.submitFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.UIStateDelegate
    @NotNull
    public i getUiEventFlow() {
        return this.uiEventFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.UIStateDelegate
    @NotNull
    public i getUiStateFlow() {
        return this.uiStateFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        initializeAnalytics(coroutineScope);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean isConfirmationRequired() {
        return ((a2) this._viewFlow).getValue() instanceof ButtonComponentViewType;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<ComponentStateT>, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getComponentStateFlow(), null, getSubmitFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public void onSubmit() {
        this.submitHandler.onSubmit((PaymentComponentState) ((a2) this._componentStateFlow).getValue());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    public final void updateComponentState$issuer_list_release(@NotNull IssuerListOutputData outputData) {
        outputData.getClass();
        ((a2) this._componentStateFlow).j(createComponentState(outputData));
    }

    @Override // com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate
    public void updateInputData(@NotNull Function1<? super IssuerListInputData, Unit> update) {
        update.getClass();
        update.invoke(this.inputData);
        onInputDataChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate$Companion;", "", "()V", "ANALYTICS_TARGET", "", "getANALYTICS_TARGET$issuer_list_release$annotations", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getANALYTICS_TARGET$issuer_list_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public IssuerListComponentParams getComponentParams() {
        return this.componentParams;
    }
}
