package e80;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f15851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f15854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, File file) {
        super(file);
        file.getClass();
        this.f15854f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // e80.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File a() {
        /*
            r11 = this;
            e80.g r0 = r11.f15854f
            e80.i r0 = r0.f15861b
            boolean r1 = r11.f15853e
            r2 = 0
            r3 = 1
            java.io.File r4 = r11.f15862a
            if (r1 != 0) goto L3e
            java.io.File[] r1 = r11.f15851c
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function1 r1 = r0.f15865c
            if (r1 == 0) goto L21
            java.lang.Object r1 = r1.invoke(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L21
            goto L61
        L21:
            java.io.File[] r1 = r4.listFiles()
            r11.f15851c = r1
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function2 r1 = r0.f15867e
            if (r1 == 0) goto L3c
            kotlin.io.AccessDeniedException r5 = new kotlin.io.AccessDeniedException
            r9 = 2
            r10 = 0
            java.io.File r6 = r11.f15862a
            r7 = 0
            java.lang.String r8 = "Cannot list files in a directory"
            r5.<init>(r6, r7, r8, r9, r10)
            r1.invoke(r6, r5)
        L3c:
            r11.f15853e = r3
        L3e:
            java.io.File[] r1 = r11.f15851c
            if (r1 == 0) goto L53
            int r5 = r11.f15852d
            int r6 = r1.length
            if (r5 >= r6) goto L53
            r1.getClass()
            int r0 = r11.f15852d
            int r2 = r0 + 1
            r11.f15852d = r2
            r0 = r1[r0]
            return r0
        L53:
            boolean r1 = r11.f15850b
            if (r1 != 0) goto L5a
            r11.f15850b = r3
            return r4
        L5a:
            kotlin.jvm.functions.Function1 r0 = r0.f15866d
            if (r0 == 0) goto L61
            r0.invoke(r4)
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.c.a():java.io.File");
    }
}
