package d9;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f14755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f14756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14758d;

    public b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f14755a = intentFilter;
        this.f14756b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f14756b);
        sb2.append(" filter=");
        sb2.append(this.f14755a);
        if (this.f14758d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
