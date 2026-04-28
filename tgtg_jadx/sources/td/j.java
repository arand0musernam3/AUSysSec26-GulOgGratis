package td;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fd.j f40016a = new fd.j(n0.f26529a, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fd.j f40017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fd.j f40018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.j f40019d;

    static {
        dx.f.a(4096);
        ud.a aVar = new ud.a(4096);
        dx.f.a(4096);
        f40017b = new fd.j(new ud.h(aVar, new ud.a(4096)), 0);
        f40018c = new fd.j(Boolean.FALSE, 0);
        f40019d = new fd.j(Boolean.TRUE, 0);
    }

    public static final void a(e eVar, List list) {
        fd.i iVar;
        Object obj = eVar.f39972q;
        if (obj instanceof fd.i) {
            iVar = (fd.i) obj;
        } else {
            if (!(obj instanceof fd.k)) {
                throw new AssertionError();
            }
            fd.i iVar2 = new fd.i((fd.k) obj);
            eVar.f39972q = iVar2;
            iVar = iVar2;
        }
        List listL = android.support.v4.media.session.a.L(list);
        LinkedHashMap linkedHashMap = iVar.f17566a;
        fd.j jVar = f40016a;
        if (listL != null) {
            linkedHashMap.put(jVar, listL);
        } else {
            linkedHashMap.remove(jVar);
        }
        String strU = CollectionsKt.U(list, null, null, null, new sg.c(new Ref.IntRef(), 5), 31);
        Map map = eVar.f39963g;
        if (!Intrinsics.areEqual(map, Boolean.valueOf(eVar.f39962f))) {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            eVar.f39963g = linkedHashMap2;
            eVar.f39962f = true;
            map = linkedHashMap2;
        }
        map.getClass();
        TypeIntrinsics.asMutableMap(map).put("coil#transformations", strU);
    }
}
