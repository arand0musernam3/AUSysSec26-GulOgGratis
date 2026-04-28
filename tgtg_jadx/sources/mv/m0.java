package mv;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f30203a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30204b;

    public m0(int i11) {
        this.f30204b = i11;
    }

    public void a(String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.a(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(3, null, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public void b(Throwable th2) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.b(th2);
                }
                break;
            default:
                g(3, th2, null, new Object[0]);
                break;
        }
    }

    public void c(String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.c(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(6, null, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public void d(Throwable th2) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.d(th2);
                }
                break;
            default:
                g(6, th2, null, new Object[0]);
                break;
        }
    }

    public void e(Throwable th2, String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.e(th2, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(6, th2, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public void f(String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.f(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(4, null, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public final void g(int i11, Throwable th2, String str, Object... objArr) {
        ThreadLocal threadLocal = this.f30203a;
        if (((String) threadLocal.get()) != null) {
            threadLocal.remove();
        }
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) str);
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th2.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                sb2.append(string);
                str = sb2.toString();
            }
        } else {
            if (th2 == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(256);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th2.printStackTrace(printWriter2);
            printWriter2.flush();
            str = stringWriter2.toString();
            str.getClass();
        }
        String str2 = str;
        int i12 = this.f30204b;
        str2.getClass();
        switch (i12) {
            case 0:
                if (i11 != 6 || th2 == null) {
                    return;
                }
                a40.u uVar = w30.b.a().f43095a;
                b40.f fVar = uVar.f790o;
                fVar.f5742a.a(new a40.s(uVar, System.currentTimeMillis() - uVar.f780d, str2, 0));
                Map map = Collections.EMPTY_MAP;
                fVar.f5742a.a(new a40.l(uVar, th2));
                return;
            default:
                throw new AssertionError();
        }
    }

    public void h(String str) {
        m0[] m0VarArr = sa0.a.f38955c;
        int length = m0VarArr.length;
        int i11 = 0;
        while (i11 < length) {
            m0 m0Var = m0VarArr[i11];
            i11++;
            m0Var.f30203a.set(str);
        }
    }

    public void i(String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.i(str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(5, null, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }

    public void j(Throwable th2) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.j(th2);
                }
                break;
            default:
                g(5, th2, null, new Object[0]);
                break;
        }
    }

    public void k(Throwable th2, String str, Object... objArr) {
        switch (this.f30204b) {
            case 1:
                for (m0 m0Var : sa0.a.f38955c) {
                    m0Var.k(th2, str, Arrays.copyOf(objArr, objArr.length));
                }
                break;
            default:
                g(5, th2, str, Arrays.copyOf(objArr, objArr.length));
                break;
        }
    }
}
