package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a0;
import com.app.tgtg.R;
import com.braze.h2;
import com.google.android.material.appbar.AppBarLayout;
import e20.i0;
import h0.g;
import java.util.LinkedHashSet;
import l20.a;
import l20.b;
import l20.c;
import lx.u;
import n20.j;
import n20.o;
import org.bouncycastle.i18n.MessageBundle;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final FrameLayout f12532f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final int f12533g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TextView f12534h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f12535h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final ColorStateList f12536i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final boolean f12537j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final boolean f12538k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final c f12539l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final Drawable f12540m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final boolean f12541n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final boolean f12542o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public View f12543p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final Integer f12544q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public Drawable f12545r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f12546s1;
    public final TextView t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f12547t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final j f12548u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f12549v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f12550w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public ActionMenuView f12551x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public ImageButton f12552y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final a f12553z1;

    public SearchBar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Material3_SearchBar), attributeSet, i11);
        this.f12546s1 = -1;
        this.f12553z1 = new a(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", MessageBundle.TITLE_ENTRY) != null) {
                h2.a("SearchBar does not support title. Use hint or text instead.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                h2.a("SearchBar does not support subtitle. Use hint or text instead.");
                throw null;
            }
        }
        Drawable drawableX = a0.x(context2, getDefaultNavigationIconResource());
        this.f12540m1 = drawableX;
        c cVar = new c(0);
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f12539l1 = cVar;
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.R, i11, R.style.Widget_Material3_SearchBar, new int[0]);
        o oVarA = o.c(context2, attributeSet, i11, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayM.getColor(4, 0);
        this.f12533g1 = color;
        this.f12536i1 = g.p(context2, typedArrayM, 11);
        float dimension = typedArrayM.getDimension(7, 0.0f);
        this.f12538k1 = typedArrayM.getBoolean(5, true);
        this.f12547t1 = typedArrayM.getBoolean(6, true);
        boolean z11 = typedArrayM.getBoolean(9, false);
        this.f12542o1 = typedArrayM.getBoolean(8, false);
        this.f12541n1 = typedArrayM.getBoolean(16, true);
        if (typedArrayM.hasValue(12)) {
            this.f12544q1 = Integer.valueOf(typedArrayM.getColor(12, -1));
        }
        int resourceId = typedArrayM.getResourceId(0, -1);
        String string = typedArrayM.getString(2);
        String string2 = typedArrayM.getString(3);
        float dimension2 = typedArrayM.getDimension(14, -1.0f);
        int color2 = typedArrayM.getColor(13, 0);
        this.f12549v1 = typedArrayM.getBoolean(15, false);
        this.f12535h1 = typedArrayM.getBoolean(10, false);
        this.f12550w1 = typedArrayM.getDimensionPixelSize(1, -1);
        typedArrayM.recycle();
        if (!z11) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableX);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.f12537j1 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f12534h0 = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.t0 = textView2;
        this.f12532f1 = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.f12549v1);
        j jVar = new j(oVarA);
        this.f12548u1 = jVar;
        jVar.p(getContext());
        this.f12548u1.s(dimension);
        if (dimension2 >= 0.0f) {
            j jVar2 = this.f12548u1;
            jVar2.A(dimension2);
            jVar2.z(ColorStateList.valueOf(color2));
        }
        int iY = e.y(R.attr.colorControlHighlight, this);
        this.f12548u1.t(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iY);
        j jVar3 = this.f12548u1;
        setBackground(new RippleDrawable(colorStateListValueOf, jVar3, jVar3));
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z11) {
        ImageButton imageButtonK = i0.k(this);
        if (imageButtonK == null) {
            return;
        }
        imageButtonK.setClickable(!z11);
        imageButtonK.setFocusable(!z11);
        Drawable background = imageButtonK.getBackground();
        if (background != null) {
            this.f12545r1 = background;
        }
        imageButtonK.setBackgroundDrawable(z11 ? null : this.f12545r1);
        y();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f12537j1 && this.f12543p1 == null && !(view instanceof ActionMenuView)) {
            this.f12543p1 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i11, layoutParams);
    }

    public View getCenterView() {
        return this.f12543p1;
    }

    public float getCompatElevation() {
        j jVar = this.f12548u1;
        return jVar != null ? jVar.f30345b.f30330n : getElevation();
    }

    public float getCornerSize() {
        return this.f12548u1.m();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.f12534h0.getHint();
    }

    public int getMaxWidth() {
        return this.f12550w1;
    }

    public int getMenuResId() {
        return this.f12546s1;
    }

    public TextView getPlaceholderTextView() {
        return this.t0;
    }

    public int getStrokeColor() {
        return this.f12548u1.f30345b.f30322e.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f12548u1.f30345b.f30328k;
    }

    @NonNull
    public CharSequence getText() {
        return this.f12534h0.getText();
    }

    public boolean getTextCentered() {
        return this.f12549v1;
    }

    @NonNull
    public TextView getTextView() {
        return this.f12534h0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i11) {
        super.m(i11);
        this.f12546s1 = i11;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.P(this, this.f12548u1);
        if (this.f12538k1 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i11 = marginLayoutParams.leftMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i11;
            int i12 = marginLayoutParams.topMargin;
            if (i12 == 0) {
                i12 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i12;
            int i13 = marginLayoutParams.rightMargin;
            if (i13 != 0) {
                dimensionPixelSize = i13;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i14 = marginLayoutParams.bottomMargin;
            if (i14 != 0) {
                dimensionPixelSize2 = i14;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        z();
        if (this.f12535h1) {
            x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.f12221r.remove(this.f12553z1);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f12543p1;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i15 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i16 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i15, measuredHeight2, getMeasuredWidth() - measuredWidth2, i16);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i15, i16);
            }
        }
        y();
        TextView textView = this.f12534h0;
        if (textView == null || !this.f12549v1) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.f12532f1;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z12 = getLayoutDirection() == 1;
        if (this.f12551x1 == null) {
            this.f12551x1 = i0.h(this);
        }
        View view2 = this.f12551x1;
        if (this.f12552y1 == null) {
            this.f12552y1 = i0.k(this);
        }
        ImageButton imageButton = this.f12552y1;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i17 = measuredWidth6 + measuredWidth4;
        int i18 = measuredWidth7 + measuredWidth4;
        View view3 = z12 ? view2 : imageButton;
        if (z12) {
            view2 = imageButton;
        }
        int iMax = view3 != null ? Math.max(view3.getRight() - i17, 0) : 0;
        int i19 = i17 + iMax;
        int i21 = i18 + iMax;
        int iMax2 = view2 != null ? Math.max(i21 - view2.getLeft(), 0) : 0;
        int i22 = i19 - iMax2;
        int i23 = i21 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i22, getContentInsetLeft() - i22), 0)) - Math.max(Math.max(i23 - (getMeasuredWidth() - getPaddingRight()), i23 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13 = this.f12550w1;
        if (i13 >= 0 && i13 < View.MeasureSpec.getSize(i11)) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f12550w1, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i11, i12);
        View view = this.f12543p1;
        if (view != null) {
            view.measure(i11, i12);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f45418a);
        setText(bVar.f26792c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        CharSequence text = getText();
        bVar.f26792c = text == null ? null : text.toString();
        return bVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f12543p1;
        if (view2 != null) {
            removeView(view2);
            this.f12543p1 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z11) {
        this.f12547t1 = z11;
        z();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        j jVar = this.f12548u1;
        if (jVar != null) {
            jVar.s(f11);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f12534h0.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z11) {
        this.f12535h1 = z11;
        if (z11) {
            x();
            return;
        }
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.f12221r.remove(this.f12553z1);
        }
    }

    public void setMaxWidth(int i11) {
        if (this.f12550w1 != i11) {
            this.f12550w1 = i11;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iY;
        if (this.f12541n1 && drawable != null) {
            Integer num = this.f12544q1;
            if (num != null) {
                iY = num.intValue();
            } else {
                iY = e.y(drawable == this.f12540m1 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(iY);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f12542o1) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z11) {
        this.f12539l1.getClass();
    }

    public void setPlaceholderText(String str) {
        this.t0.setText(str);
    }

    public void setStrokeColor(int i11) {
        if (getStrokeColor() != i11) {
            this.f12548u1.z(ColorStateList.valueOf(i11));
        }
    }

    public void setStrokeWidth(float f11) {
        if (getStrokeWidth() != f11) {
            this.f12548u1.A(f11);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f12534h0.setText(charSequence);
        this.t0.setText(charSequence);
    }

    public void setTextCentered(boolean z11) {
        this.f12549v1 = z11;
        TextView textView = this.f12534h0;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z11) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.t0.setLayoutParams(layoutParams);
    }

    public final void x() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.f12536i1 == null) {
            return;
        }
        appBarLayoutParentIfExists.f12221r.add(this.f12553z1);
    }

    public final void y() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z11 = getLayoutDirection() == 1;
        ImageButton imageButtonK = i0.k(this);
        int width = (imageButtonK == null || !imageButtonK.isClickable()) ? 0 : z11 ? getWidth() - imageButtonK.getLeft() : imageButtonK.getRight();
        ActionMenuView actionMenuViewH = i0.h(this);
        int right = actionMenuViewH != null ? z11 ? actionMenuViewH.getRight() : getWidth() - actionMenuViewH.getLeft() : 0;
        float f11 = -(z11 ? right : width);
        if (!z11) {
            width = right;
        }
        setHandwritingBoundsOffsets(f11, 0.0f, -width, 0.0f);
    }

    public final void z() {
        if (getLayoutParams() instanceof AppBarLayout.a) {
            AppBarLayout.a aVar = (AppBarLayout.a) getLayoutParams();
            if (this.f12547t1) {
                if (aVar.f12234a == 0) {
                    aVar.f12234a = 53;
                }
            } else if (aVar.f12234a == 53) {
                aVar.f12234a = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f12554g;

        public ScrollingViewBehavior() {
            this.f12554g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, s6.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.f12554g && (view2 instanceof AppBarLayout)) {
                this.f12554g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12554g = false;
        }
    }

    public void setHint(int i11) {
        this.f12534h0.setHint(i11);
    }

    public void setText(int i11) {
        this.f12534h0.setText(i11);
        this.t0.setText(i11);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public SearchBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }
}
