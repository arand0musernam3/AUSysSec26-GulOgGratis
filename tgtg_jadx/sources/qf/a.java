package qf;

import androidx.constraintlayout.widget.z;
import com.google.android.gms.internal.measurement.cg;
import java.util.concurrent.atomic.AtomicInteger;
import of.k;
import u70.l;
import u70.t;
import v80.b0;
import x80.i;
import x80.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye.b f37030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f37031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub.a f37032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f37033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hf.g f37034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f37035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f37036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f37037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f37040k;
    public final t l;

    public a(ye.b bVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ye.g gVar = bVar.f45852a;
        ub.a aVar = new ub.a(gVar, bVar.f());
        z zVar = new z(gVar.f45893h, 11);
        hf.g gVarG = bVar.g();
        b0 b0Var = bVar.f45854c;
        i iVarA = cg.a(Integer.MAX_VALUE, null, null, 6);
        i iVarA2 = cg.a(Integer.MAX_VALUE, null, null, 6);
        gVarG.getClass();
        this.f37030a = bVar;
        this.f37031b = atomicInteger;
        this.f37032c = aVar;
        this.f37033d = zVar;
        this.f37034e = gVarG;
        this.f37035f = b0Var;
        this.f37036g = iVarA;
        this.f37037h = iVarA2;
        this.f37040k = new AtomicInteger(1);
        this.l = l.b(new ky.i(this, 10));
        this.f37038i = false;
        this.f37039j = false;
        try {
            Runtime.getRuntime().addShutdownHook(new k(this, 1));
        } catch (IllegalStateException unused) {
        }
    }
}
