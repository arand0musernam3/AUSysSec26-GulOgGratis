package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.braze.h2;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lma/b;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements ma.b {
    @Override // ma.b
    public final Object create(Context context) {
        context.getClass();
        ma.a aVarC = ma.a.c(context);
        aVarC.getClass();
        if (!aVarC.f29901b.contains(ProcessLifecycleInitializer.class)) {
            h2.b("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!b0.f3415a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a0());
        }
        t0 t0Var = t0.f3512i;
        t0Var.getClass();
        t0Var.f3517e = new Handler();
        t0Var.f3518f.g(w.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new s0(t0Var));
        return t0Var;
    }

    @Override // ma.b
    public final List dependencies() {
        return kotlin.collections.n0.f26529a;
    }
}
