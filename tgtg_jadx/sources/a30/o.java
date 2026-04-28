package a30;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f666b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f665a = i11;
        this.f666b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f665a) {
            case 0:
                p pVar = (p) this.f666b;
                pVar.f669b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                pVar.a().post(new n(this, iBinder));
                break;
            case 1:
                g30.h hVar = (g30.h) this.f666b;
                hVar.f19918b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar.a().post(new f30.e(this, iBinder));
                break;
            default:
                i30.c cVar = (i30.c) this.f666b;
                cVar.f23204b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new i30.a(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f665a) {
            case 0:
                p pVar = (p) this.f666b;
                pVar.f669b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                pVar.a().post(new m(this, 1));
                break;
            case 1:
                g30.h hVar = (g30.h) this.f666b;
                hVar.f19918b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new g30.g(this, 1));
                break;
            default:
                i30.c cVar = (i30.c) this.f666b;
                cVar.f23204b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new i30.b(this, 0));
                break;
        }
    }
}
