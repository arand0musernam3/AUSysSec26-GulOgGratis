package o00;

import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31736a = 0;

    static {
        ((r0) p0.f31730a).getClass();
        AtomicReference atomicReference = u0.f31753e;
        String strSubstring = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt";
        if (atomicReference.get() != null) {
            ((v0) atomicReference.get()).a("com.google.apps.tiktok.tracing.TraceThreadContextElementKt");
            return;
        }
        int i11 = 57;
        while (true) {
            if (i11 < 0) {
                break;
            }
            char cCharAt = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt".charAt(i11);
            if (cCharAt == '$') {
                strSubstring = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt".replace('$', '.');
                break;
            } else if (cCharAt == '.') {
                break;
            } else {
                i11--;
            }
        }
        u0 u0Var = new u0(strSubstring);
        if (u0.f31750b || u0.f31751c) {
            Set set = w0.f31763b;
        } else if (u0.f31752d) {
            Set set2 = w0.f31764c.f31756a;
            Level level = Level.OFF;
            if (strSubstring.length() > 23) {
                int i12 = -1;
                for (int length = strSubstring.length() - 1; length >= 0; length--) {
                    char cCharAt2 = strSubstring.charAt(length);
                    if (cCharAt2 == '.' || cCharAt2 == '$') {
                        i12 = length;
                        break;
                    }
                }
                strSubstring = strSubstring.substring(i12 + 1);
            }
            String strConcat = "".concat(strSubstring);
            strConcat.substring(0, Math.min(strConcat.length(), 23));
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = t0.f31745a;
        concurrentLinkedQueue.offer(u0Var);
        if (atomicReference.get() != null) {
            while (true) {
                u0 u0Var2 = (u0) concurrentLinkedQueue.poll();
                if (u0Var2 == null) {
                    break;
                } else {
                    ((v0) atomicReference.get()).a(u0Var2.f8447a);
                }
            }
            if (u0.f31754f.poll() == null) {
                return;
            }
            org.bouncycastle.jce.provider.a.c();
        }
    }
}
