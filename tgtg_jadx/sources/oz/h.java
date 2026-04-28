package oz;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f33817b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f33818c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33819a;

    public /* synthetic */ h(int i11) {
        this.f33819a = i11;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f33819a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
