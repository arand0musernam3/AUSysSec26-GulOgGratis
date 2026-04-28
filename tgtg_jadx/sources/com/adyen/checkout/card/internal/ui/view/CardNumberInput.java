package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.adyen.checkout.card.internal.util.CardNumberUtils;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardNumberInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAmexCard", "", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "formatProcessedString", "unformattedString", "setAmexCardFormat", "value", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberInput extends AdyenTextInputEditText {

    @NotNull
    private static final String DIGIT_SEPARATOR = " ";
    private static final int MAX_DIGIT_SEPARATOR_COUNT = 4;

    @NotNull
    private static final String SUPPORTED_DIGITS = "0123456789";
    private boolean isAmexCard;

    @NotNull
    private static final List<Integer> AMEX_CARD_NUMBER_MASK = d0.h(4, 6, 5, 4);

    @NotNull
    private static final List<Integer> DEFAULT_CARD_NUMBER_MASK = d0.h(4, 4, 4, 4, 3);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        enforceMaxInputLength(23);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        setAutofillHints("creditCardNumber");
    }

    private final String formatProcessedString(String unformattedString) {
        return CardNumberUtils.INSTANCE.formatCardNumber(unformattedString, this.isAmexCard ? AMEX_CARD_NUMBER_MASK : DEFAULT_CARD_NUMBER_MASK, DIGIT_SEPARATOR);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    public void afterTextChanged(@NotNull Editable editable) {
        editable.getClass();
        String string = editable.toString();
        String processedString = formatProcessedString(y.n(string, DIGIT_SEPARATOR, "", false));
        if (!Intrinsics.areEqual(string, processedString)) {
            editable.replace(0, string.length(), processedString);
        }
        super.afterTextChanged(editable);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    @NotNull
    public String getRawValue() {
        return y.n(String.valueOf(getText()), DIGIT_SEPARATOR, "", false);
    }

    public final void setAmexCardFormat(boolean value) {
        if (this.isAmexCard || !value) {
            this.isAmexCard = value;
            return;
        }
        this.isAmexCard = true;
        Editable editableText = getEditableText();
        editableText.getClass();
        afterTextChanged(editableText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CardNumberInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
