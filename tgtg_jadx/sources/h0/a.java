package h0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f20956b;

    public /* synthetic */ a(int i11, b bVar) {
        this.f20955a = i11;
        this.f20956b = bVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            i11 = this.f20955a;
            i12 = 10;
            if (i13 >= 10) {
                break;
            }
            if (i11 >= c.f20960a[i13]) {
                i12 = i13 + 1;
                break;
            }
            i13++;
        }
        Thread threadNewThread = this.f20956b.newThread(new b0.h(i11, runnable));
        threadNewThread.setPriority(i12);
        return threadNewThread;
    }
}
