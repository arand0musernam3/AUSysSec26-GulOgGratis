package ae;

import coil3.request.NullRequestDataException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final td.d a(td.i iVar, Throwable th2) {
        fd.l lVar;
        if (th2 instanceof NullRequestDataException) {
            Function1 function1 = iVar.f40009o;
            td.f fVar = iVar.f40015u;
            lVar = (fd.l) function1.invoke(iVar);
            if (lVar == null) {
                lVar = (fd.l) fVar.f39983j.invoke(iVar);
            }
            if (lVar == null && (lVar = (fd.l) iVar.f40008n.invoke(iVar)) == null) {
                lVar = (fd.l) fVar.f39982i.invoke(iVar);
            }
        } else {
            lVar = (fd.l) iVar.f40008n.invoke(iVar);
            if (lVar == null) {
                lVar = (fd.l) iVar.f40015u.f39982i.invoke(iVar);
            }
        }
        return new td.d(lVar, iVar, th2);
    }
}
