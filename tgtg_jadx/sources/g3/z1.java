package g3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements d6.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.b1 f19865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f19866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3.d f19867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i3.d f19868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i3.s0 f19869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i3.s0 f19870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3.e f19871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i3.e f19872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i3.t0 f19873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i3.t0 f19874k;

    public z1(z5.c cVar, int i11, m3.b1 b1Var, r1 r1Var) {
        int iQ0 = cVar.q0(y2.f19813a);
        this.f19864a = i11;
        this.f19865b = b1Var;
        this.f19866c = r1Var;
        b4.i iVar = b4.d.f5694m;
        this.f19867d = new i3.d(iVar, iVar);
        b4.i iVar2 = b4.d.f5696o;
        this.f19868e = new i3.d(iVar2, iVar2);
        this.f19869f = new i3.s0(b4.a.f5678c);
        this.f19870g = new i3.s0(b4.a.f5679d);
        b4.j jVar = b4.d.f5692j;
        b4.j jVar2 = b4.d.l;
        this.f19871h = new i3.e(jVar, jVar2);
        this.f19872i = new i3.e(jVar2, jVar);
        this.f19873j = new i3.t0(jVar, iQ0);
        this.f19874k = new i3.t0(jVar2, iQ0);
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        z5.k kVar2;
        char c3;
        long j12;
        int iA;
        m3.b1 b1Var = this.f19865b;
        if (b1Var != null) {
            b1Var.getValue();
        }
        char c7 = ' ';
        long j13 = 4294967295L;
        long j14 = (((long) ((int) (j9 >> 32))) << 32) | (((long) (((int) (j9 & 4294967295L)) + this.f19864a)) & 4294967295L);
        int i11 = (int) (j14 >> 32);
        int i12 = 0;
        List listH = kotlin.collections.d0.h(this.f19867d, this.f19868e, ((int) (kVar.a() >> 32)) < i11 / 2 ? this.f19869f : this.f19870g);
        int size = listH.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                kVar2 = kVar;
                c3 = c7;
                j12 = j13;
                iA = 0;
                break;
            }
            c3 = c7;
            j12 = j13;
            int i14 = (int) (j11 >> c3);
            int i15 = size;
            int i16 = i13;
            kVar2 = kVar;
            List list = listH;
            iA = ((i3.b0) listH.get(i13)).a(kVar2, j14, i14, mVar);
            if (i16 == list.size() - 1 || (iA >= 0 && i14 + iA <= i11)) {
                break;
            }
            i13 = i16 + 1;
            listH = list;
            size = i15;
            c7 = c3;
            j13 = j12;
        }
        int i17 = (int) (j14 & j12);
        List listH2 = kotlin.collections.d0.h(this.f19871h, this.f19872i, ((int) (kVar2.a() & j12)) < i17 / 2 ? this.f19873j : this.f19874k);
        int size2 = listH2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j11 & j12);
            int iA2 = ((i3.c0) listH2.get(i18)).a(kVar2, j14, i19);
            if (i18 == listH2.size() - 1 || (iA2 >= 0 && i19 + iA2 <= i17)) {
                i12 = iA2;
                break;
            }
        }
        long j15 = (((long) iA) << c3) | (((long) i12) & j12);
        this.f19866c.invoke(kVar2, android.support.v4.media.session.a.d(j15, j11));
        return j15;
    }
}
