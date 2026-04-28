package a0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import b0.n;
import d2.k0;
import e0.v;
import f0.t0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.q;
import s0.r1;
import w.a0;
import x.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final s70.c A;
    public final s70.c B;
    public final s70.c C;
    public final s70.c D;
    public final s70.c E;
    public final s70.c F;
    public final s70.c G;
    public final s70.c H;
    public final s70.c I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50.c f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.a f21b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f22c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s70.c f23d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s70.c f24e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s70.c f25f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s70.c f26g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s70.c f27h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s70.c f28i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s70.c f29j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s70.c f30k;
    public final s70.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s70.c f31m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s70.c f32n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s70.c f33o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.c f34p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.c f35q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s70.c f36r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s70.c f37s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s70.c f38t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s70.c f39u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s70.c f40v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s70.c f41w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s70.c f42x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s70.c f43y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ag.d f44z = new ag.d();

    public c(a aVar, a50.c cVar, ub.a aVar2) {
        this.f22c = aVar;
        this.f20a = cVar;
        this.f21b = aVar2;
        this.f23d = a0.t(aVar, this, 4);
        this.f24e = a0.t(aVar, this, 3);
        this.f25f = a0.t(aVar, this, 2);
        this.f26g = a0.t(aVar, this, 9);
        this.f27h = a0.t(aVar, this, 10);
        this.f28i = a0.t(aVar, this, 8);
        this.f29j = a0.t(aVar, this, 7);
        this.f30k = a0.t(aVar, this, 11);
        this.l = a0.t(aVar, this, 6);
        this.f31m = a0.t(aVar, this, 12);
        this.f32n = a0.t(aVar, this, 5);
        this.f33o = a0.t(aVar, this, 14);
        this.f34p = a0.t(aVar, this, 13);
        this.f35q = a0.t(aVar, this, 16);
        this.f36r = a0.t(aVar, this, 15);
        this.f37s = a0.t(aVar, this, 17);
        this.f38t = a0.t(aVar, this, 18);
        this.f39u = a0.t(aVar, this, 19);
        this.f40v = a0.t(aVar, this, 20);
        this.f41w = a0.t(aVar, this, 22);
        this.f42x = a0.t(aVar, this, 21);
        this.f43y = a0.t(aVar, this, 23);
        this.A = a0.t(aVar, this, 25);
        this.B = a0.t(aVar, this, 26);
        this.C = a0.t(aVar, this, 28);
        this.D = a0.t(aVar, this, 27);
        this.E = a0.t(aVar, this, 29);
        this.F = a0.t(aVar, this, 24);
        this.G = a0.t(aVar, this, 30);
        this.H = a0.t(aVar, this, 1);
        this.I = a0.t(aVar, this, 31);
        ag.d.b(this.f44z, s70.a.a(new b(aVar, this, 0, 0)));
    }

    public final z.j a() {
        y.b bVar = (y.b) this.f29j.get();
        bVar.getClass();
        r1 r1VarA = bVar.a();
        r1VarA.getClass();
        Iterator it = r1VarA.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                    break;
                }
            } else if (!r1VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                return z.a.f46354g;
            }
        }
        return new k0(r1VarA);
    }

    public final k b() {
        Range rangeD;
        n nVar = (n) this.f24e.get();
        nVar.getClass();
        v vVar = nVar.f5321b;
        if (Intrinsics.areEqual("robolectric", Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = x.h.f43612a;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (wd.a.B(5, "CXCP")) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    key.getClass();
                    if (((t0) vVar).c(key) == null) {
                        return new x.h();
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (rangeD = f5.b.d(vVar)) != null) {
            return new q(nVar, rangeD);
        }
        return new ub.a(nVar);
    }
}
