package com.adyen.checkout.redirect.internal.ui;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import ba0.g;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.ActionTypes;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PaymentDataRepository;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.exception.HttpException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.redirect.internal.data.api.NativeRedirectService;
import com.adyen.checkout.redirect.internal.data.model.NativeRedirectRequest;
import com.adyen.checkout.redirect.internal.data.model.NativeRedirectResponse;
import com.adyen.checkout.ui.core.internal.RedirectHandler;
import com.braze.Constants;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import v80.b0;
import v80.f0;
import x70.c;
import x80.m;
import y70.a;
import y80.i;
import y80.r;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u0010 J\u000f\u00104\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u0010 J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00152\u0006\u0010D\u001a\u000208H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bG\u0010.J\u0017\u0010H\u001a\u00020\u00152\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0015H\u0002¢\u0006\u0004\bJ\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010KR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010RR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020>0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020>0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020+0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010XR \u0010_\u001a\b\u0012\u0004\u0012\u00020+0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010]R\"\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010[\u001a\u0004\bc\u0010]R\u0018\u0010d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR/\u0010\"\u001a\u0004\u0018\u0001052\b\u0010f\u001a\u0004\u0018\u0001058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u00107R\u0014\u0010\u0014\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/adyen/checkout/redirect/internal/ui/DefaultRedirectDelegate;", "Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "redirectHandler", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "paymentDataRepository", "Lcom/adyen/checkout/redirect/internal/data/api/NativeRedirectService;", "nativeRedirectService", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/ui/core/internal/RedirectHandler;Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;Lcom/adyen/checkout/redirect/internal/data/api/NativeRedirectService;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "onError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "restoreState", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "initState", "(Lcom/adyen/checkout/components/core/action/RedirectAction;)V", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "launchAction", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lorg/json/JSONObject;", ErrorBundle.DETAIL_ENTRY, "Lcom/adyen/checkout/components/core/ActionComponentData;", "createActionComponentData", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", "nativeRedirectData", "handleNativeRedirect", "(Ljava/lang/String;Lorg/json/JSONObject;)V", InAppMessageBase.MESSAGE, "trackNativeRedirectError", "(Ljava/lang/String;)V", "emitError", "emitDetails", "(Lorg/json/JSONObject;)V", "clearState", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "Lcom/adyen/checkout/redirect/internal/data/api/NativeRedirectService;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lx80/m;", "detailsChannel", "Lx80/m;", "Ly80/i;", "detailsFlow", "Ly80/i;", "getDetailsFlow", "()Ly80/i;", "exceptionChannel", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "getViewFlow", "_coroutineScope", "Lv80/b0;", "<set-?>", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/RedirectAction;", "setAction", "getCoroutineScope", "()Lv80/b0;", "Companion", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultRedirectDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRedirectDelegate.kt\ncom/adyen/checkout/redirect/internal/ui/DefaultRedirectDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n16#2,17:249\n16#2,17:267\n1#3:266\n*S KotlinDebug\n*F\n+ 1 DefaultRedirectDelegate.kt\ncom/adyen/checkout/redirect/internal/ui/DefaultRedirectDelegate\n*L\n82#1:249,17\n137#1:267,17\n*E\n"})
public final class DefaultRedirectDelegate implements RedirectDelegate, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";

    @NotNull
    private static final String RETURN_URL_QUERY_STRING_PARAMETER = "returnUrlQueryString";

    @Nullable
    private b0 _coroutineScope;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty action;

    @Nullable
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final GenericComponentParams componentParams;

    @NotNull
    private final m detailsChannel;

    @NotNull
    private final i detailsFlow;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final NativeRedirectService nativeRedirectService;

    @NotNull
    private final ActionObserverRepository observerRepository;

    @NotNull
    private final PaymentDataRepository paymentDataRepository;

    @NotNull
    private final RedirectHandler redirectHandler;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(DefaultRedirectDelegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/RedirectAction;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.adyen.checkout.redirect.internal.ui.DefaultRedirectDelegate$handleNativeRedirect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.redirect.internal.ui.DefaultRedirectDelegate$handleNativeRedirect$1", f = "DefaultRedirectDelegate.kt", l = {191}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ JSONObject $details;
        final /* synthetic */ String $nativeRedirectData;
        int label;
        final /* synthetic */ DefaultRedirectDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, JSONObject jSONObject, DefaultRedirectDelegate defaultRedirectDelegate, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$nativeRedirectData = str;
            this.$details = jSONObject;
            this.this$0 = defaultRedirectDelegate;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$nativeRedirectData, this.$details, this.this$0, cVar);
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
            try {
                if (i11 == 0) {
                    g.M(obj);
                    String str = this.$nativeRedirectData;
                    String stringOrNull = JsonUtilsKt.getStringOrNull(this.$details, DefaultRedirectDelegate.RETURN_URL_QUERY_STRING_PARAMETER);
                    if (stringOrNull == null) {
                        stringOrNull = "";
                    }
                    NativeRedirectRequest nativeRedirectRequest = new NativeRedirectRequest(str, stringOrNull);
                    NativeRedirectService nativeRedirectService = this.this$0.nativeRedirectService;
                    String clientKey = this.this$0.getComponentParams().getClientKey();
                    this.label = 1;
                    obj = nativeRedirectService.makeNativeRedirect(nativeRedirectRequest, clientKey, this);
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
                this.this$0.emitDetails(NativeRedirectResponse.SERIALIZER.serialize((NativeRedirectResponse) obj));
            } catch (HttpException e5) {
                this.this$0.trackNativeRedirectError("Network error");
                this.this$0.emitError(e5);
            } catch (ModelSerializationException e11) {
                this.this$0.trackNativeRedirectError("Serialization error");
                this.this$0.emitError(e11);
            }
            return Unit.f26487a;
        }
    }

    public DefaultRedirectDelegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull GenericComponentParams genericComponentParams, @NotNull RedirectHandler redirectHandler, @NotNull PaymentDataRepository paymentDataRepository, @NotNull NativeRedirectService nativeRedirectService, @Nullable AnalyticsManager analyticsManager) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        genericComponentParams.getClass();
        redirectHandler.getClass();
        paymentDataRepository.getClass();
        nativeRedirectService.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.componentParams = genericComponentParams;
        this.redirectHandler = redirectHandler;
        this.paymentDataRepository = paymentDataRepository;
        this.nativeRedirectService = nativeRedirectService;
        this.analyticsManager = analyticsManager;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.detailsChannel = mVarBufferedChannel;
        this.detailsFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel2;
        this.exceptionFlow = r.w(mVarBufferedChannel2);
        this.viewFlow = r.c(RedirectComponentViewType.INSTANCE);
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void clearState() {
        setAction(null);
    }

    private final ActionComponentData createActionComponentData(JSONObject details) {
        return new ActionComponentData(this.paymentDataRepository.getPaymentData(), details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDetails(JSONObject details) {
        this.detailsChannel.h(createActionComponentData(details));
        clearState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitError(CheckoutException e5) {
        this.exceptionChannel.h(e5);
        clearState();
    }

    private final RedirectAction getAction() {
        return (RedirectAction) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final void handleNativeRedirect(String nativeRedirectData, JSONObject details) {
        f0.B(getCoroutineScope(), null, null, new AnonymousClass1(nativeRedirectData, details, this, null), 3);
    }

    private final void initState(RedirectAction action) {
        boolean zAreEqual = Intrinsics.areEqual(action.getType(), ActionTypes.NATIVE_REDIRECT);
        PaymentDataRepository paymentDataRepository = this.paymentDataRepository;
        if (zAreEqual) {
            paymentDataRepository.setNativeRedirectData(action.getNativeRedirectData());
        } else {
            paymentDataRepository.setPaymentData(action.getPaymentData());
        }
    }

    private final void launchAction(Activity activity, String url) {
        try {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultRedirectDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                companion.getLogger().log(adyenLogLevel, strConcat, "makeRedirect - " + url, null);
            }
            this.redirectHandler.launchUriRedirect(activity, url);
        } catch (CheckoutException e5) {
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            RedirectAction action = getAction();
            String paymentMethodType = action != null ? action.getPaymentMethodType() : null;
            if (paymentMethodType == null) {
                paymentMethodType = "";
            }
            AnalyticsEvent.Error errorError$default = GenericEvents.error$default(genericEvents, paymentMethodType, ErrorEvent.REDIRECT_FAILED, null, null, 12, null);
            AnalyticsManager analyticsManager = this.analyticsManager;
            if (analyticsManager != null) {
                analyticsManager.trackEvent(errorError$default);
            }
            emitError(e5);
        }
    }

    private final void restoreState() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultRedirectDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Restoring state", null);
        }
        RedirectAction action = getAction();
        if (action != null) {
            initState(action);
        }
    }

    private final void setAction(RedirectAction redirectAction) {
        this.action.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], redirectAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackNativeRedirectError(String message) {
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        RedirectAction action = getAction();
        String paymentMethodType = action != null ? action.getPaymentMethodType() : null;
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        AnalyticsEvent.Error errorError$default = GenericEvents.error$default(genericEvents, paymentMethodType, ErrorEvent.API_NATIVE_REDIRECT, null, message, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(errorError$default);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate
    @NotNull
    public i getDetailsFlow() {
        return this.detailsFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.SavedStateHandleContainer
    @NotNull
    public c1 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        if (!(action instanceof RedirectAction)) {
            emitError(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        RedirectAction redirectAction = (RedirectAction) action;
        setAction(redirectAction);
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String paymentMethodType = action.getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        String type = action.getType();
        AnalyticsEvent.Log logAction$default = GenericEvents.action$default(genericEvents, paymentMethodType, type != null ? type : "", null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logAction$default);
        }
        initState(redirectAction);
        launchAction(activity, redirectAction.getUrl());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        try {
            JSONObject redirectResult = this.redirectHandler.parseRedirectResult(intent.getData());
            String nativeRedirectData = this.paymentDataRepository.getNativeRedirectData();
            RedirectAction action = getAction();
            if (Intrinsics.areEqual(action != null ? action.getType() : null, ActionTypes.NATIVE_REDIRECT)) {
                handleNativeRedirect(nativeRedirectData, redirectResult);
            } else {
                emitDetails(redirectResult);
            }
        } catch (CheckoutException e5) {
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            RedirectAction action2 = getAction();
            String paymentMethodType = action2 != null ? action2.getPaymentMethodType() : null;
            if (paymentMethodType == null) {
                paymentMethodType = "";
            }
            AnalyticsEvent.Error errorError$default = GenericEvents.error$default(genericEvents, paymentMethodType, ErrorEvent.REDIRECT_PARSE_FAILED, null, null, 12, null);
            AnalyticsManager analyticsManager = this.analyticsManager;
            if (analyticsManager != null) {
                analyticsManager.trackEvent(errorError$default);
            }
            emitError(e5);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        restoreState();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getDetailsFlow(), getExceptionFlow(), null, lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this.redirectHandler.removeOnRedirectListener();
        this._coroutineScope = null;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException e5) {
        e5.getClass();
        emitError(e5);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.RedirectableDelegate
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.redirectHandler.setOnRedirectListener(listener);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/redirect/internal/ui/DefaultRedirectDelegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$redirect_release$annotations", "RETURN_URL_QUERY_STRING_PARAMETER", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$redirect_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }
}
