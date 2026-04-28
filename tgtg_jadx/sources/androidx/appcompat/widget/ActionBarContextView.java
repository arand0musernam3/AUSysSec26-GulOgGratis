package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import b0.a0;
import com.app.tgtg.R;
import com.braze.h2;
import e20.m;
import o.l;
import o.z;
import p.g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20.b f1942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f1944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f1947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1952k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f1953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f1954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f1955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f1956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1960t;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int resourceId;
        super(context, attributeSet, i11);
        this.f1942a = new b20.b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1943b = context;
        } else {
            this.f1943b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24256d, i11, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : a0.x(context, resourceId));
        this.f1957q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1958r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1946e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1960t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, i11 - view.getMeasuredWidth());
    }

    public static int g(int i11, int i12, int i13, View view, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iA = org.bouncycastle.jcajce.provider.asymmetric.a.a(i13, measuredHeight, 2, i12);
        if (z11) {
            view.layout(i11 - measuredWidth, iA, i11, measuredHeight + iA);
        } else {
            view.layout(i11, iA, i11 + measuredWidth, measuredHeight + iA);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    public final void c(ActionMode actionMode) {
        View view = this.f1952k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1960t, (ViewGroup) this, false);
            this.f1952k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1952k);
        }
        View viewFindViewById = this.f1952k.findViewById(R.id.action_mode_close_button);
        this.l = viewFindViewById;
        viewFindViewById.setOnClickListener(new m(actionMode, 3));
        l lVarC = actionMode.c();
        a aVar = this.f1945d;
        if (aVar != null) {
            aVar.g();
            p.d dVar = aVar.f2138u;
            if (dVar != null && dVar.b()) {
                dVar.f31614i.dismiss();
            }
        }
        a aVar2 = new a(getContext());
        this.f1945d = aVar2;
        aVar2.f2130m = true;
        aVar2.f2131n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarC.b(this.f1945d, this.f1943b);
        a aVar3 = this.f1945d;
        z zVar = aVar3.f31499h;
        if (zVar == null) {
            z zVar2 = (z) aVar3.f31495d.inflate(aVar3.f31497f, (ViewGroup) this, false);
            aVar3.f31499h = zVar2;
            zVar2.b(aVar3.f31494c);
            aVar3.b(true);
        }
        z zVar3 = aVar3.f31499h;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(aVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f1944c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1944c, layoutParams);
    }

    public final void d() {
        if (this.f1954n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1954n = linearLayout;
            this.f1955o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1956p = (TextView) this.f1954n.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f1957q;
            if (i11 != 0) {
                this.f1955o.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f1958r;
            if (i12 != 0) {
                this.f1956p.setTextAppearance(getContext(), i12);
            }
        }
        this.f1955o.setText(this.f1950i);
        this.f1956p.setText(this.f1951j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1950i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1951j);
        this.f1956p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1954n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1954n.getParent() == null) {
            addView(this.f1954n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1953m = null;
        this.f1944c = null;
        this.f1945d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1947f != null ? this.f1942a.f5567a : getVisibility();
    }

    public int getContentHeight() {
        return this.f1946e;
    }

    public CharSequence getSubtitle() {
        return this.f1951j;
    }

    public CharSequence getTitle() {
        return this.f1950i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f1947f;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            super.setVisibility(i11);
        }
    }

    public final ViewPropertyAnimatorCompat i(int i11, long j9) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f1947f;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.b();
        }
        b20.b bVar = this.f1942a;
        if (i11 != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.c(this).a(0.0f);
            viewPropertyAnimatorCompatA.d(j9);
            ((ActionBarContextView) bVar.f5569c).f1947f = viewPropertyAnimatorCompatA;
            bVar.f5567a = i11;
            viewPropertyAnimatorCompatA.f(bVar);
            return viewPropertyAnimatorCompatA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA2 = ViewCompat.c(this).a(1.0f);
        viewPropertyAnimatorCompatA2.d(j9);
        ((ActionBarContextView) bVar.f5569c).f1947f = viewPropertyAnimatorCompatA2;
        bVar.f5567a = i11;
        viewPropertyAnimatorCompatA2.f(bVar);
        return viewPropertyAnimatorCompatA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, j.a.f24253a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        a aVar = this.f1945d;
        if (aVar != null) {
            aVar.f2134q = androidx.appcompat.view.a.a(aVar.f31493b).b();
            l lVar = aVar.f31494c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1945d;
        if (aVar != null) {
            aVar.g();
            p.d dVar = this.f1945d.f2138u;
            if (dVar == null || !dVar.b()) {
                return;
            }
            dVar.f31614i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1949h = false;
        }
        if (!this.f1949h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1949h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1949h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12 = g3.f33904a;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1952k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1952k.getLayoutParams();
            int i15 = z13 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i16 = z13 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i17 = z13 ? paddingRight - i15 : paddingRight + i15;
            int iG = g(i17, paddingTop, paddingTop2, this.f1952k, z13) + i17;
            paddingRight = z13 ? iG - i16 : iG + i16;
        }
        LinearLayout linearLayout = this.f1954n;
        if (linearLayout != null && this.f1953m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f1954n, z13);
        }
        View view2 = this.f1953m;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z13);
        }
        int paddingLeft = z13 ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1944c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            h2.b(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i12) == 0) {
            h2.b(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = this.f1946e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i12);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1952k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1952k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1944c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1944c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1954n;
        if (linearLayout != null && this.f1953m == null) {
            if (this.f1959s) {
                this.f1954n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1954n.getMeasuredWidth();
                boolean z11 = measuredWidth <= paddingLeft;
                if (z11) {
                    paddingLeft -= measuredWidth;
                }
                this.f1954n.setVisibility(z11 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f1953m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                iMin = Math.min(i15, iMin);
            }
            this.f1953m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(iMin, i16));
        }
        if (this.f1946e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1948g = false;
        }
        if (!this.f1948g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1948g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1948g = false;
        return true;
    }

    public void setContentHeight(int i11) {
        this.f1946e = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1953m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1953m = view;
        if (view != null && (linearLayout = this.f1954n) != null) {
            removeView(linearLayout);
            this.f1954n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1951j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1950i = charSequence;
        d();
        ViewCompat.d0(this, charSequence);
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.f1959s) {
            requestLayout();
        }
        this.f1959s = z11;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }
}
