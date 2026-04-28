package com.app.tgtg.customview;

import ag.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.a0;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p30.b;
import pg.c;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f8910a = c.a(LayoutInflater.from(getContext()), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1452g, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        j(context, typedArrayObtainStyledAttributes);
    }

    public final void j(Context context, TypedArray typedArray) {
        Drawable drawableX;
        typedArray.getClass();
        try {
            c cVar = this.f8910a;
            TextView textView = (TextView) cVar.f34806g;
            ImageView imageView = (ImageView) cVar.f34802c;
            textView.setText(typedArray.getString(3));
            ((TextView) cVar.f34807h).setText(typedArray.getString(isInEditMode() ? 6 : 2));
            ((ImageView) cVar.f34804e).setVisibility(typedArray.getBoolean(1, true) ? 0 : 8);
            int resourceId = typedArray.getResourceId(0, -1);
            TextView textView2 = (TextView) cVar.f34806g;
            Resources resources = getResources();
            ThreadLocal threadLocal = j.f43256a;
            textView2.setTextColor(typedArray.getColor(4, resources.getColor(R.color.neutral_80, null)));
            if (resourceId == -1 || (drawableX = a0.x(context, resourceId)) == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawableX);
            }
            typedArray.recycle();
        } catch (Throwable th2) {
            typedArray.recycle();
            throw th2;
        }
    }

    public final void setEmailBreadcrumb(boolean z11) {
        b.E((AppCompatImageView) this.f8910a.f34805f, z11);
    }

    public final void setExpiredPaymentBreadcrumb(boolean z11) {
        ((ImageView) this.f8910a.f34803d).setVisibility(z11 ? 0 : 8);
    }

    public final void setSubTitle(@Nullable String str) {
        ((TextView) this.f8910a.f34807h).setText(str);
    }

    public final void setTitle(@Nullable String str) {
        ((TextView) this.f8910a.f34806g).setText(str);
    }

    public final void setTitle(int i11) {
        ((TextView) this.f8910a.f34806g).setText(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItemView(@Nullable Context context) {
        super(context);
        context.getClass();
        this.f8910a = c.a(LayoutInflater.from(getContext()), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8910a = c.a(LayoutInflater.from(getContext()), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1452g, i11, 0);
        typedArrayObtainStyledAttributes.getClass();
        j(context, typedArrayObtainStyledAttributes);
    }
}
