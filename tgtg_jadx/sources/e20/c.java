package e20;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15591a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f15592a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15593b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f15594b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f15595c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f15596c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15597d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f15598d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f15599e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f15609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f15611k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f15612k0;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f15617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f15619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f15620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f15621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f15622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f15623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f15624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f15625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j20.a f15626z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15601f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15603g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15605h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15607i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f15600e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f15602f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final float f15604g0 = 1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f15606h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15608i0 = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f15610j0 = -1;

    public c(TextInputLayout textInputLayout) {
        this.f15591a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f15597d = new Rect();
        this.f15595c = new Rect();
        this.f15599e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i11, float f11, int i12) {
        float f12 = 1.0f - f11;
        return Color.argb(Math.round((Color.alpha(i12) * f11) + (Color.alpha(i11) * f12)), Math.round((Color.red(i12) * f11) + (Color.red(i11) * f12)), Math.round((Color.green(i12) * f11) + (Color.green(i11) * f12)), Math.round((Color.blue(i12) * f11) + (Color.blue(i11) * f12)));
    }

    public static float h(float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return k10.a.a(f11, f12, f13);
    }

    public final void b() {
        float f11 = this.f15593b;
        float f12 = this.f15595c.left;
        Rect rect = this.f15597d;
        float fH = h(f12, rect.left, f11, this.Q);
        RectF rectF = this.f15599e;
        rectF.left = fH;
        rectF.top = h(this.f15613m, this.f15614n, f11, this.Q);
        rectF.right = h(r1.right, rect.right, f11, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f11, this.Q);
        this.f15617q = h(this.f15615o, this.f15616p, f11, this.Q);
        this.f15618r = h(this.f15613m, this.f15614n, f11, this.Q);
        d(f11, false);
        TextInputLayout textInputLayout = this.f15591a;
        textInputLayout.postInvalidateOnAnimation();
        u8.a aVar = k10.a.f25731b;
        this.f15594b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f11, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f15596c0 = h(1.0f, 0.0f, f11, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f15611k;
        ColorStateList colorStateList2 = this.f15609j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), f11, g(this.f15611k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f13 = this.W;
        float f14 = this.X;
        if (f13 != f14) {
            textPaint.setLetterSpacing(h(f14, f13, f11, aVar));
        } else {
            textPaint.setLetterSpacing(f13);
        }
        this.H = k10.a.a(0.0f, this.S, f11);
        this.I = k10.a.a(0.0f, this.T, f11);
        this.J = k10.a.a(0.0f, this.U, f11);
        int iA = a(0, f11, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z11 = this.f15591a.getLayoutDirection() == 1;
        if (this.E) {
            return (z11 ? f7.f.f17468d : f7.f.f17467c).f(charSequence.length(), charSequence);
        }
        return z11;
    }

    public final void d(float f11, boolean z11) {
        float f12;
        Typeface typeface;
        float f13;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f15597d.width();
        float fWidth2 = this.f15595c.width();
        if (Math.abs(f11 - 1.0f) < 1.0E-5f) {
            f12 = o() ? this.f15607i : this.f15605h;
            f13 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f15605h, this.f15607i, f11, this.R) / this.f15605h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f15619s;
            fWidth2 = fWidth;
        } else {
            f12 = this.f15605h;
            float f14 = this.X;
            typeface = this.f15622v;
            if (Math.abs(f11 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f15605h, this.f15607i, f11, this.R) / this.f15605h;
            }
            float f15 = this.f15607i / this.f15605h;
            float f16 = fWidth2 * f15;
            if (!z11 && f16 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f13 = f14;
        }
        int i11 = f11 < 0.5f ? this.f15600e0 : this.f15602f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z12 = this.G != f12;
            boolean z13 = this.Y != f13;
            boolean z14 = this.f15625y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || (this.L != i11) || this.N;
            this.G = f12;
            this.Y = f13;
            this.f15625y = typeface;
            this.N = false;
            this.L = i11;
            textPaint.setLinearText(this.F != 1.0f);
            z = z15;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f15625y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f15600e0 > 1 || this.f15602f0 > 1) && !zC) ? i11 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i11, TextPaint textPaint, CharSequence charSequence, float f11, boolean z11) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutA = null;
        try {
            if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f15601f, this.D ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z12 = this.D;
                    alignment = absoluteGravity != 5 ? z12 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z12 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            c0 c0Var = new c0(charSequence, textPaint, (int) f11);
            c0Var.l = this.A;
            c0Var.f15637k = z11;
            c0Var.f15631e = alignment;
            c0Var.f15636j = false;
            c0Var.f15632f = i11;
            float f12 = this.f15604g0;
            c0Var.f15633g = 0.0f;
            c0Var.f15634h = f12;
            c0Var.f15635i = this.f15606h0;
            c0Var.f15638m = null;
            staticLayoutA = c0Var.a();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e5) {
            Log.e("CollapsingTextHelper", e5.getCause().getMessage(), e5);
        }
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i11 = this.f15608i0;
        if (i11 != -1) {
            return i11;
        }
        float f11 = this.f15607i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f11);
        textPaint.setTypeface(this.f15619s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f15621u;
            if (typeface != null) {
                this.f15620t = b7.a.m(configuration, typeface);
            }
            Typeface typeface2 = this.f15624x;
            if (typeface2 != null) {
                this.f15623w = b7.a.m(configuration, typeface2);
            }
            Typeface typeface3 = this.f15620t;
            if (typeface3 == null) {
                typeface3 = this.f15621u;
            }
            this.f15619s = typeface3;
            Typeface typeface4 = this.f15623w;
            if (typeface4 == null) {
                typeface4 = this.f15624x;
            }
            this.f15622v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z11) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f15591a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z11) {
            return;
        }
        d(1.0f, z11);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            boolean zO = o();
            CharSequence charSequenceEllipsize = this.C;
            if (zO) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.Z.getWidth(), this.A);
            }
            this.f15598d0 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.f15598d0;
        if (charSequence2 != null) {
            this.f15592a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f15592a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f15603g, this.D ? 1 : 0);
        int i11 = absoluteGravity & 112;
        Rect rect = this.f15597d;
        if (i11 == 48) {
            this.f15614n = rect.top;
        } else if (i11 != 80) {
            this.f15614n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f15614n = textPaint.ascent() + rect.bottom;
        }
        int i12 = absoluteGravity & 8388615;
        if (i12 == 1) {
            this.f15616p = rect.centerX() - (this.f15592a0 / 2.0f);
        } else if (i12 != 5) {
            this.f15616p = rect.left;
        } else {
            this.f15616p = rect.right - this.f15592a0;
        }
        if (this.f15592a0 <= rect.width()) {
            float f11 = this.f15616p;
            float fMax = Math.max(0.0f, rect.left - f11) + f11;
            this.f15616p = fMax;
            this.f15616p = Math.min(0.0f, rect.right - (this.f15592a0 + fMax)) + fMax;
        }
        float f12 = this.f15607i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f12);
        textPaint2.setTypeface(this.f15619s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f13 = this.f15614n;
            float fMax2 = Math.max(0.0f, rect.top - f13) + f13;
            this.f15614n = fMax2;
            this.f15614n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z11);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f15600e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f15601f, this.D ? 1 : 0);
        int i13 = absoluteGravity2 & 112;
        Rect rect2 = this.f15595c;
        if (i13 == 48) {
            this.f15613m = rect2.top;
        } else if (i13 != 80) {
            this.f15613m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f15613m = (rect2.bottom - height) + (this.f15612k0 ? textPaint.descent() : 0.0f);
        }
        int i14 = absoluteGravity2 & 8388615;
        if (i14 == 1) {
            this.f15615o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i14 != 5) {
            this.f15615o = rect2.left;
        } else {
            this.f15615o = rect2.right - fMeasureText;
        }
        d(this.f15593b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f15611k == colorStateList && this.f15609j == colorStateList) {
            return;
        }
        this.f15611k = colorStateList;
        this.f15609j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        j20.a aVar = this.f15626z;
        if (aVar != null) {
            aVar.f24449g = true;
        }
        if (this.f15621u == typeface) {
            return false;
        }
        this.f15621u = typeface;
        Typeface typefaceM = b7.a.m(this.f15591a.getContext().getResources().getConfiguration(), typeface);
        this.f15620t = typefaceM;
        if (typefaceM == null) {
            typefaceM = this.f15621u;
        }
        this.f15619s = typefaceM;
        return true;
    }

    public final void m(float f11) {
        float fN = xz.b.n(f11, 0.0f, 1.0f);
        if (fN != this.f15593b) {
            this.f15593b = fN;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z11;
        boolean zL = l(typeface);
        if (this.f15624x != typeface) {
            this.f15624x = typeface;
            Typeface typefaceM = b7.a.m(this.f15591a.getContext().getResources().getConfiguration(), typeface);
            this.f15623w = typefaceM;
            if (typefaceM == null) {
                typefaceM = this.f15624x;
            }
            this.f15622v = typefaceM;
            z11 = true;
        } else {
            z11 = false;
        }
        if (zL || z11) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f15602f0 == 1;
    }
}
