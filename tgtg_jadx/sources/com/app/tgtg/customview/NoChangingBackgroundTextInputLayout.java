package com.app.tgtg.customview;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class NoChangingBackgroundTextInputLayout extends TextInputLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoChangingBackgroundTextInputLayout(@Nullable Context context) {
        super(context);
        context.getClass();
    }

    private final ColorFilter getBackgroundDefaultColorFilter() {
        EditText editText = getEditText();
        if (editText == null || editText.getBackground() == null) {
            return null;
        }
        EditText editText2 = getEditText();
        editText2.getClass();
        return editText2.getBackground().getColorFilter();
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        Drawable background;
        ColorFilter backgroundDefaultColorFilter = getBackgroundDefaultColorFilter();
        super.drawableStateChanged();
        EditText editText = getEditText();
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        background.setColorFilter(backgroundDefaultColorFilter);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(@Nullable CharSequence charSequence) {
        Drawable background;
        ColorFilter backgroundDefaultColorFilter = getBackgroundDefaultColorFilter();
        super.setError(charSequence);
        EditText editText = getEditText();
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        background.setColorFilter(backgroundDefaultColorFilter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoChangingBackgroundTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoChangingBackgroundTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }
}
