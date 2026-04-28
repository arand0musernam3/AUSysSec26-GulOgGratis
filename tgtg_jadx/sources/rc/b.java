package rc;

import c40.q;
import ia0.a0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f37860b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37861c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37862d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f37865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f37867i;

    public b(e eVar, String str) {
        this.f37867i = eVar;
        this.f37859a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < 2; i11++) {
            sb2.append(i11);
            this.f37861c.add(this.f37867i.f37872a.f(sb2.toString()));
            sb2.append(".tmp");
            this.f37862d.add(this.f37867i.f37872a.f(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f37863e || this.f37865g != null || this.f37864f) {
            return null;
        }
        ArrayList arrayList = this.f37861c;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            e eVar = this.f37867i;
            if (i11 >= size) {
                this.f37866h++;
                return new c(eVar, this);
            }
            if (!eVar.f37886p.u((a0) arrayList.get(i11))) {
                try {
                    eVar.B(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i11++;
        }
    }
}
