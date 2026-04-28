package com.adyen.checkout.qrcode.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba0.g;
import bg.n0;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.TimerData;
import com.adyen.checkout.components.core.internal.util.ContextExtensionsKt;
import com.adyen.checkout.components.core.internal.util.CurrencyUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.qrcode.databinding.FullQrcodeViewBinding;
import com.adyen.checkout.qrcode.internal.ui.QRCodeDelegate;
import com.adyen.checkout.qrcode.internal.ui.model.QRCodeOutputData;
import com.adyen.checkout.qrcode.internal.ui.model.QrCodeUIEvent;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.braze.h2;
import com.google.android.material.button.MaterialButton;
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
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J'\u0010/\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010:¨\u0006;"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/view/FullQRCodeView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "observeDelegate", "(Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "outputData", "outputDataChanged", "(Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "componentParams", "updateAmount", "(Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;)V", "messageTextResource", "updateMessageText", "(Ljava/lang/Integer;)V", "", Action.PAYMENT_METHOD_TYPE, "updateLogo", "(Ljava/lang/String;)V", "qrImageUrl", "updateQrImage", "Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;", "timerData", "onTimerTick", "(Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;)V", "Lcom/adyen/checkout/qrcode/internal/ui/model/QrCodeUIEvent;", "event", "handleEventFlow", "(Lcom/adyen/checkout/qrcode/internal/ui/model/QrCodeUIEvent;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "highlightValidationErrors", "()V", "Lcom/adyen/checkout/qrcode/databinding/FullQrcodeViewBinding;", "binding", "Lcom/adyen/checkout/qrcode/databinding/FullQrcodeViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFullQRCodeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullQRCodeView.kt\ncom/adyen/checkout/qrcode/internal/ui/view/FullQRCodeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n1#2:177\n16#3,17:178\n21#3,12:199\n256#4,2:195\n256#4,2:197\n*S KotlinDebug\n*F\n+ 1 FullQRCodeView.kt\ncom/adyen/checkout/qrcode/internal/ui/view/FullQRCodeView\n*L\n95#1:178,17\n167#1:199,12\n110#1:195,2\n113#1:197,2\n*E\n"})
public final class FullQRCodeView extends LinearLayout implements ComponentView {

    @NotNull
    private final FullQrcodeViewBinding binding;
    private QRCodeDelegate delegate;
    private Context localizedContext;

