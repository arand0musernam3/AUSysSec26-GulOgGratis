package f0;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends CameraExtensionSession$ExtensionCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f16616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f16617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f16618d;

    public e(f fVar, w0 w0Var) {
        this.f16615a = 0;
        this.f16617c = fVar;
        this.f16616b = w0Var;
        this.f16618d = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i11 = this.f16615a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i11) {
            case 0:
                if (((ConcurrentLinkedQueue) this.f16618d).isEmpty()) {
                    r80.c cVar = this.f16617c.f16637e;
                    cVar.getClass();
                    long jIncrementAndGet = r80.c.f37782b.incrementAndGet(cVar);
                    this.f16617c.f16638f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) this.f16618d).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) this.f16618d).remove();
                objRemove.getClass();
                this.f16616b.d(captureRequest, ((Number) objRemove).longValue());
                break;
            default:
                Object obj = ((LinkedHashMap) this.f16618d).get(captureRequest);
                obj.getClass();
                int size = ((List) obj).size();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16618d;
                if (size != 1) {
                    StringBuilder sb2 = new StringBuilder("onCaptureFailed is not triggered for repeating requests. Request frame numbers: ");
                    Object obj2 = linkedHashMap.get(captureRequest);
                    obj2.getClass();
                    sb2.append(((List) obj2).stream());
                    Log.i("CXCP", sb2.toString());
                } else {
                    Object obj3 = linkedHashMap.get(captureRequest);
                    obj3.getClass();
                    this.f16616b.d(captureRequest, ((Number) ((List) obj3).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i11) {
        int i12 = this.f16615a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i12) {
            case 0:
                this.f16616b.e(captureRequest, i11);
                break;
            default:
                this.f16616b.e(captureRequest, i11);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i11 = this.f16615a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f16615a) {
            case 0:
                cameraExtensionSession.getClass();
                captureRequest.getClass();
                totalCaptureResult.getClass();
                if (((ConcurrentLinkedQueue) this.f16618d).isEmpty()) {
                    r80.c cVar = this.f16617c.f16637e;
                    cVar.getClass();
                    long jIncrementAndGet = r80.c.f37782b.incrementAndGet(cVar);
                    this.f16617c.f16638f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) this.f16618d).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) this.f16618d).remove();
                objRemove.getClass();
                this.f16616b.c(captureRequest, totalCaptureResult, ((Number) objRemove).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i11) {
        int i12 = this.f16615a;
        cameraExtensionSession.getClass();
        switch (i12) {
            case 0:
                this.f16616b.f(i11);
                break;
            default:
                this.f16616b.f(i11);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i11) {
        int i12 = this.f16615a;
        cameraExtensionSession.getClass();
        switch (i12) {
            case 0:
                Long l = (Long) this.f16617c.f16638f.get(cameraExtensionSession);
                l.getClass();
                this.f16616b.g(i11, l.longValue());
                break;
            default:
                Long l7 = (Long) this.f16617c.f16638f.get(cameraExtensionSession);
                l7.getClass();
                this.f16616b.g(i11, l7.longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j9) {
        int i11 = this.f16615a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i11) {
            case 0:
                r80.c cVar = this.f16617c.f16637e;
                cVar.getClass();
                long jIncrementAndGet = r80.c.f37782b.incrementAndGet(cVar);
                this.f16617c.f16638f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) this.f16618d).add(Long.valueOf(jIncrementAndGet));
                this.f16616b.h(captureRequest, jIncrementAndGet, j9);
                break;
            default:
                r80.c cVar2 = this.f16617c.f16637e;
                cVar2.getClass();
                long jIncrementAndGet2 = r80.c.f37782b.incrementAndGet(cVar2);
                this.f16617c.f16638f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16618d;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.f16616b.h(captureRequest, jIncrementAndGet2, j9);
                break;
        }
    }

    public e(f fVar, w0 w0Var, LinkedHashMap linkedHashMap) {
        this.f16615a = 1;
        this.f16617c = fVar;
        this.f16616b = w0Var;
        this.f16618d = linkedHashMap;
    }
}
