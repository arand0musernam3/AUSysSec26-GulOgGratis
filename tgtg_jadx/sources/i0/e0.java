package i0;

import android.util.Size;
import e0.c1;
import e0.d1;
import e0.e1;
import e0.f1;
import e0.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f22626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f22629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c1 f22630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1 f22631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f22632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f22633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0.e0 f22634j;

    public e0(int i11, int i12, Size size, c1 c1Var, d1 d1Var, e1 e1Var, f1 f1Var, g1 g1Var, String str) {
        size.getClass();
        str.getClass();
        this.f22625a = i11;
        this.f22626b = size;
        this.f22627c = i12;
        this.f22628d = str;
        this.f22629e = d1Var;
        this.f22630f = c1Var;
        this.f22631g = f1Var;
        this.f22632h = e1Var;
        this.f22633i = g1Var;
    }

    public final boolean a() {
        g1 g1Var;
        f1 f1Var = this.f22631g;
        if (f1Var == null) {
            return true;
        }
        long j9 = f1Var.f15337a;
        if (f1.a(j9, 0L) || f1.a(j9, 1L) || f1.a(j9, 3L) || (g1Var = this.f22633i) == null) {
            return true;
        }
        long j11 = g1Var.f15343a;
        return g1.a(j11, 0L) || g1.a(j11, 1L);
    }

    public final String toString() {
        return j4.s.f(this.f22625a, "Output-");
    }
}
