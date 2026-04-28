package q10;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bg.t;
import com.app.tgtg.R;
import jf.e;
import n20.j;
import n20.m;
import n20.n;
import n20.o;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f35879y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f35880z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35881a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f35883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f35884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f35889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f35890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f35891k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f35892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f35893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f35894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f35895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f35896q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f35899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f35900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f35901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f35902w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f35882b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35897r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f35903x = 0.0f;

    static {
        f35880z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public d(b bVar, AttributeSet attributeSet, int i11) {
        this.f35881a = bVar;
        j jVar = new j(bVar.getContext(), attributeSet, i11, R.style.Widget_MaterialComponents_CardView);
        this.f35883c = jVar;
        jVar.p(bVar.getContext());
        jVar.w();
        n nVarH = jVar.f30345b.f30318a.h();
        TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(attributeSet, o1.a.f31786a, i11, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            nVarH.b(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f35884d = new j();
        h(nVarH.a());
        this.f35900u = h.Q(bVar.getContext(), R.attr.motionEasingLinearInterpolator, k10.a.f25730a);
        this.f35901v = h.P(bVar.getContext(), R.attr.motionDurationShort2, 300);
        this.f35902w = h.P(bVar.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(e eVar, float f11) {
        if (eVar instanceof m) {
            return (float) ((1.0d - f35879y) * ((double) f11));
        }
        if (eVar instanceof n20.e) {
            return f11 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        e eVar = this.f35892m.f30388a;
        j jVar = this.f35883c;
        float fMax = Math.max(b(eVar, jVar.m()), b(this.f35892m.f30389b, jVar.n()));
        e eVar2 = this.f35892m.f30390c;
        float[] fArr = jVar.C;
        float fB = b(eVar2, fArr != null ? fArr[1] : jVar.f30345b.f30318a.f30394g.a(jVar.i()));
        e eVar3 = this.f35892m.f30391d;
        float[] fArr2 = jVar.C;
        return Math.max(fMax, Math.max(fB, b(eVar3, fArr2 != null ? fArr2[2] : jVar.f30345b.f30318a.f30395h.a(jVar.i()))));
    }

    public final LayerDrawable c() {
        if (this.f35894o == null) {
            this.f35896q = new j(this.f35892m);
            this.f35894o = new RippleDrawable(this.f35891k, null, this.f35896q);
        }
        if (this.f35895p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f35894o, this.f35884d, this.f35890j});
            this.f35895p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f35895p;
    }

    public final c d(Drawable drawable) {
        int iCeil;
        int i11;
        if (this.f35881a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i11 = iCeil2;
        } else {
            iCeil = 0;
            i11 = 0;
        }
        return new c(drawable, iCeil, i11, iCeil, i11);
    }

    public final void e(int i11, int i12) {
        int iCeil;
        int iCeil2;
        int i13;
        int i14;
        if (this.f35895p != null) {
            b bVar = this.f35881a;
            if (bVar.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((bVar.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((bVar.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i15 = this.f35887g;
            boolean z11 = (i15 & 8388613) == 8388613;
            int i16 = this.f35885e;
            int i17 = z11 ? ((i11 - i16) - this.f35886f) - iCeil2 : i16;
            int i18 = (i15 & 80) == 80 ? i16 : ((i12 - i16) - this.f35886f) - iCeil;
            int i19 = (i15 & 8388613) == 8388613 ? i16 : ((i11 - i16) - this.f35886f) - iCeil2;
            if ((i15 & 80) == 80) {
                i16 = ((i12 - i16) - this.f35886f) - iCeil;
            }
            int i21 = i16;
            if (bVar.getLayoutDirection() == 1) {
                i14 = i19;
                i13 = i17;
            } else {
                i13 = i19;
                i14 = i17;
            }
            this.f35895p.setLayerInset(2, i14, i21, i13, i18);
        }
    }

    public final void f(boolean z11, boolean z12) {
        Drawable drawable = this.f35890j;
        if (drawable != null) {
            if (!z12) {
                drawable.setAlpha(z11 ? 255 : 0);
                this.f35903x = z11 ? 1.0f : 0.0f;
                return;
            }
            float f11 = z11 ? 1.0f : 0.0f;
            float f12 = this.f35903x;
            if (z11) {
                f12 = 1.0f - f12;
            }
            ValueAnimator valueAnimator = this.f35899t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35899t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f35903x, f11);
            this.f35899t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new t(this, 13));
            this.f35899t.setInterpolator(this.f35900u);
            this.f35899t.setDuration((long) ((z11 ? this.f35901v : this.f35902w) * f12));
            this.f35899t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f35890j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.f35881a.f35877i, false);
        } else {
            this.f35890j = f35880z;
        }
        LayerDrawable layerDrawable = this.f35895p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f35890j);
        }
    }

    public final void h(o oVar) {
        this.f35892m = oVar;
        j jVar = this.f35883c;
        jVar.setShapeAppearanceModel(oVar);
        jVar.f30366x = !jVar.q();
        j jVar2 = this.f35884d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        j jVar3 = this.f35896q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
    }

    public final boolean i() {
        b bVar = this.f35881a;
        return bVar.getPreventCornerOverlap() && this.f35883c.q() && bVar.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f35881a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f35889i;
        Drawable drawableC = j() ? c() : this.f35884d;
        this.f35889i = drawableC;
        if (drawable != drawableC) {
            b bVar = this.f35881a;
            if (bVar.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) bVar.getForeground()).setDrawable(drawableC);
            } else {
                bVar.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        b bVar = this.f35881a;
        float cardViewRadius = 0.0f;
        float fA = ((!bVar.getPreventCornerOverlap() || this.f35883c.q()) && !i()) ? 0.0f : a();
        if (bVar.getPreventCornerOverlap() && bVar.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f35879y) * ((double) bVar.getCardViewRadius()));
        }
        int i11 = (int) (fA - cardViewRadius);
        Rect rect = this.f35882b;
        bVar.g(rect.left + i11, rect.top + i11, rect.right + i11, rect.bottom + i11);
    }

    public final void m() {
        boolean z11 = this.f35897r;
        b bVar = this.f35881a;
        if (!z11) {
            bVar.setBackgroundInternal(d(this.f35883c));
        }
        bVar.setForeground(d(this.f35889i));
    }
}
