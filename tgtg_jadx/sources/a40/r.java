package a40;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f771b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f770a = i11;
        this.f771b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f770a) {
            case 0:
                o oVar = ((u) this.f771b).f783g;
                oVar.getClass();
                b40.f.a();
                w2.z zVar = oVar.f749c;
                g40.b bVar = (g40.b) zVar.f43084c;
                String str = (String) zVar.f43083b;
                bVar.getClass();
                boolean z11 = true;
                if (new File((File) bVar.f20002c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    g40.b bVar2 = (g40.b) zVar.f43084c;
                    bVar2.getClass();
                    new File((File) bVar2.f20002c, str).delete();
                } else if (oVar.e() == null || !oVar.f756j.c()) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 1:
                cz.j jVar = (cz.j) ((dn.k) this.f771b).f15019c;
                se.b bVar3 = (se.b) jVar.f13636f;
                i40.e eVar = (i40.e) jVar.f13632b;
                String str2 = (String) bVar3.f39010b;
                b40.f.b();
                try {
                    HashMap mapN = se.b.n(eVar);
                    a8.h hVar = new a8.h(str2, mapN);
                    hVar.r("User-Agent", "Crashlytics Android SDK/20.0.4");
                    hVar.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    se.b.e(hVar, eVar);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapN;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return bVar3.p(hVar.n());
                } catch (IOException e5) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e5);
                    return null;
                }
            default:
                return (AssetFileDescriptor) this.f771b;
        }
    }
}
