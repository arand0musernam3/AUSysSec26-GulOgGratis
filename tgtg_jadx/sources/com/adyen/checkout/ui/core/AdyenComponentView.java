package com.adyen.checkout.ui.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l;
import androidx.lifecycle.m1;
import ax.s;
import ba0.g;
import com.adyen.checkout.components.core.internal.Component;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.components.core.internal.util.ContextExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.databinding.AdyenComponentViewBinding;
import com.adyen.checkout.ui.core.internal.ui.AmountButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonViewProvider;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.PaymentComponentUIEvent;
import com.adyen.checkout.ui.core.internal.ui.PaymentComponentUIState;
import com.adyen.checkout.ui.core.internal.ui.UIStateDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import com.adyen.checkout.ui.core.internal.ui.view.PayButton;
import com.adyen.checkout.ui.core.internal.util.PayButtonFormatter;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import h7.z0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import y70.a;
import y80.r;
import y80.w;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u0012*\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010&\u001a\u00020\u0012\"\f\b\u0000\u0010\"*\u00020 *\u00020!2\u0006\u0010#\u001a\u00028\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/adyen/checkout/ui/core/AdyenComponentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewType", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "componentParams", "Lv80/b0;", "coroutineScope", "", "loadView", "(Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;Lv80/b0;)V", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lcom/adyen/checkout/ui/core/internal/ui/view/PayButton;", "localizedContext", "setText", "(Lcom/adyen/checkout/ui/core/internal/ui/view/PayButton;Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;Landroid/content/Context;)V", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/Component;", "T", "component", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "attach", "(Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;Landroidx/lifecycle/LifecycleOwner;)V", "highlightValidationErrors", "()V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/adyen/checkout/ui/core/databinding/AdyenComponentViewBinding;", "binding", "Lcom/adyen/checkout/ui/core/databinding/AdyenComponentViewBinding;", "Z", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "componentView", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Ljava/lang/ref/WeakReference;", "attachedComponent", "Ljava/lang/ref/WeakReference;", "currentViewType", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdyenComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdyenComponentView.kt\ncom/adyen/checkout/ui/core/AdyenComponentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,232:1\n256#2,2:233\n256#2,2:235\n256#2,2:237\n256#2,2:239\n1317#3,2:241\n*S KotlinDebug\n*F\n+ 1 AdyenComponentView.kt\ncom/adyen/checkout/ui/core/AdyenComponentView\n*L\n76#1:233,2\n124#1:235,2\n156#1:237,2\n166#1:239,2\n185#1:241,2\n*E\n"})
public final class AdyenComponentView extends LinearLayout {

    @NotNull
    private WeakReference<Component> attachedComponent;

    @NotNull
    private final AdyenComponentViewBinding binding;

    @Nullable
    private ComponentView componentView;

