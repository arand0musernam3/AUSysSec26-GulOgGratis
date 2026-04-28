package ja0;

import ia0.a0;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f24817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f24824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f24827k;
    public final Long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f24828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f24829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f24830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f24831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f24832q;

    public /* synthetic */ l(a0 a0Var, boolean z11, String str, long j9, long j11, long j12, int i11, long j13, int i12, int i13, Long l, Long l7, Long l11, int i14) {
        this(a0Var, z11, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? -1L : j9, (i14 & 16) != 0 ? -1L : j11, (i14 & 32) != 0 ? -1L : j12, (i14 & 64) != 0 ? -1 : i11, (i14 & 128) != 0 ? -1L : j13, (i14 & 256) != 0 ? -1 : i12, (i14 & 512) != 0 ? -1 : i13, (i14 & 1024) != 0 ? null : l, (i14 & NewHope.SENDB_BYTES) != 0 ? null : l7, (i14 & 4096) != 0 ? null : l11, null, null, null);
    }

    public l(a0 a0Var, boolean z11, String str, long j9, long j11, long j12, int i11, long j13, int i12, int i13, Long l, Long l7, Long l11, Integer num, Integer num2, Integer num3) {
        a0Var.getClass();
        str.getClass();
        this.f24817a = a0Var;
        this.f24818b = z11;
        this.f24819c = str;
        this.f24820d = j9;
        this.f24821e = j11;
        this.f24822f = j12;
        this.f24823g = i11;
        this.f24824h = j13;
        this.f24825i = i12;
        this.f24826j = i13;
        this.f24827k = l;
        this.l = l7;
        this.f24828m = l11;
        this.f24829n = num;
        this.f24830o = num2;
        this.f24831p = num3;
        this.f24832q = new ArrayList();
    }
}
