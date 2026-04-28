package ax;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f4926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Exception f4927b;

    public i0(j0 j0Var) {
        this.f4926a = j0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = yx.a.f46339a;
        if (!set.contains(this)) {
            try {
                Void[] voidArr = (Void[]) objArr;
                if (!set.contains(this)) {
                    try {
                        voidArr.getClass();
                        try {
                            j0 j0Var = this.f4926a;
                            j0Var.getClass();
                            String str = h0.f4915j;
                            return qb.e.u(j0Var);
                        } catch (Exception e5) {
                            this.f4927b = e5;
                        }
                    } catch (Throwable th2) {
                        yx.a.a(this, th2);
                    }
                }
            } catch (Throwable th3) {
                yx.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        List list;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            list = (List) obj;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        if (set.contains(this)) {
            return;
        }
        try {
            list.getClass();
            super.onPostExecute(list);
            Exception exc = this.f4927b;
            if (exc != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                a0 a0Var = a0.f4849a;
                return;
            }
            return;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return;
        }
        yx.a.a(this, th2);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        j0 j0Var = this.f4926a;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            a0 a0Var = a0.f4849a;
            if (j0Var.f4936a == null) {
                j0Var.f4936a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.f4926a + "}";
    }
}
