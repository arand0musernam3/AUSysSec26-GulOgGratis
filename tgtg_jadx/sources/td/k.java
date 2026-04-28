package td;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fd.j f40020a = new fd.j(zd.a.f47527a, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fd.j f40021b = new fd.j(ae.q.f1263b, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fd.j f40022c = new fd.j(null, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.j f40023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fd.j f40024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fd.j f40025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fd.j f40026g;

    static {
        Boolean bool = Boolean.TRUE;
        f40023d = new fd.j(bool, 0);
        f40024e = new fd.j(null, 0);
        f40025f = new fd.j(bool, 0);
        f40026g = new fd.j(Boolean.FALSE, 0);
    }

    public static final Bitmap.Config a(o oVar) {
        return (Bitmap.Config) fd.o.f(oVar, f40021b);
    }

    public static final void b(e eVar, ImageView imageView) {
        eVar.f39960d = new xd.a(imageView);
    }
}
