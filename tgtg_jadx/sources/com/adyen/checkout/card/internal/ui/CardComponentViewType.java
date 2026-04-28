package com.adyen.checkout.card.internal.ui;

import com.adyen.checkout.ui.core.internal.ui.AmountButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonViewProvider;
import com.adyen.checkout.ui.core.internal.ui.ComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ViewProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "()V", "viewProvider", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "getViewProvider", "()Lcom/adyen/checkout/ui/core/internal/ui/ViewProvider;", "AddressLookup", "DefaultCardView", "StoredCardView", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$AddressLookup;", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$DefaultCardView;", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$StoredCardView;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CardComponentViewType implements ComponentViewType {

    @NotNull
    private final ViewProvider viewProvider;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$AddressLookup;", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressLookup extends CardComponentViewType {

        @NotNull
        public static final AddressLookup INSTANCE = new AddressLookup();

        private AddressLookup() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AddressLookup);
        }

        public int hashCode() {
            return 931702097;
        }

        @NotNull
        public String toString() {
            return "AddressLookup";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$DefaultCardView;", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/AmountButtonComponentViewType;", "()V", "buttonTextResId", "", "getButtonTextResId", "()I", "equals", "", "other", "", "hashCode", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DefaultCardView extends CardComponentViewType implements AmountButtonComponentViewType {

        @NotNull
        public static final DefaultCardView INSTANCE = new DefaultCardView();
        private static final int buttonTextResId = ButtonComponentViewType.INSTANCE.getDEFAULT_BUTTON_TEXT_RES_ID();

        private DefaultCardView() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DefaultCardView);
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

        public int hashCode() {
            return 1868046649;
        }

        @NotNull
        public String toString() {
            return "DefaultCardView";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardComponentViewType$StoredCardView;", "Lcom/adyen/checkout/card/internal/ui/CardComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/AmountButtonComponentViewType;", "()V", "buttonTextResId", "", "getButtonTextResId", "()I", "equals", "", "other", "", "hashCode", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StoredCardView extends CardComponentViewType implements AmountButtonComponentViewType {

        @NotNull
        public static final StoredCardView INSTANCE = new StoredCardView();
        private static final int buttonTextResId = ButtonComponentViewType.INSTANCE.getDEFAULT_BUTTON_TEXT_RES_ID();

        private StoredCardView() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StoredCardView);
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

        public int hashCode() {
            return 152597557;
        }

        @NotNull
        public String toString() {
            return "StoredCardView";
        }
    }

    private CardComponentViewType() {
        this.viewProvider = CardViewProvider.INSTANCE;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ComponentViewType
    @NotNull
    public ViewProvider getViewProvider() {
        return this.viewProvider;
    }

    public /* synthetic */ CardComponentViewType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
