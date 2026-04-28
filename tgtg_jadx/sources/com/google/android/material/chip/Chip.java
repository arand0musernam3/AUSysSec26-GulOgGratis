package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b0.a0;
import com.adyen.checkout.card.internal.ui.view.c;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import e20.d0;
import e20.f0;
import e20.i0;
import e20.j;
import ex.i;
import f7.f;
import h0.g;
import j20.d;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k10.e;
import lx.u;
import n20.b0;
import n20.o;
import n20.z;
import t10.a;
import t10.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements z, Checkable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Rect f12413x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f12414y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12415z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f12416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f12417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RippleDrawable f12418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f12419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f12421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12422k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f12428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f12429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f12431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f12432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f12433w;

    public Chip(Context context, AttributeSet attributeSet, int i11) {
        int resourceId;
        super(v20.a.a(context, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i11);
        this.f12431u = new Rect();
        this.f12432v = new RectF();
        int i12 = 1;
        this.f12433w = new d0(this, i12);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                h2.a("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                h2.a("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                h2.a("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                h2.a("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                h2.a("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        b bVar = new b(context2, attributeSet, i11);
        Context context3 = bVar.f39642u1;
        int[] iArr = j10.a.f24416i;
        TypedArray typedArrayM = i0.m(context3, attributeSet, iArr, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        bVar.U1 = typedArrayM.hasValue(37);
        Context context4 = bVar.f39642u1;
        ColorStateList colorStateListP = g.p(context4, typedArrayM, 24);
        if (bVar.H != colorStateListP) {
            bVar.H = colorStateListP;
            bVar.onStateChange(bVar.getState());
        }
        ColorStateList colorStateListP2 = g.p(context4, typedArrayM, 11);
        if (bVar.I != colorStateListP2) {
            bVar.I = colorStateListP2;
            bVar.onStateChange(bVar.getState());
        }
        float dimension = typedArrayM.getDimension(19, 0.0f);
        if (bVar.J != dimension) {
            bVar.J = dimension;
            bVar.invalidateSelf();
            bVar.M();
        }
        if (typedArrayM.hasValue(12)) {
            bVar.S(typedArrayM.getDimension(12, 0.0f));
        }
        bVar.X(g.p(context4, typedArrayM, 22));
        bVar.Y(typedArrayM.getDimension(23, 0.0f));
        bVar.i0(g.p(context4, typedArrayM, 36));
        String text = typedArrayM.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(bVar.O, text);
        f0 f0Var = bVar.A1;
        if (!zEquals) {
            bVar.O = text;
            f0Var.f15651e = true;
            bVar.invalidateSelf();
            bVar.M();
        }
        d dVar = (!typedArrayM.hasValue(0) || (resourceId = typedArrayM.getResourceId(0, 0)) == 0) ? null : new d(context4, resourceId);
        dVar.l = typedArrayM.getDimension(1, dVar.l);
        f0Var.c(dVar, context4);
        int i13 = typedArrayM.getInt(3, 0);
        if (i13 == 1) {
            bVar.R1 = TextUtils.TruncateAt.START;
        } else if (i13 == 2) {
            bVar.R1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i13 == 3) {
            bVar.R1 = TextUtils.TruncateAt.END;
        }
        bVar.W(typedArrayM.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            bVar.W(typedArrayM.getBoolean(15, false));
        }
        bVar.T(g.s(context4, typedArrayM, 14));
        if (typedArrayM.hasValue(17)) {
            bVar.V(g.p(context4, typedArrayM, 17));
        }
        bVar.U(typedArrayM.getDimension(16, -1.0f));
        bVar.f0(typedArrayM.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            bVar.f0(typedArrayM.getBoolean(26, false));
        }
        bVar.Z(g.s(context4, typedArrayM, 25));
        bVar.e0(g.p(context4, typedArrayM, 30));
        bVar.b0(typedArrayM.getDimension(28, 0.0f));
        bVar.O(typedArrayM.getBoolean(6, false));
        bVar.R(typedArrayM.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            bVar.R(typedArrayM.getBoolean(8, false));
        }
        bVar.P(g.s(context4, typedArrayM, 7));
        if (typedArrayM.hasValue(9)) {
            bVar.Q(g.p(context4, typedArrayM, 9));
        }
        bVar.f39632k1 = e.a(context4, typedArrayM, 39);
        bVar.f39633l1 = e.a(context4, typedArrayM, 33);
        float dimension2 = typedArrayM.getDimension(21, 0.0f);
        if (bVar.f39634m1 != dimension2) {
            bVar.f39634m1 = dimension2;
            bVar.invalidateSelf();
            bVar.M();
        }
        bVar.h0(typedArrayM.getDimension(35, 0.0f));
        bVar.g0(typedArrayM.getDimension(34, 0.0f));
        float dimension3 = typedArrayM.getDimension(41, 0.0f);
        if (bVar.f39637p1 != dimension3) {
            bVar.f39637p1 = dimension3;
            bVar.invalidateSelf();
            bVar.M();
        }
        float dimension4 = typedArrayM.getDimension(40, 0.0f);
        if (bVar.f39638q1 != dimension4) {
            bVar.f39638q1 = dimension4;
            bVar.invalidateSelf();
            bVar.M();
        }
        bVar.c0(typedArrayM.getDimension(29, 0.0f));
        bVar.a0(typedArrayM.getDimension(27, 0.0f));
        float dimension5 = typedArrayM.getDimension(13, 0.0f);
        if (bVar.f39641t1 != dimension5) {
            bVar.f39641t1 = dimension5;
            bVar.invalidateSelf();
            bVar.M();
        }
        int i14 = 4;
        bVar.T1 = typedArrayM.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM.recycle();
        i0.c(context2, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action);
        i0.d(context2, attributeSet, iArr, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action);
        this.f12425o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f12427q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, i.H(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(bVar);
        bVar.s(getElevation());
        i0.c(context2, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action);
        i0.d(context2, attributeSet, iArr, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f12429s = new a(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new b0(this, i12));
        }
        setChecked(this.f12422k);
        setText(bVar.O);
        setEllipsize(bVar.R1);
        h();
        if (!this.f12416e.S1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f12425o) {
            setMinHeight(this.f12427q);
        }
        this.f12426p = getLayoutDirection();
        super.setOnCheckedChangeListener(new c(this, i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f12432v;
        rectF.setEmpty();
        if (d() && this.f12419h != null) {
            b bVar = this.f12416e;
            Rect bounds = bVar.getBounds();
            rectF.setEmpty();
            if (bVar.l0()) {
                float f11 = bVar.f39641t1 + bVar.f39640s1 + bVar.t0 + bVar.f39639r1 + bVar.f39638q1;
                if (bVar.getLayoutDirection() == 0) {
                    float f12 = bounds.right;
                    rectF.right = f12;
                    rectF.left = f12 - f11;
                } else {
                    float f13 = bounds.left;
                    rectF.left = f13;
                    rectF.right = f13 + f11;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i11 = (int) closeIconTouchBounds.left;
        int i12 = (int) closeIconTouchBounds.top;
        int i13 = (int) closeIconTouchBounds.right;
        int i14 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f12431u;
        rect.set(i11, i12, i13, i14);
        return rect;
    }

    private d getTextAppearance() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.A1.f15653g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.f12423m != z11) {
            this.f12423m = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.l != z11) {
            this.l = z11;
            refreshDrawableState();
        }
    }

    public final void c(int i11) {
        this.f12427q = i11;
        if (!this.f12425o) {
            InsetDrawable insetDrawable = this.f12417f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f12417f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i11 - ((int) this.f12416e.J));
        int iMax2 = Math.max(0, i11 - this.f12416e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f12417f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f12417f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i12 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i13 = iMax > 0 ? iMax / 2 : 0;
        if (this.f12417f != null) {
            Rect rect = new Rect();
            this.f12417f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                f();
                return;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        this.f12417f = new InsetDrawable((Drawable) this.f12416e, i12, i13, i12, i13);
        f();
    }

    public final boolean d() {
        b bVar = this.f12416e;
        if (bVar == null) {
            return false;
        }
        Drawable drawable = bVar.Y;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f12430t ? super.dispatchHoverEvent(motionEvent) : this.f12429s.d(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f12430t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            t10.a r0 = r9.f12429s
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L84
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6e
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L84
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L84
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.h(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L84
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L84
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L84
            int r1 = r0.f47315i
            if (r1 == r2) goto L6c
            r4 = 16
            r0.j(r1, r4, r6)
        L6c:
            r4 = r3
            goto L84
        L6e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7a
            r1 = 2
            boolean r4 = r0.h(r1, r6)
            goto L84
        L7a:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L84
            boolean r4 = r0.h(r3, r6)
        L84:
            if (r4 == 0) goto L8b
            int r0 = r0.f47315i
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b bVar = this.f12416e;
        boolean zD0 = false;
        int i11 = 0;
        zD0 = false;
        if (bVar != null && b.L(bVar.Y)) {
            b bVar2 = this.f12416e;
            ?? IsEnabled = isEnabled();
            int i12 = IsEnabled;
            if (this.f12424n) {
                i12 = IsEnabled + 1;
            }
            int i13 = i12;
            if (this.f12423m) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (this.l) {
                i14 = i13 + 1;
            }
            int i15 = i14;
            if (isChecked()) {
                i15 = i14 + 1;
            }
            int[] iArr = new int[i15];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            }
            if (this.f12424n) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f12423m) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.l) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            zD0 = bVar2.d0(iArr);
        }
        if (zD0) {
            invalidate();
        }
    }

    public final void e() {
        b bVar;
        if (!d() || (bVar = this.f12416e) == null || !bVar.X || this.f12419h == null) {
            ViewCompat.b0(this, null);
            this.f12430t = false;
        } else {
            ViewCompat.b0(this, this.f12429s);
            this.f12430t = true;
        }
    }

    public final void f() {
        this.f12418g = new RippleDrawable(k20.a.c(this.f12416e.N), getBackgroundDrawable(), null);
        this.f12416e.getClass();
        setBackground(this.f12418g);
        g();
    }

    public final void g() {
        b bVar;
        if (TextUtils.isEmpty(getText()) || (bVar = this.f12416e) == null) {
            return;
        }
        int I = (int) (bVar.I() + bVar.f39641t1 + bVar.f39638q1);
        b bVar2 = this.f12416e;
        int iH = (int) (bVar2.H() + bVar2.f39634m1 + bVar2.f39637p1);
        if (this.f12417f != null) {
            Rect rect = new Rect();
            this.f12417f.getPadding(rect);
            iH += rect.left;
            I += rect.right;
        }
        setPaddingRelative(iH, getPaddingTop(), I, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f12428r)) {
            return this.f12428r;
        }
        b bVar = this.f12416e;
        if (bVar == null || !bVar.f39627g1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof t10.d) && ((t10.d) parent).f39652h.f15577a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12417f;
        return insetDrawable == null ? this.f12416e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39630i1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39631j1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return Math.max(0.0f, bVar.J());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12416e;
    }

    public float getChipEndPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39641t1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        b bVar = this.f12416e;
        if (bVar == null || (drawable = bVar.Q) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.V;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.T;
        }
        return null;
    }

    public float getChipMinHeight() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.J;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39634m1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.M;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        b bVar = this.f12416e;
        if (bVar == null || (drawable = bVar.Y) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39626f1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39640s1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.t0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39639r1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39628h0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.R1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f12430t) {
            a aVar = this.f12429s;
            if (aVar.f47315i == 1 || aVar.f47314h == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public e getHideMotionSpec() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39633l1;
        }
        return null;
    }

    public float getIconEndPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39636o1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39635n1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.N;
        }
        return null;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.f12416e.f30345b.f30318a;
    }

    public e getShowMotionSpec() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39632k1;
        }
        return null;
    }

    public float getTextEndPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39638q1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        b bVar = this.f12416e;
        if (bVar != null) {
            return bVar.f39637p1;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        b bVar = this.f12416e;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f12433w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.P(this, this.f12416e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12414y);
        }
        b bVar = this.f12416e;
        if (bVar != null && bVar.f39627g1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12415z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.f12430t) {
            a aVar = this.f12429s;
            int i12 = aVar.f47315i;
            if (i12 != Integer.MIN_VALUE) {
                aVar.a(i12);
            }
            if (z11) {
                aVar.h(i11, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        b bVar = this.f12416e;
        int i12 = 0;
        accessibilityNodeInfo.setCheckable(bVar != null && bVar.f39627g1);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof t10.d) {
            t10.d dVar = (t10.d) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZ0 = AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo);
            if (dVar.f15662c) {
                int i13 = 0;
                while (true) {
                    if (i12 >= dVar.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    View childAt = dVar.getChildAt(i12);
                    if ((childAt instanceof Chip) && dVar.getChildAt(i12).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i13;
            } else {
                i11 = -1;
            }
            Object tag = getTag(com.app.tgtg.R.id.row_index_key);
            accessibilityNodeInfoCompatZ0.k0(i7.e.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i11, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), AppConstants.RESULT_CODE_AUTO_REFUND) : super.onResolvePointerIcon(motionEvent, i11);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f12426p != i11) {
            this.f12426p = i11;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f12419h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f12430t
            if (r0 == 0) goto L43
            t10.a r0 = r5.f12429s
            r0.o(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f12428r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12418g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12418g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i11) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.O(z11);
        }
    }

    public void setCheckableResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.O(bVar.f39642u1.getResources().getBoolean(i11));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        b bVar = this.f12416e;
        if (bVar == null) {
            this.f12422k = z11;
        } else if (bVar.f39627g1) {
            super.setChecked(z11);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.P(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.P(a0.x(bVar.f39642u1, i11));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Q(androidx.core.app.e.b(bVar.f39642u1, i11));
        }
    }

    public void setCheckedIconVisible(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.R(bVar.f39642u1.getResources().getBoolean(i11));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.I == colorStateList) {
            return;
        }
        bVar.I = colorStateList;
        bVar.onStateChange(bVar.getState());
    }

    public void setChipBackgroundColorResource(int i11) {
        ColorStateList colorStateListB;
        b bVar = this.f12416e;
        if (bVar == null || bVar.I == (colorStateListB = androidx.core.app.e.b(bVar.f39642u1, i11))) {
            return;
        }
        bVar.I = colorStateListB;
        bVar.onStateChange(bVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.S(f11);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.S(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setChipDrawable(@NonNull b bVar) {
        b bVar2 = this.f12416e;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.Q1 = new WeakReference(null);
            }
            this.f12416e = bVar;
            bVar.S1 = false;
            bVar.Q1 = new WeakReference(this);
            c(this.f12427q);
        }
    }

    public void setChipEndPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.f39641t1 == f11) {
            return;
        }
        bVar.f39641t1 = f11;
        bVar.invalidateSelf();
        bVar.M();
    }

    public void setChipEndPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            float dimension = bVar.f39642u1.getResources().getDimension(i11);
            if (bVar.f39641t1 != dimension) {
                bVar.f39641t1 = dimension;
                bVar.invalidateSelf();
                bVar.M();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.T(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.T(a0.x(bVar.f39642u1, i11));
        }
    }

    public void setChipIconSize(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.U(f11);
        }
    }

    public void setChipIconSizeResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.U(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.V(androidx.core.app.e.b(bVar.f39642u1, i11));
        }
    }

    public void setChipIconVisible(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.W(bVar.f39642u1.getResources().getBoolean(i11));
        }
    }

    public void setChipMinHeight(float f11) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.J == f11) {
            return;
        }
        bVar.J = f11;
        bVar.invalidateSelf();
        bVar.M();
    }

    public void setChipMinHeightResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            float dimension = bVar.f39642u1.getResources().getDimension(i11);
            if (bVar.J != dimension) {
                bVar.J = dimension;
                bVar.invalidateSelf();
                bVar.M();
            }
        }
    }

    public void setChipStartPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.f39634m1 == f11) {
            return;
        }
        bVar.f39634m1 = f11;
        bVar.invalidateSelf();
        bVar.M();
    }

    public void setChipStartPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            float dimension = bVar.f39642u1.getResources().getDimension(i11);
            if (bVar.f39634m1 != dimension) {
                bVar.f39634m1 = dimension;
                bVar.invalidateSelf();
                bVar.M();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.X(androidx.core.app.e.b(bVar.f39642u1, i11));
        }
    }

    public void setChipStrokeWidth(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Y(f11);
        }
    }

    public void setChipStrokeWidthResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Y(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(Drawable drawable) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Z(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.f39626f1 == charSequence) {
            return;
        }
        String str = f7.b.f17455b;
        f7.b bVar2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f7.b.f17458e : f7.b.f17457d;
        bVar2.getClass();
        c40.i iVar = f.f17465a;
        bVar.f39626f1 = bVar2.c(charSequence);
        bVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.a0(f11);
        }
    }

    public void setCloseIconEndPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.a0(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setCloseIconResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.Z(a0.x(bVar.f39642u1, i11));
        }
        e();
    }

    public void setCloseIconSize(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.b0(f11);
        }
    }

    public void setCloseIconSizeResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.b0(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setCloseIconStartPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.c0(f11);
        }
    }

    public void setCloseIconStartPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.c0(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.e0(androidx.core.app.e.b(bVar.f39642u1, i11));
        }
    }

    public void setCloseIconVisible(int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            h2.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            h2.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            h2.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            h2.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            h2.a("Please set start drawable using R.attr#chipIcon.");
        } else if (i13 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
        } else {
            h2.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            h2.a("Please set start drawable using R.attr#chipIcon.");
        } else if (i13 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
        } else {
            h2.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.s(f11);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12416e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            h2.a("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.R1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.f12425o = z11;
        c(this.f12427q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i11);
        }
    }

    public void setHideMotionSpec(e eVar) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.f39633l1 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.f39633l1 = e.b(bVar.f39642u1, i11);
        }
    }

    public void setIconEndPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.g0(f11);
        }
    }

    public void setIconEndPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.g0(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setIconStartPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.h0(f11);
        }
    }

    public void setIconStartPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.h0(bVar.f39642u1.getResources().getDimension(i11));
        }
    }

    public void setInternalOnCheckedChangeListener(j jVar) {
        this.f12421j = jVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f12416e == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 <= 1) {
            super.setLines(i11);
        } else {
            h2.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 <= 1) {
            super.setMaxLines(i11);
        } else {
            h2.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.T1 = i11;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 <= 1) {
            super.setMinLines(i11);
        } else {
            h2.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12420i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12419h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.i0(colorStateList);
        }
        this.f12416e.getClass();
        f();
    }

    public void setRippleColorResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.i0(androidx.core.app.e.b(bVar.f39642u1, i11));
            this.f12416e.getClass();
            f();
        }
    }

    @Override // n20.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        this.f12416e.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(e eVar) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.f39632k1 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.f39632k1 = e.b(bVar.f39642u1, i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (z11) {
            super.setSingleLine(z11);
        } else {
            h2.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        b bVar = this.f12416e;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.S1 ? null : charSequence, bufferType);
        b bVar2 = this.f12416e;
        if (bVar2 == null || TextUtils.equals(bVar2.O, charSequence)) {
            return;
        }
        bVar2.O = charSequence;
        bVar2.A1.f15651e = true;
        bVar2.invalidateSelf();
        bVar2.M();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        b bVar = this.f12416e;
        if (bVar != null) {
            Context context2 = bVar.f39642u1;
            bVar.A1.c(new d(context2, i11), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.f39638q1 == f11) {
            return;
        }
        bVar.f39638q1 = f11;
        bVar.invalidateSelf();
        bVar.M();
    }

    public void setTextEndPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            float dimension = bVar.f39642u1.getResources().getDimension(i11);
            if (bVar.f39638q1 != dimension) {
                bVar.f39638q1 = dimension;
                bVar.invalidateSelf();
                bVar.M();
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        super.setTextSize(i11, f11);
        b bVar = this.f12416e;
        if (bVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i11, f11, getResources().getDisplayMetrics());
            f0 f0Var = bVar.A1;
            d dVar = f0Var.f15653g;
            if (dVar != null) {
                dVar.l = fApplyDimension;
                f0Var.f15647a.setTextSize(fApplyDimension);
                bVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f11) {
        b bVar = this.f12416e;
        if (bVar == null || bVar.f39637p1 == f11) {
            return;
        }
        bVar.f39637p1 = f11;
        bVar.invalidateSelf();
        bVar.M();
    }

    public void setTextStartPaddingResource(int i11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            float dimension = bVar.f39642u1.getResources().getDimension(i11);
            if (bVar.f39637p1 != dimension) {
                bVar.f39637p1 = dimension;
                bVar.invalidateSelf();
                bVar.M();
            }
        }
    }

    public void setCloseIconVisible(boolean z11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.f0(z11);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.R(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.W(z11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            h2.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            h2.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            h2.a("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            h2.a("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(d dVar) {
        b bVar = this.f12416e;
        if (bVar != null) {
            bVar.A1.c(dVar, bVar.f39642u1);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        b bVar = this.f12416e;
        if (bVar != null) {
            Context context = bVar.f39642u1;
            bVar.A1.c(new d(context, i11), context);
        }
        h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
