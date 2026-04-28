package k00;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f25702b;

    public w0(q qVar) throws zzhf {
        qVar.getClass();
        this.f25702b = qVar;
        b0 b0VarE = qVar.entrySet().e();
        int i11 = 0;
        while (b0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) b0VarE.next();
            int iC = ((y0) entry.getKey()).c();
            i11 = i11 < iC ? iC : i11;
            int iC2 = ((y0) entry.getValue()).c();
            if (i11 < iC2) {
                i11 = iC2;
            }
        }
        int i12 = i11 + 1;
        this.f25701a = i12;
        if (i12 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // k00.y0
    public final int a() {
        return y0.e((byte) -96);
    }

    @Override // k00.y0
    public final int c() {
        return this.f25701a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        y0 y0Var = (y0) obj;
        int iA = y0Var.a();
        int iE = y0.e((byte) -96);
        if (iE != iA) {
            return iE - y0Var.a();
        }
        q qVar = ((w0) y0Var).f25702b;
        q qVar2 = this.f25702b;
        if (qVar2.f25680d.size() != qVar.f25680d.size()) {
            return qVar2.f25680d.size() - qVar.f25680d.size();
        }
        b0 b0VarE = qVar2.entrySet().e();
        b0 b0VarE2 = qVar.entrySet().e();
        do {
            if (!b0VarE.hasNext() && !b0VarE2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) b0VarE.next();
            Map.Entry entry2 = (Map.Entry) b0VarE2.next();
            int iCompareTo2 = ((y0) entry.getKey()).compareTo((y0) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((y0) entry.getValue()).compareTo((y0) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            return this.f25702b.equals(((w0) obj).f25702b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y0.e((byte) -96)), this.f25702b});
    }

    public final String toString() {
        q qVar = this.f25702b;
        if (qVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b0 b0VarE = qVar.entrySet().e();
        while (b0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) b0VarE.next();
            linkedHashMap.put(((y0) entry.getKey()).toString().replace("\n", "\n  "), ((y0) entry.getValue()).toString().replace("\n", "\n  "));
        }
        qb.e eVar = new qb.e();
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), eVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }
}
