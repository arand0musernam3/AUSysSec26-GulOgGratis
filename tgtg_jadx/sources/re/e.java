package re;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.widget.z;
import androidx.lifecycle.n1;
import he.b0;
import he.d0;
import java.util.HashMap;
import ke.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public final ie.a D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final b0 H;
    public s I;
    public s J;
    public final ke.h K;
    public ve.j L;
    public z M;

    public e(he.z zVar, h hVar) {
        super(zVar, hVar);
        this.D = new ie.a(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = hVar.f37928g;
        he.k kVar = zVar.f21981a;
        this.H = kVar == null ? null : (b0) ((HashMap) kVar.c()).get(str);
        n1 n1Var = this.f37910p.f37944x;
        if (n1Var != null) {
            this.K = new ke.h(this, this, n1Var);
        }
    }

    @Override // re.b, je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Bitmap bitmapS;
        super.e(rectF, matrix, z11);
        b0 b0Var = this.H;
        if (b0Var != null) {
            int i11 = b0Var.f21867b;
            int i12 = b0Var.f21866a;
            float fC = ve.k.c();
            if (this.f37909o.f21993n || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i12 * fC, i11 * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f37908n.mapRect(rectF);
        }
    }

    @Override // re.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        if (obj == d0.I) {
            this.I = new s(null, aVar);
            return;
        }
        if (obj == d0.L) {
            this.J = new s(null, aVar);
            return;
        }
        ke.h hVar = this.K;
        if (obj == 5 && hVar != null) {
            hVar.f26313c.k(aVar);
            return;
        }
        if (obj == d0.E && hVar != null) {
            hVar.c(aVar);
            return;
        }
        if (obj == d0.F && hVar != null) {
            hVar.f26315e.k(aVar);
            return;
        }
        if (obj == d0.G && hVar != null) {
            hVar.f26316f.k(aVar);
        } else {
            if (obj != d0.H || hVar == null) {
                return;
            }
            hVar.f26317g.k(aVar);
        }
    }

    @Override // re.b
    public final void k(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        b0 b0Var;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (b0Var = this.H) == null) {
            return;
        }
        float fC = ve.k.c();
        ie.a aVar2 = this.D;
        aVar2.setAlpha(i11);
        s sVar = this.I;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.f());
        }
        ke.h hVar = this.K;
        if (hVar != null) {
            aVar = hVar.b(matrix, i11);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z11 = this.f37909o.f21993n;
        Rect rect2 = this.F;
        if (z11) {
            rect2.set(0, 0, (int) (b0Var.f21866a * fC), (int) (b0Var.f21867b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z12 = aVar != null;
        if (z12) {
            if (this.L == null) {
                this.L = new ve.j();
            }
            if (this.M == null) {
                this.M = new z();
            }
            z zVar = this.M;
            zVar.f2542b = 255;
            zVar.f2543c = null;
            aVar.getClass();
            ve.a aVar3 = new ve.a(aVar);
            zVar.f2543c = aVar3;
            aVar3.b(i11);
            float f11 = rect2.left;
            float f12 = rect2.top;
            float f13 = rect2.right;
            float f14 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f11, f12, f13, f14);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, aVar2);
        if (z12) {
            this.L.c();
            if (this.L.f42270c == ve.i.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.s():android.graphics.Bitmap");
    }
}
