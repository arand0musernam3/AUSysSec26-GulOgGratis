package s0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f38326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38327b;

    public f(Executor executor, Handler handler) {
        if (executor == null) {
            c50.w.l("Null cameraExecutor");
            throw null;
        }
        this.f38326a = executor;
        if (handler != null) {
            this.f38327b = handler;
        } else {
            c50.w.l("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f38326a.equals(fVar.f38326a) && this.f38327b.equals(fVar.f38327b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38326a.hashCode() ^ 1000003) * 1000003) ^ this.f38327b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f38326a + ", schedulerHandler=" + this.f38327b + "}";
    }
}
