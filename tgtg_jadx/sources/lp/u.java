package lp;

import b0.x1;
import d2.m2;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static final void a(b4.t tVar, List list, Function1 function1, Function1 function12, Function0 function0, m3.n nVar, int i11) {
        int i12;
        Function1 function13;
        Function1 function14;
        Function0 function02;
        list.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1375040616);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            function13 = function1;
            i12 |= sVar.h(function13) ? 256 : 128;
        } else {
            function13 = function1;
        }
        if ((i11 & 3072) == 0) {
            function14 = function12;
            i12 |= sVar.h(function14) ? 2048 : 1024;
        } else {
            function14 = function12;
        }
        if ((i11 & 24576) == 0) {
            function02 = function0;
            i12 |= sVar.h(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            b4.t tVarD = d2.c.D(tVar.then(m2.f13850c), 0.0f, lv.t.l, 0.0f, 0.0f, 13);
            boolean zH = ((i12 & 896) == 256) | sVar.h(list) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                x1 x1Var = new x1(15, list, function13, function14, function02);
                sVar.k0(x1Var);
                objM = x1Var;
            }
            ox.h.c(tVarD, null, null, null, null, null, false, null, (Function1) objM, sVar, 0, 510);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(tVar, list, function1, function12, function0, i11);
        }
    }
}
