package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f34085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f34086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f34087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f34088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34090i;

    public z(y yVar) {
        super(yVar);
        this.f34087f = null;
        this.f34088g = null;
        this.f34089h = false;
        this.f34090i = false;
        this.f34085d = yVar;
    }

    @Override // p.u
    public final void a(AttributeSet attributeSet, int i11) {
        super.a(attributeSet, i11);
        y yVar = this.f34085d;
        Context context = yVar.getContext();
        int[] iArr = j.a.f24259g;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        ViewCompat.a0(yVar, yVar.getContext(), iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        Drawable drawableL = gVarT.l(0);
        if (drawableL != null) {
            yVar.setThumb(drawableL);
        }
        Drawable drawableK = gVarT.k(1);
        Drawable drawable = this.f34086e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f34086e = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(yVar);
            drawableK.setLayoutDirection(yVar.getLayoutDirection());
            if (drawableK.isStateful()) {
                drawableK.setState(yVar.getDrawableState());
            }
            c();
        }
        yVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.f34088g = e1.c(typedArray.getInt(3, -1), this.f34088g);
            this.f34090i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f34087f = gVarT.j(2);
            this.f34089h = true;
        }
        gVarT.v();
        c();
    }

    public final void c() {
        Drawable drawable = this.f34086e;
        if (drawable != null) {
            if (this.f34089h || this.f34090i) {
                Drawable drawableMutate = drawable.mutate();
                this.f34086e = drawableMutate;
                if (this.f34089h) {
                    drawableMutate.setTintList(this.f34087f);
                }
                if (this.f34090i) {
                    this.f34086e.setTintMode(this.f34088g);
                }
                if (this.f34086e.isStateful()) {
                    this.f34086e.setState(this.f34085d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f34086e != null) {
            int max = this.f34085d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f34086e.getIntrinsicWidth();
                int intrinsicHeight = this.f34086e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f34086e.setBounds(-i11, -i12, i11, i12);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f34086e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
