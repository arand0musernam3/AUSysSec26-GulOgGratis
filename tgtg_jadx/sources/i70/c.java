package i70;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f23481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f23482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f23483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f23484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f23485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f23486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f23487h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23488a;

    static {
        int i11 = 0;
        f23481b = new c(i11, 0);
        f23482c = new c(i11, 1);
        f23483d = new c(i11, 2);
        f23484e = new c(i11, 3);
        f23485f = new c(i11, 4);
        f23486g = new c(i11, 5);
        f23487h = new c(i11, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f23488a = i12;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.f23488a
            java.lang.String r1 = "WindowSpy"
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L99;
                case 1: goto L8e;
                case 2: goto L7a;
                case 3: goto L6c;
                case 4: goto L57;
                case 5: goto L3b;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = i70.f.f23498a
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L3a
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "mWindow"
            java.lang.reflect.Field r5 = r0.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L20
            r5.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L20
            r3 = r5
            goto L3a
        L20:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected exception retrieving "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = "#mWindow on API "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            android.util.Log.d(r1, r0, r2)
        L3a:
            return r3
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "com.android.internal.policy.DecorView"
            java.lang.Class r3 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L44
            goto L56
        L44:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected exception loading com.android.internal.policy.DecorView on API "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.d(r1, r0, r2)
        L56:
            return r3
        L57:
            java.lang.Object r0 = i70.e.f23495a
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L6b
            java.lang.String r1 = "getInstance"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)
            java.lang.Object r3 = r0.invoke(r3, r3)
        L6b:
            return r3
        L6c:
            java.lang.String r0 = "android.view.WindowManagerGlobal"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L73
            goto L79
        L73:
            r0 = move-exception
            java.lang.String r1 = "WindowManagerSpy"
            android.util.Log.w(r1, r0)
        L79:
            return r3
        L7a:
            java.lang.Object r0 = i70.e.f23495a
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L8d
            java.lang.String r1 = "mViews"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r1)
            r3.setAccessible(r2)
        L8d:
            return r3
        L8e:
            java.lang.Class<androidx.appcompat.view.WindowCallbackWrapper> r0 = androidx.appcompat.view.WindowCallbackWrapper.class
            goto L98
        L91:
            java.lang.String r0 = "android.support.v7.view.WindowCallbackWrapper"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = r3
        L98:
            return r0
        L99:
            java.lang.Object r0 = i70.d.f23489d
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lad
            java.lang.String r1 = "mWrapped"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r3 = r0
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.c.invoke():java.lang.Object");
    }
}
