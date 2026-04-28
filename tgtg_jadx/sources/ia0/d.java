package ia0;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.constraintlayout.widget.z f23614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static d f23615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f23616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Condition f23617k;
    public static final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f23618m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23620f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23621g;

    static {
        androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(6, (byte) 0);
        zVar.f2543c = new d[8];
        f23614h = zVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f23616j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f23617k = conditionNewCondition;
        l = TimeConstants.ONE_MINUTE_DIFFERENCE;
        f23618m = TimeUnit.MILLISECONDS.toNanos(TimeConstants.ONE_MINUTE_DIFFERENCE);
    }

    public final void i() {
        long j9 = this.f23660c;
        boolean z11 = this.f23658a;
        if (j9 != 0 || z11) {
            ReentrantLock reentrantLock = f23616j;
            reentrantLock.lock();
            try {
                if (this.f23619e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f23619e = 1;
                qb.e.n(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f23616j;
        reentrantLock.lock();
        try {
            int i11 = this.f23619e;
            this.f23619e = 0;
            if (i11 != 1) {
                return i11 == 2;
            }
            f23614h.o(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        throw null;
    }

    public void l() {
    }
}
