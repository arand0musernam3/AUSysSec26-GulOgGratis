package vc;

import java.io.File;
import zc.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42217a;

    public a(boolean z11) {
        this.f42217a = z11;
    }

    @Override // vc.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f42217a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
