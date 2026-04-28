package zendesk.faye.internal;

import androidx.lifecycle.n1;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import dn.k;
import ga0.e;
import ga0.g;
import i4.a;
import ia0.j;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.c0;
import q90.d0;
import q90.f0;
import q90.g0;
import q90.w0;
import q90.x0;
import qc.y;
import r40.d;
import u90.n;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lzendesk/faye/internal/OkHttpWebSocket;", "", "Lq90/d0;", "client", "<init>", "(Lq90/d0;)V", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "Lq90/x0;", "listener", "", "connectTo", "(Ljava/lang/String;Lq90/x0;)Z", "disconnect", "()Z", InAppMessageBase.MESSAGE, "send", "(Ljava/lang/String;)Z", "", "resetSocket", "()V", "Lq90/d0;", "Lq90/w0;", "socket", "Lq90/w0;", "Companion", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpWebSocket.kt\nzendesk/faye/internal/OkHttpWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class OkHttpWebSocket {
    private static final int CLOSE_CODE_NORMAL = 1000;

    @NotNull
    private static final String LOG_TAG = "OkHttpWebSocket";

    @NotNull
    private final d0 client;

    @Nullable
    private w0 socket;

    public OkHttpWebSocket(@NotNull d0 d0Var) {
        d0Var.getClass();
        this.client = d0Var;
    }

    public final boolean connectTo(@NotNull String url, @NotNull x0 listener) {
        url.getClass();
        listener.getClass();
        if (this.socket != null) {
            Logger.w(LOG_TAG, "connectTo was called but socket was not null", new Object[0]);
            return false;
        }
        n1 n1Var = new n1();
        n1Var.D(url);
        g0 g0Var = new g0(n1Var);
        d0 d0Var = this.client;
        d0Var.getClass();
        long j9 = d0Var.B;
        int i11 = d0Var.A;
        g gVar = new g(d0Var.D, g0Var, listener, new Random(), 0, j9, i11);
        if (g0Var.f36507c.b("Sec-WebSocket-Extensions") != null) {
            g.c(gVar, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
        } else {
            c0 c0Var = new c0();
            c0Var.f36427a = d0Var.f36463a;
            c0Var.f36428b = d0Var.E;
            i0.s(d0Var.f36464b, c0Var.f36429c);
            i0.s(d0Var.f36465c, c0Var.f36430d);
            c0Var.f36432f = d0Var.f36467e;
            c0Var.f36433g = d0Var.f36468f;
            c0Var.f36434h = d0Var.f36469g;
            c0Var.f36435i = d0Var.f36470h;
            c0Var.f36436j = d0Var.f36471i;
            c0Var.f36437k = d0Var.f36472j;
            c0Var.l = d0Var.f36473k;
            c0Var.f36438m = d0Var.l;
            c0Var.f36439n = d0Var.f36474m;
            c0Var.f36440o = d0Var.f36475n;
            c0Var.f36441p = d0Var.f36476o;
            c0Var.f36442q = d0Var.f36477p;
            c0Var.f36443r = d0Var.f36478q;
            c0Var.f36444s = d0Var.f36479r;
            c0Var.f36445t = d0Var.f36480s;
            c0Var.f36446u = d0Var.f36481t;
            c0Var.f36447v = d0Var.f36482u;
            c0Var.f36448w = d0Var.f36483v;
            c0Var.f36449x = d0Var.f36484w;
            c0Var.f36450y = d0Var.f36485x;
            c0Var.f36451z = d0Var.f36486y;
            c0Var.A = d0Var.f36487z;
            c0Var.B = i11;
            c0Var.C = d0Var.B;
            c0Var.D = d0Var.C;
            c0Var.E = d0Var.D;
            c0Var.f36431e = new y(4);
            List list = g.f20285x;
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            f0 f0Var = f0.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(f0Var) && !arrayList.contains(f0.HTTP_1_1)) {
                a.j(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return false;
            }
            if (arrayList.contains(f0Var) && arrayList.size() > 1) {
                a.j(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return false;
            }
            if (arrayList.contains(f0.HTTP_1_0)) {
                a.j(arrayList, "protocols must not contain http/1.0: ");
                return false;
            }
            if (arrayList.contains(null)) {
                a.f("protocols must not contain null");
                return false;
            }
            arrayList.remove(f0.SPDY_3);
            if (!Intrinsics.areEqual(arrayList, c0Var.f36445t)) {
                c0Var.D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            c0Var.f36445t = listUnmodifiableList;
            d0 d0Var2 = new d0(c0Var);
            n1 n1VarB = g0Var.b();
            n1VarB.u("Upgrade", "websocket");
            n1VarB.u("Connection", "Upgrade");
            n1VarB.u("Sec-WebSocket-Key", gVar.f20292g);
            n1VarB.u("Sec-WebSocket-Version", "13");
            n1VarB.u("Sec-WebSocket-Extensions", "permessage-deflate");
            g0 g0Var2 = new g0(n1VarB);
            n nVar = new n(d0Var2, g0Var2, true);
            gVar.f20293h = nVar;
            nVar.d(new k(12, gVar, g0Var2));
        }
        this.socket = gVar;
        return true;
    }

    public final boolean disconnect() {
        boolean zB;
        w0 w0Var = this.socket;
        if (w0Var != null) {
            zB = ((g) w0Var).b(1000, null);
        } else {
            Logger.w(LOG_TAG, "disconnect was called but socket was null", new Object[0]);
            zB = false;
        }
        if (zB) {
            resetSocket();
        }
        return zB;
    }

    public final void resetSocket() {
        this.socket = null;
    }

    public final boolean send(@NotNull String message) {
        message.getClass();
        w0 w0Var = this.socket;
        if (w0Var == null) {
            Logger.w(LOG_TAG, "send was called but socket was null", new Object[0]);
            return false;
        }
        g gVar = (g) w0Var;
        j jVar = j.f23646d;
        j jVarP = d.p(message);
        synchronized (gVar) {
            if (!gVar.f20305u && !gVar.f20302r) {
                long j9 = gVar.f20301q;
                byte[] bArr = jVarP.f23647a;
                if (((long) bArr.length) + j9 > 16777216) {
                    gVar.b(AppConstants.RESULT_CODE_SUPPORT_MSG_SENT, null);
                    return false;
                }
                gVar.f20301q = j9 + ((long) bArr.length);
                gVar.f20300p.add(new e(jVarP));
                gVar.e();
                return true;
            }
            return false;
        }
    }
}