    /* JADX INFO: renamed from: com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$1", f = "FullQRCodeView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<QRCodeOutputData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = FullQRCodeView.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull QRCodeOutputData qRCodeOutputData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(qRCodeOutputData, cVar)).invokeSuspend(Unit.f26487a);
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
            FullQRCodeView.this.outputDataChanged((QRCodeOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$2", f = "FullQRCodeView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<TimerData, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = FullQRCodeView.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TimerData timerData, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(timerData, cVar)).invokeSuspend(Unit.f26487a);
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
            FullQRCodeView.this.onTimerTick((TimerData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView$observeDelegate$3", f = "FullQRCodeView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/qrcode/internal/ui/model/QrCodeUIEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<QrCodeUIEvent, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = FullQRCodeView.this.new AnonymousClass3(cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull QrCodeUIEvent qrCodeUIEvent, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass3) create(qrCodeUIEvent, cVar)).invokeSuspend(Unit.f26487a);
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
            FullQRCodeView.this.handleEventFlow((QrCodeUIEvent) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullQRCodeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        FullQrcodeViewBinding fullQrcodeViewBindingInflate = FullQrcodeViewBinding.inflate(LayoutInflater.from(context), this);
        fullQrcodeViewBindingInflate.getClass();
        this.binding = fullQrcodeViewBindingInflate;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, dimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEventFlow(QrCodeUIEvent event) {
        if (Intrinsics.areEqual(event, QrCodeUIEvent.QrImageDownloadResult.Success.INSTANCE)) {
            Context context = getContext();
            context.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context2 = null;
            }
            String string = context2.getString(com.adyen.checkout.qrcode.R.string.checkout_qr_code_download_image_succeeded);
            string.getClass();
            ContextExtensionsKt.toast$default(context, string, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(event, QrCodeUIEvent.QrImageDownloadResult.PermissionDenied.INSTANCE)) {
            Context context3 = getContext();
            context3.getClass();
            Context context4 = this.localizedContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context4 = null;
            }
            String string2 = context4.getString(com.adyen.checkout.qrcode.R.string.checkout_qr_code_permission_denied);
            string2.getClass();
            ContextExtensionsKt.toast$default(context3, string2, 0, 2, null);
            return;
        }
        if (event instanceof QrCodeUIEvent.QrImageDownloadResult.Failure) {
            Context context5 = getContext();
            context5.getClass();
            Context context6 = this.localizedContext;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context6 = null;
            }
            String string3 = context6.getString(com.adyen.checkout.qrcode.R.string.checkout_qr_code_download_image_failed);
            string3.getClass();
            ContextExtensionsKt.toast$default(context5, string3, 0, 2, null);
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            Throwable throwable = ((QrCodeUIEvent.QrImageDownloadResult.Failure) event).getThrowable();
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = FullQRCodeView.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "download file failed", throwable);
            }
        }
    }

    private final void initLocalizedStrings(Context localizedContext) {
        MaterialButton materialButton = this.binding.buttonSaveImage;
        materialButton.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton, com.adyen.checkout.qrcode.R.style.AdyenCheckout_QrCode_SaveButton, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ComponentDelegate componentDelegate, FullQRCodeView fullQRCodeView, View view) {
        componentDelegate.getClass();
        fullQRCodeView.getClass();
        Context context = fullQRCodeView.getContext();
        context.getClass();
        ((QRCodeDelegate) componentDelegate).downloadQRImage(context);
    }

    private final void observeDelegate(QRCodeDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
        r.u(coroutineScope, new w(delegate.getTimerFlow(), new AnonymousClass2(null), 5));
        r.u(coroutineScope, new w(delegate.getEventFlow(), new AnonymousClass3(null), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerTick(TimerData timerData) {
        long millisUntilFinished = timerData.getMillisUntilFinished() / TimeConstants.ONE_MINUTE_DIFFERENCE;
        long millisUntilFinished2 = (timerData.getMillisUntilFinished() / 1000) % 60;
        Context context = this.localizedContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        String string = context.getString(com.adyen.checkout.qrcode.R.string.checkout_qr_code_time_left_format, Long.valueOf(millisUntilFinished), Long.valueOf(millisUntilFinished2));
        string.getClass();
        TextView textView = this.binding.textViewTimer;
        Context context3 = this.localizedContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
        } else {
            context2 = context3;
        }
        textView.setText(context2.getString(com.adyen.checkout.qrcode.R.string.checkout_qr_code_pay_now_timer_text, string));
        this.binding.progressIndicator.setProgress(timerData.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(QRCodeOutputData outputData) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        QRCodeDelegate qRCodeDelegate = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = FullQRCodeView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "outputDataChanged", null);
        }
        updateMessageText(outputData.getMessageTextResource());
        updateLogo(outputData.getPaymentMethodType());
        updateQrImage(outputData.getQrImageUrl());
        QRCodeDelegate qRCodeDelegate2 = this.delegate;
        if (qRCodeDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        } else {
            qRCodeDelegate = qRCodeDelegate2;
        }
        updateAmount(qRCodeDelegate.getComponentParams());
    }

    private final void updateAmount(ComponentParams componentParams) {
        Amount amount = componentParams.getAmount();
        if (amount == null) {
            TextView textView = this.binding.textviewAmount;
            textView.getClass();
            textView.setVisibility(8);
        } else {
            String amount2 = CurrencyUtils.INSTANCE.formatAmount(amount, componentParams.getShopperLocale());
            TextView textView2 = this.binding.textviewAmount;
            textView2.getClass();
            textView2.setVisibility(0);
            this.binding.textviewAmount.setText(amount2);
        }
    }

    private final void updateLogo(String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        ImageView imageView = this.binding.imageViewLogo;
        imageView.getClass();
        QRCodeDelegate qRCodeDelegate = this.delegate;
        if (qRCodeDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            qRCodeDelegate = null;
        }
        ImageLoadingExtensionsKt.loadLogo$default(imageView, qRCodeDelegate.getComponentParams().getEnvironment(), paymentMethodType, null, LogoSize.LARGE, null, 0, 0, 116, null);
    }

    private final void updateMessageText(Integer messageTextResource) {
        if (messageTextResource == null) {
            return;
        }
        TextView textView = this.binding.textViewTopLabel;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        textView.setText(context.getString(messageTextResource.intValue()));
    }

    private final void updateQrImage(String qrImageUrl) {
        if (qrImageUrl == null || qrImageUrl.length() == 0) {
            return;
        }
        ImageView imageView = this.binding.imageViewQrcode;
        imageView.getClass();
        ImageLoadingExtensionsKt.load$default(imageView, qrImageUrl, null, 0, 0, 14, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof QRCodeDelegate)) {
            i4.a.f("Unsupported delegate type");
            return;
        }
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        QRCodeDelegate qRCodeDelegate = (QRCodeDelegate) delegate;
        this.delegate = qRCodeDelegate;
        observeDelegate(qRCodeDelegate, coroutineScope);
        this.binding.buttonSaveImage.setOnClickListener(new n0(6, qRCodeDelegate, this));
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
    public FullQRCodeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ FullQRCodeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullQRCodeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
