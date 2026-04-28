package jd;

import c40.q;
import ia0.a0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f24954b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24955c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24956d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f24959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f24961i;

    public b(e eVar, String str) {
        this.f24961i = eVar;
        this.f24953a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < 2; i11++) {
            sb2.append(i11);
            this.f24955c.add(this.f24961i.f24966a.f(sb2.toString()));
            sb2.append(".tmp");
            this.f24956d.add(this.f24961i.f24966a.f(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f24957e || this.f24959g != null || this.f24958f) {
            return null;
        }
        ArrayList arrayList = this.f24955c;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            e eVar = this.f24961i;
            if (i11 >= size) {
                this.f24960h++;
                return new c(eVar, this);
            }
            if (!eVar.f24981q.u((a0) arrayList.get(i11))) {
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
