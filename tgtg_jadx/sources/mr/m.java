package mr;

import ao.g3;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f30101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DietaryPreferences f30102c;

    public /* synthetic */ m(r rVar, DietaryPreferences dietaryPreferences, int i11) {
        this.f30100a = i11;
        this.f30101b = rVar;
        this.f30102c = dietaryPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30100a) {
            case 0:
                g3 g3Var = this.f30101b.f30110b;
                g3Var.m().setDietary(this.f30102c);
                g3Var.m().setClearDietary(null);
                break;
            default:
                this.f30101b.f30110b.m().setDietary(this.f30102c);
                break;
        }
    }
}
