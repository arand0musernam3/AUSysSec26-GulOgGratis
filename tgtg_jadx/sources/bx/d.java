package bx;

import android.preference.PreferenceManager;
import ax.a0;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReentrantReadWriteLock f6710a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f6712c;

    public static void a() {
        if (f6712c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f6710a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f6712c) {
                f6711b = PreferenceManager.getDefaultSharedPreferences(a0.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f6712c = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f6710a.writeLock().unlock();
            throw th2;
        }
    }
}
