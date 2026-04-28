package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12038b;

    public /* synthetic */ xc(Object obj, int i11) {
        this.f12037a = i11;
        this.f12038b = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12037a) {
            case 0:
                throw new RuntimeException(((ExecutionException) this.f12038b).getCause());
            case 1:
                try {
                    o30.o0.b((ListenableFuture) this.f12038b);
                    return;
                } catch (ExecutionException e5) {
                    la.g().post(new xc(e5, 0));
                    return;
                }
            case 2:
                try {
                    o30.o0.b((o30.j0) this.f12038b);
                    return;
                } catch (Exception e11) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e11);
                    return;
                }
            case 3:
                if (((Boolean) ((ed) this.f12038b).f11389c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    o30.o0.b((o30.k0) this.f12038b);
                    return;
                } catch (Exception e12) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e12);
                        return;
                    }
                    return;
                }
        }
    }
}
