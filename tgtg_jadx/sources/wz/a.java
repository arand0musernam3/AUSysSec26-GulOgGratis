package wz;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o30.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f43594b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f43593a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f43594b.newThread(new y0(4, runnable));
        threadNewThread.setName(this.f43593a);
        return threadNewThread;
    }
}
