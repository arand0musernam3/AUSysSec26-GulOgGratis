package k00;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f25690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25691b;

    public s0(w wVar) throws zzhf {
        wVar.getClass();
        this.f25690a = wVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            l lVar = this.f25690a;
            if (i11 >= lVar.size()) {
                break;
            }
            int iC = ((y0) lVar.get(i11)).c();
            if (i12 < iC) {
                i12 = iC;
            }
            i11++;
        }
        int i13 = i12 + 1;
        this.f25691b = i13;
        if (i13 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // k00.y0
    public final int a() {
        return y0.e(ByteCompanionObject.MIN_VALUE);
    }

    @Override // k00.y0
    public final int c() {
        return this.f25691b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        int iA = y0Var.a();
        int iE = y0.e(ByteCompanionObject.MIN_VALUE);
        if (iE != iA) {
            return iE - y0Var.a();
        }
        l lVar = ((s0) y0Var).f25690a;
        l lVar2 = this.f25690a;
        if (lVar2.size() != lVar.size()) {
            return lVar2.size() - lVar.size();
        }
        for (int i11 = 0; i11 < lVar2.size(); i11++) {
            int iCompareTo = ((y0) lVar2.get(i11)).compareTo((y0) lVar.get(i11));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            return this.f25690a.equals(((s0) obj).f25690a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y0.e(ByteCompanionObject.MIN_VALUE)), this.f25690a});
    }

    public final String toString() {
        l lVar = this.f25690a;
        if (lVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = lVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((y0) lVar.get(i11)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(qb.e.J(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(qb.e.J(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }
}
