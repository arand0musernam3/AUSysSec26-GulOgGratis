package z1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b4.s implements b5.k, b5.b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h2 f46779o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l3 f46780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f46782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b3 f46783s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46785u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46787w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u6.f f46784t = new u6.f(13);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f46786v = 0;

    public z(h2 h2Var, l3 l3Var, boolean z11, u uVar, b3 b3Var) {
        this.f46779o = h2Var;
        this.f46780p = l3Var;
        this.f46781q = z11;
        this.f46782r = uVar;
        this.f46783s = b3Var;
    }

    public static final float L0(z zVar, u uVar, long j9) {
        h4.c cVar;
        int iCompare;
        if (z5.l.a(zVar.f46786v, 0L)) {
            return 0.0f;
        }
        o3.e eVar = (o3.e) zVar.f46784t.f40820a;
        int i11 = eVar.f31832c - 1;
        Object[] objArr = eVar.f31830a;
        if (i11 < objArr.length) {
            cVar = null;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                h4.c cVar2 = (h4.c) ((x) objArr[i11]).f46759a.invoke();
                if (cVar2 != null) {
                    long jE = cVar2.e();
                    long jZ = b0.z.z(zVar.f46786v);
                    int i12 = y.$EnumSwitchMapping$0[zVar.f46779o.ordinal()];
                    if (i12 == 1) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jZ & 4294967295L)));
                    } else {
                        if (i12 != 2) {
                            e40.a.f();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jZ >> 32)));
                    }
                    if (iCompare <= 0) {
                        cVar = cVar2;
                    } else if (cVar == null) {
                        cVar = cVar2;
                    }
                }
                i11--;
            }
        } else {
            cVar = null;
        }
        if (cVar == null) {
            h4.c cVar3 = zVar.f46785u ? (h4.c) zVar.f46783s.invoke() : null;
            if (cVar3 == null) {
                return 0.0f;
            }
            cVar = cVar3;
        }
        long jZ2 = b0.z.z(zVar.f46786v);
        int i13 = y.$EnumSwitchMapping$0[zVar.f46779o.ordinal()];
        if (i13 == 1) {
            float f11 = cVar.f21381b;
            return uVar.a(f11 - ((int) (j9 & 4294967295L)), cVar.f21383d - f11, Float.intBitsToFloat((int) (jZ2 & 4294967295L)));
        }
        if (i13 == 2) {
            float f12 = cVar.f21380a;
            return uVar.a(f12 - ((int) (j9 >> 32)), cVar.f21382c - f12, Float.intBitsToFloat((int) (jZ2 >> 32)));
        }
        e40.a.f();
        return 0.0f;
    }

    public static boolean M0(z zVar, h4.c cVar, long j9, long j11, int i11) {
        if ((i11 & 1) != 0) {
            j9 = zVar.f46786v;
        }
        long j12 = j9;
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long jO0 = zVar.O0(cVar, j12, j11);
        return Math.abs(Float.intBitsToFloat((int) (jO0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jO0 & 4294967295L))) <= 0.5f;
    }

    public final void N0(long j9) {
        u uVar = this.f46782r;
        if (uVar == null) {
            uVar = (u) b5.o.e(this, w.f46735a);
        }
        u uVar2 = uVar;
        if (this.f46787w) {
            c2.a.c("launchAnimation called when previous animation was running");
        }
        u uVar3 = this.f46782r;
        if (uVar3 == null) {
            uVar3 = (u) b5.o.e(this, w.f46735a);
        }
        uVar3.getClass();
        u.f46707a.getClass();
        v80.f0.B(getCoroutineScope(), null, v80.d0.UNDISPATCHED, new cj.j0(this, new b4(t.f46686b), uVar2, j9, (x70.c) null), 1);
    }

    public final long O0(h4.c cVar, long j9, long j11) {
        long jZ = b0.z.z(j9);
        int i11 = y.$EnumSwitchMapping$0[this.f46779o.ordinal()];
        if (i11 == 1) {
            u uVar = this.f46782r;
            if (uVar == null) {
                uVar = (u) b5.o.e(this, w.f46735a);
            }
            float f11 = cVar.f21381b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(uVar.a(f11 - ((int) (j11 & 4294967295L)), cVar.f21383d - f11, Float.intBitsToFloat((int) (jZ & 4294967295L))))) & 4294967295L);
        }
        if (i11 != 2) {
            e40.a.f();
            return 0L;
        }
        u uVar2 = this.f46782r;
        if (uVar2 == null) {
            uVar2 = (u) b5.o.e(this, w.f46735a);
        }
        float f12 = cVar.f21380a;
        return (((long) Float.floatToRawIntBits(uVar2.a(f12 - ((int) (j11 >> 32)), cVar.f21382c - f12, Float.intBitsToFloat((int) (jZ >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.b0
    public final void k(long j9) {
        int iCompare;
        long j11;
        long j12;
        long j13;
        long j14 = this.f46786v;
        this.f46786v = j9;
        int i11 = y.$EnumSwitchMapping$0[this.f46779o.ordinal()];
        if (i11 == 1) {
            iCompare = Intrinsics.compare((int) (j9 & 4294967295L), (int) (j14 & 4294967295L));
        } else {
            if (i11 != 2) {
                e40.a.f();
                return;
            }
            iCompare = Intrinsics.compare((int) (j9 >> 32), (int) (j14 >> 32));
        }
        if (iCompare >= 0) {
            return;
        }
        if (this.f46781q) {
            j11 = 0;
        } else {
            if (this.f46779o == h2.Vertical) {
                j12 = ((long) 0) << 32;
                j13 = ((int) (j14 & 4294967295L)) - ((int) (j9 & 4294967295L));
            } else {
                j12 = ((long) (((int) (j14 >> 32)) - ((int) (j9 >> 32)))) << 32;
                j13 = 0;
            }
            j11 = j12 | (j13 & 4294967295L);
        }
        long j15 = j11;
        h4.c cVar = (h4.c) this.f46783s.invoke();
        if (cVar == null || this.f46787w || this.f46785u || !M0(this, cVar, j14, 0L, 2) || M0(this, cVar, 0L, j15, 1)) {
            return;
        }
        this.f46785u = true;
        N0(j15);
    }
}
