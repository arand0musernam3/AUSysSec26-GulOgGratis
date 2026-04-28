package c5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.hf;
import com.google.android.gms.internal.measurement.la;
import com.google.android.gms.internal.measurement.xf;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.WeakHashMap;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7106a;

    public /* synthetic */ a1(int i11) {
        this.f7106a = i11;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f7106a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    c1 c1Var = new c1(choreographer, jf.e.p(looperMyLooper));
                    return c1Var.plus(c1Var.f7147k);
                }
                com.braze.h2.b("no Looper on this thread");
                return null;
            case 1:
                com.google.android.gms.internal.measurement.g0 g0Var = new com.google.android.gms.internal.measurement.g0();
                g0Var.f11428a = 0;
                return g0Var;
            case 2:
                la.f(Thread.currentThread());
                xf xfVar = new xf();
                xfVar.f12042a = false;
                xfVar.f12043b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = hf.f11476c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, xfVar);
                    break;
                }
                return xfVar;
            case 3:
                return new Random();
            case 4:
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a", Locale.ROOT);
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                return simpleDateFormat;
            case 6:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.ROOT);
                simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                return simpleDateFormat2;
            case 7:
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
                simpleDateFormat3.setCalendar(new GregorianCalendar());
                return simpleDateFormat3;
            case 8:
                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
                simpleDateFormat4.setCalendar(new GregorianCalendar(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE)));
                return simpleDateFormat4;
            case 9:
                Thread.currentThread();
                if (o00.h0.f31666d == null) {
                    o00.h0.f31666d = Looper.getMainLooper().getThread();
                }
                o00.m mVar = new o00.m();
                mVar.f31705a = false;
                mVar.f31706b = null;
                mVar.f31707c = null;
                mVar.f31708d = null;
                Thread threadCurrentThread2 = Thread.currentThread();
                WeakHashMap weakHashMap2 = o00.c.f31630d;
                synchronized (weakHashMap2) {
                    weakHashMap2.put(threadCurrentThread2, mVar);
                    break;
                }
                return mVar;
            case 10:
                return Boolean.FALSE;
            case 11:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 12:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 13:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 14:
                SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat5.setLenient(false);
                simpleDateFormat5.setTimeZone(r90.g.f37815a);
                return simpleDateFormat5;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new PathMeasure();
            case 16:
                return new Path();
            case 17:
                return new Path();
            case 18:
                return new float[4];
            case 19:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return w.b.U();
                }
                if (Looper.myLooper() != null) {
                    return new w0.c(new Handler(Looper.myLooper()));
                }
                return null;
            default:
                return 0L;
        }
    }
}
