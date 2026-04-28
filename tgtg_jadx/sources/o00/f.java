package o00;

import com.google.android.gms.internal.measurement.gf;
import com.google.android.gms.internal.oss_licenses.zzae;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31652b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31653a;

    static {
        new zzae();
    }

    public f(String str, m mVar) {
        this.f31653a = str;
        if (mVar.f31708d == null) {
            Thread.currentThread();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = (m) c.f31631e.get();
        f fVar = mVar.f31706b;
        if (fVar == null) {
            StringBuilder sb2 = new StringBuilder(115);
            sb2.append("Tried to end [<missing root>], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new gf(sb2.toString());
        }
        if (this != fVar) {
            StringBuilder sb3 = new StringBuilder(108);
            sb3.append("Tried to end span <missing root>, but that span is not the current span. The current span is <missing root>.");
            throw new gf(sb3.toString());
        }
        if (mVar.f31708d != null) {
            c.a(mVar, null, 2);
        } else {
            c.a(mVar, null, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02be, code lost:
    
        r11 = r12.f31704d;
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c8, code lost:
    
        if (r11.containsKey(r12) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ca, code lost:
    
        ((o00.l) r1.f12017g).f31704d.put(r12, new o00.l(r4, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d8, code lost:
    
        if (r10 == 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02da, code lost:
    
        r10.f31703c = (o00.l) r1.f12017g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ec, code lost:
    
        if (r10 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ee, code lost:
    
        r10.f31703c = (o00.l) r1.f12017g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f4, code lost:
    
        r1.f12012b = r4;
        r1.f12013c++;
        r1.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0411 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.f.toString():java.lang.String");
    }
}
