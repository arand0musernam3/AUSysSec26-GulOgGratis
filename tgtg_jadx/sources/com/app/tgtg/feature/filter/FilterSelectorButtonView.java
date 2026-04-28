package com.app.tgtg.feature.filter;

import ag.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import c50.w;
import com.app.tgtg.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.a1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class FilterSelectorButtonView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f8992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterSelectorButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.filters_button_item, (ViewGroup) this, false);
        addView(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i12 = R.id.icon;
        ImageView imageView = (ImageView) g.t(R.id.icon, viewInflate);
        if (imageView != null) {
            i12 = R.id.title;
            TextView textView = (TextView) g.t(R.id.title, viewInflate);
            if (textView != null) {
                this.f8992a = new a1(linearLayout, linearLayout, imageView, textView);
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1448c, 0, 0);
                    typedArrayObtainStyledAttributes.getClass();
                    a1 a1Var = this.f8992a;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                    if (resourceId == -1) {
                        a1Var.f34768c.setVisibility(8);
                    } else {
                        a1Var.f34768c.setImageResource(resourceId);
                    }
                    a1Var.f34769d.setText(typedArrayObtainStyledAttributes.getString(1));
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
                return;
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    public final void a(boolean z11) {
        a1 a1Var = this.f8992a;
        TextView textView = a1Var.f34769d;
        LinearLayout linearLayout = a1Var.f34767b;
        Context context = getContext();
        int i11 = R.color.primary_30;
        textView.setTextColor(context.getColor(z11 ? R.color.neutral_10 : R.color.primary_30));
        a1Var.f34768c.setImageTintList(ColorStateList.valueOf(getContext().getColor(z11 ? R.color.neutral_10 : R.color.primary_30)));
        Context context2 = getContext();
        if (!z11) {
            i11 = R.color.neutral_10;
        }
        ViewCompat.f0(linearLayout, ColorStateList.valueOf(context2.getColor(i11)));
        ViewCompat.h0(linearLayout, z11 ? 0.0f : 10.0f);
    }

    @NotNull
    public final a1 getBinding() {
        return this.f8992a;
    }

    public final void setBinding(@NotNull a1 a1Var) {
        a1Var.getClass();
        this.f8992a = a1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterSelectorButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterSelectorButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FilterSelectorButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
