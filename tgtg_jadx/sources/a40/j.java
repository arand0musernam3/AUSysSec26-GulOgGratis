package a40;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f728d = new h(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f729e = new i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g40.b f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f731b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f732c = null;

    public j(g40.b bVar) {
        this.f730a = bVar;
    }

    public static void a(g40.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.h(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e5) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e5);
        }
    }
}
