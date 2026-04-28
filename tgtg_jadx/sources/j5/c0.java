package j5;

import a3.d2;
import b5.g0;
import b5.m0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f24617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f24618b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i11 = 0;
        while (i11 < 2) {
            h hVar = i11 == 0 ? h.f24626c : h.f24625b;
            g0 g0Var = m0.V;
            comparatorArr[i11] = new d2(new d2(hVar), 4);
            i11++;
        }
        f24617a = comparatorArr;
        f24618b = l.f24655v;
    }

    public static final void a(t tVar, ArrayList arrayList, androidx.fragment.app.r rVar, androidx.fragment.app.r rVar2, q1.g0 g0Var) {
        n nVar = tVar.f24696d;
        a0 a0Var = x.f24718m;
        o oVar = o.f24689e;
        Object objD = nVar.f24682a.d(a0Var);
        if (objD == null) {
            oVar.getClass();
            objD = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        if ((zBooleanValue || ((Boolean) rVar2.invoke(tVar)).booleanValue()) && ((Boolean) rVar.invoke(tVar)).booleanValue()) {
            arrayList.add(tVar);
        }
        if (zBooleanValue) {
            g0Var.i(tVar.f24699g, b(tVar, rVar, rVar2, t.j(7, tVar)));
            return;
        }
        List listJ = t.j(7, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            a((t) listJ.get(i11), arrayList, rVar, rVar2, g0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(j5.t r17, androidx.fragment.app.r r18, androidx.fragment.app.r r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c0.b(j5.t, androidx.fragment.app.r, androidx.fragment.app.r, java.util.List):java.util.ArrayList");
    }
}
