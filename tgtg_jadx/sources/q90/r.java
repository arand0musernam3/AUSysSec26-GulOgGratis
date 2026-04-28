package q90;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f36602c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36604b;

    static {
        Regex regex = z.f36633e;
        f36602c = y.a("application/x-www-form-urlencoded");
    }

    public r(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f36603a = r90.g.j(arrayList);
        this.f36604b = r90.g.j(arrayList2);
    }

    public final long a(ia0.h hVar, boolean z11) throws EOFException {
        ia0.g gVarH;
        if (z11) {
            gVarH = new ia0.g();
        } else {
            hVar.getClass();
            gVarH = hVar.h();
        }
        List list = this.f36603a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                gVarH.z0(38);
            }
            gVarH.F0((String) list.get(i11));
            gVarH.z0(61);
            gVarH.F0((String) this.f36604b.get(i11));
        }
        if (!z11) {
            return 0L;
        }
        long j9 = gVarH.f23643b;
        gVarH.a();
        return j9;
    }

    @Override // q90.n0
    public final long contentLength() {
        return a(null, true);
    }

    @Override // q90.n0
    public final z contentType() {
        return f36602c;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) throws EOFException {
        a(hVar, false);
    }
}
