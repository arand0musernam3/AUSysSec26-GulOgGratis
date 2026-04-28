package f50;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f17327a;

    public a(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f17327a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // f50.p
    public final Boolean a() {
        Bundle bundle = this.f17327a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // f50.p
    public final p80.d b() {
        Bundle bundle = this.f17327a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new p80.d(p80.g.g(bundle.getInt("firebase_sessions_sessions_restart_timeout"), p80.h.SECONDS));
        }
        return null;
    }

    @Override // f50.p
    public final Double c() {
        Bundle bundle = this.f17327a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // f50.p
    public final Object d(x70.c cVar) {
        return Unit.f26487a;
    }
}
