package s90;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.text.Regex;
import okhttp3.internal.http2.ConnectionShutdownException;
import q90.d0;
import q90.g0;
import q90.n0;
import q90.p0;
import q90.q;
import q90.x;
import u90.n;
import u90.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38911a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38912b;

    public b(q qVar) {
        qVar.getClass();
        this.f38912b = qVar;
    }

    public static int c(p0 p0Var, int i11) {
        String strE = p0.e("Retry-After", p0Var);
        if (strE == null) {
            return i11;
        }
        if (!new Regex("\\d+").e(strE)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strE);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q90.g0 a(q90.p0 r12, e20.a r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.b.a(q90.p0, e20.a):q90.g0");
    }

    public boolean b(IOException iOException, n nVar, g0 g0Var) {
        n0 n0Var;
        boolean z11 = iOException instanceof ConnectionShutdownException;
        if (!((d0) this.f38912b).f36467e) {
            return false;
        }
        if ((!z11 && (((n0Var = g0Var.f36508d) != null && n0Var.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z11) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        e20.a aVar = nVar.f40939r;
        if (aVar == null || !aVar.f15578b) {
            return false;
        }
        u90.g gVar = nVar.f40930h;
        gVar.getClass();
        u uVarB = gVar.b();
        e20.a aVar2 = nVar.f40939r;
        return ((u90.q) uVarB).a(aVar2 != null ? aVar2.e() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v46 u90.q, still in use, count: 2, list:
          (r0v46 u90.q) from 0x0076: MOVE (r45v1 u90.q) = (r0v46 u90.q) (LINE:119)
          (r0v46 u90.q) from 0x0062: MOVE (r45v3 u90.q) = (r0v46 u90.q) (LINE:99)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // q90.x
    public final q90.p0 intercept(q90.w r45) {
        /*
            Method dump skipped, instruction units count: 2340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.b.intercept(q90.w):q90.p0");
    }

    public b(q90.f fVar) {
        this.f38912b = fVar;
    }

    public b(d0 d0Var) {
        d0Var.getClass();
        this.f38912b = d0Var;
    }
}
