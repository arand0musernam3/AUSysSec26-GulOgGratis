package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.adyen.checkout.ui.core.internal.util.SocialSecurityNumberUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/SocialSecurityNumberInput;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "setSocialSecurityNumber", "socialSecurityNumber", "", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SocialSecurityNumberInput extends AdyenTextInputEditText {

    @NotNull
    private static final String SUPPORTED_CHARS = "0123456789./-";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        enforceMaxInputLength(SocialSecurityNumberUtils.INSTANCE.getCNPJ_MASK_SEPARATORS().size() + 14);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance(SUPPORTED_CHARS));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText
    public void afterTextChanged(@NotNull Editable editable) throws IOException {
        editable.getClass();
        String string = editable.toString();
        String input = SocialSecurityNumberUtils.INSTANCE.formatInput(string);
        if (!Intrinsics.areEqual(input, string)) {
            editable.replace(0, string.length(), input);
        }
        super.afterTextChanged(editable);
    }

    public final void setSocialSecurityNumber(@NotNull String socialSecurityNumber) {
        socialSecurityNumber.getClass();
        setText(SocialSecurityNumberUtils.INSTANCE.formatInput(socialSecurityNumber));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ SocialSecurityNumberInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
