package f0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f16942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a50.c f16943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayMap f16944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayMap f16945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.g0 f16946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0.q1 f16947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f16948k;
    public final v80.q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Integer f16949m;

    public w0(String str, boolean z11, ArrayList arrayList, ArrayList arrayList2, List list, a50.c cVar, ArrayMap arrayMap, ArrayMap arrayMap2, i0.g0 g0Var, e0.q1 q1Var) {
        str.getClass();
        list.getClass();
        cVar.getClass();
        q1Var.getClass();
        this.f16938a = str;
        this.f16939b = z11;
        this.f16940c = arrayList;
        this.f16941d = arrayList2;
        this.f16942e = list;
        this.f16943f = cVar;
        this.f16944g = arrayMap;
        this.f16945h = arrayMap2;
        this.f16946i = g0Var;
        this.f16947j = q1Var;
        r80.c cVar2 = y0.f17001b;
        cVar2.getClass();
        this.f16948k = r80.c.f37782b.incrementAndGet(cVar2);
        this.l = new v80.q();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        com.braze.h2.b("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.f16949m != null) {
            Integer num = this.f16949m;
            if (num != null) {
                return num.intValue();
            }
            ax.y.d(this, 33, "SequenceNumber has not been set for ");
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.f16949m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(e0.k1 k1Var, long j9, e0.j1 j1Var) {
        this.f16943f.A(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e0.h1) list.get(i11)).H(k1Var, j9, j1Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1Var.e().f15358d.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((e0.h1) k1Var.e().f15358d.get(i12)).H(k1Var, j9, j1Var);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j9) {
        captureRequest.getClass();
        totalCaptureResult.getClass();
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f16943f.A(this);
        Trace.endSection();
        e0.k1 k1VarI = i(captureRequest);
        n nVar = new n(totalCaptureResult, this.f16938a, k1VarI);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e0.h1) list.get(i11)).G(k1VarI, j9, nVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((e0.h1) k1VarI.e().f15358d.get(i12)).G(k1VarI, j9, nVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((e0.h1) list.get(i13)).L(k1VarI, j9, nVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = k1VarI.e().f15358d.size();
        for (int i14 = 0; i14 < size4; i14++) {
            ((e0.h1) k1VarI.e().f15358d.get(i14)).L(k1VarI, j9, nVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j9) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.R(Unit.f26487a);
        e0.k1 k1VarI = i(captureRequest);
        b(k1VarI, j9, new w2(k1VarI, j9));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i11) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureProcessProgressed");
        e0.k1 k1VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((e0.h1) list.get(i12)).B(k1VarI, i11);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((e0.h1) k1VarI.e().f15358d.get(i13)).B(k1VarI, i11);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i11) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.R(Unit.f26487a);
        this.f16943f.A(this);
        if (a() != i11) {
            String str = "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i11 + '!';
            this.f16947j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.f16941d;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e0.k1 k1Var = (e0.k1) arrayList.get(i12);
            List list = this.f16942e;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((e0.h1) list.get(i13)).A(k1Var);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            e0.k1 k1Var2 = (e0.k1) arrayList.get(i14);
            int size4 = k1Var2.e().f15358d.size();
            for (int i15 = 0; i15 < size4; i15++) {
                ((e0.h1) k1Var2.e().f15358d.get(i15)).A(k1Var2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i11, long j9) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.R(Unit.f26487a);
        this.f16943f.A(this);
        if (a() != i11) {
            String str = "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i11 + '!';
            this.f16947j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.f16941d;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e0.k1 k1Var = (e0.k1) arrayList.get(i12);
            List list = this.f16942e;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((e0.h1) list.get(i13)).g(k1Var, j9);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            e0.k1 k1Var2 = (e0.k1) arrayList.get(i14);
            int size4 = k1Var2.e().f15358d.size();
            for (int i15 = 0; i15 < size4; i15++) {
                ((e0.h1) k1Var2.e().f15358d.get(i15)).g(k1Var2, j9);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j9, long j11) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureStarted");
        this.l.R(Unit.f26487a);
        e0.k1 k1VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e0.h1) list.get(i11)).r(k1VarI, j9, j11);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((e0.h1) k1VarI.e().f15358d.get(i12)).r(k1VarI, j9, j11);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final e0.k1 i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.f16940c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList.get(i11) == captureRequest) {
                return (e0.k1) this.f16941d.get(i11);
            }
        }
        m0.i1.k("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j9) {
        i0.e0 e0Var;
        Object next;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        e0.p1 p1Var = (e0.p1) this.f16944g.get(surface);
        ArrayMap arrayMap = this.f16945h;
        if (p1Var == null) {
            e0.x0 x0Var = (e0.x0) arrayMap.get(surface);
            e0.p1 p1Var2 = null;
            if (x0Var != null) {
                int i11 = x0Var.f15417a;
                Iterator it = this.f16946i.f22659h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((i0.e0) next).f22625a == i11) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                e0Var = (i0.e0) next;
            } else {
                e0Var = null;
            }
            if (e0Var != null) {
                e0.e0 e0Var2 = e0Var.f22634j;
                if (e0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stream");
                    e0Var2 = null;
                }
                if (e0Var2 != null) {
                    p1Var2 = new e0.p1(e0Var2.f15329a);
                }
            }
            p1Var = p1Var2;
        }
        e0.x0 x0Var2 = (e0.x0) arrayMap.get(surface);
        if (p1Var == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the streamId for ");
            sb2.append(surface);
            hv.k.a(sb2, " on ", e0.l0.a(j9));
            return;
        }
        if (x0Var2 == null) {
            StringBuilder sb3 = new StringBuilder("Unable to find the outputId for ");
            sb3.append(surface);
            hv.k.a(sb3, " on ", e0.l0.a(j9));
            return;
        }
        e0.k1 k1VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((e0.h1) list.get(i12)).getClass();
            k1VarI.getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((e0.h1) k1VarI.e().f15358d.get(i13)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            ((e0.h1) list.get(i14)).I(k1VarI, j9, p1Var.f15397a, x0Var2.f15417a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = k1VarI.e().f15358d.size();
        for (int i15 = 0; i15 < size4; i15++) {
            ((e0.h1) k1VarI.e().f15358d.get(i15)).I(k1VarI, j9, p1Var.f15397a, x0Var2.f15417a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.R(Unit.f26487a);
        e0.k1 k1VarI = i(captureRequest);
        b(k1VarI, captureFailure.getFrameNumber(), new i(k1VarI, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        o oVar = new o(captureResult, this.f16938a);
        e0.k1 k1VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e0.h1) list.get(i11)).u(k1VarI, frameNumber, oVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((e0.h1) k1VarI.e().f15358d.get(i12)).u(k1VarI, frameNumber, oVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
        cameraCaptureSession.getClass();
        f(i11);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i11, long j9) {
        cameraCaptureSession.getClass();
        g(i11, j9);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j9, long j11) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        h(captureRequest, j11, j9);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(@NotNull CameraCaptureSession cameraCaptureSession, @NotNull CaptureRequest captureRequest, long j9, long j11) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        e0.k1 k1VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.f16942e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((e0.h1) list.get(i11)).p(k1VarI, j11, j9);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = k1VarI.e().f15358d.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((e0.h1) k1VarI.e().f15358d.get(i12)).p(k1VarI, j11, j9);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.f16948k;
    }
}
