package a40;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cz.j f741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f742e;

    public m(o oVar, long j9, Throwable th2, Thread thread, cz.j jVar) {
        this.f742e = oVar;
        this.f738a = j9;
        this.f739b = th2;
        this.f740c = thread;
        this.f741d = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j9 = this.f738a;
        long j11 = j9 / 1000;
        o oVar = this.f742e;
        String strE = oVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.d(null);
        }
        oVar.f749c.j();
        g40.b bVar = oVar.f758m;
        bVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        bVar.j(this.f739b, this.f740c, "crash", new c40.c(strE, j11, o0Var), true);
        try {
            g40.b bVar2 = oVar.f753g;
            String str = ".ae" + j9;
            bVar2.getClass();
            if (!new File((File) bVar2.f20002c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e5) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e5);
        }
        cz.j jVar = this.f741d;
        oVar.b(false, jVar, false);
        oVar.c(new e().f723a, Boolean.FALSE);
        return !oVar.f748b.h() ? Tasks.d(null) : ((d10.g) ((AtomicReference) jVar.f13639i).get()).f13697a.o(oVar.f751e.f5742a, new se.d(2, this, strE));
    }
}
