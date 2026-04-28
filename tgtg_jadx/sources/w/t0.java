package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import com.braze.h2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m0.e1;
import m0.i1;
import s0.u1;
import s0.x0;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.v f42781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f42782b = u70.l.b(new rv.a(this, 20));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8.h f42783c = new a8.h(new qc.y(28));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ld.k f42787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1 f42788h;

    public t0(b0.n nVar) {
        this.f42781a = nVar.f5321b;
        this.f42786f = y.c.a().b(ZslDisablerQuirk.class) != null;
    }

    @Override // w.s0
    public final void a(u1 u1Var) throws Exception {
        i0.w wVar = u1Var.f38447b;
        j();
        if (this.f42784d) {
            wVar.f22745b = 1;
            return;
        }
        if (this.f42786f) {
            wVar.f22745b = 1;
            return;
        }
        e0.v.f15412i0.getClass();
        e0.v vVar = this.f42781a;
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key);
        if (iArr == null) {
            iArr = e0.u.f15408b;
        }
        if (!kotlin.collections.y.t(iArr, 4)) {
            if (wd.a.B(4, "CXCP")) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            wVar.f22745b = 1;
            return;
        }
        u70.t tVar = this.f42782b;
        Size[] inputSizes = ((StreamConfigurationMap) tVar.getValue()).getInputSizes(34);
        inputSizes.getClass();
        Iterator it = kotlin.collections.y.T(inputSizes).iterator();
        if (!it.hasNext()) {
            i1.c();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            size.getClass();
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                size2.getClass();
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        int[] validOutputFormatsForInput = ((StreamConfigurationMap) tVar.getValue()).getValidOutputFormatsForInput(34);
        validOutputFormatsForInput.getClass();
        if (!kotlin.collections.y.t(validOutputFormatsForInput, 256)) {
            if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        m0.p0 p0Var = new m0.p0(size3.getWidth(), size3.getHeight(), 34, 9);
        g1.g gVar = p0Var.f28575b;
        gVar.getClass();
        ld.k kVar = new ld.k(p0Var);
        p0Var.k(new mp.a(this, 18), b.Q());
        Surface surface = kVar.getSurface();
        if (surface == null) {
            h2.b("Required value was null.");
            return;
        }
        e1 e1Var = new e1(surface, new Size(kVar.b(), kVar.getHeight()), 34);
        x0.g.d(e1Var.f38469e).a(new r0.i(kVar, 3), b.U());
        u1Var.b(e1Var, m0.c0.f28478d, -1);
        wVar.c(gVar);
        ArrayList arrayList = u1Var.f38450e;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        u1Var.f38452g = new InputConfiguration(kVar.b(), kVar.getHeight(), kVar.c());
        this.f42787g = kVar;
        this.f42788h = e1Var;
    }

    @Override // w.s0
    public final void b() throws Exception {
        j();
    }

    @Override // w.s0
    public final boolean c() {
        return this.f42784d;
    }

    @Override // w.s0
    public final boolean d() {
        return this.f42785e;
    }

    @Override // w.s0
    public final void e(boolean z11) {
        this.f42785e = z11;
    }

    @Override // w.s0
    public final void f(boolean z11) throws Exception {
        if (this.f42784d != z11 && z11) {
            i();
        }
        this.f42784d = z11;
    }

    @Override // w.s0
    public final boolean g(x0 x0Var, z1 z1Var) {
        x0Var.getClass();
        z1Var.getClass();
        InputConfiguration inputConfiguration = z1Var.f38496i;
        return inputConfiguration != null && x0Var.f38473i == inputConfiguration.getFormat() && x0Var.f38472h.getWidth() == inputConfiguration.getWidth() && x0Var.f38472h.getHeight() == inputConfiguration.getHeight();
    }

    @Override // w.s0
    public final m0.n0 h() {
        try {
            return (m0.n0) this.f42783c.m();
        } catch (NoSuchElementException unused) {
            if (!wd.a.B(5, "CXCP")) {
                return null;
            }
            Log.w("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    public final void i() throws Exception {
        boolean zIsEmpty;
        a8.h hVar = this.f42783c;
        while (true) {
            synchronized (hVar.f974c) {
                zIsEmpty = ((ArrayDeque) hVar.f973b).isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((m0.n0) hVar.m()).close();
            }
        }
    }

    public final void j() throws Exception {
        e1 e1Var = this.f42788h;
        if (e1Var != null) {
            ld.k kVar = this.f42787g;
            if (kVar != null) {
                x0.g.d(e1Var.f38469e).a(new r0.i(kVar, 4), b.U());
                kVar.e();
                this.f42787g = null;
            }
            e1Var.a();
            this.f42788h = null;
        }
        i();
    }
}
