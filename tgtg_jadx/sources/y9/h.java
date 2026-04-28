package y9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements a30.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f45667b;

    public h(int i11) {
        switch (i11) {
            case 5:
                this.f45666a = null;
                this.f45667b = null;
                break;
            default:
                this.f45666a = new x4.e();
                this.f45667b = new x4.e();
                break;
        }
    }

    @Override // a30.c
    public Object a() {
        return new z20.j(((l8.m) ((u6.f) this.f45666a).f40820a).f27469a, (z20.k) ((a30.c) this.f45667b).a());
    }

    public boolean b() {
        synchronized (this) {
            if (((AtomicBoolean) this.f45667b).get()) {
                return false;
            }
            ((AtomicInteger) this.f45666a).incrementAndGet();
            return true;
        }
    }

    public void c() throws IOException {
        String str = (String) this.f45666a;
        if (((FileChannel) this.f45667b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f45667b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f45667b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f45667b = null;
            wy.o.k(w.a0.p("Unable to lock file: '", str, "'."), th2);
        }
    }

    public void d() {
        synchronized (this) {
            ((AtomicInteger) this.f45666a).decrementAndGet();
            if (((AtomicInteger) this.f45666a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
