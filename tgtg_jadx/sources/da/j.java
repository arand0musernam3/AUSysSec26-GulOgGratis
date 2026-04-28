package da;

import a60.r;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final List a(ha.c cVar) {
        int iN = p30.b.n(cVar, "id");
        int iN2 = p30.b.n(cVar, "seq");
        int iN3 = p30.b.n(cVar, "from");
        int iN4 = p30.b.n(cVar, "to");
        v70.e eVarB = c0.b();
        while (cVar.q0()) {
            eVarB.add(new i(cVar.W(iN3), (int) cVar.getLong(iN), (int) cVar.getLong(iN2), cVar.W(iN4)));
        }
        return CollectionsKt.k0(c0.a(eVarB));
    }

    public static final m b(ha.a aVar, String str, boolean z11) {
        ha.c cVarV0 = aVar.v0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iN = p30.b.n(cVarV0, "seqno");
            int iN2 = p30.b.n(cVarV0, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            int iN3 = p30.b.n(cVarV0, "name");
            int iN4 = p30.b.n(cVarV0, "desc");
            if (iN != -1 && iN2 != -1 && iN3 != -1 && iN4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarV0.q0()) {
                    if (((int) cVarV0.getLong(iN2)) >= 0) {
                        int i11 = (int) cVarV0.getLong(iN);
                        String strW = cVarV0.W(iN3);
                        String str2 = cVarV0.getLong(iN4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i11), strW);
                        linkedHashMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                List listL0 = CollectionsKt.l0(linkedHashMap.entrySet(), new r(2));
                ArrayList arrayList = new ArrayList(e0.o(listL0, 10));
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listR0 = CollectionsKt.r0(arrayList);
                List listL02 = CollectionsKt.l0(linkedHashMap2.entrySet(), new r(3));
                ArrayList arrayList2 = new ArrayList(e0.o(listL02, 10));
                Iterator it2 = listL02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                m mVar = new m(str, z11, listR0, CollectionsKt.r0(arrayList2));
                w.b.y(cVarV0, null);
                return mVar;
            }
            w.b.y(cVarV0, null);
            return null;
        } finally {
        }
    }
}
