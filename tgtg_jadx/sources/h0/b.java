package h0;

import java.util.concurrent.ThreadFactory;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f20957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r80.b f20959c;

    public /* synthetic */ b(ThreadFactory threadFactory, String str, r80.b bVar) {
        this.f20957a = threadFactory;
        this.f20958b = str;
        this.f20959c = bVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f20957a.newThread(runnable);
        threadNewThread.getClass();
        threadNewThread.setName(this.f20958b + StringsKt.M(2, String.valueOf(r80.b.f37780b.incrementAndGet(this.f20959c))));
        return threadNewThread;
    }
}
