package o00;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Logger f31711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31712c;

    public m1() {
        this.f31712c = new r();
        this.f31710a = t1.class.getName();
    }

    public Logger a() {
        Logger logger = this.f31711b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f31712c) {
            try {
                Logger logger2 = this.f31711b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f31710a);
                this.f31711b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Logger b() {
        Logger logger = this.f31711b;
        if (logger != null) {
            return logger;
        }
        synchronized (((r) this.f31712c)) {
            try {
                Logger logger2 = this.f31711b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f31710a);
                this.f31711b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m1(Class cls) {
        this.f31712c = new Object();
        this.f31710a = cls.getName();
    }
}
