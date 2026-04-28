package com.adyen.checkout.action.core.internal.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import ba0.g;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PermissionRequestData;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate;
import com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate;
import com.adyen.checkout.components.core.internal.ui.PermissionRequestingDelegate;
import com.adyen.checkout.components.core.internal.ui.RedirectableDelegate;
import com.adyen.checkout.components.core.internal.ui.StatusPollingDelegate;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.internal.util.LifecycleExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import com.braze.h2;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
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
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001oB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00104\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b=\u00109J\u0017\u0010>\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b>\u00109J\u0017\u0010?\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b?\u00109J\u0017\u0010@\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b@\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR\u0018\u0010K\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b]\u0010UR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020*0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010[R \u0010_\u001a\b\u0012\u0004\u0012\u00020*0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010S\u001a\u0004\b`\u0010UR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010[R \u0010c\u001a\b\u0012\u0004\u0012\u00020a0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010S\u001a\u0004\bd\u0010UR\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010 \u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u00107\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ui/DefaultGenericActionDelegate;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/action/core/internal/ui/ActionDelegateProvider;", "actionDelegateProvider", "Landroid/app/Application;", "application", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/action/core/internal/ui/ActionDelegateProvider;Landroid/app/Application;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "refreshStatus", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "onError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "restoreState", "createDelegateAndObserve", "(Lcom/adyen/checkout/components/core/action/Action;)V", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "delegate", "observeDelegate", "(Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;)V", "", "isOld3DS2Flow", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "observeDetails", "observeExceptions", "observePermissionRequests", "observeViewFlow", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/action/core/internal/ui/ActionDelegateProvider;", "Landroid/app/Application;", "_delegate", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "Ly80/f1;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "Ly80/f1;", "Ly80/i;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "_coroutineScope", "Lv80/b0;", "Lx80/m;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "detailsChannel", "Lx80/m;", "detailsFlow", "getDetailsFlow", "exceptionChannel", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/components/core/internal/PermissionRequestData;", "permissionChannel", "permissionFlow", "getPermissionFlow", "onRedirectListener", "Lkotlin/jvm/functions/Function0;", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "getCoroutineScope", "()Lv80/b0;", "Companion", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultGenericActionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultGenericActionDelegate.kt\ncom/adyen/checkout/action/core/internal/ui/DefaultGenericActionDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n*L\n1#1,246:1\n16#2,17:247\n16#2,17:264\n16#2,17:281\n16#2,17:298\n44#2,4:320\n16#2,17:329\n16#2,17:346\n16#2,17:363\n16#2,17:380\n16#2,17:397\n16#2,17:414\n16#2,17:431\n1#3:315\n16#4,4:316\n20#4,5:324\n*S KotlinDebug\n*F\n+ 1 DefaultGenericActionDelegate.kt\ncom/adyen/checkout/action/core/internal/ui/DefaultGenericActionDelegate\n*L\n84#1:247,17\n90#1:264,17\n125#1:281,17\n141#1:298,17\n161#1:320,4\n166#1:329,17\n173#1:346,17\n181#1:363,17\n189#1:380,17\n206#1:397,17\n215#1:414,17\n233#1:431,17\n161#1:316,4\n161#1:324,5\n*E\n"})
public final class DefaultGenericActionDelegate implements GenericActionDelegate, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";

    @Nullable
    private b0 _coroutineScope;

    @Nullable
    private ActionDelegate _delegate;

    @NotNull
    private final f1 _viewFlow;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty action;

    @NotNull
    private final ActionDelegateProvider actionDelegateProvider;

    @NotNull
    private final Application application;

    @NotNull
    private final CheckoutConfiguration checkoutConfiguration;

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
    private final ActionObserverRepository observerRepository;

    @Nullable
    private Function0<Unit> onRedirectListener;

    @NotNull
    private final m permissionChannel;

    @NotNull
    private final i permissionFlow;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DefaultGenericActionDelegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/Action;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeDetails$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeDetails$2", f = "DefaultGenericActionDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/components/core/ActionComponentData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends z70.i implements Function2<ActionComponentData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = DefaultGenericActionDelegate.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ActionComponentData actionComponentData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(actionComponentData, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultGenericActionDelegate.this.detailsChannel.h((ActionComponentData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeExceptions$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeExceptions$2", f = "DefaultGenericActionDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/core/exception/CheckoutException;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00612 extends z70.i implements Function2<CheckoutException, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00612(c<? super C00612> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00612 c00612 = DefaultGenericActionDelegate.this.new C00612(cVar);
            c00612.L$0 = obj;
            return c00612;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CheckoutException checkoutException, @Nullable c<? super Unit> cVar) {
            return ((C00612) create(checkoutException, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultGenericActionDelegate.this.exceptionChannel.h((CheckoutException) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observePermissionRequests$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observePermissionRequests$2", f = "DefaultGenericActionDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/components/core/internal/PermissionRequestData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00622 extends z70.i implements Function2<PermissionRequestData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00622(c<? super C00622> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00622 c00622 = DefaultGenericActionDelegate.this.new C00622(cVar);
            c00622.L$0 = obj;
            return c00622;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PermissionRequestData permissionRequestData, @Nullable c<? super Unit> cVar) {
            return ((C00622) create(permissionRequestData, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultGenericActionDelegate.this.permissionChannel.h((PermissionRequestData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeViewFlow$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate$observeViewFlow$2", f = "DefaultGenericActionDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00632 extends z70.i implements Function2<ComponentViewType, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00632(c<? super C00632> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00632 c00632 = DefaultGenericActionDelegate.this.new C00632(cVar);
            c00632.L$0 = obj;
            return c00632;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable ComponentViewType componentViewType, @Nullable c<? super Unit> cVar) {
            return ((C00632) create(componentViewType, cVar)).invokeSuspend(Unit.f26487a);
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
            ((a2) DefaultGenericActionDelegate.this._viewFlow).j((ComponentViewType) this.L$0);
            return Unit.f26487a;
        }
    }

    public DefaultGenericActionDelegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull GenericComponentParams genericComponentParams, @NotNull ActionDelegateProvider actionDelegateProvider, @NotNull Application application) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        checkoutConfiguration.getClass();
        genericComponentParams.getClass();
        actionDelegateProvider.getClass();
        application.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.checkoutConfiguration = checkoutConfiguration;
        this.componentParams = genericComponentParams;
        this.actionDelegateProvider = actionDelegateProvider;
        this.application = application;
        a2 a2VarC = r.c(null);
        this._viewFlow = a2VarC;
        this.viewFlow = a2VarC;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.detailsChannel = mVarBufferedChannel;
        this.detailsFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel2;
        this.exceptionFlow = r.w(mVarBufferedChannel2);
        m mVarBufferedChannel3 = ChannelExtensionsKt.bufferedChannel();
        this.permissionChannel = mVarBufferedChannel3;
        this.permissionFlow = r.w(mVarBufferedChannel3);
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void createDelegateAndObserve(Action action) {
        Function0<Unit> function0;
        ActionDelegate delegate = this.actionDelegateProvider.getDelegate(action, this.checkoutConfiguration, getSavedStateHandle(), this.application);
        this._delegate = delegate;
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("Created delegate of type ", Reflection.getOrCreateKotlinClass(delegate.getClass()).getSimpleName()), null);
        }
        if ((delegate instanceof RedirectableDelegate) && (function0 = this.onRedirectListener) != null) {
            ((RedirectableDelegate) delegate).setOnRedirectListener(function0);
        }
        delegate.initialize(getCoroutineScope());
        observeDelegate(delegate);
    }

    private final Action getAction() {
        return (Action) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[PHI: r3 r4 r7
      0x0029: PHI (r3v1 com.adyen.checkout.core.AdyenLogLevel) = (r3v0 com.adyen.checkout.core.AdyenLogLevel), (r3v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:16:0x0027, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r4v1 com.adyen.checkout.core.AdyenLogger$Companion) = (r4v0 com.adyen.checkout.core.AdyenLogger$Companion), (r4v3 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:16:0x0027, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r7v2 'e' java.lang.Throwable) = (r7v1 'e' java.lang.Throwable), (r7v4 'e' java.lang.Throwable) binds: [B:16:0x0027, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isOld3DS2Flow(com.adyen.checkout.components.core.action.Action r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Class not found. Are you missing a dependency?"
            java.lang.String r1 = "CO.runCompileOnly"
            r2 = 0
            com.adyen.checkout.components.core.internal.ui.ActionDelegate r3 = r6._delegate     // Catch: java.lang.NoClassDefFoundError -> L11 java.lang.ClassNotFoundException -> L13
            boolean r3 = r3 instanceof com.adyen.checkout.adyen3ds2.internal.ui.Adyen3DS2Delegate     // Catch: java.lang.NoClassDefFoundError -> L11 java.lang.ClassNotFoundException -> L13
            if (r3 == 0) goto L15
            boolean r7 = r7 instanceof com.adyen.checkout.components.core.action.Threeds2ChallengeAction     // Catch: java.lang.NoClassDefFoundError -> L11 java.lang.ClassNotFoundException -> L13
            if (r7 == 0) goto L15
            r7 = 1
            goto L16
        L11:
            r7 = move-exception
            goto L1b
        L13:
            r7 = move-exception
            goto L31
        L15:
            r7 = r2
        L16:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.NoClassDefFoundError -> L11 java.lang.ClassNotFoundException -> L13
            goto L41
        L1b:
            com.adyen.checkout.core.AdyenLogLevel r3 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r5 = r4.getLogger()
            boolean r5 = r5.shouldLog(r3)
            if (r5 == 0) goto L40
        L29:
            com.adyen.checkout.core.AdyenLogger r4 = r4.getLogger()
            r4.log(r3, r1, r0, r7)
            goto L40
        L31:
            com.adyen.checkout.core.AdyenLogLevel r3 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r5 = r4.getLogger()
            boolean r5 = r5.shouldLog(r3)
            if (r5 == 0) goto L40
            goto L29
        L40:
            r7 = 0
        L41:
            if (r7 == 0) goto L47
            boolean r2 = r7.booleanValue()
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate.isOld3DS2Flow(com.adyen.checkout.components.core.action.Action):boolean");
    }

    private final void observeDelegate(ActionDelegate delegate) {
        observeDetails(delegate);
        observeExceptions(delegate);
        observePermissionRequests(delegate);
        observeViewFlow(delegate);
    }

    private final void observeDetails(ActionDelegate delegate) {
        if (delegate instanceof DetailsEmittingDelegate) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGenericActionDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Observing details", null);
            }
            r.u(getCoroutineScope(), new w(((DetailsEmittingDelegate) delegate).getDetailsFlow(), new AnonymousClass2(null), 5));
        }
    }

    private final void observeExceptions(ActionDelegate delegate) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Observing exceptions", null);
        }
        r.u(getCoroutineScope(), new w(delegate.getExceptionFlow(), new C00612(null), 5));
    }

    private final void observePermissionRequests(ActionDelegate delegate) {
        if (delegate instanceof PermissionRequestingDelegate) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGenericActionDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Observing permission requests", null);
            }
            r.u(getCoroutineScope(), new w(((PermissionRequestingDelegate) delegate).getPermissionFlow(), new C00622(null), 5));
        }
    }

    private final void observeViewFlow(ActionDelegate delegate) {
        if (delegate instanceof ViewProvidingDelegate) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGenericActionDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Observing view flow", null);
            }
            r.u(getCoroutineScope(), new w(((ViewProvidingDelegate) delegate).getViewFlow(), new C00632(null), 5));
        }
    }

    private final void restoreState() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Restoring state", null);
        }
        Action action = getAction();
        if (this._delegate != null || action == null) {
            return;
        }
        createDelegateAndObserve(action);
    }

    @Override // com.adyen.checkout.action.core.internal.ui.GenericActionDelegate
    @NotNull
    public ActionDelegate getDelegate() {
        ActionDelegate actionDelegate = this._delegate;
        if (actionDelegate != null) {
            return actionDelegate;
        }
        i4.a.f("Required value was null.");
        return null;
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
        if (isOld3DS2Flow(action)) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGenericActionDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Continuing the handling of 3ds2 challenge with old flow.", null);
            }
        } else {
            createDelegateAndObserve(action);
        }
        getDelegate().handleAction(action, activity);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        ActionDelegate actionDelegate = this._delegate;
        if (actionDelegate == null) {
            this.exceptionChannel.h(new ComponentException("handleIntent should not be called before handleAction", null, 2, null));
            return;
        }
        if (!(actionDelegate instanceof IntentHandlingDelegate)) {
            this.exceptionChannel.h(new ComponentException("Cannot handle intent with the current component", null, 2, null));
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Handling intent", null);
        }
        ((IntentHandlingDelegate) actionDelegate).handleIntent(intent);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "initialize", null);
        }
        this._coroutineScope = coroutineScope;
        restoreState();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getDetailsFlow(), getExceptionFlow(), getPermissionFlow(), lifecycleOwner, coroutineScope, callback);
        LifecycleExtensionsKt.repeatOnResume(lifecycleOwner, new Function0<Unit>() { // from class: com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate.observe.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m70invoke();
                return Unit.f26487a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
                DefaultGenericActionDelegate.this.refreshStatus();
            }
        });
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGenericActionDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        removeObserver();
        ActionDelegate actionDelegate = this._delegate;
        if (actionDelegate != null) {
            actionDelegate.onCleared();
        }
        this._delegate = null;
        this._coroutineScope = null;
        this.onRedirectListener = null;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException e5) {
        e5.getClass();
        getDelegate().onError(e5);
    }

    @Override // com.adyen.checkout.action.core.internal.ui.GenericActionDelegate
    public void refreshStatus() {
        ActionDelegate actionDelegate = this._delegate;
        if (actionDelegate instanceof StatusPollingDelegate) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGenericActionDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Refreshing status", null);
            }
            ((StatusPollingDelegate) actionDelegate).refreshStatus();
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.action.core.internal.ui.GenericActionDelegate
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        ActionDelegate actionDelegate = this._delegate;
        if (actionDelegate != null && (actionDelegate instanceof RedirectableDelegate)) {
            ((RedirectableDelegate) actionDelegate).setOnRedirectListener(listener);
        }
        this.onRedirectListener = listener;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ui/DefaultGenericActionDelegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$action_core_release$annotations", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$action_core_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }
}
