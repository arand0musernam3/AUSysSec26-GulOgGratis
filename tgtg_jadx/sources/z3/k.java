package z3;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f47025e = new k(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f47029d;

    public k(long j9, long j11, long j12, long[] jArr) {
        this.f47026a = j9;
        this.f47027b = j11;
        this.f47028c = j12;
        this.f47029d = jArr;
    }

    public final k b(k kVar) {
        k kVarD;
        long j9;
        long[] jArr;
        k kVar2 = f47025e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        long j11 = kVar.f47028c;
        long j12 = kVar.f47028c;
        long[] jArr2 = kVar.f47029d;
        long j13 = kVar.f47027b;
        long j14 = kVar.f47026a;
        long j15 = this.f47028c;
        if (j11 == j15 && jArr2 == (jArr = this.f47029d)) {
            return new k(this.f47026a & (~j14), this.f47027b & (~j13), j15, jArr);
        }
        if (jArr2 != null) {
            kVarD = this;
            for (long j16 : jArr2) {
                kVarD = kVarD.d(j16);
            }
        } else {
            kVarD = this;
        }
        long j17 = 0;
        if (j13 != 0) {
            int i11 = 0;
            while (i11 < 64) {
                if (((1 << i11) & j13) != j17) {
                    j9 = j17;
                    kVarD = kVarD.d(((long) i11) + j12);
                } else {
                    j9 = j17;
                }
                i11++;
                j17 = j9;
            }
        }
        long j18 = j17;
        if (j14 != j18) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != j18) {
                    kVarD = kVarD.d(((long) i12) + j12 + ((long) 64));
                }
            }
        }
        return kVarD;
    }

    public final k d(long j9) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j11 = j9 - this.f47028c;
        long j12 = 0;
        if (Intrinsics.compare(j11, j12) >= 0 && Intrinsics.compare(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f47027b;
            if ((j14 & j13) != 0) {
                return new k(this.f47026a, j14 & (~j13), this.f47028c, this.f47029d);
            }
        } else if (Intrinsics.compare(j11, 64) >= 0 && Intrinsics.compare(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f47026a;
            if ((j16 & j15) != 0) {
                return new k(j16 & (~j15), this.f47027b, this.f47028c, this.f47029d);
            }
        } else if (Intrinsics.compare(j11, j12) < 0 && (jArr = this.f47029d) != null && (iA = v.a(jArr, j9)) >= 0) {
            int length = jArr.length;
            int i11 = length - 1;
            if (i11 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i11];
                if (iA > 0) {
                    kotlin.collections.x.g(0, jArr, 0, jArr3, iA);
                }
                if (iA < i11) {
                    kotlin.collections.x.g(iA, jArr, iA + 1, jArr3, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f47026a, this.f47027b, this.f47028c, jArr2);
        }
        return this;
    }

    public final boolean e(long j9) {
        long[] jArr;
        long j11 = j9 - this.f47028c;
        long j12 = 0;
        return (Intrinsics.compare(j11, j12) < 0 || Intrinsics.compare(j11, (long) 64) >= 0) ? (Intrinsics.compare(j11, (long) 64) < 0 || Intrinsics.compare(j11, (long) 128) >= 0) ? Intrinsics.compare(j11, j12) <= 0 && (jArr = this.f47029d) != null && v.a(jArr, j9) >= 0 : ((1 << (((int) j11) - 64)) & this.f47026a) != 0 : ((1 << ((int) j11)) & this.f47027b) != 0;
    }

    public final k g(k kVar) {
        k kVarH;
        k kVarH2;
        long[] jArr;
        k kVar2 = f47025e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        long j9 = kVar.f47028c;
        long j11 = kVar.f47028c;
        long[] jArr2 = kVar.f47029d;
        long j12 = kVar.f47027b;
        long j13 = kVar.f47026a;
        long j14 = this.f47028c;
        long j15 = this.f47027b;
        long j16 = this.f47026a;
        if (j9 == j14 && jArr2 == (jArr = this.f47029d)) {
            return new k(j16 | j13, j15 | j12, j14, jArr);
        }
        int i11 = 0;
        long[] jArr3 = this.f47029d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVarH = this;
                for (long j17 : jArr2) {
                    kVarH = kVarH.h(j17);
                }
            } else {
                kVarH = this;
            }
            if (j12 != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if (((1 << i12) & j12) != 0) {
                        kVarH = kVarH.h(((long) i12) + j11);
                    }
                }
            }
            if (j13 != 0) {
                while (i11 < 64) {
                    if (((1 << i11) & j13) != 0) {
                        kVarH = kVarH.h(((long) i11) + j11 + ((long) 64));
                    }
                    i11++;
                }
            }
            return kVarH;
        }
        if (jArr3 != null) {
            kVarH2 = kVar;
            for (long j18 : jArr3) {
                kVarH2 = kVarH2.h(j18);
            }
        } else {
            kVarH2 = kVar;
        }
        long j19 = this.f47028c;
        if (j15 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if (((1 << i13) & j15) != 0) {
                    kVarH2 = kVarH2.h(((long) i13) + j19);
                }
            }
        }
        if (j16 != 0) {
            while (i11 < 64) {
                if (((1 << i11) & j16) != 0) {
                    kVarH2 = kVarH2.h(((long) i11) + j19 + ((long) 64));
                }
                i11++;
            }
        }
        return kVarH2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z3.k h(long r30) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.k.h(long):z3.k");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return o80.l.a(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            i11++;
            if (i11 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
