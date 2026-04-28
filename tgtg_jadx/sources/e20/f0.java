package e20;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15650d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f15652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j20.d f15653g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f15647a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f15648b = new d0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15651e = true;

    public f0(e0 e0Var) {
        this.f15652f = new WeakReference(null);
        this.f15652f = new WeakReference(e0Var);
    }

    public final float a(String str) {
        if (!this.f15651e) {
            return this.f15649c;
        }
        b(str);
        return this.f15649c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f15647a;
        this.f15649c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f15650d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f15651e = false;
    }

    public final void c(j20.d dVar, Context context) {
        if (this.f15653g != dVar) {
            this.f15653g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f15647a;
                d0 d0Var = this.f15648b;
                dVar.e(context, textPaint, d0Var);
                e0 e0Var = (e0) this.f15652f.get();
                if (e0Var != null) {
                    textPaint.drawableState = e0Var.getState();
                }
                dVar.d(context, textPaint, d0Var);
                this.f15651e = true;
            }
            e0 e0Var2 = (e0) this.f15652f.get();
            if (e0Var2 != null) {
                e0Var2.a();
                e0Var2.onStateChange(e0Var2.getState());
            }
        }
    }
}
