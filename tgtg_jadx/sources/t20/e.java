package t20;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends n20.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f39680s;

    public e(e eVar) {
        super(eVar);
        this.f39680s = eVar.f39680s;
    }

    @Override // n20.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.H = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(n20.o oVar, RectF rectF) {
        super(oVar);
        this.f39680s = rectF;
    }
}
