package qz;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends BasePendingResult {
    public abstract void f(com.google.android.gms.common.api.b bVar);

    public final void g(Status status) {
        com.google.android.gms.common.internal.i0.a("Failed result must not be success", !status.d());
        e(b(status));
    }
}
