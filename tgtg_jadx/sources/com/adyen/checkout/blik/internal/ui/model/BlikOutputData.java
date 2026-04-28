package com.adyen.checkout.blik.internal.ui.model;

import com.adyen.checkout.blik.R;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/blik/internal/ui/model/BlikOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "blikCode", "", "(Ljava/lang/String;)V", "blikCodeField", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "getBlikCodeField", "()Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "isValid", "", "()Z", "getBlikCodeValidation", "Lcom/adyen/checkout/components/core/internal/ui/model/Validation;", "Companion", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlikOutputData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlikOutputData.kt\ncom/adyen/checkout/blik/internal/ui/model/BlikOutputData\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,45:1\n21#2,12:46\n*S KotlinDebug\n*F\n+ 1 BlikOutputData.kt\ncom/adyen/checkout/blik/internal/ui/model/BlikOutputData\n*L\n27#1:46,12\n*E\n"})
public final class BlikOutputData implements OutputData {
    private static final int BLIK_CODE_LENGTH = 6;

    @NotNull
    private final FieldState<String> blikCodeField;

    public BlikOutputData(@NotNull String str) {
        str.getClass();
        this.blikCodeField = new FieldState<>(str, getBlikCodeValidation(str));
    }

    private final Validation getBlikCodeValidation(String blikCode) {
        try {
            if (blikCode.length() > 0) {
                Integer.parseInt(blikCode);
            }
            return blikCode.length() == 6 ? Validation.Valid.INSTANCE : new Validation.Invalid(R.string.checkout_blik_code_not_valid, false, 2, null);
        } catch (NumberFormatException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = BlikOutputData.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to parse blik code to Integer", e5);
            }
            return new Validation.Invalid(R.string.checkout_blik_code_not_valid, false, 2, null);
        }
    }

    @NotNull
    public final FieldState<String> getBlikCodeField() {
        return this.blikCodeField;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.blikCodeField.getValidation().isValid();
    }
}
