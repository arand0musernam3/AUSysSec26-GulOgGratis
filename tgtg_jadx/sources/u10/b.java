package u10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.lifecycle.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends FrameLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f40627a;

    public b(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40627a = new n1(this);
    }

    @Override // u10.g
    public final void a() {
        this.f40627a.getClass();
    }

    @Override // u10.g
    public final void b() {
        this.f40627a.getClass();
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
        n1 n1Var = this.f40627a;
        if (n1Var != null) {
            n1Var.n(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.f40627a.f3503e;
    }

    @Override // u10.g
    public int getCircularRevealScrimColor() {
        return ((Paint) this.f40627a.f3501c).getColor();
    }

    @Override // u10.g
    public f getRevealInfo() {
        n1 n1Var = this.f40627a;
        f fVar = (f) n1Var.f3502d;
        if (fVar == null) {
            return null;
        }
        f fVar2 = new f(fVar);
        if (fVar2.f40634c == Float.MAX_VALUE) {
            float f11 = fVar2.f40632a;
            float f12 = fVar2.f40633b;
            FrameLayout frameLayout = (FrameLayout) n1Var.f3500b;
            fVar2.f40634c = u00.d.s(f11, f12, frameLayout.getWidth(), frameLayout.getHeight());
        }
        return fVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.FrameLayout, u10.g] */
    @Override // android.view.View
    public final boolean isOpaque() {
        n1 n1Var = this.f40627a;
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
        n1 n1Var = this.f40627a;
        n1Var.f3503e = drawable;
        ((FrameLayout) n1Var.f3500b).invalidate();
    }

    @Override // u10.g
    public void setCircularRevealScrimColor(int i11) {
        n1 n1Var = this.f40627a;
        ((Paint) n1Var.f3501c).setColor(i11);
        ((FrameLayout) n1Var.f3500b).invalidate();
    }

    @Override // u10.g
    public void setRevealInfo(f fVar) {
        this.f40627a.A(fVar);
    }

    public b(@NonNull Context context) {
        this(context, null);
    }
}
