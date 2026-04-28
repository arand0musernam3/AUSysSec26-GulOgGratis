package cg;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.os.VibratorManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import m3.g1;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(b4.t r28, java.lang.String r29, java.util.ArrayList r30, int r31, m3.n r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.i.a(b4.t, java.lang.String, java.util.ArrayList, int, m3.n, int, int):void");
    }

    public static final void b(he.k kVar, float f11, ArrayList arrayList, m3.n nVar, int i11) {
        Vibrator defaultVibrator;
        boolean z11;
        boolean z12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-44375075);
        int i12 = i11 | (sVar.h(kVar) ? 4 : 2) | (sVar.c(f11) ? 32 : 16) | (sVar.h(arrayList) ? 256 : 128);
        boolean z13 = false;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g1(0.0f);
                sVar.k0(objM);
            }
            g1 g1Var = (g1) objM;
            ArrayList<a0> arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 31) {
                sVar.a0(872384417);
                Object systemService = ((Context) sVar.j(c5.v0.f7390b)).getSystemService("vibrator_manager");
                systemService.getClass();
                defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
                sVar.q(false);
            } else {
                sVar.a0(872582693);
                Object systemService2 = ((Context) sVar.j(c5.v0.f7390b)).getSystemService("vibrator");
                systemService2.getClass();
                defaultVibrator = (Vibrator) systemService2;
                sVar.q(false);
            }
            defaultVibrator.getClass();
            if (kVar == null) {
                sVar.a0(872778984);
                sVar.q(false);
            } else {
                sVar.a0(872778985);
                ArrayList<oe.i> arrayList3 = kVar.f21932g;
                if (arrayList3 == null) {
                    sVar.a0(-1334906688);
                    sVar.q(false);
                    z11 = false;
                } else {
                    sVar.a0(-1334906687);
                    sVar.a0(-1012892283);
                    for (oe.i iVar : arrayList3) {
                        String str = iVar.f32478a;
                        str.getClass();
                        float f12 = iVar.f32479b;
                        float f13 = kVar.f21937m;
                        float f14 = f12 / f13;
                        float f15 = iVar.f32480c / f13;
                        Object objM2 = sVar.M();
                        if (objM2 == fVar) {
                            objM2 = new bg.a(29);
                            sVar.k0(objM2);
                        }
                        Function0 function0 = (Function0) objM2;
                        Object objM3 = sVar.M();
                        if (objM3 == fVar) {
                            objM3 = new e(0);
                            sVar.k0(objM3);
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zF = sVar.f(str) | sVar.c(f14) | sVar.c(f15) | sVar.g(z13) | sVar.g(z13) | sVar.f(function0) | sVar.f(function02);
                        Object objM4 = sVar.M();
                        if (zF || objM4 == fVar) {
                            a0 a0Var = new a0(str, f14, f15, function0, function02);
                            sVar.k0(a0Var);
                            objM4 = a0Var;
                        }
                        arrayList2.add((a0) objM4);
                        z13 = false;
                    }
                    z11 = z13;
                    sVar.q(z11);
                    sVar.q(z11);
                }
                sVar.q(z11);
            }
            for (a0 a0Var2 : arrayList2) {
                sVar.a0(305263939);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b0 b0Var = (b0) it.next();
                    String str2 = a0Var2.f7919a;
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    String str3 = b0Var.f7935a;
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String lowerCase2 = str3.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (StringsKt.z(lowerCase, lowerCase2, false)) {
                        sVar.a0(149001502);
                        boolean zF2 = sVar.f(b0Var) | sVar.h(defaultVibrator);
                        Object objM5 = sVar.M();
                        if (zF2 || objM5 == fVar) {
                            objM5 = new bs.b(2, b0Var, defaultVibrator);
                            sVar.k0(objM5);
                        }
                        Function0 function03 = (Function0) objM5;
                        function03.getClass();
                        a0Var2.f7924f = function03;
                        sVar.q(false);
                    } else {
                        sVar.a0(149233103);
                        sVar.q(false);
                    }
                }
                sVar.q(false);
                boolean zH = sVar.h(defaultVibrator);
                Object objM6 = sVar.M();
                if (zH || objM6 == fVar) {
                    objM6 = new aa.e(defaultVibrator, 21);
                    sVar.k0(objM6);
                }
                Function0 function04 = (Function0) objM6;
                a0Var2.getClass();
                function04.getClass();
                a0Var2.f7925g = function04;
            }
            for (a0 a0Var3 : arrayList2) {
                if (a0Var3.f7922d || f11 <= a0Var3.f7920b) {
                    z12 = true;
                } else {
                    a0Var3.f7924f.invoke();
                    z12 = true;
                    a0Var3.f7922d = true;
                }
                if (!a0Var3.f7923e && f11 > a0Var3.f7921c) {
                    a0Var3.f7925g.invoke();
                    a0Var3.f7923e = z12;
                }
                if (f11 < g1Var.h()) {
                    a0Var3.f7922d = false;
                }
            }
            g1Var.i(f11);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(kVar, f11, arrayList, i11, 0);
        }
    }
}
