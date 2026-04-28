package gv;

import ag.f;
import ag.i;
import ao.v;
import com.app.tgtg.services.notifications.TGTGMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;
import ft.s;
import p70.j;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends FirebaseMessagingService implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile j f20904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20905b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20906c = false;

    @Override // r70.b
    public final Object a() {
        if (this.f20904a == null) {
            synchronized (this.f20905b) {
                try {
                    if (this.f20904a == null) {
                        this.f20904a = new j(this);
                    }
                } finally {
                }
            }
        }
        return this.f20904a.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f20906c) {
            this.f20906c = true;
            TGTGMessagingService tGTGMessagingService = (TGTGMessagingService) this;
            i iVar = ((f) ((d) a())).f1301a;
            tGTGMessagingService.f9496d = (ao.c) iVar.P.get();
            tGTGMessagingService.f9497e = (v) iVar.f1341q.get();
            tGTGMessagingService.f9498f = (b0) iVar.f1343r.get();
            tGTGMessagingService.f9499g = (s) iVar.A.get();
            tGTGMessagingService.f9500h = (hv.b) iVar.Q0.get();
        }
        super.onCreate();
    }
}
