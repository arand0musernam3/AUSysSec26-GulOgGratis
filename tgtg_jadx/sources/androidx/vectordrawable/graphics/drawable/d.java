package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import m3.k1;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4038b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f4037a = i11;
        this.f4038b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i11 = this.f4037a;
        Object obj = this.f4038b;
        switch (i11) {
            case 0:
                ((h) obj).invalidateSelf();
                break;
            default:
                drawable.getClass();
                qy.b bVar = (qy.b) obj;
                k1 k1Var = bVar.f37304g;
                k1Var.setValue(Integer.valueOf(((Number) k1Var.getValue()).intValue() + 1));
                Drawable drawable2 = bVar.f37303f;
                Object obj2 = qy.c.f37307a;
                bVar.f37305h.setValue(new h4.e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : h0.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, u70.j] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        switch (this.f4037a) {
            case 0:
                ((h) this.f4038b).scheduleSelf(runnable, j9);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) qy.c.f37307a.getValue()).postAtTime(runnable, j9);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, u70.j] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f4037a) {
            case 0:
                ((h) this.f4038b).unscheduleSelf(runnable);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) qy.c.f37307a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}
