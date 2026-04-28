package m0;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f28551b;

    public m(int i11) {
        this.f28550a = i11;
        switch (i11) {
            case 1:
                this.f28551b = new AtomicInteger(0);
                break;
            case 2:
                this.f28551b = new AtomicInteger(0);
                break;
            default:
                this.f28551b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f28550a) {
            case 0:
                Thread thread = new Thread(new l(runnable, 0));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) this.f28551b).getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + ((AtomicInteger) this.f28551b).getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + ((AtomicInteger) this.f28551b).getAndIncrement());
                return thread3;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a40.z(runnable, 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f28551b).getAndIncrement());
                return threadNewThread;
        }
    }

    public m(AtomicLong atomicLong) {
        this.f28550a = 3;
        this.f28551b = atomicLong;
    }
}
