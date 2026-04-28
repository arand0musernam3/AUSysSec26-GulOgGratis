package m10;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.app.tgtg.R;
import e20.e0;
import e20.f0;
import e20.i0;
import j20.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import n20.j;
import n20.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Drawable implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f28709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f28710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f28711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f28712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f28713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f28715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f28717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f28718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f28719k;
    public WeakReference l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f28720m;

    public a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f28709a = weakReference;
        i0.e(context, i0.f15671b, "Theme.MaterialComponents");
        this.f28712d = new Rect();
        f0 f0Var = new f0(this);
        this.f28711c = f0Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = f0Var.f15647a;
        textPaint.setTextAlign(align);
        c cVar = new c(context, bVar);
        this.f28713e = cVar;
        boolean zG = g();
        b bVar2 = cVar.f28747b;
        j jVar = new j(o.a(context, zG ? bVar2.f28727g.intValue() : bVar2.f28725e.intValue(), g() ? bVar2.f28728h.intValue() : bVar2.f28726f.intValue()).a());
        this.f28710b = jVar;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && f0Var.f15653g != (dVar = new d(context2, bVar2.f28724d.intValue()))) {
            f0Var.c(dVar, context2);
            textPaint.setColor(bVar2.f28723c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i11 = bVar2.l;
        if (i11 != -2) {
            this.f28716h = ((int) Math.pow(10.0d, ((double) i11) - 1.0d)) - 1;
        } else {
            this.f28716h = bVar2.f28732m;
        }
        f0Var.f15651e = true;
        k();
        invalidateSelf();
        f0Var.f15651e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f28722b.intValue());
        if (jVar.f30345b.f30321d != colorStateListValueOf) {
            jVar.t(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f28723c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.f28720m;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(bVar2.f28739t.booleanValue(), false);
    }

    @Override // e20.e0
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y5;
        float x11;
        ViewParent parent;
        boolean z11;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y6 = view.getY();
            x11 = view.getX();
            parent = view.getParent();
            y5 = y6;
        } else {
            y5 = 0.0f;
            x11 = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z11 = parent instanceof View;
            if (!z11 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y5 += view3.getY();
            x11 += view3.getX();
            parent = parent.getParent();
        }
        if (z11) {
            float f11 = (this.f28715g - this.f28719k) + y5;
            float f12 = (this.f28714f - this.f28718j) + x11;
            View view4 = (View) parent;
            float height = ((this.f28715g + this.f28719k) - view4.getHeight()) + y5;
            float width = ((this.f28714f + this.f28718j) - view4.getWidth()) + x11;
            if (f11 < 0.0f) {
                this.f28715g = Math.abs(f11) + this.f28715g;
            }
            if (f12 < 0.0f) {
                this.f28714f = Math.abs(f12) + this.f28714f;
            }
            if (height > 0.0f) {
                this.f28715g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f28714f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.f28713e;
        b bVar = cVar.f28747b;
        b bVar2 = cVar.f28747b;
        String str = bVar.f28730j;
        WeakReference weakReference = this.f28709a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i11 = this.f28716h;
            if (i11 == -2 || f() <= i11) {
                return NumberFormat.getInstance(bVar2.f28733n).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f28733n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i11), "+");
        }
        int i12 = bVar.l;
        if (i12 == -2 || str == null || str.length() <= i12) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i12 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        c cVar = this.f28713e;
        b bVar = cVar.f28747b;
        if (bVar.f28730j != null) {
            CharSequence charSequence = bVar.f28734o;
            return charSequence != null ? charSequence : cVar.f28747b.f28730j;
        }
        boolean zH = h();
        b bVar2 = cVar.f28747b;
        if (!zH) {
            return bVar2.f28735p;
        }
        if (bVar2.f28736q == 0 || (context = (Context) this.f28709a.get()) == null) {
            return null;
        }
        if (this.f28716h != -2) {
            int iF = f();
            int i11 = this.f28716h;
            if (iF > i11) {
                return context.getString(bVar2.f28737r, Integer.valueOf(i11));
            }
        }
        return context.getResources().getQuantityString(bVar2.f28736q, f(), Integer.valueOf(f()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f28710b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        f0 f0Var = this.f28711c;
        f0Var.f15647a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f28715g - rect.exactCenterY();
        canvas.drawText(strC, this.f28714f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), f0Var.f15647a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.f28720m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i11 = this.f28713e.f28747b.f28731k;
        if (i11 != -1) {
            return i11;
        }
        return 0;
    }

    public final boolean g() {
        return this.f28713e.f28747b.f28730j != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28713e.f28747b.f28729i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28712d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28712d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        b bVar = this.f28713e.f28747b;
        return bVar.f28730j == null && bVar.f28731k != -1;
    }

    public final void i() {
        Context context = (Context) this.f28709a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        c cVar = this.f28713e;
        this.f28710b.setShapeAppearanceModel(o.a(context, zG ? cVar.f28747b.f28727g.intValue() : cVar.f28747b.f28725e.intValue(), g() ? cVar.f28747b.f28728h.intValue() : cVar.f28747b.f28726f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.f28720m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0110 A[PHI: r13
      0x0110: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00dc, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m10.a.k():void");
    }

    @Override // android.graphics.drawable.Drawable, e20.e0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        c cVar = this.f28713e;
        cVar.f28746a.f28729i = i11;
        cVar.f28747b.f28729i = i11;
        this.f28711c.f15647a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
