package q90;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f36511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f36512b;

    public h0(z zVar, File file) {
        this.f36511a = zVar;
        this.f36512b = file;
    }

    @Override // q90.n0
    public final long contentLength() {
        return this.f36512b.length();
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36511a;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) {
        File file = this.f36512b;
        file.getClass();
        ia0.u uVar = new ia0.u(new FileInputStream(file), ia0.l0.f23657d);
        try {
            hVar.b0(uVar);
            uVar.close();
        } finally {
        }
    }
}
