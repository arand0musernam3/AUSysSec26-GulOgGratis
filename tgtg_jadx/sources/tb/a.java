package tb;

import gt.e;
import gt.u;
import ib.w;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o00.x0;
import qb.f;
import qb.g;
import qb.h;
import qb.j;
import qb.o;
import qb.s;
import qb.y;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39919a = w.f("DiagnosticsWrkr");

    public static final String a(j jVar, y yVar, g gVar, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            h hVarV = wd.a.v(oVar);
            String str = oVar.f36828a;
            gVar.getClass();
            String str2 = hVarV.f36799a;
            int i11 = hVarV.f36800b;
            str2.getClass();
            f fVar = (f) x0.A(gVar.f36797a, true, false, new u(str2, i11, 1));
            Integer numValueOf = fVar != null ? Integer.valueOf(fVar.f36796c) : null;
            jVar.getClass();
            str.getClass();
            String strU = CollectionsKt.U((List) x0.A(jVar.f36803a, true, false, new e(str, 26)), MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
            yVar.getClass();
            String strU2 = CollectionsKt.U((List) x0.A(yVar.f36875a, true, false, new s(str, 8)), MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
            StringBuilder sbS = e0.f.s("\n", str, "\t ");
            sbS.append(oVar.f36830c);
            sbS.append("\t ");
            sbS.append(numValueOf);
            sbS.append("\t ");
            sbS.append(oVar.f36829b.name());
            sbS.append("\t ");
            sbS.append(strU);
            sbS.append("\t ");
            sbS.append(strU2);
            sbS.append('\t');
            sb2.append(sbS.toString());
        }
        return sb2.toString();
    }
}
