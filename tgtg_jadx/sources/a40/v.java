package a40;

import android.content.Context;
import com.braze.h2;
import d40.s0;
import d40.t0;
import d40.u0;
import d40.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f792g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dn.k f796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cz.j f797e;

    static {
        HashMap map = new HashMap();
        f791f = map;
        l1.j(5, map, "armeabi", 6, "armeabi-v7a");
        l1.j(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f792g = "Crashlytics Android SDK/20.0.4";
    }

    public v(Context context, b0 b0Var, a aVar, dn.k kVar, cz.j jVar) {
        this.f793a = context;
        this.f794b = b0Var;
        this.f795c = aVar;
        this.f796d = kVar;
        this.f797e = jVar;
    }

    public static t0 c(com.google.firebase.messaging.a0 a0Var, int i11) {
        String str = (String) a0Var.f12780c;
        String str2 = (String) a0Var.f12779b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a0Var.f12781d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.a0 a0Var2 = (com.google.firebase.messaging.a0) a0Var.f12782e;
        if (i11 >= 8) {
            com.google.firebase.messaging.a0 a0Var3 = a0Var2;
            while (a0Var3 != null) {
                a0Var3 = (com.google.firebase.messaging.a0) a0Var3.f12782e;
                i12++;
            }
        }
        int i13 = i12;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            c50.w.l("Null frames");
            return null;
        }
        byte b8 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (a0Var2 != null && i13 == 0) {
            t0VarC = c(a0Var2, i11 + 1);
        }
        if (b8 == 1) {
            return new t0(str, str2, listD, t0VarC, i13);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i11) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f14386e = i11;
            w0Var.f14387f = (byte) (w0Var.f14387f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f14382a = jMax;
            byte b8 = (byte) (w0Var.f14387f | 1);
            w0Var.f14383b = str;
            w0Var.f14384c = fileName;
            w0Var.f14385d = lineNumber;
            w0Var.f14387f = (byte) (b8 | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b8 = (byte) 1;
        if (b8 == 1) {
            return new u0("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b8 == 0) {
            sb2.append(" address");
        }
        h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }

    public final List a() {
        byte b8 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f795c;
        String str = aVar.f694e;
        if (str == null) {
            c50.w.l("Null name");
            return null;
        }
        String str2 = aVar.f691b;
        if (b8 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b8 & 2) == 0) {
            sb2.append(" size");
        }
        h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d40.b1 b(int r17) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a40.v.b(int):d40.b1");
    }
}