    @Nullable
    private ComponentViewType currentViewType;
    private volatile boolean isInteractionBlocked;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.AdyenComponentView$attach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.AdyenComponentView$attach$1", f = "AdyenComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/Component;", "componentViewType", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAdyenComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdyenComponentView.kt\ncom/adyen/checkout/ui/core/AdyenComponentView$attach$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,232:1\n16#2,17:233\n16#2,17:250\n16#2,17:267\n*S KotlinDebug\n*F\n+ 1 AdyenComponentView.kt\ncom/adyen/checkout/ui/core/AdyenComponentView$attach$1\n*L\n97#1:233,17\n105#1:250,17\n111#1:267,17\n*E\n"})
    public static final class AnonymousClass1 extends i implements Function2<ComponentViewType, c<? super Unit>, Object> {

        /* JADX INFO: Incorrect field signature: TT; */
        final /* synthetic */ ViewableComponent $component;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/adyen/checkout/ui/core/AdyenComponentView;TT;Landroidx/lifecycle/LifecycleOwner;Lx70/c<-Lcom/adyen/checkout/ui/core/AdyenComponentView$attach$1;>;)V */
        public AnonymousClass1(ViewableComponent viewableComponent, LifecycleOwner lifecycleOwner, c cVar) {
            super(2, cVar);
            this.$component = viewableComponent;
            this.$lifecycleOwner = lifecycleOwner;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = AdyenComponentView.this.new AnonymousClass1(this.$component, this.$lifecycleOwner, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable ComponentViewType componentViewType, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(componentViewType, cVar)).invokeSuspend(Unit.f26487a);
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
            ComponentViewType componentViewType = (ComponentViewType) this.L$0;
            boolean zAreEqual = Intrinsics.areEqual(AdyenComponentView.this.currentViewType, componentViewType);
            AdyenComponentView adyenComponentView = AdyenComponentView.this;
            if (zAreEqual) {
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = adyenComponentView.getClass().getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Same component view type emitted, skipping view recreation.", null);
                }
                return Unit.f26487a;
            }
            adyenComponentView.currentViewType = componentViewType;
            AdyenComponentView.this.binding.frameLayoutComponentContainer.removeAllViews();
            if (componentViewType == null) {
                AdyenComponentView adyenComponentView2 = AdyenComponentView.this;
                AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.INFO;
                AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
                if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                    String name2 = adyenComponentView2.getClass().getName();
                    String strY2 = StringsKt.Y(name2, '$');
                    String strW2 = StringsKt.W('.', strY2, strY2);
                    if (strW2.length() != 0) {
                        name2 = StringsKt.O(strW2, "Kt");
                    }
                    companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Component view type is null, ignoring.", null);
                }
                return Unit.f26487a;
            }
            ComponentDelegate delegate = ((Component) this.$component).getDelegate();
            boolean z11 = delegate instanceof ViewProvidingDelegate;
            AdyenComponentView adyenComponentView3 = AdyenComponentView.this;
            if (z11) {
                adyenComponentView3.loadView(componentViewType, delegate, delegate.getComponentParams(), m1.c(this.$lifecycleOwner));
                return Unit.f26487a;
            }
            AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.INFO;
            AdyenLogger.Companion companion3 = AdyenLogger.INSTANCE;
            if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
                String name3 = adyenComponentView3.getClass().getName();
                String strY3 = StringsKt.Y(name3, '$');
                String strW3 = StringsKt.W('.', strY3, strY3);
                if (strW3.length() != 0) {
                    name3 = StringsKt.O(strW3, "Kt");
                }
                companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name3), "View attached to non viewable component, ignoring.", null);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.AdyenComponentView$loadView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.AdyenComponentView$loadView$1", f = "AdyenComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01361 extends i implements Function2<PaymentComponentUIState, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C01361(c<? super C01361> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C01361 c01361 = AdyenComponentView.this.new C01361(cVar);
            c01361.L$0 = obj;
            return c01361;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PaymentComponentUIState paymentComponentUIState, @Nullable c<? super Unit> cVar) {
            return ((C01361) create(paymentComponentUIState, cVar)).invokeSuspend(Unit.f26487a);
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
            AdyenComponentView.this.setInteractionBlocked(((PaymentComponentUIState) this.L$0).isInteractionBlocked());
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.AdyenComponentView$loadView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.AdyenComponentView$loadView$2", f = "AdyenComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<PaymentComponentUIEvent, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AdyenComponentView.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PaymentComponentUIEvent paymentComponentUIEvent, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(paymentComponentUIEvent, cVar)).invokeSuspend(Unit.f26487a);
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
            PaymentComponentUIEvent paymentComponentUIEvent = (PaymentComponentUIEvent) this.L$0;
            if (Intrinsics.areEqual(paymentComponentUIEvent, PaymentComponentUIEvent.InvalidUI.INSTANCE)) {
                AdyenComponentView.this.highlightValidationErrors();
            } else if (Intrinsics.areEqual(paymentComponentUIEvent, PaymentComponentUIEvent.HideKeyboard.INSTANCE)) {
                ViewExtensionsKt.hideKeyboard(AdyenComponentView.this);
            }
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        AdyenComponentViewBinding adyenComponentViewBindingInflate = AdyenComponentViewBinding.inflate(LayoutInflater.from(context), this);
        adyenComponentViewBindingInflate.getClass();
        this.binding = adyenComponentViewBindingInflate;
        this.attachedComponent = new WeakReference<>(null);
        setVisibility(isInEditMode() ? 0 : 8);
        setOrientation(1);
    }

    private final LayoutInflater getLayoutInflater() {
        try {
            LayoutInflater layoutInflater = cg.o(this).getLayoutInflater();
            layoutInflater.getClass();
            return layoutInflater;
        } catch (IllegalStateException unused) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadView(ComponentViewType viewType, ComponentDelegate delegate, ComponentParams componentParams, b0 coroutineScope) {
        y80.i uiEventFlow;
        y80.i uiStateFlow;
        ComponentView view = viewType.getViewProvider().getView(viewType, getLayoutInflater());
        this.componentView = view;
        Context context = getContext();
        context.getClass();
        Context contextCreateLocalizedContext = ContextExtensionsKt.createLocalizedContext(context, componentParams.getShopperLocale());
        this.binding.frameLayoutComponentContainer.addView(view.getView());
        view.initView(delegate, coroutineScope, contextCreateLocalizedContext);
        ButtonDelegate buttonDelegate = delegate instanceof ButtonDelegate ? (ButtonDelegate) delegate : null;
        if (buttonDelegate == null || !buttonDelegate.isConfirmationRequired()) {
            FrameLayout frameLayout = this.binding.frameLayoutButtonContainer;
            frameLayout.getClass();
            frameLayout.setVisibility(8);
            return;
        }
        UIStateDelegate uIStateDelegate = delegate instanceof UIStateDelegate ? (UIStateDelegate) delegate : null;
        if (uIStateDelegate != null && (uiStateFlow = uIStateDelegate.getUiStateFlow()) != null) {
            r.u(coroutineScope, new w(uiStateFlow, new C01361(null), 5));
        }
        if (uIStateDelegate != null && (uiEventFlow = uIStateDelegate.getUiEventFlow()) != null) {
            r.u(coroutineScope, new w(uiEventFlow, new AnonymousClass2(null), 5));
        }
        FrameLayout frameLayout2 = this.binding.frameLayoutButtonContainer;
        frameLayout2.getClass();
        frameLayout2.setVisibility(buttonDelegate.shouldShowSubmitButton() ? 0 : 8);
        ButtonViewProvider buttonViewProvider = ((ButtonComponentViewType) viewType).getButtonViewProvider();
        Context context2 = getContext();
        context2.getClass();
        PayButton button = buttonViewProvider.getButton(context2);
        button.initialize(buttonDelegate, coroutineScope);
        setText(button, viewType, componentParams, contextCreateLocalizedContext);
        button.setOnClickListener(new s(buttonDelegate, 10));
        this.binding.frameLayoutButtonContainer.addView(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInteractionBlocked(boolean isInteractionBlocked) {
        this.isInteractionBlocked = isInteractionBlocked;
        FrameLayout frameLayout = this.binding.frameLayoutButtonContainer;
        frameLayout.getClass();
        Iterator it = new z0(frameLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(!isInteractionBlocked);
        }
        if (isInteractionBlocked) {
            ViewExtensionsKt.resetFocus(this);
            ViewExtensionsKt.hideKeyboard(this);
        }
    }

    private final void setText(PayButton payButton, ComponentViewType componentViewType, ComponentParams componentParams, Context context) {
        payButton.setText(componentViewType instanceof AmountButtonComponentViewType ? PayButtonFormatter.getPayButtonText$default(PayButtonFormatter.INSTANCE, componentParams.getAmount(), componentParams.getShopperLocale(), context, ((AmountButtonComponentViewType) componentViewType).getButtonTextResId(), 0, 0, 48, null) : componentViewType instanceof ButtonComponentViewType ? context.getString(((ButtonComponentViewType) componentViewType).getButtonTextResId()) : null);
    }

    public final <T extends ViewableComponent & Component> void attach(@NotNull T component, @NotNull LifecycleOwner lifecycleOwner) {
        component.getClass();
        lifecycleOwner.getClass();
        if (Intrinsics.areEqual(component, this.attachedComponent.get())) {
            return;
        }
        this.attachedComponent = new WeakReference<>(component);
        w wVar = new w(component.getViewFlow(), new AnonymousClass1(component, lifecycleOwner, null), 5);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        lifecycle.getClass();
        state.getClass();
        r.u(m1.c(lifecycleOwner), r.f(new l(lifecycle, state, wVar, null)));
        setVisibility(0);
    }

    public final void highlightValidationErrors() {
        ComponentView componentView = this.componentView;
        if (componentView != null) {
            componentView.highlightValidationErrors();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        if (this.isInteractionBlocked) {
            return true;
        }
        return super.onInterceptTouchEvent(ev2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AdyenComponentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
