package j6;

import androidx.constraintlayout.core.parser.CLParsingException;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f24739e;

    public b(char[] cArr) {
        super(cArr);
        this.f24739e = new ArrayList();
    }

    public final void A(String str, c cVar) {
        Iterator it = this.f24739e.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.c().equals(str)) {
                int size = dVar.f24739e.size();
                ArrayList arrayList = dVar.f24739e;
                if (size > 0) {
                    arrayList.set(0, cVar);
                    return;
                } else {
                    arrayList.add(cVar);
                    return;
                }
            }
        }
        d dVar2 = new d(str.toCharArray());
        dVar2.f24741b = 0L;
        long length = str.length() - 1;
        if (dVar2.f24742c == LongCompanionObject.MAX_VALUE) {
            dVar2.f24742c = length;
            b bVar = dVar2.f24743d;
            if (bVar != null) {
                bVar.j(dVar2);
            }
        }
        int size2 = dVar2.f24739e.size();
        ArrayList arrayList2 = dVar2.f24739e;
        if (size2 > 0) {
            arrayList2.set(0, cVar);
        } else {
            arrayList2.add(cVar);
        }
        this.f24739e.add(dVar2);
    }

    @Override // j6.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f24739e.equals(((b) obj).f24739e);
        }
        return false;
    }

    @Override // j6.c
    public int hashCode() {
        return Objects.hash(this.f24739e, Integer.valueOf(super.hashCode()));
    }

    public final void j(c cVar) {
        this.f24739e.add(cVar);
    }

    @Override // j6.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.clone();
        ArrayList arrayList = new ArrayList(this.f24739e.size());
        Iterator it = this.f24739e.iterator();
        while (it.hasNext()) {
            c cVarClone = ((c) it.next()).clone();
            cVarClone.f24743d = bVar;
            arrayList.add(cVarClone);
        }
        bVar.f24739e = arrayList;
        return bVar;
    }

    public final c m(int i11) {
        if (i11 < 0 || i11 >= this.f24739e.size()) {
            throw new CLParsingException(s.f(i11, "no element at index "), this);
        }
        return (c) this.f24739e.get(i11);
    }

    public final c n(String str) {
        Iterator it = this.f24739e.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.c().equals(str)) {
                if (dVar.f24739e.size() > 0) {
                    return (c) dVar.f24739e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(a0.p("no element for key <", str, ">"), this);
    }

    public final float o(int i11) {
        c cVarM = m(i11);
        if (cVarM != null) {
            return cVarM.d();
        }
        throw new CLParsingException(s.f(i11, "no float at index "), this);
    }

    public final float q(String str) {
        c cVarN = n(str);
        if (cVarN != null) {
            return cVarN.d();
        }
        StringBuilder sbS = e0.f.s("no float found for key <", str, ">, found [");
        sbS.append(cVarN.i());
        sbS.append("] : ");
        sbS.append(cVarN);
        throw new CLParsingException(sbS.toString(), this);
    }

    public final int s(int i11) throws CLParsingException {
        c cVarM = m(i11);
        if (cVarM != null) {
            return cVarM.h();
        }
        throw new CLParsingException(s.f(i11, "no int at index "), this);
    }

    public final c t(int i11) {
        if (i11 < 0 || i11 >= this.f24739e.size()) {
            return null;
        }
        return (c) this.f24739e.get(i11);
    }

    @Override // j6.c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c cVar : this.f24739e) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public final c u(String str) {
        Iterator it = this.f24739e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d dVar = (d) ((c) it.next());
            if (dVar.c().equals(str)) {
                if (dVar.f24739e.size() > 0) {
                    return (c) dVar.f24739e.get(0);
                }
            }
        }
        return null;
    }

    public final String v(int i11) {
        c cVarM = m(i11);
        if (cVarM instanceof g) {
            return cVarM.c();
        }
        throw new CLParsingException(s.f(i11, "no string at index "), this);
    }

    public final String w(String str) {
        c cVarN = n(str);
        if (cVarN instanceof g) {
            return cVarN.c();
        }
        StringBuilder sbT = e0.f.t("no string found for key <", str, ">, found [", cVarN != null ? cVarN.i() : null, "] : ");
        sbT.append(cVarN);
        throw new CLParsingException(sbT.toString(), this);
    }

    public final String x(String str) {
        c cVarU = u(str);
        if (cVarU instanceof g) {
            return cVarU.c();
        }
        return null;
    }

    public final boolean y(String str) {
        for (c cVar : this.f24739e) {
            if ((cVar instanceof d) && ((d) cVar).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList z() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f24739e) {
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).c());
            }
        }
        return arrayList;
    }
}
