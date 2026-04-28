package ae;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import fd.t;
import java.lang.ref.WeakReference;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1241b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f1240a = i11;
        this.f1241b = obj;
    }

    private final void c(int i11) {
        od.d dVarD;
        long jI;
        c cVar = (c) this.f1241b;
        synchronized (cVar) {
            try {
                t tVar = (t) ((WeakReference) cVar.f1243b).get();
                if (tVar != null) {
                    fd.q qVar = tVar.f17595a;
                    if (i11 >= 40) {
                        od.d dVarD2 = tVar.d();
                        if (dVarD2 != null) {
                            synchronized (dVarD2.f32436c) {
                                ((od.f) dVarD2.f32434a.f8720c).p(-1L);
                                od.h hVar = dVarD2.f32435b;
                                hVar.f32448b = 0;
                                hVar.f32447a.clear();
                            }
                        }
                    } else if (i11 >= 20) {
                        ((a) cVar.f1244c).a(qVar.f17579a);
                    } else if (i11 >= 10 && (dVarD = tVar.d()) != null) {
                        synchronized (dVarD.f32436c) {
                            jI = ((od.f) dVarD.f32434a.f8720c).i();
                        }
                        long j9 = jI / ((long) 2);
                        synchronized (dVarD.f32436c) {
                            ((od.f) dVarD.f32434a.f8720c).p(j9);
                        }
                    }
                } else {
                    cVar.l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.f1240a) {
            case 0:
                c cVar = (c) this.f1241b;
                synchronized (cVar) {
                    if (((t) ((WeakReference) cVar.f1243b).get()) == null) {
                        cVar.l();
                        break;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.f1240a) {
            case 0:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        switch (this.f1240a) {
            case 0:
                c(i11);
                return;
            default:
                if (i11 >= 40) {
                    i4.e eVar = (i4.e) this.f1241b;
                    k8.d dVar = eVar.f23240e;
                    if (dVar != null) {
                        synchronized (dVar) {
                            try {
                                t0 t0Var = (t0) dVar.f26134b;
                                if (t0Var != null) {
                                    t0Var.g();
                                }
                                dVar.f26135c = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    eVar.f23240e = null;
                    return;
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
