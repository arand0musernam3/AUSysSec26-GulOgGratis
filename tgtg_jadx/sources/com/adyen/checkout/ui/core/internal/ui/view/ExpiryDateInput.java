package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/ExpiryDateInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "isStringInt", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExpiryDateInput extends AdyenTextInputEditText {
    private static final int MAX_LENGTH = 5;
    private static final int MAX_SECOND_DIGIT_MONTH = 1;

    @NotNull
    public static final String SEPARATOR = "/";

    public /* synthetic */ ExpiryDateInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final boolean isStringInt(String s7) {
        try {
            Integer.parseInt(s7);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    public void afterTextChanged(@NotNull Editable editable) {
        editable.getClass();
        String string = editable.toString();
        String strReplace = new Regex("(\\d{2})(?=\\d)").replace(new Regex("\\D").replace(string, ""), "$1/");
        if (strReplace.length() == 1 && isStringInt(strReplace) && Integer.parseInt(strReplace) > 1) {
            strReplace = "0".concat(strReplace);
        }
        if (!Intrinsics.areEqual(string, strReplace)) {
            editable.replace(0, string.length(), strReplace);
        }
        super.afterTextChanged(editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        enforceMaxInputLength(5);
    }
}
