package qz;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import c5.a1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends w5 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                Log.wtf("BasePendingResult", e0.f.h(i11, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i11).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.f11057h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            org.bouncycastle.jce.provider.a.c();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e5) {
            a1 a1Var = BasePendingResult.f11070j;
            throw e5;
        }
    }
}
