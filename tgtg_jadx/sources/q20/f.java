package q20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.tgtg.R;
import com.google.firebase.messaging.a0;
import e20.i0;
import n20.j;
import n20.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends FrameLayout {
    public static final com.google.android.material.bottomsheet.i l = new com.google.android.material.bottomsheet.i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f35913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f35914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f35920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f35921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f35922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35923k;

    public f(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(v20.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j10.a.X);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f35915c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f35914b = o.c(context2, attributeSet, 0, 0).a();
        }
        this.f35916d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(h0.g.p(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(i0.o(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f35917e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f35918f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f35919g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(l);
        setFocusable(true);
        if (getBackground() == null) {
            int iE = w0.e.E(w0.e.y(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), w0.e.y(R.attr.colorOnSurface, this));
            o oVar = this.f35914b;
            if (oVar != null) {
                u8.a aVar = g.f35924u;
                j jVar = new j(oVar);
                jVar.t(ColorStateList.valueOf(iE));
                drawable = jVar;
            } else {
                Resources resources = getResources();
                u8.a aVar2 = g.f35924u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iE);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f35920h;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(g gVar) {
        this.f35913a = gVar;
    }

    public float getActionTextColorAlpha() {
        return this.f35917e;
    }

    public int getAnimationMode() {
        return this.f35915c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f35916d;
    }

    public int getMaxInlineActionWidth() {
        return this.f35919g;
    }

    public int getMaxWidth() {
        return this.f35918f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g gVar = this.f35913a;
        if (gVar != null) {
            gVar.b();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z11;
        super.onDetachedFromWindow();
        g gVar = this.f35913a;
        if (gVar != null) {
            a0 a0VarK = a0.K();
            e eVar = gVar.f35948t;
            synchronized (a0VarK.f12779b) {
                z11 = true;
                if (!a0VarK.R(eVar)) {
                    i iVar = (i) a0VarK.f12782e;
                    if (!(iVar != null && iVar.f35949a.get() == eVar)) {
                        z11 = false;
                    }
                }
            }
            if (z11) {
                g.f35927x.post(new d(gVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        g gVar = this.f35913a;
        if (gVar == null || !gVar.f35946r) {
            return;
        }
        gVar.e();
        gVar.f35946r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int i13 = this.f35918f;
        if (i13 <= 0 || getMeasuredWidth() <= i13) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
    }

    public void setAnimationMode(int i11) {
        this.f35915c = i11;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f35920h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f35920h);
            drawable.setTintMode(this.f35921i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f35920h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f35921i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f35921i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f35923k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f35922j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        g gVar = this.f35913a;
        if (gVar != null) {
            u8.a aVar = g.f35924u;
            gVar.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : l);
        super.setOnClickListener(onClickListener);
    }
}
