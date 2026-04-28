package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/SecurityCodeInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SecurityCodeInput extends AdyenTextInputEditText {
    private static final int MAX_LENGTH = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityCodeInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        enforceMaxInputLength(4);
        setAutofillHints("creditCardSecurityCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecurityCodeInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ SecurityCodeInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecurityCodeInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
