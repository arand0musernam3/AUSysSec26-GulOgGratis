package oe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f32473c = new f("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f32475b;

    public f(f fVar) {
        this.f32474a = new ArrayList(fVar.f32474a);
        this.f32475b = fVar.f32475b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f32474a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L91
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L54
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L35
            java.lang.String r9 = "*"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L33
            goto L35
        L33:
            r9 = r2
            goto L36
        L35:
            r9 = r3
        L36:
            if (r1 != 0) goto L51
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
        L51:
            if (r9 == 0) goto L91
            goto L88
        L54:
            if (r1 != 0) goto L86
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L86
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L88
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
            goto L88
        L86:
            if (r1 == 0) goto L89
        L88:
            return r3
        L89:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L92
        L91:
            return r2
        L92:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.a(int, java.lang.String):boolean");
    }

    public final int b(int i11, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f32474a;
        if (((String) list.get(i11)).equals("**")) {
            return (i11 != list.size() - 1 && ((String) list.get(i11 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f32474a;
        if (i11 >= list.size()) {
            return false;
        }
        return ((String) list.get(i11)).equals(str) || ((String) list.get(i11)).equals("**") || ((String) list.get(i11)).equals("*");
    }

    public final boolean d(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f32474a;
        return i11 < list.size() - 1 || ((String) list.get(i11)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (!this.f32474a.equals(fVar.f32474a)) {
                return false;
            }
            g gVar = this.f32475b;
            g gVar2 = fVar.f32475b;
            if (gVar != null) {
                return gVar.equals(gVar2);
            }
            if (gVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f32474a.hashCode() * 31;
        g gVar = this.f32475b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f32474a);
        sb2.append(",resolved=");
        return k.q(sb2, this.f32475b != null, '}');
    }

    public f(String... strArr) {
        this.f32474a = Arrays.asList(strArr);
    }
}
