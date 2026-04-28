package i0;

import aa.l0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import e0.c1;
import e0.d1;
import e0.f1;
import e0.g1;
import e0.m1;
import e0.o1;
import e0.p1;
import f0.f4;
import f0.p0;
import f0.s2;
import f0.t0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AutoCloseable, e0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f22578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f22579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f22580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f22581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0.j f22582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.o f22583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0.n f22584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0.d0 f22585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0.r f22586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j0.c f22587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0.d f22588k;
    public final j0.w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v80.b0 f22589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f22590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r80.a f22591o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Collection, java.util.List] */
    public b(e0.n nVar, e0.v vVar, v vVar2, v vVar3, g0 g0Var, h0 h0Var, e0.j jVar, j0.o oVar, j0.n nVar2, f0.d0 d0Var, e0.r rVar, j0.c cVar, j0.d dVar, j0.w wVar, v80.b0 b0Var, h hVar) {
        String strA;
        Iterator it;
        Object obj;
        e0.e0 e0Var;
        nVar.getClass();
        int i11 = nVar.f15376h;
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        g0Var.getClass();
        Object obj2 = g0Var.f22657f;
        h0Var.getClass();
        jVar.getClass();
        oVar.getClass();
        nVar2.getClass();
        d0Var.getClass();
        cVar.getClass();
        dVar.getClass();
        wVar.getClass();
        b0Var.getClass();
        hVar.getClass();
        this.f22578a = vVar2;
        this.f22579b = vVar3;
        this.f22580c = g0Var;
        this.f22581d = h0Var;
        this.f22582e = jVar;
        this.f22583f = oVar;
        this.f22584g = nVar2;
        this.f22585h = d0Var;
        this.f22586i = rVar;
        this.f22587j = cVar;
        this.f22588k = dVar;
        this.l = wVar;
        this.f22589m = b0Var;
        this.f22590n = hVar;
        this.f22591o = w.b.p(false);
        String str = nVar.f15369a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        t0 t0Var = (t0) vVar;
        Integer num = (Integer) t0Var.c(key);
        String str2 = "External";
        String str3 = "Unknown";
        int i12 = 1;
        String str4 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) t0Var.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            str2 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str2 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str2 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str2 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str2 = "Unknown";
        }
        if (i11 == 1) {
            str3 = "High Speed";
        } else if (i11 == 0) {
            str3 = "Normal";
        } else if (i11 == 2) {
            str3 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) t0Var.c(key3);
        String str5 = (iArr == null || !kotlin.collections.y.t(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this + " (Camera " + str + ")\n");
        StringBuilder sbT = e0.f.t("  Facing:    ", str4, " (", str5, ", ");
        sbT.append(str2);
        sbT.append(")\n");
        sb2.append(sbT.toString());
        sb2.append("  Mode:      " + str3 + '\n');
        sb2.append("Outputs:\n");
        Iterator it2 = g0Var.f22658g.iterator();
        while (true) {
            int i13 = 12;
            if (!it2.hasNext()) {
                ?? r16 = obj2;
                int i14 = i12;
                if (!r16.isEmpty()) {
                    sb2.append("Inputs:\n");
                    for (c0 c0Var : r16) {
                        sb2.append(" ");
                        sb2.append(StringsKt.L(12, "Input-" + c0Var.f22608a));
                        sb2.append(StringsKt.L(12, o1.b(c0Var.f22609b)));
                        sb2.append(StringsKt.L(12, String.valueOf(i14)));
                        sb2.append("\n");
                    }
                }
                sb2.append("Session Template: " + m1.a(nVar.f15374f) + '\n');
                jf.e.o(sb2, "Session Parameters", nVar.f15375g);
                sb2.append("Default Template: " + m1.a(nVar.f15377i) + '\n');
                jf.e.o(sb2, "Default Parameters", nVar.f15378j);
                jf.e.o(sb2, "Required Parameters", nVar.f15380m);
                Log.i("CXCP", sb2.toString());
                ArrayList arrayList = nVar.f15372d;
                if (i11 == i14) {
                    if (this.f22580c.f22659h.isEmpty()) {
                        i4.a.f("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.f22580c.f22659h.size();
                    g0 g0Var2 = this.f22580c;
                    if (size > 2) {
                        i4.a.j(g0Var2.f22659h, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList2 = g0Var2.f22659h;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            if (!((e0) it3.next()).a()) {
                                i4.a.j(this.f22580c.f22659h, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        i4.a.f("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList.size() > 1) {
                        i4.a.f("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.f22580c.f22656e.isEmpty()) {
                    return;
                }
                this.f22581d.a();
                return;
            }
            int i15 = 0;
            for (Object obj3 : ((e0.e0) it2.next()).f15330b) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    kotlin.collections.d0.n();
                    throw null;
                }
                e0 e0Var2 = (e0) obj3;
                sb2.append("  ");
                if (i15 == 0) {
                    e0.e0 e0Var3 = e0Var2.f22634j;
                    if (e0Var3 != null) {
                        e0Var = e0Var3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("stream");
                        e0Var = null;
                    }
                    strA = p1.a(e0Var.f15329a);
                } else {
                    strA = "";
                }
                sb2.append(StringsKt.L(i13, strA));
                int i17 = e0Var2.f22625a;
                String str6 = e0Var2.f22628d;
                int i18 = i12;
                sb2.append(StringsKt.L(i13, "Output-" + i17));
                String string = e0Var2.f22626b.toString();
                string.getClass();
                sb2.append(StringsKt.L(i13, string));
                sb2.append(StringsKt.L(16, o1.a(e0Var2.f22627c)));
                d1 d1Var = e0Var2.f22629e;
                if (d1Var != null) {
                    sb2.append(" [" + ((Object) d1.a(d1Var.f15328a)) + ']');
                }
                c1 c1Var = e0Var2.f22630f;
                if (c1Var != null) {
                    sb2.append(" [" + ((Object) c1.a(c1Var.f15324a)) + ']');
                    e0Var2 = e0Var2;
                }
                f1 f1Var = e0Var2.f22631g;
                if (f1Var != null) {
                    long j9 = f1Var.f15337a;
                    StringBuilder sb3 = new StringBuilder(" [");
                    it = it2;
                    obj = obj2;
                    sb3.append((Object) ("StreamUseCase(value=" + j9 + ')'));
                    sb3.append(']');
                    sb2.append(sb3.toString());
                } else {
                    it = it2;
                    obj = obj2;
                }
                g1 g1Var = e0Var2.f22633i;
                if (g1Var != null) {
                    long j11 = g1Var.f15343a;
                    StringBuilder sb4 = new StringBuilder(" [");
                    sb4.append((Object) ("StreamUseHint(value=" + j11 + ')'));
                    sb4.append(']');
                    sb2.append(sb4.toString());
                }
                if (!Intrinsics.areEqual(str6, str)) {
                    sb2.append(" [");
                    sb2.append(new e0.s(str6));
                    sb2.append("]");
                }
                sb2.append("\n");
                i12 = i18;
                it2 = it;
                i15 = i16;
                obj2 = obj;
                i13 = 12;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        x70.c cVar;
        if (this.f22591o.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb2 = new StringBuilder("Closing ");
            sb2.append(this);
            Log.i("CXCP", sb2.toString());
            this.f22578a.f22741c.close();
            p0 p0Var = (p0) this.f22582e;
            synchronized (p0Var.f16829q) {
                try {
                    cVar = null;
                    if (!p0Var.e()) {
                        p0Var.f16831s = e0.i.f15349g;
                        Log.d("CXCP", "Closed " + p0Var);
                        f4 f4Var = p0Var.f16837y;
                        s2 s2Var = p0Var.f16838z;
                        p0Var.f16837y = null;
                        p0Var.f16838z = null;
                        b2 b2Var = p0Var.f16835w;
                        if (b2Var != null) {
                            b2Var.a(null);
                        }
                        b2 b2Var2 = p0Var.B;
                        if (b2Var2 != null) {
                            b2Var2.a(null);
                        }
                        p0Var.B = null;
                        b2 b2Var3 = p0Var.C;
                        if (b2Var3 != null) {
                            b2Var3.a(null);
                        }
                        p0Var.C = null;
                        b2 b2Var4 = p0Var.D;
                        if (b2Var4 != null) {
                            b2Var4.a(null);
                        }
                        p0Var.D = null;
                        e0.f.z(p0Var.f16820g);
                        p0Var.d(s2Var, f4Var);
                        e0.n nVar = p0Var.f16817d;
                        if (nVar.f15382o.f15394e || p0Var.l.a(nVar.f15369a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) e0.s.b(p0Var.f16817d.f15369a)) + " during " + p0Var + "#close");
                            p0Var.f16823j.a(p0Var.f16817d.f15369a);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f22583f.close();
            this.f22584g.close();
            this.f22581d.close();
            this.f22580c.close();
            f0.d0 d0Var = this.f22585h;
            d0Var.getClass();
            synchronized (d0Var.f16607c) {
                e0.c cVarA = d0Var.a();
                d0Var.f16608d.remove(this);
                e0.c cVarA2 = d0Var.a();
                if (cVarA2 != null && !Intrinsics.areEqual(cVarA2, cVarA)) {
                    lz.i iVar = d0Var.f16606b;
                    a90.d dVar = d0Var.f16605a;
                    l0 l0Var = new l0(d0Var, cVarA2, cVar, 15);
                    iVar.getClass();
                    dVar.getClass();
                    v80.f0.B(dVar, null, v80.d0.UNDISPATCHED, new al.n(iVar, l0Var, (x70.c) null), 1);
                }
            }
            v80.f0.j(this.f22589m, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z70.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof i0.a
            if (r0 == 0) goto L13
            r0 = r8
            i0.a r0 = (i0.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            i0.a r0 = new i0.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f22569j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L3c
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L2e:
            ba0.g.M(r8)
            r0.l = r3
            j0.w r8 = r7.l
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L3c
            return r1
        L3c:
            r1 = r8
            h0.e r1 = (h0.e) r1
            i0.c r0 = new i0.c
            j0.c r5 = r7.f22587j
            j0.d r6 = r7.f22588k
            i0.v r2 = r7.f22578a
            i0.h r3 = r7.f22590n
            j0.n r4 = r7.f22584g
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.e(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r8, android.view.Surface r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.g(int, android.view.Surface):void");
    }

    public final String toString() {
        return this.f22586i.f15400a;
    }
}
