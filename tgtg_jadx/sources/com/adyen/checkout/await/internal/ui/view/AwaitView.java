package com.adyen.checkout.await.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba0.g;
import com.adyen.checkout.await.databinding.AwaitViewBinding;
import com.adyen.checkout.await.internal.ui.AwaitDelegate;
import com.adyen.checkout.await.internal.ui.model.AwaitOutputData;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import e0.f;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006-"}, d2 = {"Lcom/adyen/checkout/await/internal/ui/view/AwaitView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "observeDelegate", "(Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;", "outputData", "outputDataChanged", "(Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;)V", "", Action.PAYMENT_METHOD_TYPE, "updateMessageText", "(Ljava/lang/String;)V", "updateLogo", "getMessageTextResource", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/await/databinding/AwaitViewBinding;", "binding", "Lcom/adyen/checkout/await/databinding/AwaitViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAwaitView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitView.kt\ncom/adyen/checkout/await/internal/ui/view/AwaitView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,120:1\n1#2:121\n16#3,17:122\n16#3,17:139\n*S KotlinDebug\n*F\n+ 1 AwaitView.kt\ncom/adyen/checkout/await/internal/ui/view/AwaitView\n*L\n81#1:122,17\n98#1:139,17\n*E\n"})
public final class AwaitView extends LinearLayout implements ComponentView {

    @NotNull
    private final AwaitViewBinding binding;
    private AwaitDelegate delegate;
    private Context localizedContext;

    /* JADX INFO: renamed from: com.adyen.checkout.await.internal.ui.view.AwaitView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.await.internal.ui.view.AwaitView$observeDelegate$1", f = "AwaitView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<AwaitOutputData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = AwaitView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitOutputData awaitOutputData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(awaitOutputData, cVar)).invokeSuspend(Unit.f26487a);
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
            AwaitView.this.outputDataChanged((AwaitOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        AwaitViewBinding awaitViewBindingInflate = AwaitViewBinding.inflate(LayoutInflater.from(context), this);
        awaitViewBindingInflate.getClass();
        this.binding = awaitViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_double_margin);
        setPadding(dimension, dimension, dimension, dimension);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Integer getMessageTextResource(String paymentMethodType) {
        if (paymentMethodType == null) {
            return null;
        }
        switch (paymentMethodType.hashCode()) {
            case -2116042983:
                if (paymentMethodType.equals(PaymentMethodTypes.UPI_COLLECT)) {
                    return Integer.valueOf(com.adyen.checkout.await.R.string.checkout_await_message_upi);
                }
                return null;
            case 3026668:
                if (paymentMethodType.equals("blik")) {
                    return Integer.valueOf(com.adyen.checkout.await.R.string.checkout_await_message_blik);
                }
                return null;
            case 103700794:
                if (paymentMethodType.equals("mbway")) {
                    return Integer.valueOf(com.adyen.checkout.await.R.string.checkout_await_message_mbway);
                }
                return null;
            case 106444067:
                if (paymentMethodType.equals("payto")) {
                    return Integer.valueOf(com.adyen.checkout.await.R.string.checkout_await_message_payto);
                }
                return null;
            default:
                return null;
        }
    }

    private final void initLocalizedStrings(Context localizedContext) {
        TextView textView = this.binding.textViewWaitingConfirmation;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, com.adyen.checkout.await.R.style.AdyenCheckout_Await_WaitingConfirmationTextView, localizedContext, false, 4, null);
    }

    private final void observeDelegate(AwaitDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(AwaitOutputData outputData) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = AwaitView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "outputDataChanged", null);
        }
        updateMessageText(outputData.getPaymentMethodType());
        updateLogo(outputData.getPaymentMethodType());
    }

    private final void updateLogo(String paymentMethodType) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        AwaitDelegate awaitDelegate = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = AwaitView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("updateLogo - ", paymentMethodType), null);
        }
        if (paymentMethodType != null) {
            ImageView imageView = this.binding.imageViewLogo;
            imageView.getClass();
            AwaitDelegate awaitDelegate2 = this.delegate;
            if (awaitDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            } else {
                awaitDelegate = awaitDelegate2;
            }
            ImageLoadingExtensionsKt.loadLogo$default(imageView, awaitDelegate.getComponentParams().getEnvironment(), paymentMethodType, null, null, null, 0, 0, 124, null);
        }
    }

    private final void updateMessageText(String paymentMethodType) {
        Integer messageTextResource = getMessageTextResource(paymentMethodType);
        if (messageTextResource != null) {
            int iIntValue = messageTextResource.intValue();
            TextView textView = this.binding.textViewOpenApp;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            textView.setText(context.getString(iIntValue));
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof AwaitDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        AwaitDelegate awaitDelegate = (AwaitDelegate) delegate;
        this.delegate = awaitDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        observeDelegate(awaitDelegate, coroutineScope);
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
    public AwaitView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AwaitView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AwaitView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
