package com.adyen.checkout.issuerlist.internal.ui;

import com.adyen.checkout.ui.core.internal.ui.AmountButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonViewProvider;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewProvider", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "(Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;)V", "getViewProvider", "()Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "RecyclerView", "SpinnerView", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType$RecyclerView;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType$SpinnerView;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IssuerListComponentViewType implements ComponentViewType {

    @NotNull
    private final ViewProvider viewProvider;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType$RecyclerView;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType;", "()V", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RecyclerView extends IssuerListComponentViewType {

        @NotNull
        public static final RecyclerView INSTANCE = new RecyclerView();

        /* JADX WARN: Multi-variable type inference failed */
        private RecyclerView() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType$SpinnerView;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/AmountButtonComponentViewType;", "()V", "buttonTextResId", "", "getButtonTextResId", "()I", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpinnerView extends IssuerListComponentViewType implements AmountButtonComponentViewType {

        @NotNull
        public static final SpinnerView INSTANCE = new SpinnerView();
        private static final int buttonTextResId = ButtonComponentViewType.INSTANCE.getDEFAULT_BUTTON_TEXT_RES_ID();

        /* JADX WARN: Multi-variable type inference failed */
        private SpinnerView() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType
        public int getButtonTextResId() {
            return buttonTextResId;
        }

        @Override // com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType
        @NotNull
        public ButtonViewProvider getButtonViewProvider() {
            return AmountButtonComponentViewType.DefaultImpls.getButtonViewProvider(this);
        }
    }

    public /* synthetic */ IssuerListComponentViewType(ViewProvider viewProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IssuerListViewProvider.INSTANCE : viewProvider, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentViewType
    @NotNull
    public ViewProvider getViewProvider() {
        return this.viewProvider;
    }

    private IssuerListComponentViewType(ViewProvider viewProvider) {
        this.viewProvider = viewProvider;
    }

    public /* synthetic */ IssuerListComponentViewType(ViewProvider viewProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewProvider);
    }
}
