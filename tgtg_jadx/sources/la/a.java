package la;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f27569e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f27571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f27572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f27573d;

    public a(String str, File file, boolean z11) {
        Lock lock;
        str.getClass();
        this.f27570a = z11;
        this.f27571b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f27569e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f27572c = lock;
    }

    public final void a(boolean z11) {
        this.f27572c.lock();
        if (z11) {
            File file = this.f27571b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f27573d = channel;
            } catch (IOException e5) {
                this.f27573d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f27573d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f27572c.unlock();
    }
}
