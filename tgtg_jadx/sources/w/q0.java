package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import b0.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s0.c2;
import s0.d2;
import s0.e2;
import s0.f2;
import s0.g2;
import s0.h2;
import s0.i1;
import s0.i2;
import s0.o2;
import s0.u1;
import s0.x0;
import s0.y0;
import s0.y1;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final z.a A;
    public final c0.b B;
    public final c0.d C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.v f42751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f42752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.b f42753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f42756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f42757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f42758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f42759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f42760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f42761k;
    public final LinkedHashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f42762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f42763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f42764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f42765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f42766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f42767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f42768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f42769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f42770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s0.o f42771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f42772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x.i f42773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e1 f42774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t10.c f42775z;

    /* JADX WARN: Removed duplicated region for block: B:51:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0(android.content.Context r36, e0.v r37, s0.y0 r38, o0.b r39) {
        /*
            Method dump skipped, instruction units count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.<init>(android.content.Context, e0.v, s0.y0, o0.b):void");
    }

    public static boolean b(q0 q0Var, o0 o0Var, ArrayList arrayList) {
        kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
        o0Var2.getClass();
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        return q0Var.a(o0Var, arrayList, o0Var2, n0Var, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Range d(android.util.Range r19, int r20, android.util.Range[] r21) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.d(android.util.Range, int, android.util.Range[]):android.util.Range");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size f(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 0
            u70.o r1 = u70.q.f40850b     // Catch: java.lang.Throwable -> L10
            r1 = 34
            if (r9 != r1) goto L14
            if (r8 == 0) goto L12
            java.lang.Class<android.graphics.SurfaceTexture> r1 = android.graphics.SurfaceTexture.class
            android.util.Size[] r1 = r8.getOutputSizes(r1)     // Catch: java.lang.Throwable -> L10
            goto L23
        L10:
            r1 = move-exception
            goto L1b
        L12:
            r1 = r0
            goto L23
        L14:
            if (r8 == 0) goto L12
            android.util.Size[] r1 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> L10
            goto L23
        L1b:
            u70.o r2 = u70.q.f40850b
            u70.p r2 = new u70.p
            r2.<init>(r1)
            r1 = r2
        L23:
            boolean r2 = r1 instanceof u70.p
            if (r2 == 0) goto L29
            r1 = r0
        L29:
            android.util.Size[] r1 = (android.util.Size[]) r1
            r2 = 0
            if (r1 == 0) goto L51
            if (r11 == 0) goto L52
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = r2
        L37:
            if (r5 >= r4) goto L47
            r6 = r1[r5]
            boolean r7 = v0.a.a(r11, r6)
            if (r7 == 0) goto L44
            r3.add(r6)
        L44:
            int r5 = r5 + 1
            goto L37
        L47:
            android.util.Size[] r11 = new android.util.Size[r2]
            java.lang.Object[] r11 = r3.toArray(r11)
            r1 = r11
            android.util.Size[] r1 = (android.util.Size[]) r1
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 == 0) goto L97
            int r11 = r1.length
            if (r11 != 0) goto L58
            goto L97
        L58:
            v0.b r11 = new v0.b
            r11.<init>(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            java.lang.Object r1 = java.util.Collections.max(r1, r11)
            android.util.Size r1 = (android.util.Size) r1
            android.util.Size r2 = b1.a.f5535a
            if (r10 == 0) goto L88
            if (r8 == 0) goto L74
            android.util.Size[] r0 = r8.getHighResolutionOutputSizes(r9)
        L74:
            if (r0 == 0) goto L88
            int r8 = r0.length
            if (r8 != 0) goto L7a
            goto L88
        L7a:
            java.util.List r8 = java.util.Arrays.asList(r0)
            r8.getClass()
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r2 = r8
            android.util.Size r2 = (android.util.Size) r2
        L88:
            android.util.Size[] r8 = new android.util.Size[]{r1, r2}
            java.util.List r8 = kotlin.collections.d0.h(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.f(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    public static int h(Range range, Range range2) {
        if (range.contains(range2.getUpper()) || range.contains(range2.getLower())) {
            i4.a.f("Ranges must not intersect");
            return 0;
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            int iIntValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            upper.getClass();
            return iIntValue - ((Number) upper).intValue();
        }
        int iIntValue2 = ((Number) range2.getLower()).intValue();
        Object upper2 = range.getUpper();
        upper2.getClass();
        return iIntValue2 - ((Number) upper2).intValue();
    }

    public static int i(Range range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        lower.getClass();
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    public static Range o(Range range, Range range2, boolean z11) {
        Range range3 = s0.n.f38401h;
        if (Intrinsics.areEqual(range2, range3) && Intrinsics.areEqual(range, range3)) {
            range3.getClass();
            return range3;
        }
        if (Intrinsics.areEqual(range2, range3)) {
            return range;
        }
        if (!Intrinsics.areEqual(range, range3)) {
            if (z11) {
                pd.g.n("All targetFrameRate should be the same if strict fps is required", Intrinsics.areEqual(range, range2));
                return range;
            }
            try {
                Range rangeIntersect = range2.intersect(range);
                rangeIntersect.getClass();
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final boolean a(o0 o0Var, ArrayList arrayList, Map map, List list, List list2) {
        boolean z11;
        Integer num;
        ArrayList arrayList2;
        List list3;
        boolean z12;
        Size sizeC;
        Integer num2;
        u0.b bVar = o0Var.f42739d;
        boolean z13 = o0Var.f42743h;
        map.getClass();
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.containsKey(o0Var)) {
            Object obj = linkedHashMap.get(o0Var);
            obj.getClass();
            list3 = (List) obj;
            z11 = z13;
            num = 2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i11 = o0Var.f42736a;
            if (z13) {
                u70.t tVar = f0.f42677a;
                arrayList3.addAll(f0.b(this.f42751a, bVar));
                z11 = z13;
                num = 2;
            } else if (o0Var.f42740e) {
                ArrayList arrayList4 = this.f42763n;
                if (arrayList4.isEmpty()) {
                    u70.t tVar2 = f0.f42677a;
                    ArrayList arrayList5 = new ArrayList();
                    d2 d2Var = new d2();
                    c2 c2Var = i2.f38344e;
                    g2 g2Var = g2.JPEG_R;
                    e2 e2Var = e2.MAXIMUM;
                    c2 c2Var2 = i2.f38344e;
                    z11 = z13;
                    d2Var.a(l50.a.n(g2Var, e2Var, c2Var2));
                    arrayList5.add(d2Var);
                    d2 d2Var2 = new d2();
                    num = 2;
                    r8.k.B(d2Var2, l50.a.n(g2.PRIV, e2.PREVIEW, c2Var2), g2Var, e2Var, c2Var2);
                    arrayList5.add(d2Var2);
                    arrayList4.addAll(arrayList5);
                } else {
                    z11 = z13;
                    num = 2;
                }
                if (i11 == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                z11 = z13;
                num = 2;
                if (o0Var.f42741f) {
                    ArrayList arrayList6 = this.f42761k;
                    if (arrayList6.isEmpty()) {
                        c0.d dVar = this.C;
                        if (((Boolean) dVar.f6797b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size = (Size) dVar.f6798c.getValue();
                            if (size != null) {
                                s0.o oVarN = n(34);
                                u70.t tVar3 = f0.f42677a;
                                oVarN.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                c2 c2Var3 = i2.f38344e;
                                i2 i2VarG = l50.a.G(34, size, oVarN, 0, f2.CAPTURE_SESSION_TABLES, i2.f38344e);
                                d2 d2Var3 = new d2();
                                d2Var3.a(i2VarG);
                                arrayList7.add(d2Var3);
                                d2 d2Var4 = new d2();
                                d2Var4.a(i2VarG);
                                d2Var4.a(i2VarG);
                                arrayList7.add(d2Var4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i12 = o0Var.f42737b;
                    if (i12 == 8) {
                        if (i11 != 1) {
                            ArrayList arrayList8 = this.f42757g;
                            if (i11 != 2) {
                                if (bVar == u0.b.PREVIEW) {
                                    arrayList8 = this.f42760j;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.f42759i);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.f42756f;
                            linkedHashMap.put(o0Var, arrayList2);
                            list3 = arrayList2;
                        }
                    } else if (i12 == 10 && i11 == 0) {
                        arrayList3.addAll(this.f42762m);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(o0Var, arrayList2);
            list3 = arrayList2;
        }
        boolean z14 = false;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((d2) it.next()).c(arrayList) != null) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        if (!z12 || !z11) {
            return z12;
        }
        y1 y1Var = new y1();
        Iterator it2 = arrayList.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.d0.n();
                throw null;
            }
            i2 i2Var = (i2) next;
            s0.o oVarN2 = n(i2Var.f38351d);
            int i15 = i2Var.f38351d;
            oVarN2.getClass();
            LinkedHashMap linkedHashMap2 = oVarN2.f38415f;
            e2 e2Var2 = i2Var.f38349b;
            switch (h2.$EnumSwitchMapping$0[e2Var2.ordinal()]) {
                case 1:
                    sizeC = oVarN2.f38412c;
                    break;
                case 2:
                    sizeC = oVarN2.f38414e;
                    break;
                case 3:
                    sizeC = (Size) linkedHashMap2.get(Integer.valueOf(i15));
                    break;
                case 4:
                    sizeC = (Size) linkedHashMap2.get(Integer.valueOf(i15));
                    break;
                case 5:
                    sizeC = (Size) linkedHashMap2.get(Integer.valueOf(i15));
                    break;
                case 6:
                    sizeC = (Size) oVarN2.f38418i.get(Integer.valueOf(i15));
                    break;
                case 7:
                    com.braze.h2.b("Not supported config size");
                    return z14;
                default:
                    sizeC = e2Var2.c();
                    break;
            }
            sizeC.getClass();
            o2 o2Var = (o2) list.get(((Number) list2.get(i13)).intValue());
            Object obj2 = map.get(i2Var);
            if (obj2 == null) {
                boolean z15 = z14;
                i4.a.f("Required value was null.");
                return z15;
            }
            m0.c0 c0Var = (m0.c0) obj2;
            o2Var.getClass();
            boolean z16 = z14;
            o0.a aVar = new o0.a(o2Var.k(), sizeC);
            o0.g.Companion.getClass();
            int i16 = o0.d.$EnumSwitchMapping$0[o2Var.n().ordinal()];
            Iterator it3 = it2;
            Class clsA = (i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? i16 != 5 ? o0.g.UNDEFINED : o0.g.STREAM_SHARING : o0.g.VIDEO_CAPTURE : o0.g.PREVIEW : o0.g.IMAGE_CAPTURE : o0.g.IMAGE_ANALYSIS).a();
            if (clsA != null) {
                aVar.f38474j = clsA;
            }
            u1 u1VarD = u1.d(o2Var, sizeC);
            i0.w wVar = u1VarD.f38447b;
            u1VarD.b(aVar, c0Var, -1);
            Range range = o0Var.f42744i;
            if (Intrinsics.areEqual(range, s0.n.f38401h)) {
                range = null;
            }
            if (range == null) {
                range = p0.c.f34098d;
            }
            wVar.getClass();
            ((i1) wVar.f22747d).v(s0.r0.f38437h, range);
            if (bVar == u0.b.PREVIEW) {
                wVar.getClass();
                num2 = num;
                ((i1) wVar.f22747d).v(o2.V0, num2);
            } else {
                num2 = num;
                if (bVar == u0.b.ON) {
                    wVar.getClass();
                    ((i1) wVar.f22747d).v(o2.W0, num2);
                }
            }
            y1Var.a(u1VarD.c());
            boolean zC = y1Var.c();
            StringBuilder sb2 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb2.append(o2Var);
            sb2.append(" with ");
            sb2.append(i2Var);
            sb2.append(" due to [");
            sb2.append(!y1Var.f38478m ? "Template is not set" : y1Var.l.toString());
            sb2.append("]; surfaceConfigList = ");
            sb2.append(arrayList);
            sb2.append(", featureSettings = ");
            sb2.append(o0Var);
            sb2.append(", newUseCaseConfigs = ");
            sb2.append(list);
            pd.g.n(sb2.toString(), zC);
            i13 = i14;
            num = num2;
            z14 = z16;
            it2 = it3;
        }
        z1 z1VarB = y1Var.b();
        boolean zH = this.f42753c.h(z1VarB);
        List listB = z1VarB.b();
        listB.getClass();
        Iterator it4 = listB.iterator();
        while (it4.hasNext()) {
            ((x0) it4.next()).a();
        }
        return zH;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r11 = this;
            b0.e1 r0 = r11.f42774y
            android.util.Size r4 = r0.c()
            java.lang.String r0 = r11.f42754d     // Catch: java.lang.NumberFormatException -> L14
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L14
            android.util.Size r0 = r11.j()     // Catch: java.lang.NumberFormatException -> L14
            if (r0 == 0) goto L14
        L11:
            r6 = r0
            goto L73
        L14:
            x.i r0 = r11.f42773x
            t10.c r0 = r0.f43616d
            java.lang.Object r0 = r0.f39648a
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            r1 = 0
            u70.o r2 = u70.q.f40850b     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            java.lang.Class<android.media.MediaRecorder> r2 = android.media.MediaRecorder.class
            android.util.Size[] r0 = r0.getOutputSizes(r2)     // Catch: java.lang.Throwable -> L28
            goto L34
        L28:
            r0 = move-exception
            goto L2c
        L2a:
            r0 = r1
            goto L34
        L2c:
            u70.o r2 = u70.q.f40850b
            u70.p r2 = new u70.p
            r2.<init>(r0)
            r0 = r2
        L34:
            boolean r2 = r0 instanceof u70.p
            if (r2 == 0) goto L3a
            r0 = r1
        L3a:
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 != 0) goto L40
        L3e:
            r0 = r1
            goto L6a
        L40:
            v0.b r2 = new v0.b
            r3 = 1
            r2.<init>(r3)
            java.util.Arrays.sort(r0, r2)
            int r2 = r0.length
            r3 = 0
        L4b:
            if (r3 >= r2) goto L3e
            r5 = r0[r3]
            int r6 = r5.getWidth()
            android.util.Size r7 = b1.a.f5539e
            int r8 = r7.getWidth()
            if (r6 > r8) goto L67
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L67
            r0 = r5
            goto L6a
        L67:
            int r3 = r3 + 1
            goto L4b
        L6a:
            if (r0 == 0) goto L6d
            goto L11
        L6d:
            android.util.Size r0 = b1.a.f5537c
            r0.getClass()
            goto L11
        L73:
            android.util.Size r2 = b1.a.f5536b
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            s0.o r1 = new s0.o
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f42771v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.c():void");
    }

    public final int e(int i11, Size size, boolean z11, int i12) {
        long jL;
        int iIntValue = 0;
        if (!z11) {
            x.i iVarK = k();
            size.getClass();
            try {
                jL = iVarK.f43616d.l(i11, size);
            } catch (RuntimeException e5) {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i11 + " and size = " + size, e5);
                }
                jL = 0;
            }
            if (jL > 0) {
                iIntValue = (int) (1.0E9d / jL);
            } else if (!this.f42770u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "minFrameDuration: " + jL + " is invalid for imageFormat = " + i11 + ", size = " + size);
            }
        } else {
            if (i11 != 34) {
                com.braze.h2.b("Check failed.");
                return 0;
            }
            c0.d dVar = this.C;
            dVar.getClass();
            size.getClass();
            List listC = dVar.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                wd.a.I("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    m0.i1.c();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                iIntValue = num.intValue();
            }
        }
        return Math.min(i12, iIntValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        r2 = u70.l.b(new us.j(10, r11, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r3 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (((java.lang.Boolean) r2.getValue()).booleanValue() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g(w.o0 r12, java.util.ArrayList r13, java.util.LinkedHashMap r14, java.util.LinkedHashMap r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.g(w.o0, java.util.ArrayList, java.util.LinkedHashMap, java.util.LinkedHashMap):java.util.List");
    }

    public final Size j() {
        s0.i iVarB;
        Iterator it = kotlin.collections.d0.h(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            y0 y0Var = this.f42752b;
            if (y0Var.a(iIntValue) && (iVarB = y0Var.b(iIntValue)) != null) {
                List list = iVarB.f38342d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    s0.j jVar = (s0.j) obj;
                    return new Size(jVar.f38356e, jVar.f38357f);
                }
            }
        }
        return null;
    }

    public final x.i k() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        e0.v vVar = this.f42751a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((f0.t0) vVar).c(key);
        if (streamConfigurationMap != null) {
            return new x.i(streamConfigurationMap, new z.f(vVar));
        }
        i4.a.f("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList l(int i11, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z11) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s0.e eVar = (s0.e) it.next();
            arrayList3.add(eVar.f38315a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), eVar);
        }
        Iterator it2 = list.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            int i13 = i12 + 1;
            Size size = (Size) it2.next();
            o2 o2Var = (o2) list2.get(((Number) arrayList2.get(i12)).intValue());
            int iK = o2Var.k();
            c2 c2VarM = o2Var.m();
            c2 c2Var = i2.f38344e;
            arrayList3.add(l50.a.G(iK, size, n(iK), i11, z11 ? f2.FEATURE_COMBINATION_TABLE : f2.CAPTURE_SESSION_TABLES, c2VarM));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), o2Var);
            i12 = i13;
        }
        return arrayList3;
    }

    public final s0.o m() {
        s0.o oVar = this.f42771v;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("surfaceSizeDefinition");
        return null;
    }

    public final s0.o n(int i11) {
        Size sizeF;
        Integer numValueOf = Integer.valueOf(i11);
        ArrayList arrayList = this.f42772w;
        if (!arrayList.contains(numValueOf)) {
            LinkedHashMap linkedHashMap = m().f38411b;
            Size size = b1.a.f5538d;
            size.getClass();
            s(linkedHashMap, size, i11);
            LinkedHashMap linkedHashMap2 = m().f38413d;
            Size size2 = b1.a.f5540f;
            size2.getClass();
            s(linkedHashMap2, size2, i11);
            r(m().f38415f, i11, null);
            r(m().f38416g, i11, v0.a.f41584a);
            r(m().f38417h, i11, v0.a.f41586c);
            LinkedHashMap linkedHashMap3 = m().f38418i;
            if (Build.VERSION.SDK_INT >= 31 && this.f42768s) {
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((f0.t0) this.f42751a).c(key);
                if (streamConfigurationMap != null && (sizeF = f(streamConfigurationMap, i11, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i11), sizeF);
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x062a A[PHI: r12 r24 r26
      0x062a: PHI (r12v14 int) = (r12v13 int), (r12v13 int), (r12v17 int), (r12v19 int) binds: [B:194:0x05ff, B:196:0x060b, B:202:0x0618, B:205:0x0625] A[DONT_GENERATE, DONT_INLINE]
      0x062a: PHI (r24v3 int) = (r24v2 int), (r24v2 int), (r24v2 int), (r24v4 int) binds: [B:194:0x05ff, B:196:0x060b, B:202:0x0618, B:205:0x0625] A[DONT_GENERATE, DONT_INLINE]
      0x062a: PHI (r26v3 java.util.List) = (r26v2 java.util.List), (r26v2 java.util.List), (r26v5 java.util.List), (r26v6 java.util.List) binds: [B:194:0x05ff, B:196:0x060b, B:202:0x0618, B:205:0x0625] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0857  */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [int] */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.j2 p(w.o0 r48, java.util.ArrayList r49, java.util.Map r50, java.util.List r51, java.util.ArrayList r52, java.util.LinkedHashMap r53) {
        /*
            Method dump skipped, instruction units count: 2389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q0.p(w.o0, java.util.ArrayList, java.util.Map, java.util.List, java.util.ArrayList, java.util.LinkedHashMap):s0.j2");
    }

    public final i2 q(int i11, int i12, Size size, c2 c2Var) {
        size.getClass();
        c2 c2Var2 = i2.f38344e;
        return l50.a.G(i12, size, n(i12), i11, f2.CAPTURE_SESSION_TABLES, c2Var);
    }

    public final void r(LinkedHashMap linkedHashMap, int i11, Rational rational) {
        Size sizeF = f((StreamConfigurationMap) this.f42773x.f43616d.f39648a, i11, true, rational);
        if (sizeF != null) {
            linkedHashMap.put(Integer.valueOf(i11), sizeF);
        }
    }

    public final void s(LinkedHashMap linkedHashMap, Size size, int i11) {
        if (this.f42766q) {
            Size sizeF = f((StreamConfigurationMap) this.f42773x.f43616d.f39648a, i11, false, null);
            Integer numValueOf = Integer.valueOf(i11);
            if (sizeF != null) {
                size = (Size) Collections.min(kotlin.collections.d0.h(size, sizeF), new v0.b(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void t(o0 o0Var) {
        int i11 = o0Var.f42736a;
        boolean z11 = o0Var.f42742g;
        String str = this.f42754d;
        if (i11 != 0 && o0Var.f42740e) {
            i4.a.i(r8.k.p(e0.f.s("Camera device Id is ", str, ". Ultra HDR is not currently supported in "), i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        if (i11 != 0 && o0Var.f42737b == 10) {
            i4.a.i(r8.k.p(e0.f.s("Camera device Id is ", str, ". 10 bit dynamic range is not currently supported in "), i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        if (i11 != 0 && z11) {
            i4.a.i(r8.k.p(e0.f.s("Camera device Id is ", str, ". feature combination is not currently supported in "), i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        boolean z12 = o0Var.f42741f;
        if (z12 && z11) {
            i4.a.f("High-speed session is not supported with feature combination");
        } else {
            if (!z12 || ((Boolean) this.C.f6797b.getValue()).booleanValue()) {
                return;
            }
            i4.a.f("High-speed session is not supported on this device.");
        }
    }
}
