package z20;

import a30.p;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import d10.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f46947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f46948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46949c;

    public e(j jVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f46947a = jVar;
        this.f46948b = cVar;
        this.f46949c = context;
    }

    public static void b(a aVar, ActivityResultLauncher activityResultLauncher, m mVar) {
        if (aVar == null || activityResultLauncher == null || aVar.a(mVar) == null || aVar.f46932e) {
            return;
        }
        aVar.f46932e = true;
        IntentSender intentSender = aVar.a(mVar).getIntentSender();
        intentSender.getClass();
        activityResultLauncher.a(new h.g(intentSender, null, 0, 0), null);
    }

    public final o a() {
        String packageName = this.f46949c.getPackageName();
        j jVar = this.f46947a;
        p pVar = jVar.f46960a;
        if (pVar != null) {
            j.f46958e.d("requestUpdateInfo(%s)", packageName);
            d10.g gVar = new d10.g();
            pVar.a().post(new f(pVar, gVar, gVar, new f(jVar, gVar, packageName, gVar), 2));
            return gVar.f13697a;
        }
        a30.j jVar2 = j.f46958e;
        Object[] objArr = {-9};
        jVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", a30.j.e(jVar2.f657a, "onError(%d)", objArr));
        }
        return Tasks.c(new InstallException(-9));
    }
}
