package v10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.n1;
import q10.b;
import u00.d;
import u10.f;
import u10.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends b implements g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f41918n;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41918n = new n1(this);
    }

    @Override // u10.g
    public final void a() {
        this.f41918n.getClass();
    }

    @Override // u10.g
    public final void b() {
        this.f41918n.getClass();
    }

    @Override // u10.g
    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // u10.g
    public final boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        n1 n1Var = this.f41918n;
        if (n1Var != null) {
            n1Var.n(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.f41918n.f3503e;
    }

    @Override // u10.g
    public int getCircularRevealScrimColor() {
        return ((Paint) this.f41918n.f3501c).getColor();
    }

    @Override // u10.g
    public f getRevealInfo() {
        n1 n1Var = this.f41918n;
        f fVar = (f) n1Var.f3502d;
        if (fVar == null) {
            return null;
        }
        f fVar2 = new f(fVar);
        if (fVar2.f40634c == Float.MAX_VALUE) {
            float f11 = fVar2.f40632a;
            float f12 = fVar2.f40633b;
            FrameLayout frameLayout = (FrameLayout) n1Var.f3500b;
            fVar2.f40634c = d.s(f11, f12, frameLayout.getWidth(), frameLayout.getHeight());
        }
        return fVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.FrameLayout, u10.g] */
    @Override // android.view.View
    public final boolean isOpaque() {
        n1 n1Var = this.f41918n;
        if (n1Var == null) {
            return super.isOpaque();
        }
        if (!((FrameLayout) n1Var.f3499a).d()) {
            return false;
        }
        f fVar = (f) n1Var.f3502d;
        return fVar == null || fVar.f40634c == Float.MAX_VALUE;
    }

    @Override // u10.g
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        n1 n1Var = this.f41918n;
        n1Var.f3503e = drawable;
        ((FrameLayout) n1Var.f3500b).invalidate();
    }

    @Override // u10.g
    public void setCircularRevealScrimColor(int i11) {
        n1 n1Var = this.f41918n;
        ((Paint) n1Var.f3501c).setColor(i11);
        ((FrameLayout) n1Var.f3500b).invalidate();
    }

    @Override // u10.g
    public void setRevealInfo(f fVar) {
        this.f41918n.A(fVar);
    }

    public a(Context context) {
        this(context, null);
    }
}
