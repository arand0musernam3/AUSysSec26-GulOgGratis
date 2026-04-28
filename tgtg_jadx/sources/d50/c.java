package d50;

import a40.d0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14422a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f14423b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f14423b;
        map.getClass();
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        d0.q("Cannot get dependency ", dVar, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:22:0x0098, B:25:0x00ab, B:26:0x00c3), top: B:31:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d50.c.b(z70.c):java.lang.Object");
    }
}
