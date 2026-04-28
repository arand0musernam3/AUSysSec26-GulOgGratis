package ev;

import a40.q;
import a40.u;
import a40.x;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Pair;
import kotlin.collections.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16496b;

    public h(Context context, String str) {
        str.getClass();
        this.f16495a = context;
        w30.b bVarA = w30.b.a();
        u uVar = bVarA.f43095a;
        Boolean bool = Boolean.TRUE;
        x xVar = uVar.f778b;
        synchronized (xVar) {
            xVar.f805c = false;
            xVar.f811i = bool;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) xVar.f806d).edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", true);
            editorEdit.apply();
            synchronized (xVar.f808f) {
                try {
                    boolean zH = xVar.h();
                    boolean z11 = xVar.f804b;
                    if (zH) {
                        if (!z11) {
                            ((d10.g) xVar.f809g).d(null);
                            xVar.f804b = true;
                        }
                    } else if (z11) {
                        xVar.f809g = new d10.g();
                        xVar.f804b = false;
                    }
                } finally {
                }
            }
        }
        String strC = dv.a.CORRELATION_ID.c();
        u uVar2 = bVarA.f43095a;
        uVar2.f790o.f5742a.a(new q((Object) uVar2, (Object) strC, (Object) str, 0));
    }

    public final void a() {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.f16495a);
        a7 a7Var = firebaseAnalytics.f12750a;
        Boolean bool = Boolean.TRUE;
        a7Var.getClass();
        a7Var.a(new m6(a7Var, bool));
        q30.b bVar = q30.b.AD_STORAGE;
        q30.a aVar = q30.a.GRANTED;
        firebaseAnalytics.a(x0.e(new Pair(bVar, aVar), new Pair(q30.b.ANALYTICS_STORAGE, aVar), new Pair(q30.b.AD_USER_DATA, aVar), new Pair(q30.b.AD_PERSONALIZATION, aVar)));
        this.f16496b = true;
    }
}
