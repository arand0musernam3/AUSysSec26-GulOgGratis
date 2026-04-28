package com.app.tgtg.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BottomFadingScrollView extends ScrollView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomFadingScrollView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    @Override // android.widget.ScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomFadingScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomFadingScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }
}
