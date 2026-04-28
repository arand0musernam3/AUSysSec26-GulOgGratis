package hf;

import a3.d2;
import android.content.SharedPreferences;
import ax.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.y;
import of.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf.b f22027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f22028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f22029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uf.g f22030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f22031e;

    public g(String str, kf.b bVar, SharedPreferences sharedPreferences, File file, ub.a aVar, m mVar) {
        str.getClass();
        bVar.getClass();
        sharedPreferences.getClass();
        file.getClass();
        aVar.getClass();
        this.f22027a = bVar;
        this.f22028b = sharedPreferences;
        this.f22029c = mVar;
        this.f22030d = new uf.g(file, str, new p0(sharedPreferences, 1), bVar, aVar);
        this.f22031e = new LinkedHashMap();
    }

    public final String a(nf.e eVar) {
        eVar.getClass();
        return this.f22028b.getString(eVar.a(), null);
    }

    public final ArrayList b() {
        uf.g gVar = this.f22030d;
        File[] fileArrListFiles = gVar.f41098a.listFiles(new uf.a(gVar, 0));
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List listN = y.N(new d2(gVar, 9), fileArrListFiles);
        ArrayList arrayList = new ArrayList(e0.o(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    public final void c(String str) {
        str.getClass();
        uf.g gVar = this.f22030d;
        gVar.getClass();
        str.getClass();
        gVar.f41105h.remove(str);
    }

    public final Unit d(nf.e eVar) {
        SharedPreferences.Editor editorEdit = this.f22028b.edit();
        editorEdit.remove(eVar.a());
        editorEdit.apply();
        return Unit.f26487a;
    }

    public final void e(String str) {
        str.getClass();
        this.f22030d.h(str);
    }

    public final Object f(z70.c cVar) {
        Object objJ = this.f22030d.j(cVar);
        return objJ == y70.a.COROUTINE_SUSPENDED ? objJ : Unit.f26487a;
    }

    public final Unit g(nf.e eVar, String str) {
        SharedPreferences.Editor editorEdit = this.f22028b.edit();
        editorEdit.putString(eVar.a(), str);
        editorEdit.apply();
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(pf.a r10, z70.c r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.g.h(pf.a, z70.c):java.lang.Object");
    }
}
