package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12017g;

    public wf(int[] iArr, int i11) {
        this.f12011a = i11;
        switch (i11) {
            case 3:
                this.f12015e = iArr;
                o00.l lVar = new o00.l(-1, -1);
                this.f12016f = lVar;
                this.f12017g = lVar;
                break;
            default:
                this.f12015e = iArr;
                uf ufVar = new uf(-1, -1);
                this.f12016f = ufVar;
                this.f12017g = ufVar;
                break;
        }
    }

    public static void i(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(hh.a(obj));
        sb2.append("]");
    }

    public void a() {
        this.f12012b = 1;
        this.f12016f = (l8.t) this.f12015e;
        this.f12014d = 0;
    }

    public boolean b() {
        m8.a aVarB = ((l8.t) this.f12016f).f27485b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f21601d).get(iA + aVarB.f21598a) == 0) || this.f12013c == 65039;
    }

    public void c() {
        switch (this.f12011a) {
            case 0:
                if (this.f12013c != 0) {
                    HashMap map = ((uf) this.f12017g).f11947d;
                    int[] iArr = (int[]) this.f12015e;
                    uf ufVar = (uf) map.get(Integer.valueOf(iArr[this.f12012b]));
                    while (true) {
                        int i11 = (ufVar.f11945b - ufVar.f11944a) + 1;
                        int i12 = this.f12013c;
                        if (i11 > i12) {
                            break;
                        } else {
                            int i13 = this.f12012b + i11;
                            this.f12012b = i13;
                            this.f12017g = ufVar;
                            int i14 = i12 - i11;
                            this.f12013c = i14;
                            if (i14 > 0) {
                                ufVar = (uf) ufVar.f11947d.get(Integer.valueOf(iArr[i13]));
                            }
                        }
                    }
                }
                break;
            default:
                if (this.f12013c != 0) {
                    HashMap map2 = ((o00.l) this.f12017g).f31704d;
                    int[] iArr2 = (int[]) this.f12015e;
                    o00.l lVar = (o00.l) map2.get(Integer.valueOf(iArr2[this.f12012b]));
                    while (true) {
                        int i15 = (lVar.f31702b - lVar.f31701a) + 1;
                        int i16 = this.f12013c;
                        if (i15 > i16) {
                            break;
                        } else {
                            int i17 = this.f12012b + i15;
                            this.f12012b = i17;
                            this.f12017g = lVar;
                            int i18 = i16 - i15;
                            this.f12013c = i18;
                            if (i18 > 0) {
                                lVar = (o00.l) lVar.f31704d.get(Integer.valueOf(iArr2[i17]));
                            }
                        }
                    }
                }
                break;
        }
    }

    public void d() {
        switch (this.f12011a) {
            case 0:
                uf ufVar = ((uf) this.f12017g).f11946c;
                if (ufVar != null) {
                    this.f12017g = ufVar;
                } else {
                    this.f12017g = (uf) this.f12016f;
                    int i11 = this.f12013c;
                    if (i11 > 0) {
                        this.f12013c = i11 - 1;
                    }
                    if (this.f12014d > 0) {
                        this.f12012b++;
                    }
                }
                c();
                break;
            default:
                o00.l lVar = ((o00.l) this.f12017g).f31703c;
                if (lVar != null) {
                    this.f12017g = lVar;
                } else {
                    this.f12017g = (o00.l) this.f12016f;
                    int i12 = this.f12013c;
                    if (i12 > 0) {
                        this.f12013c = i12 - 1;
                    }
                    if (this.f12014d > 0) {
                        this.f12012b++;
                    }
                }
                c();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Object r8, com.google.android.gms.internal.measurement.dh r9, com.google.android.gms.internal.measurement.eh r10) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.wf.e(java.lang.Object, com.google.android.gms.internal.measurement.dh, com.google.android.gms.internal.measurement.eh):void");
    }

    public void f(uf ufVar, StringBuilder sb2) {
        for (uf ufVar2 : ufVar.f11947d.values()) {
            sb2.append("  ");
            sb2.append(ufVar);
            sb2.append(" -> ");
            sb2.append(ufVar2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.f12015e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, ufVar2.f11944a, Math.min(iArr.length, ufVar2.f11945b + 1))));
            sb2.append("\"]\n");
            f(ufVar2, sb2);
        }
    }

    public void g(o00.l lVar, StringBuilder sb2) {
        for (o00.l lVar2 : lVar.f31704d.values()) {
            sb2.append("  ");
            sb2.append(lVar);
            sb2.append(" -> ");
            sb2.append(lVar2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.f12015e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, lVar2.f31701a, Math.min(iArr.length, lVar2.f31702b + 1))));
            sb2.append("\"]\n");
            g(lVar2, sb2);
        }
    }

    public boolean h(int i11, int i12, int i13, int i14) {
        switch (this.f12011a) {
            case 0:
                if (i11 >= 0 && i13 >= 0) {
                    int[] iArr = (int[]) this.f12015e;
                    int length = iArr.length;
                    int iMin = Math.min(length, i12);
                    if (iMin - i11 == Math.min(length, i14) - i13) {
                        for (int i15 = i11; i15 <= iMin; i15++) {
                            if (iArr[i15] != iArr[(i13 + i15) - i11]) {
                            }
                        }
                    }
                }
                break;
            default:
                if (i11 >= 0 && i13 >= 0) {
                    int[] iArr2 = (int[]) this.f12015e;
                    int length2 = iArr2.length;
                    int iMin2 = Math.min(length2, i12);
                    if (iMin2 - i11 == Math.min(length2, i14) - i13) {
                        for (int i16 = i11; i16 <= iMin2; i16++) {
                            if (iArr2[i16] != iArr2[(i13 + i16) - i11]) {
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    public String toString() {
        switch (this.f12011a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                f((uf) this.f12016f, sb2);
                sb2.append("}");
                return sb2.toString();
            case 3:
                StringBuilder sb3 = new StringBuilder("digraph {\n");
                g((o00.l) this.f12016f, sb3);
                sb3.append("}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public wf(g gVar, Object[] objArr, StringBuilder sb2) {
        this.f12011a = 1;
        this.f12012b = 0;
        this.f12013c = -1;
        g1.c(gVar, "context");
        this.f12015e = gVar;
        this.f12014d = 0;
        this.f12016f = objArr;
        this.f12017g = sb2;
    }

    public wf(l8.t tVar) {
        this.f12011a = 2;
        this.f12012b = 1;
        this.f12015e = tVar;
        this.f12016f = tVar;
    }
}
