package s0;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements m0.u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.u0 f38420c;

    public o0(long j9, int i11) {
        this.f38419b = i11;
        switch (i11) {
            case 1:
                this.f38420c = new l2(j9, new n0(j9));
                break;
            default:
                this.f38420c = new o0(j9, 1);
                break;
        }
    }

    @Override // m0.u0
    public final long a() {
        switch (this.f38419b) {
            case 0:
                return ((l2) ((o0) this.f38420c).f38420c).f38384b;
            default:
                return ((l2) this.f38420c).f38384b;
        }
    }

    @Override // m0.u0
    public final m0.t0 b(ic.a aVar) {
        switch (this.f38419b) {
            case 0:
                if (((l2) ((o0) this.f38420c).f38420c).b(aVar).f28603b) {
                    return m0.t0.f28600e;
                }
                Throwable th2 = (Throwable) aVar.f23775c;
                if (th2 instanceof CameraValidator$CameraIdListIncorrectException) {
                    wd.a.r("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th2).f2217a > 0) {
                        return m0.t0.f28601f;
                    }
                }
                return m0.t0.f28599d;
            default:
                return ((l2) this.f38420c).b(aVar);
        }
    }
}
