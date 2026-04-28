package a9;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1001a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1002b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1003c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f1004d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                a0.z(autoCloseable);
            } catch (Exception e5) {
                org.bouncycastle.jce.provider.a.m(e5);
            }
        }
    }
}
