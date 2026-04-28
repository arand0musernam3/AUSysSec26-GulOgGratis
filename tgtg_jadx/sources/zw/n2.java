package zw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends ox.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f48300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f48301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q2 f48302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f48303h;

    public n2(q2 q2Var, float f11, float f12) {
        this.f48299d = 1;
        this.f48302g = q2Var;
        this.f48303h = new RectF();
        this.f48300e = f11;
        this.f48301f = f12;
    }

    @Override // ox.h
    public final void M(String str) {
        String str2;
        switch (this.f48299d) {
            case 0:
                q2 q2Var = this.f48302g;
                if (q2Var.q0()) {
                    Path path = new Path();
                    str2 = str;
                    ((o2) q2Var.f48335c).f48314d.getTextPath(str2, 0, str.length(), this.f48300e, this.f48301f, path);
                    ((Path) this.f48303h).addPath(path);
                } else {
                    str2 = str;
                }
                this.f48300e = ((o2) q2Var.f48335c).f48314d.measureText(str2) + this.f48300e;
                break;
            default:
                q2 q2Var2 = this.f48302g;
                if (q2Var2.q0()) {
                    Rect rect = new Rect();
                    ((o2) q2Var2.f48335c).f48314d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f48300e, this.f48301f);
                    ((RectF) this.f48303h).union(rectF);
                }
                this.f48300e = ((o2) q2Var2.f48335c).f48314d.measureText(str) + this.f48300e;
                break;
        }
    }

    @Override // ox.h
    public final boolean u(a2 a2Var) {
        switch (this.f48299d) {
            case 0:
                if (!(a2Var instanceof b2)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(a2Var instanceof b2)) {
                    return true;
                }
                b2 b2Var = (b2) a2Var;
                n1 n1VarG = a2Var.f48323a.G(b2Var.f48166n);
                if (n1VarG == null) {
                    q2.y("TextPath path reference '%s' not found", b2Var.f48166n);
                } else {
                    q0 q0Var = (q0) n1VarG;
                    k2 k2Var = new k2(q0Var.f48331o);
                    Matrix matrix = q0Var.f48202n;
                    Path path = k2Var.f48267a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.f48303h).union(rectF);
                }
                return false;
        }
    }

    public n2(q2 q2Var, float f11, float f12, Path path) {
        this.f48299d = 0;
        this.f48302g = q2Var;
        this.f48300e = f11;
        this.f48301f = f12;
        this.f48303h = path;
    }
}
