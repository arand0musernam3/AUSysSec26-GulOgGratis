package x90;

import ia0.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f44170d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.i f44171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f44172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f44173c;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        logger.getClass();
        f44170d = logger;
    }

    public r(ia0.i iVar) {
        iVar.getClass();
        this.f44171a = iVar;
        q qVar = new q(iVar);
        this.f44172b = qVar;
        this.f44173c = new e(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0234, code lost:
    
        i4.a.k(j4.s.f(r10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r19, x90.m r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.r.a(boolean, x90.m):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f44171a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r21 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r9.i(q90.t.f36613b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(x90.m r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.r.e(x90.m, int, int, int):void");
    }

    public final List g(int i11, int i12, int i13, int i14) throws IOException {
        q qVar = this.f44172b;
        qVar.f44168e = i11;
        qVar.f44165b = i11;
        qVar.f44169f = i12;
        qVar.f44166c = i13;
        qVar.f44167d = i14;
        e eVar = this.f44173c;
        d0 d0Var = eVar.f44100c;
        ArrayList arrayList = eVar.f44099b;
        while (!d0Var.a()) {
            byte b8 = d0Var.readByte();
            byte[] bArr = r90.e.f37811a;
            int i15 = b8 & 255;
            if (i15 == 128) {
                i4.a.k("index == 0");
                return null;
            }
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 128) {
                int iE = eVar.e(i15, 127);
                int i16 = iE - 1;
                if (i16 >= 0) {
                    d[] dVarArr = g.f44113a;
                    if (i16 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i16]);
                    }
                }
                int length = eVar.f44102e + 1 + (i16 - g.f44113a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f44101d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        dVar.getClass();
                        arrayList.add(dVar);
                    }
                }
                i4.a.k(j4.s.f(iE, "Header index too large "));
                return null;
            }
            if (i15 == 64) {
                d[] dVarArr3 = g.f44113a;
                ia0.j jVarD = eVar.d();
                g.a(jVarD);
                eVar.c(new d(jVarD, eVar.d()));
            } else if ((b8 & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i15, 63) - 1), eVar.d()));
            } else if ((b8 & 32) == 32) {
                int iE2 = eVar.e(i15, 31);
                eVar.f44098a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    wy.o.e(eVar.f44098a, "Invalid dynamic table size update ");
                    return null;
                }
                int i17 = eVar.f44104g;
                if (iE2 < i17) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.f44101d;
                        kotlin.collections.x.m(dVarArr4, 0, dVarArr4.length, null);
                        eVar.f44102e = eVar.f44101d.length - 1;
                        eVar.f44103f = 0;
                        eVar.f44104g = 0;
                    } else {
                        eVar.a(i17 - iE2);
                    }
                }
            } else if (i15 == 16 || i15 == 0) {
                d[] dVarArr5 = g.f44113a;
                ia0.j jVarD2 = eVar.d();
                g.a(jVarD2);
                arrayList.add(new d(jVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i15, 15) - 1), eVar.d()));
            }
        }
        List listR0 = CollectionsKt.r0(arrayList);
        arrayList.clear();
        return listR0;
    }

    public final void p(m mVar, int i11, int i12, int i13) throws Throwable {
        boolean z11;
        int i14;
        int i15;
        if (i13 == 0) {
            i4.a.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z12 = false;
        boolean z13 = true;
        if ((i12 & 1) != 0) {
            z11 = true;
        } else {
            z11 = true;
            z13 = false;
        }
        if ((i12 & 8) != 0) {
            byte b8 = this.f44171a.readByte();
            byte[] bArr = r90.e.f37811a;
            i14 = b8 & 255;
        } else {
            i14 = 0;
        }
        if ((i12 & 32) != 0) {
            ia0.i iVar = this.f44171a;
            iVar.readInt();
            iVar.readByte();
            byte[] bArr2 = r90.e.f37811a;
            i15 = i11 - 5;
        } else {
            i15 = i11;
        }
        List listG = g(p.a(i15, i12, i14), i14, i12, i13);
        listG.getClass();
        n nVar = mVar.f44130b;
        if (i13 != 0 && (i13 & 1) == 0) {
            z12 = z11;
        }
        if (z12) {
            t90.c.b(nVar.f44140i, nVar.f44134c + '[' + i13 + "] onHeaders", 0L, new j(nVar, i13, listG, z13), 6);
            return;
        }
        synchronized (nVar) {
            try {
                v vVarE = nVar.e(i13);
                if (vVarE != null) {
                    vVarE.i(r90.g.h(listG), z13);
                    return;
                }
                if (nVar.f44137f) {
                    return;
                }
                if (i13 <= nVar.f44135d) {
                    return;
                }
                if (i13 % 2 == nVar.f44136e % 2) {
                    return;
                }
                try {
                    v vVar = new v(i13, nVar, false, z13, r90.g.h(listG));
                    nVar.f44135d = i13;
                    nVar.f44133b.put(Integer.valueOf(i13), vVar);
                    t90.c.b(nVar.f44138g.d(), nVar.f44134c + '[' + i13 + "] onStream", 0L, new us.j(15, nVar, vVar), 6);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    nVar = nVar;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void r(m mVar, int i11, int i12, int i13) throws IOException {
        int i14;
        if (i13 == 0) {
            i4.a.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i12 & 8) != 0) {
            byte b8 = this.f44171a.readByte();
            byte[] bArr = r90.e.f37811a;
            i14 = b8 & 255;
        } else {
            i14 = 0;
        }
        int i15 = this.f44171a.readInt() & Integer.MAX_VALUE;
        List listG = g(p.a(i11 - 4, i12, i14), i14, i12, i13);
        listG.getClass();
        n nVar = mVar.f44130b;
        synchronized (nVar) {
            if (nVar.f44155y.contains(Integer.valueOf(i15))) {
                nVar.u(i15, b.PROTOCOL_ERROR);
                return;
            }
            nVar.f44155y.add(Integer.valueOf(i15));
            t90.c.b(nVar.f44140i, nVar.f44134c + '[' + i15 + "] onRequest", 0L, new j(nVar, i15, listG), 6);
        }
    }
}
