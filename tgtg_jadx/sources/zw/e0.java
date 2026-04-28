package zw;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 extends n1 implements l1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f48181h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f48182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f48183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f48184k;
    public String l;

    @Override // zw.l1
    public final List getChildren() {
        return this.f48181h;
    }

    @Override // zw.l1
    public final void k(p1 p1Var) throws SVGParseException {
        if (p1Var instanceof x0) {
            this.f48181h.add(p1Var);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + p1Var + " elements.");
    }
}
