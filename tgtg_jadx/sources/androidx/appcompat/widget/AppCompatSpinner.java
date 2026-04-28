package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import h20.u;
import p.a0;
import p.b0;
import p.d0;
import p.h0;
import p.i0;
import p.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2015i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f2018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f2019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f2021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f2023h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, android.content.res.Resources.Theme r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f2023h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f2016a;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i0 i0Var = this.f2021f;
        return i0Var != null ? i0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i0 i0Var = this.f2021f;
        return i0Var != null ? i0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2021f != null ? this.f2022g : super.getDropDownWidth();
    }

    public final i0 getInternalPopup() {
        return this.f2021f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i0 i0Var = this.f2021f;
        return i0Var != null ? i0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2017b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i0 i0Var = this.f2021f;
        return i0Var != null ? i0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f2016a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f2016a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i0 i0Var = this.f2021f;
        if (i0Var == null || !i0Var.a()) {
            return;
        }
        i0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f2021f == null || View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h0 h0Var = (h0) parcelable;
        super.onRestoreInstanceState(h0Var.getSuperState());
        if (!h0Var.f33908a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new u(this, 3));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h0 h0Var = new h0(super.onSaveInstanceState());
        i0 i0Var = this.f2021f;
        h0Var.f33908a = i0Var != null && i0Var.a();
        return h0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.f2018c;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i0 i0Var = this.f2021f;
        if (i0Var == null) {
            return super.performClick();
        }
        if (i0Var.a()) {
            return true;
        }
        i0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2020e) {
            this.f2019d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i0 i0Var = this.f2021f;
        if (i0Var != null) {
            Context context = this.f2017b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d0 d0Var = new d0();
            d0Var.f33875a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                d0Var.f33876b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                b0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            i0Var.o(d0Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f2016a;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.f2016a;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i11) {
        i0 i0Var = this.f2021f;
        if (i0Var == null) {
            super.setDropDownHorizontalOffset(i11);
        } else {
            i0Var.l(i11);
            i0Var.d(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i11) {
        i0 i0Var = this.f2021f;
        if (i0Var != null) {
            i0Var.k(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i11) {
        if (this.f2021f != null) {
            this.f2022g = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i0 i0Var = this.f2021f;
        if (i0Var != null) {
            i0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(b0.a0.x(getPopupContext(), i11));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i0 i0Var = this.f2021f;
        if (i0Var != null) {
            i0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f2016a;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f2016a;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public AppCompatSpinner(Context context, int i11) {
        this(context, null, com.app.tgtg.R.attr.spinnerStyle, i11);
    }

    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, null);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }
}
