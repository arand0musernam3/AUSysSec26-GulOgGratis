package c5;

import android.content.res.Resources;
import com.app.tgtg.R;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static final boolean a(j5.t tVar) {
        j5.n nVarK = tVar.k();
        return !nVarK.f24682a.b(j5.x.f24715i);
    }

    public static final boolean b(j5.t tVar, Resources resources) {
        List list = (List) j5.w.d(tVar.f24696d, j5.x.f24707a);
        return !j5.w.e(tVar) && (tVar.f24696d.f24684c || (tVar.n() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || f(tVar) != null || e(tVar, resources) != null || d(tVar))));
    }

    public static final b5.m0 c(b5.m0 m0Var, Function1 function1) {
        for (b5.m0 m0VarW = m0Var.w(); m0VarW != null; m0VarW = m0VarW.w()) {
            if (((Boolean) function1.invoke(m0VarW)).booleanValue()) {
                return m0VarW;
            }
        }
        return null;
    }

    public static final boolean d(j5.t tVar) {
        l5.a aVar = (l5.a) j5.w.d(tVar.f24696d, j5.x.J);
        j5.n nVar = tVar.f24696d;
        j5.j jVar = (j5.j) j5.w.d(nVar, j5.x.f24730y);
        boolean z11 = aVar != null;
        if (((Boolean) j5.w.d(nVar, j5.x.I)) == null || (jVar != null && jVar.f24632a == 4)) {
            return z11;
        }
        return true;
    }

    public static final String e(j5.t tVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object objD = j5.w.d(tVar.f24696d, j5.x.f24708b);
        j5.n nVar = tVar.f24696d;
        l5.a aVar = (l5.a) j5.w.d(nVar, j5.x.J);
        j5.j jVar = (j5.j) j5.w.d(nVar, j5.x.f24730y);
        Object string = null;
        if (aVar != null) {
            int i11 = g0.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        e40.a.f();
                        return null;
                    }
                    if (objD == null) {
                        objD = resources.getString(R.string.indeterminate);
                    }
                } else if (jVar != null && jVar.f24632a == 2 && objD == null) {
                    objD = resources.getString(R.string.state_off);
                }
            } else if (jVar != null && jVar.f24632a == 2 && objD == null) {
                objD = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) j5.w.d(nVar, j5.x.I);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((jVar == null || jVar.f24632a != 4) && objD == null) {
                objD = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        j5.i iVar = (j5.i) j5.w.d(nVar, j5.x.f24709c);
        if (iVar != null) {
            if (iVar != j5.i.f24629c) {
                if (objD == null) {
                    n80.f fVar = iVar.f24631b;
                    float f11 = fVar.f30712a - 0.0f == 0.0f ? 0.0f : (iVar.f24630a - 0.0f) / (fVar.f30712a - 0.0f);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    objD = resources.getString(R.string.template_percent, Integer.valueOf(f11 == 0.0f ? 0 : f11 == 1.0f ? 100 : n80.p.c(Math.round(f11 * 100), 1, 99)));
                }
            } else if (objD == null) {
                objD = resources.getString(R.string.in_progress);
            }
        }
        j5.a0 a0Var = j5.x.F;
        if (nVar.f24682a.b(a0Var)) {
            j5.n nVarK = new j5.t(tVar.f24693a, true, tVar.f24695c, nVar).k();
            Collection collection2 = (Collection) j5.w.d(nVarK, j5.x.f24707a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) j5.w.d(nVarK, j5.x.B)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) j5.w.d(nVarK, a0Var)) == null || charSequence.length() == 0))) {
                string = resources.getString(R.string.state_empty);
            }
            objD = string;
        }
        return (String) objD;
    }

    public static final m5.h f(j5.t tVar) {
        m5.h hVar = (m5.h) j5.w.d(tVar.f24696d, j5.x.F);
        List list = (List) j5.w.d(tVar.f24696d, j5.x.B);
        return hVar == null ? list != null ? (m5.h) CollectionsKt.firstOrNull(list) : null : hVar;
    }
}
