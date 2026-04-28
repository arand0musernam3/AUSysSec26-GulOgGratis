package r90;

import ia0.i;
import ia0.j;
import ia0.j0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.n0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import q90.d0;
import q90.p0;
import q90.t;
import q90.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f37815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37816b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f37815a = timeZone;
        f37816b = StringsKt.O(StringsKt.N(d0.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(v vVar, v vVar2) {
        vVar.getClass();
        vVar2.getClass();
        return Intrinsics.areEqual(vVar.f36626d, vVar2.f36626d) && vVar.f36627e == vVar2.f36627e && Intrinsics.areEqual(vVar.f36623a, vVar2.f36623a);
    }

    public static final int b(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j9 < 0) {
            e40.a.g("timeout < 0");
            return 0;
        }
        long millis = timeUnit.toMillis(j9);
        if (millis > 2147483647L) {
            i4.a.i("timeout too large");
            return 0;
        }
        if (millis != 0 || j9 <= 0) {
            return (int) millis;
        }
        i4.a.i("timeout too small");
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(p0 p0Var) {
        String strB = p0Var.f36587f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = e.f37811a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(i iVar, Charset charset) {
        iVar.getClass();
        charset.getClass();
        int iU = iVar.U(e.f37812b);
        if (iU == -1) {
            return charset;
        }
        if (iU == 0) {
            return Charsets.UTF_8;
        }
        if (iU == 1) {
            return Charsets.f26578b;
        }
        if (iU == 2) {
            Charsets.f26577a.getClass();
            Charset charset2 = Charsets.f26582f;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            Charsets.f26582f = charsetForName;
            return charsetForName;
        }
        if (iU == 3) {
            return Charsets.f26579c;
        }
        if (iU != 4) {
            throw new AssertionError();
        }
        Charsets.f26577a.getClass();
        Charset charset3 = Charsets.f26583g;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        Charsets.f26583g = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(j0 j0Var, int i11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = j0Var.i().e() ? j0Var.i().c() - jNanoTime : Long.MAX_VALUE;
        j0Var.i().d(Math.min(jC, timeUnit.toNanos(i11)) + jNanoTime);
        try {
            ia0.g gVar = new ia0.g();
            while (j0Var.F(gVar, 8192L) != -1) {
                gVar.a();
            }
            if (jC == LongCompanionObject.MAX_VALUE) {
                j0Var.i().a();
                return true;
            }
            j0Var.i().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                j0Var.i().a();
                return false;
            }
            j0Var.i().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                j0Var.i().a();
            } else {
                j0Var.i().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final t h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x90.d dVar = (x90.d) it.next();
            j jVar = dVar.f44095a;
            j jVar2 = dVar.f44096b;
            String strS = jVar.s();
            String strS2 = jVar2.s();
            arrayList.add(strS);
            arrayList.add(StringsKt.e0(strS2).toString());
        }
        return new t((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(v vVar, boolean z11) {
        vVar.getClass();
        String strG = vVar.f36626d;
        int i11 = vVar.f36627e;
        if (StringsKt.z(strG, ":", false)) {
            strG = e0.f.g(']', "[", strG);
        }
        if (!z11) {
            String str = vVar.f36623a;
            str.getClass();
            if (i11 == (Intrinsics.areEqual(str, "http") ? 80 : Intrinsics.areEqual(str, "https") ? 443 : -1)) {
                return strG;
            }
        }
        return strG + ':' + i11;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return n0.f26529a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(x.c(array));
        listUnmodifiableList.getClass();
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return n0.f26529a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(x.c((Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
