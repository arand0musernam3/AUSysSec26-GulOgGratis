package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import y9.l;
import y9.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4000b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f4001c = new m(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f4002d = new l(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f4002d;
    }
}
