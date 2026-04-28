package a40;

import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.feature.login.SplashActivity;
import com.google.android.gms.tasks.Task;
import com.squareup.moshi.JsonDataException;
import java.io.File;
import java.util.Set;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements d10.b, u30.e, h7.w, ActivityResultCallback {
    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void d(int i11, String str) {
        throw new IllegalStateException(str + i11);
    }

    public static /* synthetic */ void f(Object obj, int i11, String str) {
        throw new IllegalArgumentException(str + i11 + obj);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3, Object obj4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        sb2.append(obj3);
        sb2.append(obj4);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2, Object obj3, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString(), th2);
    }

    public static /* synthetic */ void k(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th2) {
        throw new RuntimeException(str + obj, th2);
    }

    public static /* synthetic */ void o(String str, Throwable th2) {
        throw new RuntimeException(str, th2);
    }

    public static /* synthetic */ void p(StringBuilder sb2, Object obj) {
        sb2.append(" at path ");
        sb2.append(obj);
        throw new JsonDataException(sb2.toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void s(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalStateException(sb2.toString());
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        h.a aVar = (h.a) obj;
        int i11 = SplashActivity.l;
        aVar.getClass();
        int i12 = aVar.f20935a;
        if (i12 != -1) {
            sa0.a.f38953a.c(j4.s.f(i12, "In-app update flow failed or was cancelled. Result code: "), new Object[0]);
        }
    }

    @Override // d10.b
    public Object g(Task task) {
        boolean z11;
        if (task.isSuccessful()) {
            b bVar = (b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.f701b;
            x30.b bVar2 = x30.b.f43820a;
            bVar2.b(str);
            File file = bVar.f702c;
            z11 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // u30.e
    public Object i(q2 q2Var) {
        Set setF = q2Var.f(u30.o.a(a50.a.class));
        a50.c cVar = a50.c.f820c;
        if (cVar == null) {
            synchronized (a50.c.class) {
                try {
                    cVar = a50.c.f820c;
                    if (cVar == null) {
                        cVar = new a50.c(0);
                        a50.c.f820c = cVar;
                    }
                } finally {
                }
            }
        }
        return new a50.b(setF, cVar);
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        x6.d dVarX = j4.s.x(view, windowInsetsCompat);
        view.setPadding(dVarX.f43873a, dVarX.f43874b, dVarX.f43875c, dVarX.f43876d);
        return windowInsetsCompat;
    }
}
