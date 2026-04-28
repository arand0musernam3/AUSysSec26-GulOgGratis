package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import com.google.android.material.timepicker.TimePickerView;
import e20.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n20.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12367r = 0;
    public final LinkedHashSet l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f12372q;

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i11);
        this.l = new LinkedHashSet();
        this.f12368m = false;
        this.f12372q = new HashSet();
        TypedArray typedArrayM = i0.m(getContext(), attributeSet, j10.a.f24431y, i11, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM.getBoolean(7, false));
        this.f12371p = typedArrayM.getResourceId(2, -1);
        this.f12370o = typedArrayM.getBoolean(4, false);
        if (this.f12381f == null) {
            this.f12381f = f0.b(new n20.a(0.0f));
        }
        setEnabled(typedArrayM.getBoolean(0, true));
        typedArrayM.recycle();
        setImportantForAccessibility(1);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.f12369n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && getChildAt(i12).getVisibility() != 8) {
                i11++;
            }
        }
        return i11;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.e, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        ViewCompat.b0(materialButton, new g(this, 0));
    }

    public final void f(int i11, boolean z11) {
        if (i11 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i11);
            return;
        }
        HashSet hashSet = new HashSet(this.f12372q);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.f12369n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.f12370o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f12372q;
        this.f12372q = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = ((MaterialButton) getChildAt(i11)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f12368m = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f12368m = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    TimePickerView timePickerView = ((w20.e) it.next()).f43091a;
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f12369n || this.f12372q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f12372q.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = ((MaterialButton) getChildAt(i11)).getId();
            if (this.f12372q.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f12371p;
        if (i11 != -1) {
            g(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo).j0(i7.d.a(1, getVisibleButtonCount(), this.f12369n ? 1 : 2, false));
    }

    public void setSelectionRequired(boolean z11) {
        this.f12370o = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.f12369n != z11) {
            this.f12369n = z11;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ((MaterialButton) getChildAt(i11)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }
}
