package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f45098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f45099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f45100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f45101k;

    public r(String str, String str2, long j9, long j11, long j12, long j13, long j14, Long l, Long l7, Long l11, Boolean bool) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.b(j9 >= 0);
        com.google.android.gms.common.internal.i0.b(j11 >= 0);
        com.google.android.gms.common.internal.i0.b(j12 >= 0);
        com.google.android.gms.common.internal.i0.b(j14 >= 0);
        this.f45091a = str;
        this.f45092b = str2;
        this.f45093c = j9;
        this.f45094d = j11;
        this.f45095e = j12;
        this.f45096f = j13;
        this.f45097g = j14;
        this.f45098h = l;
        this.f45099i = l7;
        this.f45100j = l11;
        this.f45101k = bool;
    }

    public final r a(long j9) {
        return new r(this.f45091a, this.f45092b, this.f45093c, this.f45094d, this.f45095e, j9, this.f45097g, this.f45098h, this.f45099i, this.f45100j, this.f45101k);
    }

    public final r b(Long l, Long l7, Boolean bool) {
        return new r(this.f45091a, this.f45092b, this.f45093c, this.f45094d, this.f45095e, this.f45096f, this.f45097g, this.f45098h, l, l7, bool);
    }
}
