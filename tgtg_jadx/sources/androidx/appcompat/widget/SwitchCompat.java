package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import b0.a0;
import l8.j;
import p.e1;
import p.g3;
import p.p0;
import p.q;
import p.t2;
import p.u2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final c20.d T = new c20.d(11, "thumbPos", Float.class);
    public static final int[] V = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public n.a M;
    public ObjectAnimator N;
    public q O;
    public t2 P;
    public final Rect Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f2073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f2074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f2078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2083k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f2086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f2087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f2088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f2089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2092u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f2093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f2094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VelocityTracker f2095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2096y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f2097z;

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2074b = null;
        this.f2075c = null;
        this.f2076d = false;
        this.f2077e = false;
        this.f2079g = null;
        this.f2080h = null;
        this.f2081i = false;
        this.f2082j = false;
        this.f2095x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        u2.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.a.f24275x;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        ViewCompat.a0(this, context, iArr, attributeSet, typedArray, i11, 0);
        Drawable drawableK = gVarT.k(2);
        this.f2073a = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(this);
        }
        Drawable drawableK2 = gVarT.k(11);
        this.f2078f = drawableK2;
        if (drawableK2 != null) {
            drawableK2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f2090s = typedArray.getBoolean(3, true);
        this.f2083k = typedArray.getDimensionPixelSize(8, 0);
        this.l = typedArray.getDimensionPixelSize(5, 0);
        this.f2084m = typedArray.getDimensionPixelSize(6, 0);
        this.f2085n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListJ = gVarT.j(9);
        if (colorStateListJ != null) {
            this.f2074b = colorStateListJ;
            this.f2076d = true;
        }
        PorterDuff.Mode modeC = e1.c(typedArray.getInt(10, -1), null);
        if (this.f2075c != modeC) {
            this.f2075c = modeC;
            this.f2077e = true;
        }
        if (this.f2076d || this.f2077e) {
            a();
        }
        ColorStateList colorStateListJ2 = gVarT.j(12);
        if (colorStateListJ2 != null) {
            this.f2079g = colorStateListJ2;
            this.f2081i = true;
        }
        PorterDuff.Mode modeC2 = e1.c(typedArray.getInt(13, -1), null);
        if (this.f2080h != modeC2) {
            this.f2080h = modeC2;
            this.f2082j = true;
        }
        if (this.f2081i || this.f2082j) {
            b();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        new p0(this).f(attributeSet, i11);
        gVarT.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2092u = viewConfiguration.getScaledTouchSlop();
        this.f2096y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i11);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new q(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        return this.f2097z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z11 = g3.f33904a;
        int layoutDirection = getLayoutDirection();
        float f11 = this.f2097z;
        if (layoutDirection == 1) {
            f11 = 1.0f - f11;
        }
        return (int) ((f11 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2078f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2073a;
        Rect rectB = drawable2 != null ? e1.b(drawable2) : e1.f33883c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f2088q = charSequence;
        q emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE0 = ((w.b) emojiTextViewHelper.f33981b.f24851a).e0(this.M);
        if (transformationMethodE0 != null) {
            charSequence = transformationMethodE0.getTransformation(charSequence, this);
        }
        this.f2089r = charSequence;
        this.L = null;
        if (this.f2090s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f2086o = charSequence;
        q emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE0 = ((w.b) emojiTextViewHelper.f33981b.f24851a).e0(this.M);
        if (transformationMethodE0 != null) {
            charSequence = transformationMethodE0.getTransformation(charSequence, this);
        }
        this.f2087p = charSequence;
        this.K = null;
        if (this.f2090s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f2073a;
        if (drawable != null) {
            if (this.f2076d || this.f2077e) {
                Drawable drawableMutate = drawable.mutate();
                this.f2073a = drawableMutate;
                if (this.f2076d) {
                    drawableMutate.setTintList(this.f2074b);
                }
                if (this.f2077e) {
                    this.f2073a.setTintMode(this.f2075c);
                }
                if (this.f2073a.isStateful()) {
                    this.f2073a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2078f;
        if (drawable != null) {
            if (this.f2081i || this.f2082j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2078f = drawableMutate;
                if (this.f2081i) {
                    drawableMutate.setTintList(this.f2079g);
                }
                if (this.f2082j) {
                    this.f2078f.setTintMode(this.f2080h);
                }
                if (this.f2078f.isStateful()) {
                    this.f2078f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f2086o);
        setTextOffInternal(this.f2088q);
        requestLayout();
    }

    public final void d() {
        if (this.P == null && ((w.b) this.O.f33981b.f24851a).S() && j.d()) {
            j jVarA = j.a();
            int iC = jVarA.c();
            if (iC == 3 || iC == 0) {
                t2 t2Var = new t2(this);
                this.P = t2Var;
                jVarA.h(t2Var);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i11;
        int i12;
        int i13 = this.D;
        int i14 = this.E;
        int i15 = this.F;
        int i16 = this.G;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f2073a;
        Rect rectB = drawable != null ? e1.b(drawable) : e1.f33883c;
        Drawable drawable2 = this.f2078f;
        Rect rect = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i17 = rect.left;
            thumbOffset += i17;
            if (rectB != null) {
                int i18 = rectB.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rectB.top;
                int i21 = rect.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = rectB.right;
                int i23 = rect.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rectB.bottom;
                int i25 = rect.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                }
                this.f2078f.setBounds(i13, i11, i15, i12);
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f2078f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f2073a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i26 = thumbOffset - rect.left;
            int i27 = thumbOffset + this.C + rect.right;
            this.f2073a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f2073a;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
        Drawable drawable2 = this.f2078f;
        if (drawable2 != null) {
            drawable2.setHotspot(f11, f12);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2073a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f2078f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z11 = g3.f33904a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2084m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z11 = g3.f33904a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2084m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.a.P(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f2090s;
    }

    public boolean getSplitTrack() {
        return this.f2085n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.f2084m;
    }

    public CharSequence getTextOff() {
        return this.f2088q;
    }

    public CharSequence getTextOn() {
        return this.f2086o;
    }

    public Drawable getThumbDrawable() {
        return this.f2073a;
    }

    public final float getThumbPosition() {
        return this.f2097z;
    }

    public int getThumbTextPadding() {
        return this.f2083k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2074b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2075c;
    }

    public Drawable getTrackDrawable() {
        return this.f2078f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2079g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2080h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2073a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2078f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f2078f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.E;
        int i12 = this.G;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f2073a;
        if (drawable != null) {
            if (!this.f2085n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = e1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            TextPaint textPaint = this.I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i13 + i14) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f2086o : this.f2088q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z11, i11, i12, i13, i14);
        int iMax2 = 0;
        if (this.f2073a != null) {
            Drawable drawable = this.f2078f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = e1.b(this.f2073a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z12 = g3.f33904a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i15 = this.B;
            int i16 = height2 - (i15 / 2);
            height = i15 + i16;
            paddingTop = i16;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.B;
        }
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f2090s) {
            StaticLayout staticLayout = this.K;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f2087p;
                this.K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.f2089r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f2073a;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f2073a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f2073a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f2090s ? (this.f2083k * 2) + Math.max(this.K.getWidth(), this.L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f2078f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f2078f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f2073a;
        if (drawable3 != null) {
            Rect rectB = e1.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        boolean z11 = this.H;
        int iMax3 = this.l;
        if (z11) {
            iMax3 = Math.max(iMax3, (this.C * 2) + iMax + iMax2);
        }
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2086o : this.f2088q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f2086o;
                if (string == null) {
                    string = getResources().getString(com.app.tgtg.R.string.abc_capital_on);
                }
                ViewCompat.o0(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f2088q;
            if (string2 == null) {
                string2 = getResources().getString(com.app.tgtg.R.string.abc_capital_off);
            }
            ViewCompat.o0(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, T, zIsChecked ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
        setTextOnInternal(this.f2086o);
        setTextOffInternal(this.f2088q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z11) {
        this.H = z11;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z11) {
        if (this.f2090s != z11) {
            this.f2090s = z11;
            requestLayout();
            if (z11) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z11) {
        this.f2085n = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.l = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.f2084m = i11;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i11) {
        ColorStateList colorStateList;
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, j.a.f24276y);
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = androidx.core.app.e.b(context, resourceId)) == null) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        if (colorStateList != null) {
            this.J = colorStateList;
        } else {
            this.J = getTextColors();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f11 = dimensionPixelSize;
            TextPaint textPaint = this.I;
            if (f11 != textPaint.getTextSize()) {
                textPaint.setTextSize(f11);
                requestLayout();
            }
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(1, -1);
        setSwitchTypeface(i12 != 1 ? i12 != 2 ? i12 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, typedArrayObtainStyledAttributes.getInt(2, -1));
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            Context context2 = getContext();
            n.a aVar = new n.a();
            aVar.f30266a = context2.getResources().getConfiguration().locale;
            this.M = aVar;
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f2086o);
        setTextOffInternal(this.f2088q);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i11) {
        TextPaint textPaint = this.I;
        if (i11 <= 0) {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
            textPaint.setFakeBoldText((i12 & 1) != 0);
            textPaint.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f2088q;
        if (string == null) {
            string = getResources().getString(com.app.tgtg.R.string.abc_capital_off);
        }
        ViewCompat.o0(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f2086o;
        if (string == null) {
            string = getResources().getString(com.app.tgtg.R.string.abc_capital_on);
        }
        ViewCompat.o0(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2073a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2073a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f11) {
        this.f2097z = f11;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(a0.x(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.f2083k = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2074b = colorStateList;
        this.f2076d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2075c = mode;
        this.f2077e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2078f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2078f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(a0.x(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2079g = colorStateList;
        this.f2081i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2080h = mode;
        this.f2082j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2073a || drawable == this.f2078f;
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }
}
