package m1;

import android.view.Surface;
import android.view.SurfaceControl;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceControl f28702a;

    public e(g gVar, int i11, int i12, String str) {
        SurfaceControl surfaceControlBuild = new SurfaceControl.Builder().setName(str).setBufferSize(i11, i12).setParent(((e) gVar).f28702a).build();
        surfaceControlBuild.getClass();
        this.f28702a = surfaceControlBuild;
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.setVisibility(surfaceControlBuild, true).apply();
            transaction.close();
        } finally {
        }
    }

    @Override // m1.g
    public final void b() throws IOException {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.reparent(this.f28702a, null).apply();
            transaction.close();
        } finally {
        }
    }

    @Override // m1.g
    public final boolean d(g gVar) {
        if (!this.f28702a.isValid()) {
            return false;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.reparent(this.f28702a, ((e) gVar).f28702a).apply();
            transaction.close();
            return true;
        } finally {
        }
    }

    @Override // m1.g
    public final Surface e() {
        return new Surface(this.f28702a);
    }

    public e(SurfaceControl surfaceControl) {
        surfaceControl.getClass();
        this.f28702a = surfaceControl;
    }
}
