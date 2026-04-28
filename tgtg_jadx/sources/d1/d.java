package d1;

import a40.q;
import al.u;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c1.o;
import c1.p;
import com.google.firebase.messaging.r;
import e1.j;
import e6.i;
import e6.l;
import e6.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.b0;
import m0.c0;
import m0.h1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f13678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.c f13679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f13680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f13684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f13685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f13686j;

    public d(c0 c0Var, b0 b0Var, b0 b0Var2) {
        Map map = Collections.EMPTY_MAP;
        this.f13681e = 0;
        this.f13682f = false;
        this.f13683g = new AtomicBoolean(false);
        this.f13684h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f13678b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f13680d = handler;
        this.f13679c = new w0.c(handler);
        this.f13677a = new c(b0Var, b0Var2);
        try {
            f(c0Var);
        } catch (RuntimeException e5) {
            a();
            throw e5;
        }
    }

    @Override // c1.p
    public final void a() {
        if (this.f13683g.getAndSet(true)) {
            return;
        }
        e(new u(this, 29), new bx.c(4));
    }

    @Override // c1.p
    public final void b(h1 h1Var) {
        if (this.f13683g.get()) {
            h1Var.c();
        } else {
            e(new r(4, this, h1Var), new c1.c(h1Var, 0));
        }
    }

    @Override // c1.p
    public final void c(o oVar) {
        if (this.f13683g.get()) {
            oVar.close();
            return;
        }
        r rVar = new r(5, this, oVar);
        Objects.requireNonNull(oVar);
        e(rVar, new u(oVar, 14));
    }

    public final void d() {
        if (this.f13682f && this.f13681e == 0) {
            LinkedHashMap linkedHashMap = this.f13684h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((o) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.f13677a;
            if (((AtomicBoolean) cVar.f6867c).getAndSet(false)) {
                j.c((Thread) cVar.f6869e);
                cVar.p();
            }
            cVar.f13673n = -1;
            cVar.f13674o = -1;
            this.f13678b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f13679c.execute(new q(this, runnable2, runnable, 17));
        } catch (RejectedExecutionException e5) {
            wd.a.J("DualSurfaceProcessor", "Unable to executor runnable", e5);
            runnable2.run();
        }
    }

    public final void f(c0 c0Var) {
        Map map = Collections.EMPTY_MAP;
        i iVar = new i();
        iVar.f15778c = new n();
        l lVar = new l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            e(new q(this, c0Var, iVar), new bx.c(4));
            iVar.f15776a = "Init GlRenderer";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        try {
            lVar.get();
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            wy.o.k("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f13683g.get() || (surfaceTexture2 = this.f13685i) == null || this.f13686j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f13686j.updateTexImage();
        for (Map.Entry entry : this.f13684h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            o oVar = (o) entry.getKey();
            if (oVar.f6912c == 34) {
                try {
                    this.f13677a.v(surfaceTexture.getTimestamp(), surface, oVar, this.f13685i, this.f13686j);
                } catch (RuntimeException e5) {
                    wd.a.s("DualSurfaceProcessor", "Failed to render with OpenGL.", e5);
                }
            }
        }
    }
}
