package uf;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.x0;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.p;
import of.l;
import of.n;
import org.json.JSONArray;
import org.json.JSONException;
import v80.b0;
import v80.f0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.g f41117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.a f41118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f41119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f41120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf.b f41121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f41122f;

    public k(hf.g gVar, qf.a aVar, ye.g gVar2, b0 b0Var, x xVar, kf.b bVar, l lVar) {
        gVar.getClass();
        b0Var.getClass();
        this.f41117a = gVar;
        this.f41118b = aVar;
        this.f41119c = b0Var;
        this.f41120d = xVar;
        this.f41121e = bVar;
        this.f41122f = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean a(h2.s0 r19, java.lang.Object r20, java.lang.String r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.k.a(h2.s0, java.lang.Object, java.lang.String):java.lang.Boolean");
    }

    public final JSONArray b(String str, String str2) throws JSONException {
        try {
            return new JSONArray(str);
        } catch (JSONException e5) {
            x70.c cVar = null;
            i iVar = new i(this, str2, cVar, 3);
            b0 b0Var = this.f41119c;
            x xVar = this.f41120d;
            f0.B(b0Var, xVar, null, iVar, 2);
            Regex regex = new Regex("\"insert_id\":\"(.{36})\",");
            if (str.length() < 0) {
                throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
            }
            i2.e eVar = new i2.e(18, regex, str);
            p pVar = p.f26621a;
            pVar.getClass();
            o80.h hVar = new o80.h(new o80.i(eVar, pVar));
            while (hVar.hasNext()) {
                f0.B(b0Var, xVar, null, new rf.c(this, (MatchResult) hVar.next(), cVar, 11), 2);
            }
            throw e5;
        }
    }

    public final void c(int i11, String str, ArrayList arrayList) {
        int i12;
        String str2;
        l lVar;
        if (!arrayList.isEmpty() && (lVar = this.f41122f) != null) {
            str.getClass();
            if (!arrayList.isEmpty()) {
                if (200 > i11 || i11 >= 300) {
                    long size = arrayList.size();
                    x80.i iVar = lVar.f32516r;
                    iVar.h(new of.c("analytics.events.dropped", size));
                    ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((pf.a) it.next()).a());
                    }
                    iVar.h(new of.b(new n("analytics.events.dropped", System.currentTimeMillis() / 1000.0d, x0.e(new Pair("events", arrayList2), new Pair("count", Integer.valueOf(arrayList.size())), new Pair("code", Integer.valueOf(i11)), new Pair(InAppMessageBase.MESSAGE, str)))));
                } else {
                    lVar.f32516r.h(new of.c("analytics.events.sent", arrayList.size()));
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pf.a aVar = (pf.a) it2.next();
            String str3 = aVar.f34739f;
            if (str3 != null) {
                i12 = i11;
                str2 = str;
                f0.B(this.f41119c, this.f41120d, null, new os.c(this, str3, aVar, i12, str2, (x70.c) null), 2);
            } else {
                i12 = i11;
                str2 = str;
            }
            i11 = i12;
            str = str2;
        }
    }
}
