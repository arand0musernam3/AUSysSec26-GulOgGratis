package com.adyen.checkout.voucher.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba0.g;
import bg.n0;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.adyen.checkout.voucher.databinding.SimpleVoucherViewBinding;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import com.adyen.checkout.voucher.internal.ui.model.VoucherOutputData;
import com.braze.h2;
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
import y80.r;
import y80.w;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010.¨\u0006/"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/SimpleVoucherView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "observeDelegate", "(Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "outputData", "outputDataChanged", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;)V", "", Action.PAYMENT_METHOD_TYPE, "loadLogo", "(Ljava/lang/String;)V", "introductionTextResource", "updateIntroductionText", "(Ljava/lang/Integer;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/voucher/databinding/SimpleVoucherViewBinding;", "binding", "Lcom/adyen/checkout/voucher/databinding/SimpleVoucherViewBinding;", "getBinding", "()Lcom/adyen/checkout/voucher/databinding/SimpleVoucherViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimpleVoucherView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleVoucherView.kt\ncom/adyen/checkout/voucher/internal/ui/view/SimpleVoucherView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,110:1\n1#2:111\n16#3,17:112\n*S KotlinDebug\n*F\n+ 1 SimpleVoucherView.kt\ncom/adyen/checkout/voucher/internal/ui/view/SimpleVoucherView\n*L\n84#1:112,17\n*E\n"})
public class SimpleVoucherView extends LinearLayout implements ComponentView {

    @NotNull
    private final SimpleVoucherViewBinding binding;
    private VoucherDelegate delegate;
    private Context localizedContext;

    /* JADX INFO: renamed from: com.adyen.checkout.voucher.internal.ui.view.SimpleVoucherView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.voucher.internal.ui.view.SimpleVoucherView$observeDelegate$1", f = "SimpleVoucherView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<VoucherOutputData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = SimpleVoucherView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull VoucherOutputData voucherOutputData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(voucherOutputData, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SimpleVoucherView.this.outputDataChanged((VoucherOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        SimpleVoucherViewBinding simpleVoucherViewBindingInflate = SimpleVoucherViewBinding.inflate(LayoutInflater.from(context), this);
        simpleVoucherViewBindingInflate.getClass();
        this.binding = simpleVoucherViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, dimension);
    }

    private final void initLocalizedStrings(Context localizedContext) {
        TextView textView = this.binding.textViewDownload;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, com.adyen.checkout.voucher.R.style.AdyenCheckout_Voucher_DownloadTextAppearance, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ComponentDelegate componentDelegate, SimpleVoucherView simpleVoucherView, View view) {
        componentDelegate.getClass();
        simpleVoucherView.getClass();
        Context context = simpleVoucherView.getContext();
        context.getClass();
        ((VoucherDelegate) componentDelegate).downloadVoucher(context);
    }

    private final void loadLogo(String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        ImageView imageView = this.binding.imageViewLogo;
        imageView.getClass();
        VoucherDelegate voucherDelegate = this.delegate;
        if (voucherDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            voucherDelegate = null;
        }
        ImageLoadingExtensionsKt.loadLogo$default(imageView, voucherDelegate.getComponentParams().getEnvironment(), paymentMethodType, null, LogoSize.MEDIUM, null, 0, 0, 116, null);
    }

    private final void observeDelegate(VoucherDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(VoucherOutputData outputData) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "outputDataChanged", null);
        }
        loadLogo(outputData.getPaymentMethodType());
        updateIntroductionText(outputData.getIntroductionTextResource());
    }

    private final void updateIntroductionText(Integer introductionTextResource) {
        if (introductionTextResource == null) {
            return;
        }
        TextView textView = this.binding.textViewDescription;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        textView.setText(context.getString(introductionTextResource.intValue()));
    }

    @NotNull
    public final SimpleVoucherViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof VoucherDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        VoucherDelegate voucherDelegate = (VoucherDelegate) delegate;
        this.delegate = voucherDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        observeDelegate(voucherDelegate, coroutineScope);
        this.binding.textViewDownload.setOnClickListener(new n0(11, voucherDelegate, this));
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
    public SimpleVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ SimpleVoucherView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleVoucherView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
