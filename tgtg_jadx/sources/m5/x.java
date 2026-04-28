package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f29668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29669b = 0;

    static {
        z5.p[] pVarArr = z5.o.f47288b;
        f29668a = z5.o.f47289c;
    }

    public static final w a(w wVar, int i11, int i12, long j9, x5.q qVar, z zVar, x5.i iVar, int i13, int i14, x5.s sVar) {
        long j11;
        int i15 = i11;
        int i16 = i12;
        long j12 = j9;
        x5.q qVar2 = qVar;
        z zVar2 = zVar;
        x5.i iVar2 = iVar;
        int i17 = i13;
        int i18 = i14;
        x5.s sVar2 = sVar;
        if (i15 == 0 || i15 == wVar.f29658a) {
            z5.p[] pVarArr = z5.o.f47288b;
            if ((j12 & 1095216660480L) == 0) {
                j11 = 0;
            } else {
                j11 = 0;
                if (z5.o.a(j12, wVar.f29660c)) {
                }
            }
            if ((qVar2 == null || Intrinsics.areEqual(qVar2, wVar.f29661d)) && ((i16 == 0 || i16 == wVar.f29659b) && ((zVar2 == null || Intrinsics.areEqual(zVar2, wVar.f29662e)) && ((iVar2 == null || Intrinsics.areEqual(iVar2, wVar.f29663f)) && ((i17 == 0 || i17 == wVar.f29664g) && ((i18 == 0 || i18 == wVar.f29665h) && (sVar2 == null || Intrinsics.areEqual(sVar2, wVar.f29666i)))))))) {
                return wVar;
            }
        } else {
            j11 = 0;
        }
        z5.p[] pVarArr2 = z5.o.f47288b;
        if ((j12 & 1095216660480L) == j11) {
            j12 = wVar.f29660c;
        }
        if (qVar2 == null) {
            qVar2 = wVar.f29661d;
        }
        if (i15 == 0) {
            i15 = wVar.f29658a;
        }
        if (i16 == 0) {
            i16 = wVar.f29659b;
        }
        z zVar3 = wVar.f29662e;
        if (zVar3 != null && zVar2 == null) {
            zVar2 = zVar3;
        }
        if (iVar2 == null) {
            iVar2 = wVar.f29663f;
        }
        if (i17 == 0) {
            i17 = wVar.f29664g;
        }
        if (i18 == 0) {
            i18 = wVar.f29665h;
        }
        if (sVar2 == null) {
            sVar2 = wVar.f29666i;
        }
        return new w(i15, i16, j12, qVar2, zVar2, iVar2, i17, i18, sVar2);
    }
}
