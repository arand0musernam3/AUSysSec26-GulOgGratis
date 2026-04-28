package x20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import e20.e0;
import e20.f0;
import n20.g;
import n20.j;
import n20.k;
import n20.n;
import p.j2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends j implements e0 {
    public CharSequence H;
    public final Context I;
    public final Paint.FontMetrics J;
    public final f0 K;
    public final j2 L;
    public final Rect M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean T;
    public int V;
    public int W;
    public float X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f43816h0;
    public float t0;

    public a(Context context, int i11) {
        super(context, null, 0, i11);
        this.J = new Paint.FontMetrics();
        f0 f0Var = new f0(this);
        this.K = f0Var;
        this.L = new j2(this, 1);
        this.M = new Rect();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.Z = 0.5f;
        this.f43816h0 = 0.5f;
        this.t0 = 1.0f;
        this.I = context;
        float f11 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = f0Var.f15647a;
        textPaint.density = f11;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float F() {
        int i11;
        Rect rect = this.M;
        if (((rect.right - getBounds().right) - this.W) - this.Q < 0) {
            i11 = ((rect.right - getBounds().right) - this.W) - this.Q;
        } else {
            if (((rect.left - getBounds().left) - this.W) + this.Q <= 0) {
                return 0.0f;
            }
            i11 = ((rect.left - getBounds().left) - this.W) + this.Q;
        }
        return i11;
    }

    public final k G() {
        float f11 = -F();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.V))) / 2.0d);
        return new k(new g(this.V), Math.min(Math.max(f11, -fWidth), fWidth));
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float F = F();
        float f11 = (float) (-((Math.sqrt(2.0d) * ((double) this.V)) - ((double) this.V)));
        canvas.scale(this.X, this.Y, (getBounds().width() * this.Z) + getBounds().left, (getBounds().height() * this.f43816h0) + getBounds().top);
        canvas.translate(F, f11);
        super.draw(canvas);
        if (this.H == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            f0 f0Var = this.K;
            TextPaint textPaint = f0Var.f15647a;
            Paint.FontMetrics fontMetrics = this.J;
            textPaint.getFontMetrics(fontMetrics);
            int i11 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (f0Var.f15653g != null) {
                textPaint.drawableState = getState();
                f0Var.f15653g.d(this.I, f0Var.f15647a, f0Var.f15648b);
                textPaint.setAlpha((int) (this.t0 * 255.0f));
            }
            CharSequence charSequence = this.H;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i11, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.K.f15647a.getTextSize(), this.P);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f11 = this.N * 2;
        CharSequence charSequence = this.H;
        return (int) Math.max(f11 + (charSequence == null ? 0.0f : this.K.a(charSequence.toString())), this.O);
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.T) {
            n nVarH = this.f30345b.f30318a.h();
            nVarH.f30386k = G();
            setShapeAppearanceModel(nVarH.a());
        }
    }
}
