package zw;

import com.caverock.androidsvg.SVGParseException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a2 extends k1 {
    @Override // zw.k1, zw.l1
    public final void k(p1 p1Var) throws SVGParseException {
        if (p1Var instanceof z1) {
            this.f48263i.add(p1Var);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + p1Var + " elements.");
    }
}
