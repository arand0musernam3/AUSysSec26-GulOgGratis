package w0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f42800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f42801c = new a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f42802d = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42803a;

    public /* synthetic */ a(int i11) {
        this.f42803a = i11;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42803a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
