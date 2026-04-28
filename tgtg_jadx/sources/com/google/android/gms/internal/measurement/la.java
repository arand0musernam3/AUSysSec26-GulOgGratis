package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile j30.h f11594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11595b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Thread f11596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f11597d;

    public static c5 b(Object obj) {
        if (obj == null) {
            return c5.f11303a0;
        }
        if (obj instanceof String) {
            return new f5((String) obj);
        }
        if (obj instanceof Double) {
            return new i3((Double) obj);
        }
        if (obj instanceof Long) {
            return new i3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new b2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                i4.a.f("Invalid value type");
                return null;
            }
            n1 n1Var = new n1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n1Var.r(n1Var.p(), b(it.next()));
            }
            return n1Var;
        }
        z4 z4Var = new z4();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            c5 c5VarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                z4Var.g((String) string, c5VarB);
            }
        }
        return z4Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, all -> 0x006c, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j30.h c(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.la.c(android.content.Context):j30.h");
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b8 : bArr) {
            if (b8 == 34) {
                sb2.append("\\\"");
            } else if (b8 == 39) {
                sb2.append("\\'");
            } else if (b8 != 92) {
                switch (b8) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append(CodeBlockHandler.NEWLINE_REGEX);
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b8 < 32 || b8 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b8 >>> 6) & 3) + 48));
                            sb2.append((char) (((b8 >>> 3) & 7) + 48));
                            sb2.append((char) ((b8 & 7) + 48));
                        } else {
                            sb2.append((char) b8);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean f(Thread thread) {
        if (f11596c == null) {
            f11596c = Looper.getMainLooper().getThread();
        }
        return thread == f11596c;
    }

    public static Handler g() {
        if (f11597d == null) {
            synchronized (f11595b) {
                try {
                    if (f11597d == null) {
                        f11597d = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f11597d;
    }

    public static c5 h(p9 p9Var) {
        if (p9Var == null) {
            return c5.U;
        }
        int iB = p9Var.B() - 1;
        if (iB == 1) {
            return p9Var.v() ? new f5(p9Var.w()) : c5.f11309g0;
        }
        if (iB == 2) {
            return p9Var.z() ? new i3(Double.valueOf(p9Var.A())) : new i3(null);
        }
        if (iB == 3) {
            return p9Var.x() ? new b2(Boolean.valueOf(p9Var.y())) : new b2(null);
        }
        if (iB != 4) {
            i4.a.f("Unknown type found. Cannot convert entity");
            return null;
        }
        List listT = p9Var.t();
        ArrayList arrayList = new ArrayList();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(h((p9) it.next()));
        }
        return new d5(p9Var.u(), arrayList);
    }

    public abstract int a();

    public abstract tg i(int i11);

    public abstract Object j(int i11);

    public abstract Object k(tg tgVar);
}
