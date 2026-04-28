package s90;

import c40.q;
import ia0.a0;
import ia0.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f38917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f38922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f38924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f38925j;

    public d(g gVar, String str) {
        str.getClass();
        this.f38925j = gVar;
        this.f38916a = str;
        gVar.getClass();
        this.f38917b = new long[2];
        this.f38918c = new ArrayList();
        this.f38919d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < 2; i11++) {
            sb2.append(i11);
            this.f38918c.add(this.f38925j.f38935a.f(sb2.toString()));
            sb2.append(".tmp");
            this.f38919d.add(this.f38925j.f38935a.f(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final e a() {
        TimeZone timeZone = r90.g.f37815a;
        if (!this.f38920e) {
            return null;
        }
        g gVar = this.f38925j;
        if (!gVar.l && (this.f38922g != null || this.f38921f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f38917b.clone();
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                j0 j0VarJ = gVar.f38936b.J((a0) this.f38918c.get(i11));
                if (!gVar.l) {
                    this.f38923h++;
                    j0VarJ = new c(j0VarJ, gVar, this);
                }
                arrayList.add(j0VarJ);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r90.e.b((j0) it.next());
                }
                try {
                    gVar.H(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new e(this.f38925j, this.f38916a, this.f38924i, arrayList, jArr);
    }
}
