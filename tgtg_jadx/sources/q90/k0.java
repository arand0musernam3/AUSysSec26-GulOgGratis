package q90;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f36521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FileDescriptor f36522b;

    public k0(FileDescriptor fileDescriptor, z zVar) {
        this.f36521a = zVar;
        this.f36522b = fileDescriptor;
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36521a;
    }

    @Override // q90.n0
    public final boolean isOneShot() {
        return true;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f36522b);
        try {
            hVar.h().b0(ia0.b.g(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
