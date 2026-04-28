package com.adyen.checkout.issuerlist.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.issuerlist.databinding.IssuerListRecyclerViewBinding;
import com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListInputData;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.ui.core.internal.ui.ComponentView;
import com.braze.models.FeatureFlag;
import e0.f;
import i4.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001e\u0010'\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerView;", "Landroid/widget/LinearLayout;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "", "initLocalizedStrings", "(Landroid/content/Context;)V", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "issuerModel", "onItemClicked", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)V", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Lv80/b0;", "coroutineScope", "initView", "(Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;Lv80/b0;Landroid/content/Context;)V", "highlightValidationErrors", "()V", "", FeatureFlag.ENABLED, "setEnabled", "(Z)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/adyen/checkout/issuerlist/databinding/IssuerListRecyclerViewBinding;", "binding", "Lcom/adyen/checkout/issuerlist/databinding/IssuerListRecyclerViewBinding;", "Landroid/content/Context;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "issuerListDelegate", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssuerListRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerListRecyclerView.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,81:1\n1#2:82\n16#3,17:83\n*S KotlinDebug\n*F\n+ 1 IssuerListRecyclerView.kt\ncom/adyen/checkout/issuerlist/internal/ui/view/IssuerListRecyclerView\n*L\n74#1:83,17\n*E\n"})
public final class IssuerListRecyclerView extends LinearLayout implements ComponentView {

    @NotNull
    private final IssuerListRecyclerViewBinding binding;
    private IssuerListDelegate<?, ?> issuerListDelegate;
    private Context localizedContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuerListRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        IssuerListRecyclerViewBinding issuerListRecyclerViewBindingInflate = IssuerListRecyclerViewBinding.inflate(LayoutInflater.from(context), this);
        issuerListRecyclerViewBindingInflate.getClass();
        this.binding = issuerListRecyclerViewBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClicked(final IssuerModel issuerModel) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        IssuerListDelegate<?, ?> issuerListDelegate = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = IssuerListRecyclerView.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("onItemClicked - ", issuerModel.getName()), null);
        }
        IssuerListDelegate<?, ?> issuerListDelegate2 = this.issuerListDelegate;
        if (issuerListDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("issuerListDelegate");
            issuerListDelegate2 = null;
        }
        issuerListDelegate2.updateInputData(new Function1<IssuerListInputData, Unit>() { // from class: com.adyen.checkout.issuerlist.internal.ui.view.IssuerListRecyclerView.onItemClicked.2
            {
                super(1);
            }

            public final void invoke(@NotNull IssuerListInputData issuerListInputData) {
                issuerListInputData.getClass();
                issuerListInputData.setSelectedIssuer(issuerModel);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IssuerListInputData) obj);
                return Unit.f26487a;
            }
        });
        IssuerListDelegate<?, ?> issuerListDelegate3 = this.issuerListDelegate;
        if (issuerListDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("issuerListDelegate");
        } else {
            issuerListDelegate = issuerListDelegate3;
        }
        issuerListDelegate.onSubmit();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentView
    public void initView(@NotNull ComponentDelegate delegate, @NotNull b0 coroutineScope, @NotNull Context localizedContext) {
        delegate.getClass();
        coroutineScope.getClass();
        localizedContext.getClass();
        if (!(delegate instanceof IssuerListDelegate)) {
            a.f("Unsupported delegate type");
            return;
        }
        IssuerListDelegate<?, ?> issuerListDelegate = (IssuerListDelegate) delegate;
        this.issuerListDelegate = issuerListDelegate;
        this.localizedContext = localizedContext;
        initLocalizedStrings(localizedContext);
        RecyclerView recyclerView = this.binding.recyclerIssuers;
        IssuerListRecyclerAdapter issuerListRecyclerAdapter = new IssuerListRecyclerAdapter(issuerListDelegate.getPaymentMethodType(), issuerListDelegate.getComponentParams().getHideIssuerLogos(), new AnonymousClass2(this));
        issuerListRecyclerAdapter.submitList(issuerListDelegate.getIssuers());
        recyclerView.setAdapter(issuerListRecyclerAdapter);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.recyclerIssuers.setEnabled(enabled);
    }

    /* JADX INFO: renamed from: com.adyen.checkout.issuerlist.internal.ui.view.IssuerListRecyclerView$initView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<IssuerModel, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, IssuerListRecyclerView.class, "onItemClicked", "onItemClicked(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)V", 0);
        }

        public final void invoke(@NotNull IssuerModel issuerModel) {
            issuerModel.getClass();
            ((IssuerListRecyclerView) this.receiver).onItemClicked(issuerModel);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IssuerModel) obj);
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IssuerListRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ IssuerListRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
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
    public IssuerListRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private final void initLocalizedStrings(Context localizedContext) {
    }
}
