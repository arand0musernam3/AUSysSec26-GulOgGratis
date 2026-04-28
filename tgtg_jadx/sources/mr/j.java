package mr;

import ao.g3;
import com.app.tgtg.model.remote.user.requests.UserGender;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f30091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserGender f30092c;

    public /* synthetic */ j(r rVar, UserGender userGender, int i11) {
        this.f30090a = i11;
        this.f30091b = rVar;
        this.f30092c = userGender;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30090a) {
            case 0:
                g3 g3Var = this.f30091b.f30110b;
                g3Var.m().setGender(this.f30092c);
                g3Var.m().setClearGender(null);
                break;
            default:
                this.f30091b.f30110b.m().setGender(this.f30092c);
                break;
        }
    }
}
