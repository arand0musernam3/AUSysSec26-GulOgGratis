package com.app.tgtg.feature.orderview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OrderSwiper extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f9161b;

    public /* synthetic */ OrderSwiper(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f9161b == null || motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            Drawable drawable = this.f9161b;
            drawable.getClass();
            drawable.getBounds().getClass();
            if (motionEvent.getX() > r0.width() + r0.left) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(@Nullable Drawable drawable) {
        super.setThumb(drawable);
        this.f9161b = drawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderSwiper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSwiper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderSwiper(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
