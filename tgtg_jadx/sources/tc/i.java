package tc;

import android.webkit.MimeTypeMap;
import ia0.a0;
import java.io.File;
import qc.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f39932a;

    public i(File file) {
        this.f39932a = file;
    }

    @Override // tc.h
    public final Object a(x70.c cVar) {
        String str = a0.f23602b;
        File file = this.f39932a;
        return new n(new p(n20.f.t(file), ia0.m.f23661a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(e80.m.f(file)), qc.f.DISK);
    }
}
