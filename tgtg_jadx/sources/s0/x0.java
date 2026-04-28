package s0;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f38463k;
    public static final AtomicInteger l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f38464m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38465a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38466b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38467c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e6.i f38468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e6.l f38469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e6.i f38470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e6.l f38471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f38472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f38474j;

    static {
        new Size(0, 0);
        f38463k = wd.a.B(3, "DeferrableSurface");
        l = new AtomicInteger(0);
        f38464m = new AtomicInteger(0);
    }

    public x0(int i11, Size size) {
        this.f38472h = size;
        this.f38473i = i11;
        final int i12 = 0;
        e6.l lVarA = ox.h.A(new e6.j(this) { // from class: s0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f38462b;

            {
                this.f38462b = this;
            }

            @Override // e6.j
            public final Object o(e6.i iVar) {
                switch (i12) {
                    case 0:
                        x0 x0Var = this.f38462b;
                        synchronized (x0Var.f38465a) {
                            x0Var.f38468d = iVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + x0Var + ")";
                    default:
                        x0 x0Var2 = this.f38462b;
                        synchronized (x0Var2.f38465a) {
                            x0Var2.f38470f = iVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + x0Var2 + ")";
                }
            }
        });
        this.f38469e = lVarA;
        final int i13 = 1;
        this.f38471g = ox.h.A(new e6.j(this) { // from class: s0.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f38462b;

            {
                this.f38462b = this;
            }

            @Override // e6.j
            public final Object o(e6.i iVar) {
                switch (i13) {
                    case 0:
                        x0 x0Var = this.f38462b;
                        synchronized (x0Var.f38465a) {
                            x0Var.f38468d = iVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + x0Var + ")";
                    default:
                        x0 x0Var2 = this.f38462b;
                        synchronized (x0Var2.f38465a) {
                            x0Var2.f38470f = iVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + x0Var2 + ")";
                }
            }
        });
        if (wd.a.B(3, "DeferrableSurface")) {
            e(f38464m.incrementAndGet(), l.get(), "Surface created");
            lVarA.f15782b.a(new mr.h(20, this, Log.getStackTraceString(new Exception())), w.b.F());
        }
    }

    public void a() {
        e6.i iVar;
        synchronized (this.f38465a) {
            try {
                if (this.f38467c) {
                    iVar = null;
                } else {
                    this.f38467c = true;
                    this.f38470f.b(null);
                    if (this.f38466b == 0) {
                        iVar = this.f38468d;
                        this.f38468d = null;
                    } else {
                        iVar = null;
                    }
                    if (wd.a.B(3, "DeferrableSurface")) {
                        wd.a.p("DeferrableSurface", "surface closed,  useCount=" + this.f38466b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final void b() {
        e6.i iVar;
        synchronized (this.f38465a) {
            try {
                int i11 = this.f38466b;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i12 = i11 - 1;
                this.f38466b = i12;
                if (i12 == 0 && this.f38467c) {
                    iVar = this.f38468d;
                    this.f38468d = null;
                } else {
                    iVar = null;
                }
                if (wd.a.B(3, "DeferrableSurface")) {
                    wd.a.p("DeferrableSurface", "use count-1,  useCount=" + this.f38466b + " closed=" + this.f38467c + " " + this);
                    if (this.f38466b == 0) {
                        e(f38464m.get(), l.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final ListenableFuture c() {
        synchronized (this.f38465a) {
            try {
                if (this.f38467c) {
                    return new x0.i(new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this), 1);
                }
                return f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f38465a) {
            try {
                int i11 = this.f38466b;
                if (i11 == 0 && this.f38467c) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f38466b = i11 + 1;
                if (wd.a.B(3, "DeferrableSurface")) {
                    if (this.f38466b == 1) {
                        e(f38464m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    wd.a.p("DeferrableSurface", "use count+1, useCount=" + this.f38466b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(int i11, int i12, String str) {
        if (!f38463k && wd.a.B(3, "DeferrableSurface")) {
            wd.a.p("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        wd.a.p("DeferrableSurface", str + "[total_surfaces=" + i11 + ", used_surfaces=" + i12 + "](" + this + "}");
    }

    public abstract ListenableFuture f();
}
