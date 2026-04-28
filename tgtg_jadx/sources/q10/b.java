package q10;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import b0.a0;
import e20.i0;
import h0.g;
import lx.u;
import n20.j;
import n20.n;
import n20.o;
import n20.z;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends CardView implements Checkable, z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f35873k = {R.attr.state_checkable};
    public static final int[] l = {R.attr.state_checked};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f35874m = {com.app.tgtg.R.attr.state_dragged};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f35875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f35876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35878j;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public b(Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_CardView), attributeSet, i11);
        this.f35877i = false;
        this.f35878j = false;
        this.f35876h = true;
        TypedArray typedArrayM = i0.m(getContext(), attributeSet, j10.a.B, i11, com.app.tgtg.R.style.Widget_MaterialComponents_CardView, new int[0]);
        d dVar = new d(this, attributeSet, i11);
        this.f35875g = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = dVar.f35883c;
        jVar.t(cardBackgroundColor);
        dVar.f35882b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.l();
        b bVar = dVar.f35881a;
        ColorStateList colorStateListP = g.p(bVar.getContext(), typedArrayM, 11);
        dVar.f35893n = colorStateListP;
        if (colorStateListP == null) {
            dVar.f35893n = ColorStateList.valueOf(-1);
        }
        dVar.f35888h = typedArrayM.getDimensionPixelSize(12, 0);
        boolean z11 = typedArrayM.getBoolean(0, false);
        dVar.f35898s = z11;
        bVar.setLongClickable(z11);
        dVar.l = g.p(bVar.getContext(), typedArrayM, 6);
        dVar.g(g.s(bVar.getContext(), typedArrayM, 2));
        dVar.f35886f = typedArrayM.getDimensionPixelSize(5, 0);
        dVar.f35885e = typedArrayM.getDimensionPixelSize(4, 0);
        dVar.f35887g = typedArrayM.getInteger(3, 8388661);
        ColorStateList colorStateListP2 = g.p(bVar.getContext(), typedArrayM, 7);
        dVar.f35891k = colorStateListP2;
        if (colorStateListP2 == null) {
            dVar.f35891k = ColorStateList.valueOf(e.y(com.app.tgtg.R.attr.colorControlHighlight, bVar));
        }
        ColorStateList colorStateListP3 = g.p(bVar.getContext(), typedArrayM, 1);
        colorStateListP3 = colorStateListP3 == null ? ColorStateList.valueOf(0) : colorStateListP3;
        j jVar2 = dVar.f35884d;
        jVar2.t(colorStateListP3);
        RippleDrawable rippleDrawable = dVar.f35894o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.f35891k);
        }
        jVar.s(bVar.getCardElevation());
        float f11 = dVar.f35888h;
        ColorStateList colorStateList = dVar.f35893n;
        jVar2.A(f11);
        jVar2.z(colorStateList);
        bVar.setBackgroundInternal(dVar.d(jVar));
        Drawable drawableC = dVar.j() ? dVar.c() : jVar2;
        dVar.f35889i = drawableC;
        bVar.setForeground(dVar.d(drawableC));
        typedArrayM.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f35875g.f35883c.getBounds());
        return rectF;
    }

    public final void f() {
        d dVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (dVar = this.f35875g).f35894o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i11 = bounds.bottom;
        dVar.f35894o.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
        dVar.f35894o.setBounds(bounds.left, bounds.top, bounds.right, i11);
    }

    public final void g(int i11, int i12, int i13, int i14) {
        super.setContentPadding(i11, i12, i13, i14);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f35875g.f35883c.f30345b.f30321d;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f35875g.f35884d.f30345b.f30321d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f35875g.f35890j;
    }

    public int getCheckedIconGravity() {
        return this.f35875g.f35887g;
    }

    public int getCheckedIconMargin() {
        return this.f35875g.f35885e;
    }

    public int getCheckedIconSize() {
        return this.f35875g.f35886f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f35875g.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f35875g.f35882b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f35875g.f35882b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f35875g.f35882b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f35875g.f35882b.top;
    }

    public float getProgress() {
        return this.f35875g.f35883c.f30345b.f30327j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f35875g.f35883c.m();
    }

    public ColorStateList getRippleColor() {
        return this.f35875g.f35891k;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.f35875g.f35892m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f35875g.f35893n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f35875g.f35893n;
    }

    public int getStrokeWidth() {
        return this.f35875g.f35888h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f35877i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f35875g;
        dVar.k();
        u.P(this, dVar.f35883c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        d dVar = this.f35875g;
        if (dVar != null && dVar.f35898s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f35873k);
        }
        if (this.f35877i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        if (this.f35878j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f35874m);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f35877i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        d dVar = this.f35875g;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f35898s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f35877i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f35875g.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f35876h) {
            d dVar = this.f35875g;
            if (!dVar.f35897r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.f35897r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i11) {
        this.f35875g.f35883c.t(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f11) {
        super.setCardElevation(f11);
        d dVar = this.f35875g;
        dVar.f35883c.s(dVar.f35881a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.f35875g.f35884d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.t(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.f35875g.f35898s = z11;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f35877i != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f35875g.g(drawable);
    }

    public void setCheckedIconGravity(int i11) {
        d dVar = this.f35875g;
        if (dVar.f35887g != i11) {
            dVar.f35887g = i11;
            b bVar = dVar.f35881a;
            dVar.e(bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i11) {
        this.f35875g.f35885e = i11;
    }

    public void setCheckedIconMarginResource(int i11) {
        if (i11 != -1) {
            this.f35875g.f35885e = getResources().getDimensionPixelSize(i11);
        }
    }

    public void setCheckedIconResource(int i11) {
        this.f35875g.g(a0.x(getContext(), i11));
    }

    public void setCheckedIconSize(int i11) {
        this.f35875g.f35886f = i11;
    }

    public void setCheckedIconSizeResource(int i11) {
        if (i11 != 0) {
            this.f35875g.f35886f = getResources().getDimensionPixelSize(i11);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f35875g;
        dVar.l = colorStateList;
        Drawable drawable = dVar.f35890j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        d dVar = this.f35875g;
        if (dVar != null) {
            dVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i11, int i12, int i13, int i14) {
        d dVar = this.f35875g;
        dVar.f35882b.set(i11, i12, i13, i14);
        dVar.l();
    }

    public void setDragged(boolean z11) {
        if (this.f35878j != z11) {
            this.f35878j = z11;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f11) {
        super.setMaxCardElevation(f11);
        this.f35875g.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        d dVar = this.f35875g;
        dVar.m();
        dVar.l();
    }

    public void setProgress(float f11) {
        d dVar = this.f35875g;
        dVar.f35883c.u(f11);
        j jVar = dVar.f35884d;
        if (jVar != null) {
            jVar.u(f11);
        }
        j jVar2 = dVar.f35896q;
        if (jVar2 != null) {
            jVar2.u(f11);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f11) {
        super.setRadius(f11);
        d dVar = this.f35875g;
        n nVarH = dVar.f35892m.h();
        nVarH.b(f11);
        dVar.h(nVarH.a());
        dVar.f35889i.invalidateSelf();
        if (dVar.i() || (dVar.f35881a.getPreventCornerOverlap() && !dVar.f35883c.q())) {
            dVar.l();
        }
        if (dVar.i()) {
            dVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f35875g;
        dVar.f35891k = colorStateList;
        RippleDrawable rippleDrawable = dVar.f35894o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i11) {
        ColorStateList colorStateListB = androidx.core.app.e.b(getContext(), i11);
        d dVar = this.f35875g;
        dVar.f35891k = colorStateListB;
        RippleDrawable rippleDrawable = dVar.f35894o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // n20.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        setClipToOutline(oVar.g(getBoundsAsRectF()));
        this.f35875g.h(oVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f35875g;
        if (dVar.f35893n != colorStateList) {
            dVar.f35893n = colorStateList;
            j jVar = dVar.f35884d;
            jVar.A(dVar.f35888h);
            jVar.z(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i11) {
        d dVar = this.f35875g;
        if (i11 != dVar.f35888h) {
            dVar.f35888h = i11;
            j jVar = dVar.f35884d;
            ColorStateList colorStateList = dVar.f35893n;
            jVar.A(i11);
            jVar.z(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        d dVar = this.f35875g;
        dVar.m();
        dVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d dVar = this.f35875g;
        if (dVar != null && dVar.f35898s && isEnabled()) {
            this.f35877i = !this.f35877i;
            refreshDrawableState();
            f();
            dVar.f(this.f35877i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f35875g.f35883c.t(colorStateList);
    }

    public void setStrokeColor(int i11) {
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.materialCardViewStyle);
    }

    public b(Context context) {
        this(context, null);
    }
}
