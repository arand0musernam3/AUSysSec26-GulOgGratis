package e10;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements OnCompleteListener, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w5 f15571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseArray f15572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f15573f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f15575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f15576c;

    static {
        w5 w5Var = new w5(Looper.getMainLooper());
        Looper.getMainLooper();
        f15571d = w5Var;
        f15572e = new SparseArray(2);
        f15573f = new AtomicInteger();
    }

    public final void a() {
        if (this.f15576c == null || this.f15575b == null) {
            return;
        }
        f15572e.delete(this.f15574a);
        f15571d.removeCallbacks(this);
        a0 a0Var = this.f15575b;
        if (a0Var != null) {
            Task task = this.f15576c;
            int i11 = a0.f15467d;
            a0Var.a(task);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f15576c = task;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f15572e.delete(this.f15574a);
    }
}
