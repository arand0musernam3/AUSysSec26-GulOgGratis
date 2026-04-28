package n20;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f30293c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30291a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30292b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f30294d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f30295e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        o oVar;
        RectF rectF = this.f30294d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (oVar = this.f30293c) == null) {
            return;
        }
        p.f30399a.a(oVar, null, 1.0f, rectF, null, this.f30295e);
    }
}
