package androidx.compose.foundation;

import android.view.KeyEvent;
import b2.l;
import b4.q;
import b4.t;
import c5.m2;
import dp.x;
import j5.j;
import kotlin.jvm.functions.Function0;
import u4.c;
import v1.b1;
import v1.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final t a(t tVar, l lVar, e1 e1Var, boolean z11, String str, j jVar, Function0 function0) {
        t tVarA;
        if (e1Var != null) {
            tVarA = new ClickableElement(lVar, e1Var, false, z11, str, jVar, function0);
        } else if (e1Var == null) {
            tVarA = new ClickableElement(lVar, null, false, z11, str, jVar, function0);
        } else {
            q qVar = q.f5711a;
            if (lVar != null) {
                tVarA = b1.a(qVar, lVar, e1Var).then(new ClickableElement(lVar, null, false, z11, str, jVar, function0));
            } else {
                tVarA = b4.a.a(qVar, m2.f7291a, new a(e1Var, z11, str, jVar, function0));
            }
        }
        return tVar.then(tVarA);
    }

    public static /* synthetic */ t b(t tVar, l lVar, e1 e1Var, boolean z11, String str, j jVar, Function0 function0, int i11) {
        j jVar2;
        t tVar2;
        l lVar2;
        e1 e1Var2;
        Function0 function02;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            jVar2 = null;
            lVar2 = lVar;
            e1Var2 = e1Var;
            function02 = function0;
            tVar2 = tVar;
        } else {
            jVar2 = jVar;
            tVar2 = tVar;
            lVar2 = lVar;
            e1Var2 = e1Var;
            function02 = function0;
        }
        return a(tVar2, lVar2, e1Var2, z12, str2, jVar2, function02);
    }

    public static t c(t tVar, boolean z11, String str, j jVar, Function0 function0, int i11) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return tVar.then(new ClickableElement(null, null, true, z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : jVar, function0));
    }

    public static t d(t tVar, l lVar, String str, j jVar, x xVar, Function0 function0, int i11) {
        return tVar.then(new CombinedClickableElement(lVar, (i11 & 16) != 0 ? null : jVar, (i11 & 8) != 0 ? null : str, null, function0, (i11 & 64) != 0 ? null : xVar));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jB = c.b(keyEvent);
        int i11 = u4.a.F;
        return u4.a.a(jB, u4.a.f40716h) || u4.a.a(jB, u4.a.f40725r) || u4.a.a(jB, u4.a.E) || u4.a.a(jB, u4.a.f40724q);
    }
}
