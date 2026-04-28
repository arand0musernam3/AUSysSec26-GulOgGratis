package b0;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5111d;

    public /* synthetic */ d(Context context, String str, long j9) {
        this.f5108a = 2;
        this.f5109b = j9;
        this.f5110c = str;
        this.f5111d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.b bVar;
        switch (this.f5108a) {
            case 0:
                ((w.q) this.f5110c).f42750a.onCaptureSequenceCompleted((CameraCaptureSession) this.f5111d, -1, this.f5109b);
                break;
            case 1:
                ((e0.h1) this.f5110c).g((e0.k1) this.f5111d, this.f5109b);
                break;
            default:
                long j9 = this.f5109b;
                String str = (String) this.f5110c;
                Context context = (Context) this.f5111d;
                androidx.recyclerview.widget.b bVar2 = nx.c.f31419g;
                Long l = bVar2 != null ? (Long) bVar2.f3665c : null;
                if (nx.c.f31419g == null) {
                    nx.c.f31419g = new androidx.recyclerview.widget.b(Long.valueOf(j9), null);
                    String str2 = nx.c.f31421i;
                    context.getClass();
                    nx.m.b(context, str, str2);
                } else if (l != null) {
                    long jLongValue = j9 - l.longValue();
                    String str3 = nx.c.f31413a;
                    if (jLongValue > (tx.c0.b(ax.a0.b()) == null ? 60 : r4.f40586d) * 1000) {
                        nx.m.d(str, nx.c.f31419g, nx.c.f31421i);
                        String str4 = nx.c.f31421i;
                        context.getClass();
                        nx.m.b(context, str, str4);
                        nx.c.f31419g = new androidx.recyclerview.widget.b(Long.valueOf(j9), null);
                    } else if (jLongValue > 1000 && (bVar = nx.c.f31419g) != null) {
                        bVar.f3663a++;
                    }
                }
                androidx.recyclerview.widget.b bVar3 = nx.c.f31419g;
                if (bVar3 != null) {
                    bVar3.f3665c = Long.valueOf(j9);
                }
                androidx.recyclerview.widget.b bVar4 = nx.c.f31419g;
                if (bVar4 != null) {
                    bVar4.m();
                }
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, long j9, int i11) {
        this.f5108a = i11;
        this.f5110c = obj;
        this.f5111d = obj2;
        this.f5109b = j9;
    }
}
