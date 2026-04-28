package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.app.tgtg.R;
import e20.i0;
import h0.g;
import java.util.List;
import java.util.Locale;
import n20.j;
import p.e0;
import p.t;
import p.v1;
import t20.q;
import v20.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1 f12635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f12636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f12637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f12639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f12640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12641k;
    public ColorStateList l;

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, 0), attributeSet, i11);
        this.f12637g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24428v, i11, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM.hasValue(0) && typedArrayM.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f12638h = typedArrayM.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f12639i = typedArrayM.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i12 = 2;
        if (typedArrayM.hasValue(2)) {
            this.f12640j = ColorStateList.valueOf(typedArrayM.getColor(2, 0));
        }
        this.f12641k = typedArrayM.getColor(4, 0);
        this.l = g.p(context2, typedArrayM, 5);
        this.f12636f = (AccessibilityManager) context2.getSystemService("accessibility");
        v1 v1Var = new v1(context2, null, R.attr.listPopupWindowStyle);
        this.f12635e = v1Var;
        v1Var.f34063y = true;
        t tVar = v1Var.f34064z;
        tVar.setFocusable(true);
        v1Var.f34053o = this;
        tVar.setInputMethodMode(2);
        v1Var.o(getAdapter());
        v1Var.f34054p = new e0(this, i12);
        if (typedArrayM.hasValue(6)) {
            setSimpleItems(typedArrayM.getResourceId(6, 0));
        }
        typedArrayM.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f12636f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f12635e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f12640j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.F) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f12639i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f12641k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12635e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                v1 v1Var = this.f12635e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !v1Var.f34064z.isShowing() ? -1 : v1Var.f34042c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = v1Var.f34064z.getBackground();
                if (background != null) {
                    Rect rect = this.f12637g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z11);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t9) {
        super.setAdapter(t9);
        this.f12635e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        v1 v1Var = this.f12635e;
        if (v1Var != null) {
            v1Var.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i11) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i11));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f12640j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof j) {
            ((j) dropDownBackground).t(this.f12640j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12635e.f34055q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i11) {
        super.setRawInputType(i11);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i11) {
        this.f12641k = i11;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new q(this, getContext(), this.f12638h, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f12635e.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i11) {
        setSimpleItems(getResources().getStringArray(i11));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }
}
