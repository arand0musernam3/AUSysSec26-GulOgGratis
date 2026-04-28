package f30;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d10.g f17275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, d10.g gVar) {
        super(handler);
        this.f17275a = gVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        this.f17275a.d(null);
    }
}
