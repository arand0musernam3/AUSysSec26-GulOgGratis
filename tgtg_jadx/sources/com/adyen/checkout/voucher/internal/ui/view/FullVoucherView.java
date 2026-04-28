package com.adyen.checkout.voucher.internal.ui.view;

import al.u;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba0.g;
import bg.n0;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.util.AmountExtensionsKt;
import com.adyen.checkout.components.core.internal.util.ContextExtensionsKt;
import com.adyen.checkout.components.core.internal.util.CurrencyUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.ui.core.internal.util.CustomTabsLauncher;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.adyen.checkout.voucher.databinding.FullVoucherViewBinding;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import com.adyen.checkout.voucher.internal.ui.model.VoucherInformationField;
import com.adyen.checkout.voucher.internal.ui.model.VoucherOutputData;
import com.adyen.checkout.voucher.internal.ui.model.VoucherStoreAction;
import com.adyen.checkout.voucher.internal.ui.model.VoucherUIEvent;
import com.braze.Constants;
import com.braze.h2;
import com.google.android.material.button.MaterialButton;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00102\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b-\u0010$J\u0019\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\u00102\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0014J\u0019\u0010:\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b:\u0010$J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020!H\u0002¢\u0006\u0004\b<\u0010$J\u000f\u0010=\u001a\u00020\u0010H\u0002¢\u0006\u0004\b=\u0010\u0014J\u000f\u0010>\u001a\u00020\u0010H\u0002¢\u0006\u0004\b>\u0010\u0014J\u0019\u0010?\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b?\u0010$J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010,\u001a\u00020!H\u0002¢\u0006\u0004\b@\u0010$J\u0017\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0016\u0010\f\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/FullVoucherView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "localizedContext", "", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "observeDelegate", "(Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;Lv80/b0;)V", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "outputData", "outputDataChanged", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;)V", "", Action.PAYMENT_METHOD_TYPE, "loadLogo", "(Ljava/lang/String;)V", "introductionTextResource", "updateIntroductionText", "(Ljava/lang/Integer;)V", "Lcom/adyen/checkout/components/core/Amount;", "amount", "updateAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "codeReference", "updateCodeReference", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "storeAction", "updateStoreAction", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;)V", "", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "informationFields", "updateInformationFields", "(Ljava/util/List;)V", "onDownloadPdfClicked", "onSaveAsImageClicked", "instructionUrl", "updateReadInstructionTextView", Constants.BRAZE_WEBVIEW_URL_EXTRA, "onReadInstructionsClicked", "hideButtons", "showButtons", "onCopyClicked", "copyCode", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;", "event", "handleEventFlow", "(Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;)V", "Lcom/adyen/checkout/voucher/databinding/FullVoucherViewBinding;", "binding", "Lcom/adyen/checkout/voucher/databinding/FullVoucherViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter;", "informationFieldsAdapter", "Lcom/adyen/checkout/voucher/internal/ui/view/VoucherInformationFieldsAdapter;", "Lv80/b0;", "Ljava/lang/Runnable;", "resetCopyButtonTextRunnable", "Ljava/lang/Runnable;", "Companion", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFullVoucherView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullVoucherView.kt\ncom/adyen/checkout/voucher/internal/ui/view/FullVoucherView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,267:1\n1#2:268\n16#3,17:269\n16#3,17:302\n16#3,17:319\n256#4,2:286\n256#4,2:288\n256#4,2:290\n256#4,2:292\n256#4,2:294\n256#4,2:296\n37#4:298\n53#4:299\n256#4,2:300\n256#4,2:336\n256#4,2:338\n*S KotlinDebug\n*F\n+ 1 FullVoucherView.kt\ncom/adyen/checkout/voucher/internal/ui/view/FullVoucherView\n*L\n125#1:269,17\n212#1:302,17\n214#1:319,17\n157#1:286,2\n160#1:288,2\n168#1:290,2\n169#1:292,2\n173#1:294,2\n174#1:296,2\n192#1:298\n192#1:299\n199#1:300,2\n219#1:336,2\n224#1:338,2\n*E\n"})
public final class FullVoucherView extends ConstraintLayout implements ComponentView {
    private static final long COPY_BUTTON_TEXT_CHANGE_DELAY = 2000;

    @NotNull
    private static final String COPY_LABEL = "Voucher code reference";

    @NotNull
    private final FullVoucherViewBinding binding;

    @Nullable
    private b0 coroutineScope;
    private VoucherDelegate delegate;

