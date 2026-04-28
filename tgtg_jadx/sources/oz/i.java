package oz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y00.j0;
import y00.m3;
import y00.n1;
import y00.o4;
import y00.t4;
import y00.u;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f33822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33824e;

    public i(m3 m3Var, t4 t4Var, boolean z11, y00.e eVar) {
        this.f33820a = 3;
        this.f33822c = t4Var;
        this.f33821b = z11;
        this.f33823d = eVar;
        Objects.requireNonNull(m3Var);
        this.f33824e = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f33820a) {
            case 0:
                Intent intent = (Intent) this.f33822c;
                Context context = (Context) this.f33823d;
                boolean z11 = this.f33821b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f33824e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f12760b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wz.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f12760b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } finally {
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new ye(context, aVar, countDownLatch, 4));
                            try {
                                iIntValue = ((Integer) Tasks.await(new com.google.firebase.messaging.i(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e5) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e5);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e11) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z11 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                m3 m3Var = (m3) this.f33824e;
                j0 j0Var = m3Var.f44962e;
                if (j0Var != null) {
                    m3Var.H(j0Var, this.f33821b ? null : (o4) this.f33823d, (t4) this.f33822c);
                    m3Var.C();
                    return;
                } else {
                    w0 w0Var = ((n1) m3Var.f21216b).f44987f;
                    n1.m(w0Var);
                    w0Var.f45260g.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                m3 m3Var2 = (m3) this.f33824e;
                j0 j0Var2 = m3Var2.f44962e;
                if (j0Var2 != null) {
                    m3Var2.H(j0Var2, this.f33821b ? null : (u) this.f33823d, (t4) this.f33822c);
                    m3Var2.C();
                    return;
                } else {
                    w0 w0Var2 = ((n1) m3Var2.f21216b).f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                m3 m3Var3 = (m3) this.f33824e;
                j0 j0Var3 = m3Var3.f44962e;
                if (j0Var3 != null) {
                    m3Var3.H(j0Var3, this.f33821b ? null : (y00.e) this.f33823d, (t4) this.f33822c);
                    m3Var3.C();
                    return;
                } else {
                    w0 w0Var3 = ((n1) m3Var3.f21216b).f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45260g.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ i(m3 m3Var, t4 t4Var, boolean z11, rz.a aVar, int i11) {
        this.f33820a = i11;
        this.f33822c = t4Var;
        this.f33821b = z11;
        this.f33823d = aVar;
        this.f33824e = m3Var;
    }

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z11, BroadcastReceiver.PendingResult pendingResult) {
        this.f33820a = 0;
        this.f33822c = intent;
        this.f33823d = context;
        this.f33821b = z11;
        this.f33824e = pendingResult;
    }
}
