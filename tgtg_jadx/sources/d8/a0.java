package d8;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f14571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f14572c;

    public a0(File file, x0 x0Var) {
        x0Var.getClass();
        this.f14570a = file;
        this.f14571b = x0Var;
        this.f14572c = new AtomicBoolean(false);
    }

    @Override // d8.a
    public final void close() {
        this.f14572c.set(true);
    }
}
