package q90;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f36414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f36415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f36416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f36417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f36418i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.j f36419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f36421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36422d;

    static {
        Regex regex = z.f36633e;
        f36414e = y.a("multipart/mixed");
        y.a("multipart/alternative");
        y.a("multipart/digest");
        y.a("multipart/parallel");
        f36415f = y.a("multipart/form-data");
        f36416g = new byte[]{58, 32};
        f36417h = new byte[]{13, 10};
        f36418i = new byte[]{45, 45};
    }

    public b0(ia0.j jVar, z zVar, List list) {
        jVar.getClass();
        zVar.getClass();
        list.getClass();
        this.f36419a = jVar;
        this.f36420b = list;
        Regex regex = z.f36633e;
        this.f36421c = y.a(zVar + "; boundary=" + jVar.s());
        this.f36422d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ia0.h hVar, boolean z11) throws EOFException {
        ia0.g gVar;
        ia0.h gVar2;
        if (z11) {
            gVar2 = new ia0.g();
            gVar = gVar2;
        } else {
            gVar = 0;
            gVar2 = hVar;
        }
        List list = this.f36420b;
        int size = list.size();
        long j9 = 0;
        int i11 = 0;
        while (true) {
            ia0.j jVar = this.f36419a;
            byte[] bArr = f36418i;
            byte[] bArr2 = f36417h;
            if (i11 >= size) {
                gVar2.getClass();
                gVar2.write(bArr);
                gVar2.o0(jVar);
                gVar2.write(bArr);
                gVar2.write(bArr2);
                if (!z11) {
                    return j9;
                }
                gVar.getClass();
                long j11 = j9 + gVar.f23643b;
                gVar.a();
                return j11;
            }
            a0 a0Var = (a0) list.get(i11);
            t tVar = a0Var.f36411a;
            n0 n0Var = a0Var.f36412b;
            gVar2.getClass();
            gVar2.write(bArr);
            gVar2.o0(jVar);
            gVar2.write(bArr2);
            int size2 = tVar.size();
            for (int i12 = 0; i12 < size2; i12++) {
                gVar2.M(tVar.d(i12)).write(f36416g).M(tVar.g(i12)).write(bArr2);
            }
            z zVarContentType = n0Var.contentType();
            if (zVarContentType != null) {
                gVar2.M("Content-Type: ").M(zVarContentType.f36635a).write(bArr2);
            }
            long jContentLength = n0Var.contentLength();
            if (jContentLength == -1 && z11) {
                gVar.getClass();
                gVar.a();
                return -1L;
            }
            gVar2.write(bArr2);
            if (z11) {
                j9 += jContentLength;
            } else {
                n0Var.writeTo(gVar2);
            }
            gVar2.write(bArr2);
            i11++;
        }
    }

    @Override // q90.n0
    public final long contentLength() throws EOFException {
        long j9 = this.f36422d;
        if (j9 != -1) {
            return j9;
        }
        long jA = a(null, true);
        this.f36422d = jA;
        return jA;
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36421c;
    }

    @Override // q90.n0
    public final boolean isOneShot() {
        List list = this.f36420b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((a0) it.next()).f36412b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) throws EOFException {
        a(hVar, false);
    }
}
