package ba0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qb.e f6081e = new qb.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6085d;

    public e(Class cls) throws NoSuchMethodException {
        this.f6082a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f6083b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f6084c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f6085d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ba0.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f6082a.isInstance(sSLSocket);
    }

    @Override // ba0.n
    public final boolean b() {
        boolean z11 = aa0.c.f1188e;
        return aa0.c.f1188e;
    }

    @Override // ba0.n
    public final String c(SSLSocket sSLSocket) {
        if (this.f6082a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f6084c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e5) {
                i4.a.d(e5);
                return null;
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    i4.a.d(e11);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // ba0.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f6082a.isInstance(sSLSocket)) {
            try {
                this.f6083b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f6085d;
                aa0.e eVar = aa0.e.f1191a;
                method.invoke(sSLSocket, qb.e.s(list));
            } catch (IllegalAccessException e5) {
                i4.a.d(e5);
            } catch (InvocationTargetException e11) {
                i4.a.d(e11);
            }
        }
    }
}
