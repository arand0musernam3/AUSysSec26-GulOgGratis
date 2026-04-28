package k5;

import e0.f;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f25973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h2.d f25974g;

    public c(long j9, long j11, long j12, long j13, long j14, float[] fArr, h2.d dVar) {
        this.f25968a = j9;
        this.f25969b = j11;
        this.f25970c = j12;
        this.f25971d = j13;
        this.f25972e = j14;
        this.f25973f = fArr;
        this.f25974g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<k5.c> r2 = k5.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            k5.c r7 = (k5.c) r7
            long r2 = r6.f25968a
            long r4 = r7.f25968a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f25969b
            long r4 = r7.f25969b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f25972e
            long r4 = r7.f25972e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f25970c
            long r4 = r7.f25970c
            boolean r2 = z5.j.b(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f25971d
            long r4 = r7.f25971d
            boolean r2 = z5.j.b(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f25973f
            float[] r3 = r6.f25973f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            h2.d r2 = r6.f25974g
            h2.d r7 = r7.f25974g
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB = f.b(f.b(f.b(f.b(Long.hashCode(this.f25968a) * 31, 31, this.f25969b), 31, this.f25972e), 31, this.f25970c), 31, this.f25971d);
        float[] fArr = this.f25973f;
        return this.f25974g.hashCode() + ((iB + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
