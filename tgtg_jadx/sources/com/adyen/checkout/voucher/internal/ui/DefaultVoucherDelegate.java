package com.adyen.checkout.voucher.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import ba0.g;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PermissionRequestData;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.internal.util.DateUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.exception.PermissionRequestException;
import com.adyen.checkout.ui.core.internal.util.ImageSaver;
import com.adyen.checkout.ui.core.internal.util.PdfOpener;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import com.adyen.checkout.voucher.internal.ui.model.VoucherOutputData;
import com.adyen.checkout.voucher.internal.ui.model.VoucherPaymentMethodConfig;
import com.adyen.checkout.voucher.internal.ui.model.VoucherPaymentMethodConfigKt;
import com.adyen.checkout.voucher.internal.ui.model.VoucherStoreAction;
import com.adyen.checkout.voucher.internal.ui.model.VoucherUIEvent;
import com.braze.h2;
import j4.s;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import v80.b0;
import v80.f0;
import w.a0;
import x70.c;
import x80.m;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0001qB9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00105\u001a\u00020\u00132\u0006\u0010 \u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00132\u0006\u0010 \u001a\u0002042\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u00109\u001a\u00020;H\u0002¢\u0006\u0004\b9\u0010<J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010BR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020;0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\b\u0012\u0004\u0012\u00020;0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020=0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010W\u001a\b\u0012\u0004\u0012\u00020=0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010SR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR \u0010[\u001a\b\u0012\u0004\u0012\u00020Y0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010SR\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010NR\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010Q\u001a\u0004\b`\u0010SR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010VR \u0010c\u001a\b\u0012\u0004\u0012\u00020a0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010Q\u001a\u0004\bd\u0010SR\u0018\u0010e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR/\u0010 \u001a\u0004\u0018\u0001042\b\u0010g\u001a\u0004\u0018\u0001048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u00106R\u0014\u0010n\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/DefaultVoucherDelegate;", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/ui/core/internal/util/PdfOpener;", "pdfOpener", "Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;", "imageSaver", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/ui/core/internal/util/PdfOpener;Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "downloadVoucher", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "saveVoucherAsImage", "(Landroid/content/Context;Landroid/view/View;)V", "", "requiredPermission", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "requestPermission", "(Landroid/content/Context;Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;)V", "onCleared", "restoreState", "Lcom/adyen/checkout/components/core/action/VoucherAction;", "initState", "(Lcom/adyen/checkout/components/core/action/VoucherAction;)V", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig;", "config", "createOutputData", "(Lcom/adyen/checkout/components/core/action/VoucherAction;Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig;)V", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "()Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "emitError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "clearState", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/ui/core/internal/util/PdfOpener;", "Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "Ly80/i;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "Lx80/m;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/components/core/internal/PermissionRequestData;", "permissionChannel", "permissionFlow", "getPermissionFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "eventChannel", "eventFlow", "getEventFlow", "_coroutineScope", "Lv80/b0;", "<set-?>", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/VoucherAction;", "setAction", "getOutputData", "outputData", "getCoroutineScope", "()Lv80/b0;", "Companion", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultVoucherDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultVoucherDelegate.kt\ncom/adyen/checkout/voucher/internal/ui/DefaultVoucherDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,239:1\n16#2,17:240\n*S KotlinDebug\n*F\n+ 1 DefaultVoucherDelegate.kt\ncom/adyen/checkout/voucher/internal/ui/DefaultVoucherDelegate\n*L\n89#1:240,17\n*E\n"})
public final class DefaultVoucherDelegate implements VoucherDelegate, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";

    @NotNull
    private static final String IMAGE_NAME_FORMAT = "%s-%s.png";

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty action;

    @Nullable
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final GenericComponentParams componentParams;

    @NotNull
    private final m eventChannel;

    @NotNull
    private final i eventFlow;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final ImageSaver imageSaver;

    @NotNull
    private final ActionObserverRepository observerRepository;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PdfOpener pdfOpener;

    @NotNull
    private final m permissionChannel;

    @NotNull
    private final i permissionFlow;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(DefaultVoucherDelegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/VoucherAction;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.adyen.checkout.voucher.internal.ui.DefaultVoucherDelegate$saveVoucherAsImage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.voucher.internal.ui.DefaultVoucherDelegate$saveVoucherAsImage$1", f = "DefaultVoucherDelegate.kt", l = {194}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageName;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, View view, String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$view = view;
            this.$imageName = str;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultVoucherDelegate.this.new AnonymousClass1(this.$context, this.$view, this.$imageName, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass1 anonymousClass1;
            Object objM126saveImageFromViewbMdYcbs$default;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ImageSaver imageSaver = DefaultVoucherDelegate.this.imageSaver;
                Context context = this.$context;
                DefaultVoucherDelegate defaultVoucherDelegate = DefaultVoucherDelegate.this;
                View view = this.$view;
                String str = this.$imageName;
                this.label = 1;
                anonymousClass1 = this;
                objM126saveImageFromViewbMdYcbs$default = ImageSaver.m126saveImageFromViewbMdYcbs$default(imageSaver, context, defaultVoucherDelegate, view, null, str, null, anonymousClass1, 40, null);
                if (objM126saveImageFromViewbMdYcbs$default == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objM126saveImageFromViewbMdYcbs$default = ((q) obj).f40851a;
                anonymousClass1 = this;
            }
            DefaultVoucherDelegate defaultVoucherDelegate2 = DefaultVoucherDelegate.this;
            Throwable thA = q.a(objM126saveImageFromViewbMdYcbs$default);
            if (thA == null) {
                defaultVoucherDelegate2.eventChannel.h(VoucherUIEvent.Success.INSTANCE);
            } else if (thA instanceof PermissionRequestException) {
                defaultVoucherDelegate2.eventChannel.h(VoucherUIEvent.PermissionDenied.INSTANCE);
            } else {
                defaultVoucherDelegate2.eventChannel.h(new VoucherUIEvent.Failure(thA));
            }
            return Unit.f26487a;
        }
    }

    public DefaultVoucherDelegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull GenericComponentParams genericComponentParams, @NotNull PdfOpener pdfOpener, @NotNull ImageSaver imageSaver, @Nullable AnalyticsManager analyticsManager) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        genericComponentParams.getClass();
        pdfOpener.getClass();
        imageSaver.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.componentParams = genericComponentParams;
        this.pdfOpener = pdfOpener;
        this.imageSaver = imageSaver;
        this.analyticsManager = analyticsManager;
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.permissionChannel = mVarBufferedChannel2;
        this.permissionFlow = r.w(mVarBufferedChannel2);
        a2 a2VarC2 = r.c(null);
        this._viewFlow = a2VarC2;
        this.viewFlow = a2VarC2;
        m mVarBufferedChannel3 = ChannelExtensionsKt.bufferedChannel();
        this.eventChannel = mVarBufferedChannel3;
        this.eventFlow = r.w(mVarBufferedChannel3);
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void clearState() {
        setAction(null);
    }

    private final void createOutputData(VoucherAction action, VoucherPaymentMethodConfig config) {
        String downloadUrl = action.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = action.getUrl();
        }
        ((a2) this._outputDataFlow).j(new VoucherOutputData(true, action.getPaymentMethodType(), config.getIntroductionTextResource(), action.getReference(), action.getTotalAmount(), downloadUrl != null ? new VoucherStoreAction.DownloadPdf(downloadUrl) : VoucherStoreAction.SaveAsImage.INSTANCE, action.getInstructionsUrl(), VoucherPaymentMethodConfigKt.getInformationFields(config, action, getComponentParams().getShopperLocale())));
    }

    private final void emitError(CheckoutException e5) {
        this.exceptionChannel.h(e5);
        clearState();
    }

    private final VoucherAction getAction() {
        return (VoucherAction) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final void initState(VoucherAction action) {
        VoucherPaymentMethodConfig byPaymentMethodType = VoucherPaymentMethodConfig.INSTANCE.getByPaymentMethodType(action.getPaymentMethodType());
        if (byPaymentMethodType == null) {
            emitError(new ComponentException(a0.p("Payment method ", action.getPaymentMethodType(), " not supported for this action"), null, 2, null));
            return;
        }
        ((a2) this._viewFlow).j(byPaymentMethodType.getViewType());
        createOutputData(action, byPaymentMethodType);
    }

    private final void restoreState() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultVoucherDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Restoring state", null);
        }
        VoucherAction action = getAction();
        if (action != null) {
            initState(action);
        }
    }

    private final void setAction(VoucherAction voucherAction) {
        this.action.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], voucherAction);
    }

    @Override // com.adyen.checkout.voucher.internal.ui.VoucherDelegate
    public void downloadVoucher(@NotNull Context context) {
        String downloadUrl;
        context.getClass();
        VoucherStoreAction storeAction = getOutputData().getStoreAction();
        VoucherStoreAction.DownloadPdf downloadPdf = storeAction instanceof VoucherStoreAction.DownloadPdf ? (VoucherStoreAction.DownloadPdf) storeAction : null;
        if (downloadPdf == null || (downloadUrl = downloadPdf.getDownloadUrl()) == null) {
            downloadUrl = "";
        }
        try {
            this.pdfOpener.open(context, downloadUrl);
        } catch (IllegalStateException e5) {
            String message = e5.getMessage();
            emitError(new ComponentException(message != null ? message : "", e5.getCause()));
        }
    }

    @Override // com.adyen.checkout.voucher.internal.ui.VoucherDelegate
    @NotNull
    public i getEventFlow() {
        return this.eventFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public VoucherOutputData getOutputData() {
        return (VoucherOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PermissionRequestingDelegate
    @NotNull
    public i getPermissionFlow() {
        return this.permissionFlow;
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
        if (!(action instanceof VoucherAction)) {
            emitError(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        VoucherAction voucherAction = (VoucherAction) action;
        setAction(voucherAction);
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
        initState(voucherAction);
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
        this.observerRepository.addObservers(null, getExceptionFlow(), getPermissionFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this._coroutineScope = null;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException checkoutException) {
        VoucherDelegate.DefaultImpls.onError(this, checkoutException);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.core.internal.ui.PermissionHandler
    public void requestPermission(@NotNull Context context, @NotNull String requiredPermission, @NotNull PermissionHandlerCallback callback) {
        context.getClass();
        requiredPermission.getClass();
        callback.getClass();
        this.permissionChannel.h(new PermissionRequestData(requiredPermission, callback));
    }

    @Override // com.adyen.checkout.voucher.internal.ui.VoucherDelegate
    public void saveVoucherAsImage(@NotNull Context context, @NotNull View view) {
        context.getClass();
        view.getClass();
        String paymentMethodType = getOutputData().getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        DateUtils dateUtils = DateUtils.INSTANCE;
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        String dateToString$default = DateUtils.formatDateToString$default(dateUtils, calendar, null, 2, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        f0.B(getCoroutineScope(), null, null, new AnonymousClass1(context, view, String.format(IMAGE_NAME_FORMAT, Arrays.copyOf(new Object[]{paymentMethodType, dateToString$default}, 2)), null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/DefaultVoucherDelegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$voucher_release$annotations", "IMAGE_NAME_FORMAT", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$voucher_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    private final VoucherOutputData createOutputData() {
        return new VoucherOutputData(false, null, null, null, null, null, null, null);
    }
}
