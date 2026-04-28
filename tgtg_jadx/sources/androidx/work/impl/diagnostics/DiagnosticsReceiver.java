package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import ib.a0;
import ib.w;
import ib.z;
import jb.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4165a = w.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w wVarD = w.d();
        String str = f4165a;
        wVarD.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            s sVarD = s.d(context);
            sVarD.getClass();
            sVarD.b((a0) new z(DiagnosticsWorker.class, 0).a());
        } catch (IllegalStateException e5) {
            w.d().c(str, "WorkManager is not initialized", e5);
        }
    }
}
