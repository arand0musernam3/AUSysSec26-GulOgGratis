package cz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wy.i f13612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f13614d;

    public /* synthetic */ d(j jVar, wy.i iVar, int i11, Runnable runnable) {
        this.f13611a = jVar;
        this.f13612b = iVar;
        this.f13613c = i11;
        this.f13614d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wy.i iVar = this.f13612b;
        int i11 = this.f13613c;
        Runnable runnable = this.f13614d;
        j jVar = this.f13611a;
        dz.g gVar = (dz.g) jVar.f13634d;
        try {
            try {
                dz.g gVar2 = (dz.g) jVar.f13633c;
                Objects.requireNonNull(gVar2);
                gVar.t(new e(gVar2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) jVar.f13631a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    gVar.t(new f(jVar, iVar, i11));
                } else {
                    jVar.j(iVar, i11);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                ((a8.h) jVar.f13636f).z(iVar, i11 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
