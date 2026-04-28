package ax;

import com.facebook.FacebookException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements tx.q, d10.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5016b;

    public /* synthetic */ u(String str, int i11) {
        this.f5015a = i11;
        this.f5016b = str;
    }

    @Override // tx.q
    public void a(boolean z11) {
        String str = this.f5016b;
        SecureRandom secureRandom = FacebookException.f10985a;
        if (z11) {
            try {
                zx.a aVar = new zx.a(str);
                if ((aVar.f48408b == null || aVar.f48409c == null) ? false : true) {
                    p30.b.F(aVar.f48407a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // d10.f
    public Task h(Object obj) {
        switch (this.f5015a) {
            case 1:
                return FirebaseMessaging.lambda$subscribeToTopic$10(this.f5016b, (com.google.firebase.messaging.i0) obj);
            default:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$11(this.f5016b, (com.google.firebase.messaging.i0) obj);
        }
    }
}
