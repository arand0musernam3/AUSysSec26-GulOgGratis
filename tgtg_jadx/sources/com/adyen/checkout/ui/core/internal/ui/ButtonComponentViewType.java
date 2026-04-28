package com.adyen.checkout.ui.core.internal.ui;

import com.adyen.checkout.ui.core.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/ButtonComponentViewType;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "buttonTextResId", "", "getButtonTextResId", "()I", "buttonViewProvider", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonViewProvider;", "getButtonViewProvider", "()Lcom/adyen/checkout/ui/core/internal/ui/ButtonViewProvider;", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ButtonComponentViewType extends ComponentViewType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/ButtonComponentViewType$Companion;", "", "()V", "DEFAULT_BUTTON_TEXT_RES_ID", "", "getDEFAULT_BUTTON_TEXT_RES_ID", "()I", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_BUTTON_TEXT_RES_ID = R.string.pay_button;

        private Companion() {
        }

        public final int getDEFAULT_BUTTON_TEXT_RES_ID() {
            return DEFAULT_BUTTON_TEXT_RES_ID;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static ButtonViewProvider getButtonViewProvider(@NotNull ButtonComponentViewType buttonComponentViewType) {
            return new DefaultButtonViewProvider();
        }
    }

    int getButtonTextResId();

    @NotNull
    ButtonViewProvider getButtonViewProvider();
}
