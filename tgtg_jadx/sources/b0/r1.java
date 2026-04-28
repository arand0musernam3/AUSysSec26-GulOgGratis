package b0;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends m0.m1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f5393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e1 f5394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Size f5395t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f5396u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s0.v1 f5397v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m0.e1 f5398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(n nVar, q1 q1Var, e1 e1Var) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(q1Var);
        nVar.getClass();
        e1Var.getClass();
        this.f5393r = nVar;
        this.f5394s = e1Var;
        Size size = t1.f5423a;
        e0.v vVar = nVar.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((f0.t0) vVar).c(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (wd.a.B(6, "CXCP")) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = z.i.f46375a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) y.c.a().b(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (z.i.f46376b.compare(size4, z.i.f46375a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                kotlin.collections.x.p(new s1(), outputSizes);
            }
            Size sizeC = e1Var.c();
            long jMin = Math.min(307200L, ((long) sizeC.getWidth()) * ((long) sizeC.getHeight()));
            int length = outputSizes.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Size size5 = outputSizes[i11];
                long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                if (width != jMin) {
                    if (width > jMin) {
                        if (size2 == null) {
                            break;
                        }
                    } else {
                        i11++;
                        size2 = size5;
                    }
                } else {
                    size = size5;
                    break;
                }
            }
            size = size2 == null ? outputSizes[0] : size2;
        }
        this.f5395t = size;
        this.f5396u = new Object();
    }

    public final m0.e1 D(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        m0.e1 e1Var = this.f5398w;
        if (e1Var != null) {
            e1Var.a();
        }
        m0.e1 e1Var2 = new m0.e1(surface, size, this.f28560i.k());
        this.f5398w = e1Var2;
        x0.g.d(e1Var2.f38469e).a(new a40.l(20, surface, surfaceTexture), w.b.F());
        return e1Var2;
    }

    public final s0.u1 E(final Size size) {
        m0.e1 e1VarD;
        synchronized (this.f5396u) {
            e1VarD = D(size);
        }
        s0.v1 v1Var = this.f5397v;
        if (v1Var != null) {
            v1Var.b();
        }
        s0.v1 v1Var2 = new s0.v1(new s0.w1() { // from class: b0.p1
            @Override // s0.w1
            public final void a(s0.z1 z1Var, s0.x1 x1Var) {
                z1Var.getClass();
                x1Var.getClass();
                r1 r1Var = this.f5362a;
                r1Var.B(kotlin.collections.c0.c(r1Var.E(size).c()));
                r1Var.p();
            }
        });
        this.f5397v = v1Var2;
        s0.u1 u1VarD = s0.u1.d(new q1(), size);
        u1VarD.f38447b.f22745b = 1;
        u1VarD.b(e1VarD, m0.c0.f28478d, -1);
        u1VarD.f38451f = v1Var2;
        return u1VarD;
    }

    public final void F() {
        C(s0.n.a(t1.f5423a).d(), null);
    }

    @Override // m0.m1
    public final s0.o2 g(boolean z11, s0.r2 r2Var) {
        r2Var.getClass();
        this.f5393r.getClass();
        this.f5394s.getClass();
        return new q1();
    }

    @Override // m0.m1
    public final s0.n2 m(s0.u0 u0Var) {
        u0Var.getClass();
        this.f5393r.getClass();
        this.f5394s.getClass();
        return new c1();
    }

    @Override // m0.m1
    public final s0.n x(s0.n nVar, s0.n nVar2) {
        Size size = this.f5395t;
        B(kotlin.collections.c0.c(E(size).c()));
        g40.b bVarB = nVar.b();
        bVarB.f20000a = size;
        return bVarB.d();
    }

    @Override // m0.m1
    public final void y() {
        s0.v1 v1Var = this.f5397v;
        if (v1Var != null) {
            v1Var.b();
        }
        this.f5397v = null;
        synchronized (this.f5396u) {
            try {
                m0.e1 e1Var = this.f5398w;
                if (e1Var != null) {
                    e1Var.a();
                }
                this.f5398w = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
