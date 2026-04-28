package ga0;

import ia0.d0;
import ia0.t;
import j4.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.i f20314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ia0.g f20324k;
    public final ia0.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f20325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f20326n;

    public j(ia0.i iVar, i iVar2, boolean z11, boolean z12) {
        iVar.getClass();
        this.f20314a = iVar;
        this.f20315b = iVar2;
        this.f20316c = z11;
        this.f20317d = z12;
        this.f20324k = new ia0.g();
        this.l = new ia0.g();
        this.f20326n = null;
    }

    public final void a() throws IOException {
        g();
        if (this.f20322i) {
            e();
            return;
        }
        int i11 = this.f20319f;
        if (i11 != 1 && i11 != 2) {
            TimeZone timeZone = r90.g.f37815a;
            String hexString = Integer.toHexString(i11);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.f20318e) {
            long j9 = this.f20320g;
            ia0.g gVar = this.l;
            if (j9 > 0) {
                this.f20314a.l0(gVar, j9);
            }
            if (this.f20321h) {
                if (this.f20323j) {
                    a aVar = this.f20325m;
                    if (aVar == null) {
                        aVar = new a(this.f20317d, 1);
                        this.f20325m = aVar;
                    }
                    ia0.g gVar2 = aVar.f20273c;
                    if (gVar2.f23643b != 0) {
                        i4.a.f("Failed requirement.");
                        return;
                    }
                    Inflater inflater = (Inflater) aVar.f20274d;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        aVar.f20274d = inflater;
                    }
                    t tVar = (t) aVar.f20275e;
                    if (tVar == null) {
                        tVar = new t(new d0(gVar2), inflater);
                        aVar.f20275e = tVar;
                    }
                    if (aVar.f20272b) {
                        inflater.reset();
                    }
                    gVar2.b0(gVar);
                    gVar2.C0(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    long bytesRead = inflater.getBytesRead() + gVar2.f23643b;
                    do {
                        tVar.a(gVar, LongCompanionObject.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        gVar2.a();
                        tVar.close();
                        aVar.f20275e = null;
                        aVar.f20274d = null;
                    }
                }
                i iVar = this.f20315b;
                if (i11 == 1) {
                    g gVar3 = (g) iVar;
                    gVar3.f20286a.onMessage(gVar3, gVar.g0());
                    return;
                } else {
                    ia0.j jVarQ = gVar.q(gVar.f23643b);
                    g gVar4 = (g) iVar;
                    jVarQ.getClass();
                    gVar4.f20286a.onMessage(gVar4, jVarQ);
                    return;
                }
            }
            while (!this.f20318e) {
                g();
                if (!this.f20322i) {
                    break;
                } else {
                    e();
                }
            }
            if (this.f20319f != 0) {
                int i12 = this.f20319f;
                TimeZone timeZone2 = r90.g.f37815a;
                String hexString2 = Integer.toHexString(i12);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        i4.a.k("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f20325m;
        if (aVar != null) {
            r90.e.b(aVar);
        }
        r90.e.b(this.f20314a);
    }

    public final void e() throws ProtocolException, EOFException {
        String strG0;
        short s7;
        long j9 = this.f20320g;
        if (j9 > 0) {
            this.f20314a.l0(this.f20324k, j9);
        }
        switch (this.f20319f) {
            case 8:
                ia0.g gVar = this.f20324k;
                long j11 = gVar.f23643b;
                if (j11 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j11 != 0) {
                    s7 = gVar.readShort();
                    strG0 = this.f20324k.g0();
                    String strF = (s7 < 1000 || s7 >= 5000) ? s.f(s7, "Code must be in range [1000,5000): ") : ((1004 > s7 || s7 >= 1007) && (1015 > s7 || s7 >= 3000)) ? null : r8.k.h(s7, "Code ", " is reserved and may not be used.");
                    if (strF != null) {
                        throw new ProtocolException(strF);
                    }
                } else {
                    strG0 = "";
                    s7 = 1005;
                }
                g gVar2 = (g) this.f20315b;
                if (s7 == -1) {
                    i4.a.f("Failed requirement.");
                    return;
                }
                synchronized (gVar2) {
                    if (gVar2.f20303s != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    gVar2.f20303s = s7;
                    gVar2.f20304t = strG0;
                }
                gVar2.f20286a.onClosing(gVar2, s7, strG0);
                this.f20318e = true;
                return;
            case 9:
                i iVar = this.f20315b;
                ia0.g gVar3 = this.f20324k;
                ia0.j jVarQ = gVar3.q(gVar3.f23643b);
                g gVar4 = (g) iVar;
                synchronized (gVar4) {
                    try {
                        jVarQ.getClass();
                        if (!gVar4.f20305u && (!gVar4.f20302r || !gVar4.f20300p.isEmpty())) {
                            gVar4.f20299o.add(jVarQ);
                            gVar4.e();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                i iVar2 = this.f20315b;
                ia0.g gVar5 = this.f20324k;
                ia0.j jVarQ2 = gVar5.q(gVar5.f23643b);
                g gVar6 = (g) iVar2;
                synchronized (gVar6) {
                    jVarQ2.getClass();
                    gVar6.f20307w = false;
                }
                return;
            default:
                int i11 = this.f20319f;
                TimeZone timeZone = r90.g.f37815a;
                String hexString = Integer.toHexString(i11);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void g() throws IOException {
        boolean z11;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f20318e) {
            i4.a.k("closed");
            return;
        }
        ia0.i iVar = this.f20314a;
        long jH = iVar.i().h();
        iVar.i().b();
        try {
            byte b8 = iVar.readByte();
            byte[] bArr = r90.e.f37811a;
            iVar.i().g(jH, timeUnit);
            int i11 = b8 & 15;
            this.f20319f = i11;
            boolean z12 = (b8 & ByteCompanionObject.MIN_VALUE) != 0;
            this.f20321h = z12;
            boolean z13 = (b8 & 8) != 0;
            this.f20322i = z13;
            if (z13 && !z12) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z14 = (b8 & 64) != 0;
            if (i11 == 1 || i11 == 2) {
                if (!z14) {
                    z11 = false;
                } else {
                    if (!this.f20316c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z11 = true;
                }
                this.f20323j = z11;
            } else if (z14) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b8 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b8 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b11 = iVar.readByte();
            boolean z15 = (b11 & ByteCompanionObject.MIN_VALUE) != 0;
            if (z15) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j9 = b11 & ByteCompanionObject.MAX_VALUE;
            this.f20320g = j9;
            if (j9 == 126) {
                this.f20320g = iVar.readShort() & HPKE.aead_EXPORT_ONLY;
            } else if (j9 == 127) {
                long j11 = iVar.readLong();
                this.f20320g = j11;
                if (j11 < 0) {
                    long j12 = this.f20320g;
                    TimeZone timeZone = r90.g.f37815a;
                    String hexString = Long.toHexString(j12);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f20322i && this.f20320g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z15) {
                byte[] bArr2 = this.f20326n;
                bArr2.getClass();
                iVar.readFully(bArr2);
            }
        } catch (Throwable th2) {
            iVar.i().g(jH, timeUnit);
            throw th2;
        }
    }
}
