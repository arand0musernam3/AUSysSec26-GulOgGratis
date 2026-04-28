package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.app.tgtg.R;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0015J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0007H\u0004J\u0010\u0010\u0019\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$Listener;", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "textWatcher", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "enforceMaxInputLength", "maxLength", "setOnChangeListener", "Companion", "Listener", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AdyenTextInputEditText extends TextInputEditText {
    protected static final int NO_MAX_LENGTH = -1;

    @Nullable
    private Listener listener;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText$Listener;", "", "onTextChanged", "", "editable", "Landroid/text/Editable;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onTextChanged(@NotNull Editable editable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11 == 0 ? R.attr.editTextStyle : i11);
        context.getClass();
        addTextChangedListener(getTextWatcher());
    }

    private final TextWatcher getTextWatcher() {
        return new TextWatcher() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText$textWatcher$1
            private boolean isEditing;

            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s7) {
                s7.getClass();
                if (this.isEditing) {
                    return;
                }
                this.isEditing = true;
                this.this$0.afterTextChanged(s7);
                this.isEditing = false;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s7, int start, int count, int after) {
                s7.getClass();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s7, int start, int before, int count) {
                s7.getClass();
            }
        };
    }

    public void afterTextChanged(@NotNull Editable editable) {
        Listener listener;
        editable.getClass();
        if (!isEnabled() || (listener = this.listener) == null) {
            return;
        }
        listener.onTextChanged(editable);
    }

    public final void enforceMaxInputLength(int maxLength) {
        if (maxLength != -1) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
        }
    }

    @NotNull
    public String getRawValue() {
        String string;
        Editable text = getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final void setOnChangeListener(@Nullable Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AdyenTextInputEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenTextInputEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
