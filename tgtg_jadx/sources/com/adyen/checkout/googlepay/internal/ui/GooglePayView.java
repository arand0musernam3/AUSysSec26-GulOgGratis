package com.adyen.checkout.googlepay.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ba0.g;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.googlepay.databinding.ViewGooglePayBinding;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayOutputData;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.view.ProcessingPaymentView;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'¨\u0006("}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/GooglePayView;", "Landroid/widget/FrameLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/view/LayoutInflater;Landroid/util/AttributeSet;I)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "delegate", "", "initializeFragment", "(Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;)V", "Lv80/b0;", "coroutineScope", "observeDelegate", "(Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "outputData", "outputDataChanged", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "localizedContext", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/googlepay/databinding/ViewGooglePayBinding;", "binding", "Lcom/adyen/checkout/googlepay/databinding/ViewGooglePayBinding;", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayView.kt\ncom/adyen/checkout/googlepay/internal/ui/GooglePayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n1#2:71\n256#3,2:72\n*S KotlinDebug\n*F\n+ 1 GooglePayView.kt\ncom/adyen/checkout/googlepay/internal/ui/GooglePayView\n*L\n63#1:72,2\n*E\n"})
public final class GooglePayView extends FrameLayout implements ComponentView {

    @NotNull
    private ViewGooglePayBinding binding;

    @Nullable
    private GooglePayDelegate delegate;

    /* JADX INFO: renamed from: com.adyen.checkout.googlepay.internal.ui.GooglePayView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.googlepay.internal.ui.GooglePayView$observeDelegate$1", f = "GooglePayView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<GooglePayOutputData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = GooglePayView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull GooglePayOutputData googlePayOutputData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(googlePayOutputData, cVar)).invokeSuspend(Unit.f26487a);
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
            GooglePayView.this.outputDataChanged((GooglePayOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayView(@NotNull LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet, int i11) {
        super(layoutInflater.getContext(), attributeSet, i11);
        layoutInflater.getClass();
        ViewGooglePayBinding viewGooglePayBindingInflate = ViewGooglePayBinding.inflate(layoutInflater, this);
        viewGooglePayBindingInflate.getClass();
        this.binding = viewGooglePayBindingInflate;
    }

    private final void initializeFragment(GooglePayDelegate delegate) {
        GooglePayFragment googlePayFragment = (GooglePayFragment) this.binding.fragmentContainer.getFragment();
        if (googlePayFragment != null) {
            googlePayFragment.initialize(delegate);
        }
    }

    private final void observeDelegate(GooglePayDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(GooglePayOutputData outputData) {
        ProcessingPaymentView processingPaymentView = this.binding.processingPaymentView;
        processingPaymentView.getClass();
        processingPaymentView.setVisibility(outputData.isLoading() ? 0 : 8);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof GooglePayDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        GooglePayDelegate googlePayDelegate = (GooglePayDelegate) delegate;
        this.delegate = googlePayDelegate;
        initializeFragment(googlePayDelegate);
        observeDelegate(googlePayDelegate, coroutineScope);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayView(@NotNull LayoutInflater layoutInflater) {
        this(layoutInflater, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        layoutInflater.getClass();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void highlightValidationErrors() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayView(@NotNull LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet) {
        this(layoutInflater, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        layoutInflater.getClass();
    }

    public /* synthetic */ GooglePayView(LayoutInflater layoutInflater, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        context.getClass();
    }

    public /* synthetic */ GooglePayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GooglePayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this(layoutInflaterFrom, attributeSet, i11);
    }
}
