package r90;

import ia0.a0;
import ia0.i;
import ia0.j;
import ia0.m;
import ia0.y;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f37811a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f37812b;

    static {
        int i11 = y.f23687d;
        j jVar = j.f23646d;
        f37812b = ia0.b.f(r40.d.n("efbbbf"), r40.d.n("feff"), r40.d.n("fffe0000"), r40.d.n("fffe"), r40.d.n("0000feff"));
    }

    public static final void a(long j9, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j9 || j9 - j11 < j12) {
            StringBuilder sbG = l1.g("length=", j9, ", offset=");
            sbG.append(j11);
            sbG.append(", count=");
            sbG.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbG.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final void c(m mVar, a0 a0Var) throws IOException {
        mVar.getClass();
        try {
            IOException iOException = null;
            for (a0 a0Var2 : mVar.A(a0Var)) {
                try {
                    if (mVar.B(a0Var2).f805c) {
                        c(mVar, a0Var2);
                    }
                    mVar.r(a0Var2);
                } catch (IOException e5) {
                    if (iOException == null) {
                        iOException = e5;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(s90.f fVar, a0 a0Var) {
        fVar.getClass();
        a0Var.getClass();
        try {
            fVar.r(a0Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(String str, char c3, int i11, int i12) {
        str.getClass();
        while (i11 < i12) {
            if (str.charAt(i11) == c3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int f(String str, int i11, int i12, String str2) {
        str.getClass();
        while (i11 < i12) {
            if (StringsKt.A(str2, str.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int g(String str, char c3, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return e(str, c3, i11, i12);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int i(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int j(int i11, int i12, String str) {
        str.getClass();
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int k(int i11, int i12, String str) {
        str.getClass();
        int i13 = i12 - 1;
        if (i11 <= i13) {
            while (true) {
                char cCharAt = str.charAt(i13);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13--;
            }
        }
        return i11;
    }

    public static final String[] l(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i11]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i11++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean m(String str) {
        str.getClass();
        return kotlin.text.y.k(str, "Authorization", true) || kotlin.text.y.k(str, "Cookie", true) || kotlin.text.y.k(str, "Proxy-Authorization", true) || kotlin.text.y.k(str, "Set-Cookie", true);
    }

    public static final int n(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final int o(i iVar) {
        iVar.getClass();
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final int p(int i11, String str) {
        if (str == null) {
            return i11;
        }
        try {
            long j9 = Long.parseLong(str);
            if (j9 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j9 < 0) {
                return 0;
            }
            return (int) j9;
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public static final String q(int i11, int i12, String str) {
        str.getClass();
        int iJ = j(i11, i12, str);
        return str.substring(iJ, k(iJ, i12, str));
    }
}
