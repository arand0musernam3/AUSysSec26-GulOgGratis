package t10;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import com.google.android.material.chip.Chip;
import e20.h;
import e20.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class d extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f39651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e20.a f39652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f39654j;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i11);
        e20.a aVar = new e20.a();
        this.f39652h = aVar;
        g gVar = new g(this);
        this.f39654j = gVar;
        TypedArray typedArrayM = i0.m(getContext(), attributeSet, j10.a.f24417j, i11, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM.getBoolean(5, false));
        setSingleSelection(typedArrayM.getBoolean(6, false));
        setSelectionRequired(typedArrayM.getBoolean(4, false));
        this.f39653i = typedArrayM.getResourceId(0, -1);
        typedArrayM.recycle();
        aVar.f15581e = new c(this);
        super.setOnHierarchyChangeListener(gVar);
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof Chip) && getChildAt(i12).getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    @Override // e20.h
    public final boolean a() {
        return this.f15662c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f39652h.f();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f39652h.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f39649e;
    }

    public int getChipSpacingVertical() {
        return this.f39650f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f39653i;
        if (i11 != -1) {
            e20.a aVar = this.f39652h;
            Chip chip = (Chip) ((HashMap) aVar.f15579c).get(Integer.valueOf(i11));
            if (chip != null && aVar.b(chip)) {
                aVar.g();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo).j0(i7.d.a(getRowCount(), this.f15662c ? getVisibleChipCount() : -1, this.f39652h.f15577a ? 1 : 2, false));
    }

    public void setChipSpacing(int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(int i11) {
        if (this.f39649e != i11) {
            this.f39649e = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(int i11) {
        if (this.f39650f != i11) {
            this.f39650f = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(e eVar) {
        if (eVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new m1.a(this));
        }
    }

    public void setOnCheckedStateChangeListener(f fVar) {
        this.f39651g = fVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f39654j.f39655a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.f39652h.f15578b = z11;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(boolean z11) {
        e20.a aVar = this.f39652h;
        if (aVar.f15577a != z11) {
            aVar.f15577a = z11;
            boolean zIsEmpty = ((HashSet) aVar.f15580d).isEmpty();
            Iterator it = ((HashMap) aVar.f15579c).values().iterator();
            while (it.hasNext()) {
                aVar.j((Chip) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            aVar.g();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // e20.h
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public d(Context context) {
        this(context, null);
    }
}
