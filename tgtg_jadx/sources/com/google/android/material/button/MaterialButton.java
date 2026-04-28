package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import b0.a0;
import com.braze.h2;
import e20.i0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k8.h;
import k8.i;
import lx.u;
import n20.h0;
import n20.j;
import n20.j0;
import n20.n;
import n20.o;
import n20.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, z {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private static final float OPTICAL_CENTER_RATIO = 0.11f;
    private static final int UNSET = -1;
    private String accessibilityClassName;
    int allowedWidthDecrease;
    private boolean broadcasting;
    private boolean checked;
    private float displayedWidthDecrease;
    private float displayedWidthIncrease;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private boolean isInHorizontalButtonGroup;

    @NonNull
    private final f materialButtonHelper;

    @NonNull
    private final LinkedHashSet<b> onCheckedChangeListeners;
    private c onPressedChangeListenerInternal;
    private boolean opticalCenterEnabled;
    private int opticalCenterShift;
    private int orientation;
    private LinearLayout.LayoutParams originalLayoutParams;
    private int originalPaddingEnd;
    private int originalPaddingStart;
    private float originalWidth;
    j0 sizeChange;
    int widthChangeMax;
    private i widthIncreaseSpringAnimation;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = com.app.tgtg.R.style.Widget_MaterialComponents_Button;
    private static final int MATERIAL_SIZE_OVERLAY_ATTR = com.app.tgtg.R.attr.materialSizeOverlay;
    private static final h WIDTH_INCREASE = new a(0);

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(v20.a.b(context, attributeSet, i11, i12, new int[]{MATERIAL_SIZE_OVERLAY_ATTR}), attributeSet, i11);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        this.orientation = -1;
        this.originalWidth = -1.0f;
        this.originalPaddingStart = -1;
        this.originalPaddingEnd = -1;
        this.allowedWidthDecrease = -1;
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24429w, i11, i12, new int[0]);
        this.iconPadding = typedArrayM.getDimensionPixelSize(13, 0);
        int i13 = typedArrayM.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iconTintMode = i0.o(i13, mode);
        this.iconTint = h0.g.p(getContext(), typedArrayM, 15);
        this.icon = h0.g.s(getContext(), typedArrayM, 11);
        this.iconGravity = typedArrayM.getInteger(12, 1);
        this.iconSize = typedArrayM.getDimensionPixelSize(14, 0);
        h0 h0VarB = h0.b(context2, typedArrayM, 19);
        o oVarC = h0VarB != null ? h0VarB.c() : o.c(context2, attributeSet, i11, i12).a();
        boolean z11 = typedArrayM.getBoolean(17, false);
        f fVar = new f(this, oVarC);
        this.materialButtonHelper = fVar;
        fVar.f12391f = typedArrayM.getDimensionPixelOffset(2, 0);
        fVar.f12392g = typedArrayM.getDimensionPixelOffset(3, 0);
        fVar.f12393h = typedArrayM.getDimensionPixelOffset(4, 0);
        fVar.f12394i = typedArrayM.getDimensionPixelOffset(5, 0);
        if (typedArrayM.hasValue(9)) {
            int dimensionPixelSize = typedArrayM.getDimensionPixelSize(9, -1);
            fVar.f12395j = dimensionPixelSize;
            n nVarH = fVar.f12387b.h();
            nVarH.b(dimensionPixelSize);
            fVar.f12387b = nVarH.a();
            fVar.f12388c = null;
            fVar.d();
            fVar.f12403s = true;
        }
        fVar.f12396k = typedArrayM.getDimensionPixelSize(22, 0);
        fVar.l = i0.o(typedArrayM.getInt(8, -1), mode);
        fVar.f12397m = h0.g.p(getContext(), typedArrayM, 7);
        fVar.f12398n = h0.g.p(getContext(), typedArrayM, 21);
        fVar.f12399o = h0.g.p(getContext(), typedArrayM, 18);
        fVar.f12404t = typedArrayM.getBoolean(6, false);
        fVar.f12407w = typedArrayM.getDimensionPixelSize(10, 0);
        fVar.f12405u = typedArrayM.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM.hasValue(0)) {
            fVar.f12402r = true;
            setSupportBackgroundTintList(fVar.f12397m);
            setSupportBackgroundTintMode(fVar.l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f12391f, paddingTop + fVar.f12393h, paddingEnd + fVar.f12392g, paddingBottom + fVar.f12394i);
        setCheckedInternal(typedArrayM.getBoolean(1, false));
        if (h0VarB != null) {
            fVar.f12389d = c();
            if (fVar.f12388c != null) {
                fVar.d();
            }
            fVar.f12388c = h0VarB;
            fVar.d();
        }
        setOpticalCenterEnabled(z11);
        typedArrayM.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        g(this.icon != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.opticalCenterShift = materialButton.getOpticalCenterShift();
        materialButton.i();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f11) {
        int i11 = (int) (f11 * OPTICAL_CENTER_RATIO);
        if (materialButton.opticalCenterShift != i11) {
            materialButton.opticalCenterShift = i11;
            materialButton.i();
            materialButton.invalidate();
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.displayedWidthIncrease;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.opticalCenterEnabled && this.isInHorizontalButtonGroup && (jVarA = this.materialButtonHelper.a(false)) != null) {
            return (int) (jVarA.j() * OPTICAL_CENTER_RATIO);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i11));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z11) {
        if (!isCheckable() || this.checked == z11) {
            return;
        }
        this.checked = z11;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z12 = this.checked;
            if (!materialButtonToggleGroup.f12368m) {
                materialButtonToggleGroup.f(getId(), z12);
            }
        }
        if (this.broadcasting) {
            return;
        }
        this.broadcasting = true;
        Iterator<b> it = this.onCheckedChangeListeners.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        this.broadcasting = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f11) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.displayedWidthIncrease != f11) {
            this.displayedWidthIncrease = f11;
            i();
            invalidate();
            if (getParent() instanceof e) {
                e eVar = (e) getParent();
                int i11 = (int) this.displayedWidthIncrease;
                int iIndexOfChild = eVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i12 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i12 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (eVar.c(i12)) {
                            materialButton2 = (MaterialButton) eVar.getChildAt(i12);
                            break;
                        }
                        i12--;
                    }
                }
                int childCount = eVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (eVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) eVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i11);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i11);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i11 / 2);
                materialButton.setDisplayedWidthDecrease((i11 + 1) / 2);
            }
        }
    }

    public void addOnCheckedChangeListener(@NonNull b bVar) {
        this.onCheckedChangeListeners.add(bVar);
    }

    public final k8.j c() {
        Context context = getContext();
        TypedValue typedValueF = ex.i.F(context, com.app.tgtg.R.attr.motionSpringFastSpatial);
        int[] iArr = j10.a.G;
        TypedArray typedArrayObtainStyledAttributes = typedValueF == null ? context.obtainStyledAttributes(null, iArr, 0, com.app.tgtg.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueF.resourceId, iArr);
        k8.j jVar = new k8.j();
        try {
            float f11 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f12 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f12 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            jVar.b(f11);
            jVar.a(f12);
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    public final boolean d() {
        f fVar = this.materialButtonHelper;
        return (fVar == null || fVar.f12402r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r9) {
        /*
            r8 = this;
            n20.j0 r0 = r8.sizeChange
            if (r0 != 0) goto L6
            goto L89
        L6:
            k8.i r0 = r8.widthIncreaseSpringAnimation
            if (r0 != 0) goto L19
            k8.i r0 = new k8.i
            k8.h r1 = com.google.android.material.button.MaterialButton.WIDTH_INCREASE
            r0.<init>(r8, r1)
            r8.widthIncreaseSpringAnimation = r0
            k8.j r1 = r8.c()
            r0.f26164m = r1
        L19:
            boolean r0 = r8.isInHorizontalButtonGroup
            if (r0 == 0) goto L89
            int r0 = r8.widthChangeMax
            n20.j0 r1 = r8.sizeChange
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f30371c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f30369a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.f30371c
            r5 = r4
        L42:
            int r6 = r1.f30369a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            jd.f r1 = r1.f30370b
            goto L5d
        L59:
            jd.f[] r1 = r1.f30372d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f24983b
            ke.d r1 = (ke.d) r1
            int r2 = r8.getWidth()
            float r3 = r1.f26299a
            java.lang.Object r1 = r1.f26300b
            n20.i0 r1 = (n20.i0) r1
            n20.i0 r5 = n20.i0.PERCENT
            if (r1 != r5) goto L73
            float r1 = (float) r2
            float r3 = r3 * r1
        L71:
            int r4 = (int) r3
            goto L78
        L73:
            n20.i0 r2 = n20.i0.PIXELS
            if (r1 != r2) goto L78
            goto L71
        L78:
            int r0 = java.lang.Math.min(r0, r4)
            k8.i r1 = r8.widthIncreaseSpringAnimation
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L89
            k8.i r9 = r8.widthIncreaseSpringAnimation
            r9.d()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.e(boolean):void");
    }

    public final void f() {
        int i11 = this.iconGravity;
        if (i11 == 1 || i11 == 2) {
            setCompoundDrawablesRelative(this.icon, null, null, null);
            return;
        }
        if (i11 == 3 || i11 == 4) {
            setCompoundDrawablesRelative(null, null, this.icon, null);
        } else if (i11 == 16 || i11 == 32) {
            setCompoundDrawablesRelative(null, this.icon, null, null);
        }
    }

    public final void g(boolean z11) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.icon = drawableMutate;
            drawableMutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i11 = this.iconLeft;
            int i12 = this.iconTop;
            drawable2.setBounds(i11, i12, intrinsicWidth + i11, intrinsicHeight + i12);
            this.icon.setVisible(true, z11);
        }
        if (z11) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.iconGravity;
        if (((i13 == 1 || i13 == 2) && drawable3 != this.icon) || (((i13 == 3 || i13 == 4) && drawable5 != this.icon) || ((i13 == 16 || i13 == 32) && drawable4 != this.icon))) {
            f();
        }
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    public int getAllowedWidthDecrease() {
        return this.allowedWidthDecrease;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (d()) {
            return this.materialButtonHelper.f12395j;
        }
        return 0;
    }

    public k8.j getCornerSpringForce() {
        return this.materialButtonHelper.f12389d;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.f12394i;
    }

    public int getInsetTop() {
        return this.materialButtonHelper.f12393h;
    }

    public ColorStateList getRippleColor() {
        if (d()) {
            return this.materialButtonHelper.f12399o;
        }
        return null;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        if (d()) {
            return this.materialButtonHelper.f12387b;
        }
        h2.b("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public h0 getStateListShapeAppearanceModel() {
        if (d()) {
            return this.materialButtonHelper.f12388c;
        }
        h2.b("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (d()) {
            return this.materialButtonHelper.f12398n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (d()) {
            return this.materialButtonHelper.f12396k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return d() ? this.materialButtonHelper.f12397m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return d() ? this.materialButtonHelper.l : super.getSupportBackgroundTintMode();
    }

    public final void h(int i11, int i12) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        int i13 = this.iconGravity;
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            if (i13 == 16 || i13 == 32) {
                this.iconLeft = 0;
                if (i13 == 16) {
                    this.iconTop = 0;
                    g(false);
                    return;
                }
                int intrinsicHeight = this.iconSize;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.icon.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i12 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
                if (this.iconTop != iMax) {
                    this.iconTop = iMax;
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.iconTop = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i14 = this.iconGravity;
        if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.iconLeft = 0;
            g(false);
            return;
        }
        int intrinsicWidth = this.iconSize;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.icon.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i11 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.iconPadding) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.iconGravity == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.iconLeft != textLayoutWidth) {
            this.iconLeft = textLayoutWidth;
            g(false);
        }
    }

    public final void i() {
        int i11 = (int) (this.displayedWidthIncrease - this.displayedWidthDecrease);
        int i12 = (i11 / 2) + this.opticalCenterShift;
        getLayoutParams().width = (int) (this.originalWidth + i11);
        setPaddingRelative(this.originalPaddingStart + i12, getPaddingTop(), (this.originalPaddingEnd + i11) - i12, getPaddingBottom());
    }

    public boolean isCheckable() {
        f fVar = this.materialButtonHelper;
        return fVar != null && fVar.f12404t;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isOpticalCenterEnabled() {
        return this.opticalCenterEnabled;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.f12405u;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d()) {
            u.P(this, this.materialButtonHelper.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        super.onLayout(z11, i11, i12, i13, i14);
        h(getMeasuredWidth(), getMeasuredHeight());
        int i16 = getResources().getConfiguration().orientation;
        if (this.orientation != i16) {
            this.orientation = i16;
            this.originalWidth = -1.0f;
        }
        if (this.originalWidth == -1.0f) {
            this.originalWidth = getMeasuredWidth();
            if (this.originalLayoutParams == null && (getParent() instanceof e) && ((e) getParent()).getButtonSizeChange() != null) {
                this.originalLayoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.originalLayoutParams);
                layoutParams.width = (int) this.originalWidth;
                setLayoutParams(layoutParams);
            }
        }
        boolean z12 = false;
        if (this.allowedWidthDecrease == -1) {
            if (this.icon == null) {
                i15 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.iconSize;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.icon.getIntrinsicWidth();
                }
                i15 = iconPadding + intrinsicWidth;
            }
            this.allowedWidthDecrease = (getMeasuredWidth() - getTextLayoutWidth()) - i15;
        }
        if (this.originalPaddingStart == -1) {
            this.originalPaddingStart = getPaddingStart();
        }
        if (this.originalPaddingEnd == -1) {
            this.originalPaddingEnd = getPaddingEnd();
        }
        if ((getParent() instanceof e) && ((e) getParent()).getOrientation() == 0) {
            z12 = true;
        }
        this.isInHorizontalButtonGroup = z12;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f45418a);
        setChecked(dVar.f12374c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f12374c = this.checked;
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.materialButtonHelper.f12405u) {
            toggle();
        }
        return super.performClick();
    }

    public void recoverOriginalLayoutParams() {
        LinearLayout.LayoutParams layoutParams = this.originalLayoutParams;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.originalLayoutParams = null;
            this.originalWidth = -1.0f;
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull b bVar) {
        this.onCheckedChangeListeners.remove(bVar);
    }

    public void setA11yClassName(String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (!d()) {
            super.setBackgroundColor(i11);
            return;
        }
        f fVar = this.materialButtonHelper;
        if (fVar.a(false) != null) {
            fVar.a(false).setTint(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!d()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        f fVar = this.materialButtonHelper;
        fVar.f12402r = true;
        MaterialButton materialButton = fVar.f12386a;
        materialButton.setSupportBackgroundTintList(fVar.f12397m);
        materialButton.setSupportBackgroundTintMode(fVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i11) {
        setBackgroundDrawable(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (d()) {
            this.materialButtonHelper.f12404t = z11;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedInternal(z11);
    }

    public void setCornerRadius(int i11) {
        if (d()) {
            f fVar = this.materialButtonHelper;
            if (fVar.f12403s && fVar.f12395j == i11) {
                return;
            }
            fVar.f12395j = i11;
            fVar.f12403s = true;
            n nVarH = fVar.f12387b.h();
            nVarH.b(i11);
            fVar.f12387b = nVarH.a();
            fVar.f12388c = null;
            fVar.d();
        }
    }

    public void setCornerRadiusResource(int i11) {
        if (d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCornerSpringForce(@NonNull k8.j jVar) {
        f fVar = this.materialButtonHelper;
        fVar.f12389d = jVar;
        if (fVar.f12388c != null) {
            fVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i11) {
        this.displayedWidthDecrease = Math.min(i11, this.allowedWidthDecrease);
        i();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        if (d()) {
            this.materialButtonHelper.a(false).s(f11);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.iconGravity != i11) {
            this.iconGravity = i11;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i11) {
        if (this.iconPadding != i11) {
            this.iconPadding = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(int i11) {
        setIcon(i11 != 0 ? a0.x(getContext(), i11) : null);
    }

    public void setIconSize(int i11) {
        if (i11 < 0) {
            i4.a.f("iconSize cannot be less than 0");
        } else if (this.iconSize != i11) {
            this.iconSize = i11;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i11) {
        setIconTint(androidx.core.app.e.b(getContext(), i11));
    }

    public void setInsetBottom(int i11) {
        f fVar = this.materialButtonHelper;
        fVar.b(fVar.f12393h, i11);
    }

    public void setInsetTop(int i11) {
        f fVar = this.materialButtonHelper;
        fVar.b(i11, fVar.f12394i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.onPressedChangeListenerInternal = cVar;
    }

    public void setOpticalCenterEnabled(boolean z11) {
        if (this.opticalCenterEnabled != z11) {
            this.opticalCenterEnabled = z11;
            f fVar = this.materialButtonHelper;
            if (z11) {
                w.z zVar = new w.z(this, 20);
                fVar.f12390e = zVar;
                j jVarA = fVar.a(false);
                if (jVarA != null) {
                    jVarA.E = zVar;
                }
            } else {
                fVar.f12390e = null;
                j jVarA2 = fVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.E = null;
                }
            }
            post(new al.u(this, 24));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        c cVar = this.onPressedChangeListenerInternal;
        if (cVar != null) {
            ((e) ((se.b) cVar).f39010b).invalidate();
        }
        super.setPressed(z11);
        e(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (d()) {
            f fVar = this.materialButtonHelper;
            MaterialButton materialButton = fVar.f12386a;
            if (fVar.f12399o != colorStateList) {
                fVar.f12399o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(k20.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i11) {
        if (d()) {
            setRippleColor(androidx.core.app.e.b(getContext(), i11));
        }
    }

    @Override // n20.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        if (!d()) {
            h2.b("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        f fVar = this.materialButtonHelper;
        fVar.f12387b = oVar;
        fVar.f12388c = null;
        fVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (d()) {
            f fVar = this.materialButtonHelper;
            fVar.f12401q = z11;
            fVar.e();
        }
    }

    public void setSizeChange(@NonNull j0 j0Var) {
        if (this.sizeChange != j0Var) {
            this.sizeChange = j0Var;
            e(true);
        }
    }

    public void setStateListShapeAppearanceModel(@NonNull h0 h0Var) {
        if (!d()) {
            h2.b("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        if (this.materialButtonHelper.f12389d == null && h0Var.d()) {
            f fVar = this.materialButtonHelper;
            fVar.f12389d = c();
            if (fVar.f12388c != null) {
                fVar.d();
            }
        }
        f fVar2 = this.materialButtonHelper;
        fVar2.f12388c = h0Var;
        fVar2.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (d()) {
            f fVar = this.materialButtonHelper;
            if (fVar.f12398n != colorStateList) {
                fVar.f12398n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i11) {
        if (d()) {
            setStrokeColor(androidx.core.app.e.b(getContext(), i11));
        }
    }

    public void setStrokeWidth(int i11) {
        if (d()) {
            f fVar = this.materialButtonHelper;
            if (fVar.f12396k != i11) {
                fVar.f12396k = i11;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i11) {
        if (d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!d()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        f fVar = this.materialButtonHelper;
        if (fVar.f12397m != colorStateList) {
            fVar.f12397m = colorStateList;
            if (fVar.a(false) != null) {
                fVar.a(false).setTintList(fVar.f12397m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!d()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        f fVar = this.materialButtonHelper;
        if (fVar.l != mode) {
            fVar.l = mode;
            if (fVar.a(false) == null || fVar.l == null) {
                return;
            }
            fVar.a(false).setTintMode(fVar.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i11) {
        super.setTextAlignment(i11);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z11) {
        this.materialButtonHelper.f12405u = z11;
    }

    @Override // android.widget.TextView
    public void setWidth(int i11) {
        this.originalWidth = -1.0f;
        super.setWidth(i11);
    }

    public void setWidthChangeMax(int i11) {
        if (this.widthChangeMax != i11) {
            this.widthChangeMax = i11;
            e(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }
}
