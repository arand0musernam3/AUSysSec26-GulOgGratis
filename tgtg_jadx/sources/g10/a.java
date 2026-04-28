package g10;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f18116b;

    public a(Object obj, Status status) {
        this.f18115a = obj;
        this.f18116b = status;
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f18116b, "status");
        qVar.b(this.f18115a, "result");
        return qVar.toString();
    }
}