    @Nullable
    private VoucherInformationFieldsAdapter informationFieldsAdapter;
    private Context localizedContext;

    @NotNull
    private final Runnable resetCopyButtonTextRunnable;

    /* JADX INFO: renamed from: com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$1", f = "FullVoucherView.kt", l = {}, m = "invokeSuspend")
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
            AnonymousClass1 anonymousClass1 = FullVoucherView.this.new AnonymousClass1(cVar);
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
            FullVoucherView.this.outputDataChanged((VoucherOutputData) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$2", f = "FullVoucherView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherUIEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<VoucherUIEvent, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = FullVoucherView.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull VoucherUIEvent voucherUIEvent, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(voucherUIEvent, cVar)).invokeSuspend(Unit.f26487a);
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
            FullVoucherView.this.handleEventFlow((VoucherUIEvent) this.L$0);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        FullVoucherViewBinding fullVoucherViewBindingInflate = FullVoucherViewBinding.inflate(LayoutInflater.from(context), this);
        fullVoucherViewBindingInflate.getClass();
        this.binding = fullVoucherViewBindingInflate;
        this.resetCopyButtonTextRunnable = new u(this, 21);
        int dimension = (int) getResources().getDimension(R.dimen.standard_margin);
        setPadding(dimension, dimension, dimension, dimension);
    }

    private final void copyCode(String codeReference) {
        Context context = getContext();
        context.getClass();
        ContextExtensionsKt.copyTextToClipboard(context, COPY_LABEL, codeReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEventFlow(VoucherUIEvent event) {
        if (Intrinsics.areEqual(event, VoucherUIEvent.Success.INSTANCE)) {
            Context context = getContext();
            context.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context2 = null;
            }
            String string = context2.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_image_saved);
            string.getClass();
            ContextExtensionsKt.toast$default(context, string, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(event, VoucherUIEvent.PermissionDenied.INSTANCE)) {
            Context context3 = getContext();
            context3.getClass();
            Context context4 = this.localizedContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context4 = null;
            }
            String string2 = context4.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_permission_denied);
            string2.getClass();
            ContextExtensionsKt.toast$default(context3, string2, 0, 2, null);
            return;
        }
        if (event instanceof VoucherUIEvent.Failure) {
            Context context5 = getContext();
            context5.getClass();
            Context context6 = this.localizedContext;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context6 = null;
            }
            String string3 = context6.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_image_failed);
            string3.getClass();
            ContextExtensionsKt.toast$default(context5, string3, 0, 2, null);
        }
    }

    private final void hideButtons() {
        MaterialButton materialButton = this.binding.buttonCopyCode;
        materialButton.getClass();
        materialButton.setVisibility(8);
        updateStoreAction(null);
    }

    private final void initLocalizedStrings(Context localizedContext) {
        FullVoucherViewBinding fullVoucherViewBinding = this.binding;
        TextView textView = fullVoucherViewBinding.textViewPaymentReference;
        textView.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(textView, com.adyen.checkout.voucher.R.style.AdyenCheckout_Voucher_PaymentReference, localizedContext, false, 4, null);
        MaterialButton materialButton = fullVoucherViewBinding.buttonCopyCode;
        materialButton.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton, com.adyen.checkout.voucher.R.style.AdyenCheckout_Voucher_Button_CopyCode, localizedContext, false, 4, null);
        MaterialButton materialButton2 = fullVoucherViewBinding.buttonDownloadPdf;
        materialButton2.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton2, com.adyen.checkout.voucher.R.style.AdyenCheckout_Voucher_Button_DownloadPdf, localizedContext, false, 4, null);
        MaterialButton materialButton3 = fullVoucherViewBinding.buttonSaveImage;
        materialButton3.getClass();
        ViewExtensionsKt.setLocalizedTextFromStyle$default(materialButton3, com.adyen.checkout.voucher.R.style.AdyenCheckout_Voucher_Button_SaveImage, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(FullVoucherView fullVoucherView, ComponentDelegate componentDelegate, View view) {
        fullVoucherView.getClass();
        componentDelegate.getClass();
        fullVoucherView.onCopyClicked(((VoucherDelegate) componentDelegate).getOutputData().getReference());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(FullVoucherView fullVoucherView, View view) {
        fullVoucherView.getClass();
        fullVoucherView.onDownloadPdfClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(FullVoucherView fullVoucherView, View view) {
        fullVoucherView.getClass();
        fullVoucherView.onSaveAsImageClicked();
    }

    private final void loadLogo(String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        RoundCornerImageView roundCornerImageView = this.binding.imageViewLogo;
        roundCornerImageView.getClass();
        VoucherDelegate voucherDelegate = this.delegate;
        if (voucherDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            voucherDelegate = null;
        }
        ImageLoadingExtensionsKt.loadLogo$default(roundCornerImageView, voucherDelegate.getComponentParams().getEnvironment(), paymentMethodType, null, LogoSize.MEDIUM, null, 0, 0, 116, null);
    }

    private final void observeDelegate(VoucherDelegate delegate, b0 coroutineScope) {
        r.u(coroutineScope, new w(delegate.getOutputDataFlow(), new AnonymousClass1(null), 5));
        r.u(coroutineScope, new w(delegate.getEventFlow(), new AnonymousClass2(null), 5));
    }

    private final void onCopyClicked(String codeReference) {
        if (codeReference == null) {
            return;
        }
        MaterialButton materialButton = this.binding.buttonCopyCode;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        materialButton.setText(context.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_copied_toast));
        copyCode(codeReference);
        this.binding.buttonCopyCode.removeCallbacks(this.resetCopyButtonTextRunnable);
        this.binding.buttonCopyCode.postDelayed(this.resetCopyButtonTextRunnable, 2000L);
    }

    private final void onDownloadPdfClicked() {
        VoucherDelegate voucherDelegate = this.delegate;
        if (voucherDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            voucherDelegate = null;
        }
        Context context = getContext();
        context.getClass();
        voucherDelegate.downloadVoucher(context);
    }

    private final void onReadInstructionsClicked(String url) {
        CustomTabsLauncher customTabsLauncher = CustomTabsLauncher.INSTANCE;
        Context context = getContext();
        context.getClass();
        Uri uri = Uri.parse(url);
        uri.getClass();
        if (customTabsLauncher.launchCustomTab(context, uri)) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = FullVoucherView.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Successfully opened instructions in custom tab", null);
                return;
            }
            return;
        }
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
        if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = FullVoucherView.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Couldn't open instructions in custom tab", null);
        }
    }

    private final void onSaveAsImageClicked() {
        hideButtons();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$onSaveAsImageClicked$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                VoucherDelegate voucherDelegate = this.this$0.delegate;
                if (voucherDelegate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                    voucherDelegate = null;
                }
                Context context = this.this$0.getContext();
                context.getClass();
                voucherDelegate.saveVoucherAsImage(context, this.this$0);
                this.this$0.showButtons();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void outputDataChanged(VoucherOutputData outputData) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = FullVoucherView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "outputDataChanged", null);
        }
        loadLogo(outputData.getPaymentMethodType());
        updateIntroductionText(outputData.getIntroductionTextResource());
        updateAmount(outputData.getTotalAmount());
        updateCodeReference(outputData.getReference());
        updateStoreAction(outputData.getStoreAction());
        updateInformationFields(outputData.getInformationFields());
        updateReadInstructionTextView(outputData.getInstructionUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetCopyButtonTextRunnable$lambda$0(FullVoucherView fullVoucherView) {
        fullVoucherView.getClass();
        MaterialButton materialButton = fullVoucherView.binding.buttonCopyCode;
        Context context = fullVoucherView.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        materialButton.setText(context.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_copy_code));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showButtons() {
        MaterialButton materialButton = this.binding.buttonCopyCode;
        materialButton.getClass();
        materialButton.setVisibility(0);
        VoucherDelegate voucherDelegate = this.delegate;
        if (voucherDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            voucherDelegate = null;
        }
        updateStoreAction(voucherDelegate.getOutputData().getStoreAction());
    }

    private final void updateAmount(Amount amount) {
        FullVoucherViewBinding fullVoucherViewBinding = this.binding;
        if (amount == null || AmountExtensionsKt.isEmpty(amount)) {
            TextView textView = fullVoucherViewBinding.textViewAmount;
            textView.getClass();
            textView.setVisibility(8);
            return;
        }
        CurrencyUtils currencyUtils = CurrencyUtils.INSTANCE;
        VoucherDelegate voucherDelegate = this.delegate;
        if (voucherDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            voucherDelegate = null;
        }
        String amount2 = currencyUtils.formatAmount(amount, voucherDelegate.getComponentParams().getShopperLocale());
        TextView textView2 = fullVoucherViewBinding.textViewAmount;
        textView2.getClass();
        textView2.setVisibility(0);
        fullVoucherViewBinding.textViewAmount.setText(amount2);
    }

    private final void updateCodeReference(String codeReference) {
        FullVoucherViewBinding fullVoucherViewBinding = this.binding;
        fullVoucherViewBinding.textViewReferenceCode.setText(codeReference);
        boolean z11 = codeReference == null || codeReference.length() == 0;
        TextView textView = fullVoucherViewBinding.textViewReferenceCode;
        textView.getClass();
        textView.setVisibility(!z11 ? 0 : 8);
        MaterialButton materialButton = fullVoucherViewBinding.buttonCopyCode;
        materialButton.getClass();
        materialButton.setVisibility(z11 ? 8 : 0);
    }

    private final void updateInformationFields(List<VoucherInformationField> informationFields) {
        if (informationFields == null || informationFields.isEmpty()) {
            return;
        }
        if (this.informationFieldsAdapter == null) {
            Context context = getContext();
            context.getClass();
            Context context2 = this.localizedContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context2 = null;
            }
            VoucherInformationFieldsAdapter voucherInformationFieldsAdapter = new VoucherInformationFieldsAdapter(context, context2);
            this.informationFieldsAdapter = voucherInformationFieldsAdapter;
            this.binding.recyclerViewInformationFields.setAdapter(voucherInformationFieldsAdapter);
        }
        VoucherInformationFieldsAdapter voucherInformationFieldsAdapter2 = this.informationFieldsAdapter;
        if (voucherInformationFieldsAdapter2 != null) {
            voucherInformationFieldsAdapter2.submitList(informationFields);
        }
    }

    private final void updateIntroductionText(Integer introductionTextResource) {
        if (introductionTextResource == null) {
            return;
        }
        TextView textView = this.binding.textViewIntroduction;
        Context context = this.localizedContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
            context = null;
        }
        textView.setText(context.getString(introductionTextResource.intValue()));
    }

    private final void updateReadInstructionTextView(String instructionUrl) {
        TextView textView = this.binding.textViewReadInstructions;
        textView.getClass();
        textView.setVisibility(instructionUrl != null ? 0 : 8);
        if (instructionUrl != null) {
            TextView textView2 = this.binding.textViewReadInstructions;
            Context context = this.localizedContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizedContext");
                context = null;
            }
            String string = context.getString(com.adyen.checkout.voucher.R.string.checkout_voucher_read_instructions);
            string.getClass();
            textView2.setText(ViewExtensionsKt.formatFullStringWithHyperLink(string));
            this.binding.textViewReadInstructions.setOnClickListener(new n0(9, this, instructionUrl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateReadInstructionTextView$lambda$12$lambda$11(FullVoucherView fullVoucherView, String str, View view) {
        fullVoucherView.getClass();
        fullVoucherView.onReadInstructionsClicked(str);
    }

    private final void updateStoreAction(VoucherStoreAction storeAction) {
        FullVoucherViewBinding fullVoucherViewBinding = this.binding;
        MaterialButton materialButton = fullVoucherViewBinding.buttonDownloadPdf;
        materialButton.getClass();
        materialButton.setVisibility(storeAction instanceof VoucherStoreAction.DownloadPdf ? 0 : 8);
        MaterialButton materialButton2 = fullVoucherViewBinding.buttonSaveImage;
        materialButton2.getClass();
        materialButton2.setVisibility(storeAction instanceof VoucherStoreAction.SaveAsImage ? 0 : 8);
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
        this.coroutineScope = coroutineScope;
        this.binding.buttonCopyCode.setOnClickListener(new n0(10, this, voucherDelegate));
        final int i11 = 0;
        this.binding.buttonDownloadPdf.setOnClickListener(new View.OnClickListener(this) { // from class: com.adyen.checkout.voucher.internal.ui.view.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FullVoucherView f8847b;

            {
                this.f8847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        FullVoucherView.initView$lambda$3(this.f8847b, view);
                        break;
                    default:
                        FullVoucherView.initView$lambda$4(this.f8847b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        this.binding.buttonSaveImage.setOnClickListener(new View.OnClickListener(this) { // from class: com.adyen.checkout.voucher.internal.ui.view.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FullVoucherView f8847b;

            {
                this.f8847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        FullVoucherView.initView$lambda$3(this.f8847b, view);
                        break;
                    default:
                        FullVoucherView.initView$lambda$4(this.f8847b, view);
                        break;
                }
            }
        });
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
    public FullVoucherView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ FullVoucherView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullVoucherView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
