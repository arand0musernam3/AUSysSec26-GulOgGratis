package i20;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f23052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c5.b f23053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.r f23054p;

    public r(Context context, e eVar, q qVar, c5.b bVar) {
        super(context, eVar);
        this.f23052n = qVar;
        this.f23053o = bVar;
        bVar.f7113a = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i20.r.draw(android.graphics.Canvas):void");
    }

    @Override // i20.n
    public final boolean e(boolean z11, boolean z12, boolean z13) {
        androidx.vectordrawable.graphics.drawable.r rVar;
        boolean zE = super.e(z11, z12, z13);
        if (this.f23027c != null && Settings.Global.getFloat(this.f23025a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (rVar = this.f23054p) != null) {
            return rVar.setVisible(z11, z12);
        }
        if (!isRunning()) {
            this.f23053o.d();
        }
        if (z11 && z13) {
            this.f23053o.x();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f23052n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f23052n.f();
    }
}
