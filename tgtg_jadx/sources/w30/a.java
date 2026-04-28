package w30;

import a40.t;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import l8.f;
import x0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements z30.a, y30.a, t40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f43094a;

    public /* synthetic */ a(f fVar) {
        this.f43094a = fVar;
    }

    @Override // z30.a
    public void d(t tVar) {
        f fVar = this.f43094a;
        synchronized (fVar) {
            try {
                if (((z30.a) fVar.f27450b) instanceof z30.b) {
                    ((ArrayList) fVar.f27451c).add(tVar);
                }
                ((z30.a) fVar.f27450b).d(tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t40.a
    public void f(t40.b bVar) {
        f fVar = this.f43094a;
        x30.b bVar2 = x30.b.f43820a;
        bVar2.b("AnalyticsConnector now available.");
        r30.a aVar = (r30.a) bVar.get();
        e eVar = new e(aVar, 5);
        ub.a aVar2 = new ub.a(8, false);
        r30.b bVar3 = (r30.b) aVar;
        l20.c cVarB = bVar3.b("clx", aVar2);
        if (cVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            cVarB = bVar3.b("crash", aVar2);
            if (cVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (cVarB == null) {
            bVar2.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        bVar2.b("Registered Firebase Analytics listener.");
        u6.f fVar2 = new u6.f();
        t5.a aVar3 = new t5.a(eVar);
        synchronized (fVar) {
            try {
                Iterator it = ((ArrayList) fVar.f27451c).iterator();
                while (it.hasNext()) {
                    fVar2.d((t) it.next());
                }
                aVar2.f40982c = fVar2;
                aVar2.f40981b = aVar3;
                fVar.f27450b = fVar2;
                fVar.f27449a = aVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y30.a
    public void h(Bundle bundle) {
        ((y30.a) this.f43094a.f27449a).h(bundle);
    }
}
