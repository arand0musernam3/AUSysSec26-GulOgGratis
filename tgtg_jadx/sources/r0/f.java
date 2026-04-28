package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import c50.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import m0.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f37451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb.b f37453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f37454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f37455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f37456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f37459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f37460k;
    public final List l;

    public f(Executor executor, jb.b bVar, b0 b0Var, Rect rect, Matrix matrix, int i11, int i12, int i13, boolean z11, List list) {
        this.f37450a = ((CaptureFailedRetryQuirk) z0.a.f46383a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.f37451b = new HashMap();
        if (executor == null) {
            w.l("Null appExecutor");
            throw null;
        }
        this.f37452c = executor;
        this.f37453d = bVar;
        this.f37454e = b0Var;
        this.f37455f = rect;
        if (matrix == null) {
            w.l("Null sensorToBufferTransform");
            throw null;
        }
        this.f37456g = matrix;
        this.f37457h = i11;
        this.f37458i = i12;
        this.f37459j = i13;
        this.f37460k = z11;
        if (list != null) {
            this.l = list;
        } else {
            w.l("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    public final boolean a() {
        Iterator it = this.f37451b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f37451b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i11), Boolean.TRUE);
        } else {
            wd.a.r("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f37452c.equals(fVar.f37452c)) {
            return false;
        }
        jb.b bVar = fVar.f37453d;
        jb.b bVar2 = this.f37453d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        b0 b0Var = fVar.f37454e;
        b0 b0Var2 = this.f37454e;
        if (b0Var2 == null) {
            if (b0Var != null) {
                return false;
            }
        } else if (!b0Var2.equals(b0Var)) {
            return false;
        }
        return this.f37455f.equals(fVar.f37455f) && this.f37456g.equals(fVar.f37456g) && this.f37457h == fVar.f37457h && this.f37458i == fVar.f37458i && this.f37459j == fVar.f37459j && this.f37460k == fVar.f37460k && this.l.equals(fVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.f37452c.hashCode() ^ 1000003) * (-721379959);
        jb.b bVar = this.f37453d;
        int iHashCode2 = (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        b0 b0Var = this.f37454e;
        return ((((((((((((((iHashCode2 ^ (b0Var != null ? b0Var.hashCode() : 0)) * (-721379959)) ^ this.f37455f.hashCode()) * 1000003) ^ this.f37456g.hashCode()) * 1000003) ^ this.f37457h) * 1000003) ^ this.f37458i) * 1000003) ^ this.f37459j) * 1000003) ^ (this.f37460k ? 1231 : 1237)) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb2.append(this.f37452c);
        sb2.append(", inMemoryCallback=null, onDiskCallback=");
        sb2.append(this.f37453d);
        sb2.append(", outputFileOptions=");
        sb2.append(this.f37454e);
        sb2.append(", secondaryOutputFileOptions=null, cropRect=");
        sb2.append(this.f37455f);
        sb2.append(", sensorToBufferTransform=");
        sb2.append(this.f37456g);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f37457h);
        sb2.append(", jpegQuality=");
        sb2.append(this.f37458i);
        sb2.append(", captureMode=");
        sb2.append(this.f37459j);
        sb2.append(", simultaneousCapture=");
        sb2.append(this.f37460k);
        sb2.append(", sessionConfigCameraCaptureCallbacks=");
        return e0.f.p(sb2, this.l, "}");
    }
}
