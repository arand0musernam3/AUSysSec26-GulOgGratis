package androidx.work;

import a50.c;
import android.content.Context;
import ib.w;
import java.util.Collections;
import java.util.List;
import jb.s;
import ma.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4145a = w.f("WrkMgrInitializer");

    @Override // ma.b
    public final Object create(Context context) {
        w.d().a(f4145a, "Initializing WorkManager with default configuration.");
        ib.b bVar = new ib.b(new c(27, false));
        context.getClass();
        s.f(context, bVar);
        s sVarD = s.d(context);
        sVarD.getClass();
        return sVarD;
    }

    @Override // ma.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
